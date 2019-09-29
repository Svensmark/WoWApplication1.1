package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entities.Account;
import entities.Event;
import utils.EMF_Creator;
import facades.AccountFacade;
import facades.EventFacade;
import javax.persistence.EntityManagerFactory;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//Todo Remove or change relevant parts before ACTUAL use
@Path("event")
public class EventResource {

    private static final EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory(
                "pu",
                "jdbc:mysql://localhost:3307/WoWApplication",
                "dev",
                "ax2",
                EMF_Creator.Strategy.CREATE);
    private static final EventFacade FACADE =  EventFacade.getEventFacade(EMF);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
            
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String demo() {
        return "{\"msg\":\"Hello World\"}";
    }
    
    @Path("/all")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String getAllAccounts() {
        return GSON.toJson(FACADE.getAllEvents());
    }
    
    @Path("/populate")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String populate() {
        FACADE.populateDummyEvents();
        return"{\"msg\":\"Your database has been populated..\"}";
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addEvent(String event) {
        Event e = GSON.fromJson(event, Event.class);
        Event ev = new Event(e.getImgUrl(),e.getTitle(),e.getBody(),e.isActive());
        FACADE.addEvent(ev);
        return Response.ok(ev).build();
    }
    
}