/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import dto.EventDTO;
import entities.Event;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author emilt
 */
public class EventFacade implements EventInterface{
    
    private static EventFacade instance;
    private static EntityManagerFactory emf;
    
    //Private Constructor to ensure Singleton
    private EventFacade() {}
    
    
    /**
     * 
     * @param _emf
     * @return an instance of this facade class.
     */
    public static EventFacade getEventFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new EventFacade();
        }
        return instance;
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    

    @Override
    public Event addEvent(Event event) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(event);
        em.getTransaction().commit();
        return event;
    }

    @Override
    public void deleteEvent(Event event) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Event ev = em.merge(event);
            em.remove(ev);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    @Override
    public ArrayList<Event> getAllEvents() {
        EntityManager em = getEntityManager();
        try {
            List l = em.createNamedQuery("Event.getAll").getResultList();
            ArrayList<Event> al = new ArrayList();
            l.forEach((e) -> {
                al.add((Event) e);
            });
        return al;
        } finally {
            em.close();
        }
    }

    @Override
    public ArrayList<EventDTO> getAllEventsDTO() {
        ArrayList<Event> al = getAllEvents();
        ArrayList<EventDTO> alDTO = new ArrayList();
        for (int i = 0; i < al.size(); ++i) {
            alDTO.add(new EventDTO(al.get(i)));
        }
        return alDTO;
    }

    @Override
    public void populateDummyEvents() {
        Event e1 = new Event("https://pbs.twimg.com/media/CvoHcRiXYAA5fJc.jpg","Title","This is the body text", true);
        Event e2 = new Event("https://www.plethorist.com/wp-content/uploads/2017/07/The-Worst-Stock-Photos-On-The-Internet-2.jpg","Title","This is the body text", true);
        Event e3 = new Event("https://pbs.twimg.com/profile_images/949787136030539782/LnRrYf6e_400x400.jpg","Title","This is the body text", true);
        Event e4 = new Event("https://i.imgur.com/5mXfwr1.jpg","Title","This is the body text", true);
        
        EventFacade ef = new EventFacade();
        ef.addEvent(e1);
        ef.addEvent(e2);
        ef.addEvent(e3);
        ef.addEvent(e4);
    }
    
}
