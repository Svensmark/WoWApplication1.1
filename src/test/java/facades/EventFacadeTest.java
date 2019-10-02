/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import facades.EventFacade;
import entities.Event;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.EMF_Creator;

/**
 *
 * @author emilt
 */
public class EventFacadeTest {

    private static EntityManagerFactory emf;
    private static EventFacade facade;

    public EventFacadeTest() {
    }

    //@BeforeAll
    public static void setUpClass() {
        emf = EMF_Creator.createEntityManagerFactory(
                "pu",
                "jdbc:mysql://localhost:3307/WoWApplication_test",
                "dev",
                "ax2",
                EMF_Creator.Strategy.CREATE);
        facade = EventFacade.getEventFacade(emf);
    }

    /*   **** HINT **** 
        A better way to handle configuration values, compared to the UNUSED example above, is to store those values
        ONE COMMON place accessible from anywhere.
        The file config.properties and the corresponding helper class utils.Settings is added just to do that. 
        See below for how to use these files. This is our RECOMENDED strategy
     */
    @BeforeAll
    public static void setUpClassV2() {
        emf = EMF_Creator.createEntityManagerFactory(EMF_Creator.DbSelector.TEST, EMF_Creator.Strategy.DROP_AND_CREATE);
        facade = EventFacade.getEventFacade(emf);
    }

    @AfterAll
    public static void tearDownClass() {
//        Clean up database after test is done or use a persistence unit with drop-and-create to start up clean on every test
    }

    @BeforeEach
    public void setUp() {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.createNamedQuery("Event.deleteAllRows").executeUpdate();
            em.persist(new Event("imgUrl","title","body",false));
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    
    @Test
    public void testAddEvent() {
        EntityManager em = emf.createEntityManager();

        TypedQuery<Event> query = em.createQuery("SELECT a FROM Event a", Event.class);
        List l = query.getResultList();
        int before = l.size();

        Event e = new Event("url","tit","bod",true);
        facade.addEvent(e);

        l = query.getResultList();
        int after = l.size();

        assertEquals(before + 1, after);
    }
    
    @Test
    public void testDeleteEvent() {
        EntityManager em = emf.createEntityManager();

        TypedQuery<Event> query = em.createQuery("SELECT a FROM Event a", Event.class);
        List l = query.getResultList();
        int expected = l.size();

        Event e = new Event("url","tit","bod",true);
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        facade.deleteEvent(e);
        
        l = query.getResultList();
        int result = l.size();
        
        assertEquals(expected,result);        
    }
    
    @Test
    public void testGetAllEvents() {
        
    }
    
}
