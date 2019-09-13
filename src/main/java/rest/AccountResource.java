package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entities.Account;
import utils.EMF_Creator;
import facades.AccountFacade;
import javax.persistence.EntityManagerFactory;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//Todo Remove or change relevant parts before ACTUAL use
@Path("account")
public class AccountResource {

    private static final EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory(
                "pu",
                "jdbc:mysql://localhost:3307/WoWApplication",
                "dev",
                "ax2",
                EMF_Creator.Strategy.CREATE);
    private static final AccountFacade FACADE =  AccountFacade.getAccountFacade(EMF);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
            
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String demo() {
        return "{\"msg\":\"Hello World\"}";
    }
    
    
    @Path("/count")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String getAccountCount() {
        long count = FACADE.getAmountOfMembers();
        //System.out.println("--------------->"+count);
        return "{\"count\":"+count+"}";  //Done manually so no need for a DTO
    }
    
    @Path("/all")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String getAllAccounts() {
        return GSON.toJson(FACADE.getAllAccounts());
    }
    
    @Path("/populate")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String populate() {
        FACADE.populateDummyAccounts();
        return"{\"msg\":\"Your database has been populated..\"}";
    }
    
    @Path("/deleteAll")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String deleteAll() {
        FACADE.deleteAllAccounts();
        return"{\"msg\":\"Your database has been cleared..\"}";
    }
    
    
    @Path("/get/role/{role}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String getRole(Account entity, @PathParam("role") String role) {
        return GSON.toJson(FACADE.getAccountsByRole(role));
    }
    
    @Path("/get/prof/{prof}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String getProf(Account entity, @PathParam("prof") String prof) {
        return GSON.toJson(FACADE.getAccountsByProfDTO(prof));
    }
    

    
}
