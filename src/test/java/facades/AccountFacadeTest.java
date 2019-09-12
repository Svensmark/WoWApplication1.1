package facades;

import utils.EMF_Creator;
import entities.Account;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.Settings;
import utils.EMF_Creator.DbSelector;
import utils.EMF_Creator.Strategy;

//Uncomment the line below, to temporarily disable this test
//@Disabled
public class AccountFacadeTest {

    private static EntityManagerFactory emf;
    private static AccountFacade facade;

    public AccountFacadeTest() {
    }

    //@BeforeAll
    public static void setUpClass() {
        emf = EMF_Creator.createEntityManagerFactory(
                "pu",
                "jdbc:mysql://localhost:3307/WoWApplication_test",
                "dev",
                "ax2",
                EMF_Creator.Strategy.CREATE);
        facade = AccountFacade.getAccountFacade(emf);
    }

    /*   **** HINT **** 
        A better way to handle configuration values, compared to the UNUSED example above, is to store those values
        ONE COMMON place accessible from anywhere.
        The file config.properties and the corresponding helper class utils.Settings is added just to do that. 
        See below for how to use these files. This is our RECOMENDED strategy
     */
    @BeforeAll
    public static void setUpClassV2() {
       emf = EMF_Creator.createEntityManagerFactory(DbSelector.TEST,Strategy.DROP_AND_CREATE);
       facade = AccountFacade.getAccountFacade(emf);
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
            em.createNamedQuery("Account.deleteAllRows").executeUpdate();
            
            em.persist(new Account("Username1","Password1","Mage","Frost","DPS","Enchanting","Tailoring",
                                    37, "Description of me", "A reason to join the guild", false));
            em.persist(new Account("Username2","Password2","Mage","Frost","DPS","Enchanting","Tailoring",
                                    37, "Description of me", "A reason to join the guild", false));
            em.persist(new Account("Username4","Password3","Mage","Frost","DPS","Enchanting","Tailoring",
                                    37, "Description of me", "A reason to join the guild", false));
            em.persist(new Account("Username4","Password4","Mage","Frost","DPS","Enchanting","Tailoring",
                                    37, "Description of me", "A reason to join the guild", false));
           
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
    
    
    @AfterEach
    public void tearDown() {
//        Remove any data after each test was run
    }

    
    
     @Test
    public void testAddAccount() {
        EntityManager em = emf.createEntityManager();

        TypedQuery<Account> query = em.createQuery("SELECT a FROM Account a", Account.class);
        List l = query.getResultList();
        int before = l.size();

        Account account = new Account("Username4","Password4","Mage","Frost","DPS","Enchanting","Tailoring",
                                    37, "Description of me", "A reason to join the guild", false);
        facade.addAccount(account);

        query = em.createQuery("SELECT a FROM Account a", Account.class);
        l = query.getResultList();
        int after = l.size();

        assertEquals(before + 1, after);
    }
    
    @Test
    public void testDeleteAccount() {
        EntityManager em = emf.createEntityManager();

        TypedQuery<Account> query = em.createQuery("SELECT a FROM Account a", Account.class);
        List l = query.getResultList();
        int before = l.size();
        Account account = new Account("Username4","Password4","Mage","Frost","DPS","Enchanting","Tailoring",
                                    37, "Description of me", "A reason to join the guild", false);

        em.getTransaction().begin();
        em.persist(account);
        em.getTransaction().commit();
        facade.deleteAccount(account);

        l = query.getResultList();
        int after = l.size();

        assertEquals(before, after);
    }
    
    @Test
    public void testGetAccountByUsername() {
        assertEquals("Username4",facade.getAccountsByUsername("Username4").get(0).getUsername());
    }
    
    @Test
    public void testGetAccountByCharClass() {
        assertEquals("Mage",facade.getAccountsByCharClass("Mage").get(0).getCharClass());
    }
    
    @Test
    public void testGetAccountBySpec() {
        assertEquals("Frost",facade.getAccountsBySpec("Frost").get(0).getSpec());
    }
    
    @Test
    public void testGetAccountByRole() {
        assertEquals("DPS",facade.getAccountsByRole("DPS").get(0).getRole());
    }
    
    @Test
    public void testGetAccountByProf() {
        Account acc = facade.getAccountsByProf("Tailoring").get(0);
        if (acc.getProf1().equals("Tailoring") || acc.getProf2().equals("Tailoring")) {
            assertEquals(true,true);
        } else {
            assertEquals(true,false);
        }
    }
    
    @Test
    public void testGetAllAccounts() {
        assertEquals(4,facade.getAllAccounts().size());
    }
    

    
}
