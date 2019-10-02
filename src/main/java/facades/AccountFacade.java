package facades;

import dto.AccountDTO;
import entities.Account;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import utils.EMF_Creator;

/**
 *
 * Rename Class to a relevant name Add add relevant facade methods
 */
public class AccountFacade implements AccountInterface{

    private static AccountFacade instance;
    private static EntityManagerFactory emf;
    
    //Private Constructor to ensure Singleton
    private AccountFacade() {}
    
    
    /**
     * 
     * @param _emf
     * @return an instance of this facade class.
     */
    public static AccountFacade getAccountFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new AccountFacade();
        }
        return instance;
    }

    private static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    

    
    
    
    
    @Override
    public Account addAccount(Account account) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(account);
        em.getTransaction().commit();
        return account;
    }

    @Override
    public void deleteAccount(Account account) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Account acc = em.merge(account);
            em.remove(acc);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    @Override
    public ArrayList<Account> getAccountsByUsername(String username) {        
        EntityManager em = getEntityManager();
        TypedQuery<Account> query = em.createQuery("SELECT a FROM Account a WHERE a.username = :username", Account.class);
        query.setParameter("username", username);
        ArrayList<Account> l = new ArrayList();
        for (Account m : query.getResultList()) {
            l.add((Account) m);
        }
        return l;
    }

    @Override
    public ArrayList<Account> getAccountsByCharClass(String charClass) {
        EntityManager em = getEntityManager();
        TypedQuery<Account> query = em.createQuery("SELECT a FROM Account a WHERE a.charClass = :search", Account.class);
        query.setParameter("search", charClass);
        ArrayList<Account> l = new ArrayList();
        for (Account m : query.getResultList()) {
            l.add((Account) m);
        }
        return l;
    }


    @Override
    public ArrayList<Account> getAccountsByRole(String role) {
        EntityManager em = getEntityManager();
        TypedQuery<Account> query = em.createQuery("SELECT a FROM Account a WHERE a.role = :search", Account.class);
        query.setParameter("search", role);
        ArrayList<Account> l = new ArrayList();
        for (Account m : query.getResultList()) {
            l.add((Account) m);
        }
        return l;
    }

    @Override
    public ArrayList<Account> getAccountsByProf(String prof) {
        EntityManager em = getEntityManager();
        TypedQuery<Account> query = em.createQuery("SELECT a FROM Account a WHERE a.prof1 = :search OR a.prof2 = :search", Account.class);
        query.setParameter("search", prof);
        ArrayList<Account> l = new ArrayList();
        for (Account m : query.getResultList()) {
            l.add((Account) m);
        }
        return l;}

    @Override
    public ArrayList<Account> getAllAccounts() {
        EntityManager em = getEntityManager();
        try {
            List l = em.createNamedQuery("Account.getAll").getResultList();
            ArrayList<Account> al = new ArrayList();
        for (Object m : l) {
            al.add((Account) m);
        }
        return al;
        } finally {
            em.close();
        }
    }

    @Override
    public ArrayList<AccountDTO> getAccountsByUsernameDTO(String username) {
        ArrayList<Account> al = getAllAccounts();
        ArrayList<AccountDTO> aldto = new ArrayList();
        for (int i = 0; i < al.size(); ++i) {
            aldto.add(new AccountDTO(al.get(i)));
        }
        return aldto;
    }

    @Override
    public ArrayList<AccountDTO> getAccountsByCharClassDTO(String charClass) {
        ArrayList<Account> al = getAccountsByCharClass(charClass);
        ArrayList<AccountDTO> aldto = new ArrayList();
        for (int i = 0; i < al.size(); ++i) {
            aldto.add(new AccountDTO(al.get(i)));
        }
        return aldto;
    }

    @Override
    public ArrayList<AccountDTO> getAccountsByRoleDTO(String role) {
        ArrayList<Account> al = getAccountsByRole(role);
        ArrayList<AccountDTO> aldto = new ArrayList();
        for (int i = 0; i < al.size(); ++i) {
            aldto.add(new AccountDTO(al.get(i)));
        }
        return aldto;
    }

    @Override
    public ArrayList<AccountDTO> getAccountsByProfDTO(String prof) {
        ArrayList<Account> al = getAccountsByProf(prof);
        ArrayList<AccountDTO> aldto = new ArrayList();
        for (int i = 0; i < al.size(); ++i) {
            aldto.add(new AccountDTO(al.get(i)));
        }
        return aldto;
    }

    @Override
    public ArrayList<AccountDTO> getAllAccountsDTO() {
        ArrayList<Account> al = getAllAccounts();
        ArrayList<AccountDTO> aldto = new ArrayList();
        for (int i = 0; i < al.size(); ++i) {
            aldto.add(new AccountDTO(al.get(i)));
        }
        return aldto;
    }    
    
    @Override
    public void deleteAllAccounts() {
        ArrayList<Account> m = getAllAccounts();
        for (int i = 0; i < m.size(); ++i) {
            deleteAccount(m.get(i));
        }
    }

    @Override
    public int getAmountOfMembers() {
        return getAllAccounts().size();
    }

    @Override
    public void populateDummyAccounts() {
        addAccount(new Account("Username11","Password1","Druid","Feral","DPS","Leatherwork","Engineering",
                                    37, "Description of me", "A reason to join the guild", false));
        addAccount(new Account("Username12","Password2","Warlock","Demonology","Tank","Cooking","Blacksmithing",
                                    37, "Description of me", "A reason to join the guild", false));
        addAccount(new Account("Username13","Password3","Paladin","Retribution","DPS","Blacksmithing","Mining",
                                    37, "Description of me", "A reason to join the guild", false));
        addAccount(new Account("Username14","Password4","Mage","Frost","DPS","Enchanting","Skinning",
                                    37, "Description of me", "A reason to join the guild", false));
        addAccount(new Account("Username15","Password5","Priest","Holy","Healer","Herbalism","Alchemy",
                                    37, "Description of me", "A reason to join the guild", false));
    }

    @Override
    public Account editAccount(Account account) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Account aMerge = em.find(Account.class, account.getId());
        em.merge(aMerge);
        aMerge.setAdmin(account.isAdmin());
        aMerge.setCharClass(account.getCharClass());
        aMerge.setDescription(account.getDescription());
        aMerge.setLevel(account.getLevel());
        aMerge.setMember(account.isMember());
        aMerge.setProf1(account.getProf1());
        aMerge.setProf2(account.getProf2());
        aMerge.setRole(account.getRole());
        aMerge.setSpec(account.getSpec());
        aMerge.setUsername(account.getUsername());
        em.getTransaction().commit();
        em.close();
        
        return aMerge;
    }

    @Override
    public ArrayList<AccountDTO> getAllMembersDTO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
