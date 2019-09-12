package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@Entity
@NamedQueries ({
    @NamedQuery(name = "Account.deleteAllRows", query = "DELETE from Account"),
    @NamedQuery(name = "Account.getAll", query = "SELECT a FROM Account a"),
    @NamedQuery(name = "Account.getAccountsByUsername", query = "SELECT a FROM Account a WHERE a.username = :username"),
    @NamedQuery(name = "Account.getAccountsByCharClass", query = "SELECT a FROM Account a WHERE a.charClass = :charClass"),
    @NamedQuery(name = "Account.getAccountsBySpec", query = "SELECT a FROM Account a WHERE a.spec = :spec"),
    @NamedQuery(name = "Account.getAccountsByRole", query = "SELECT a FROM Account a WHERE a.role = :role"),
    @NamedQuery(name = "Account.getAccountsByProf", query = "SELECT a FROM Account a WHERE a.prof1 = :prof OR a.prof2 = :prof")
})

public class Account implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String charClass;
    private String spec;
    private String role;
    private String prof1;
    private String prof2;
    private int level;
    
    private String description;
    private String reasonToJoin;
    private boolean isMember;    
    
    private boolean admin = false;
    
    
    
    public Account() {
    }
    
    public Account(String username, String password, String charClass, String spec, String role, String prof1, 
            String prof2, int level, String description, String reasonToJoin, boolean member) {
        this.username = username;
        this.password = password;
        this.charClass = charClass;
        this.spec = spec;
        this.role = role;
        this.prof1 = prof1;
        this.prof2 = prof2;
        this.level = level;
        this.description = description;
        this.reasonToJoin = reasonToJoin;
        this.isMember = member;
    }
    
        
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCharClass() {
        return charClass;
    }

    public void setCharClass(String charClass) {
        this.charClass = charClass;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getProf1() {
        return prof1;
    }

    public void setProf1(String prof1) {
        this.prof1 = prof1;
    }

    public String getProf2() {
        return prof2;
    }

    public void setProf2(String prof2) {
        this.prof2 = prof2;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReasonToJoin() {
        return reasonToJoin;
    }

    public void setReasonToJoin(String reasonToJoin) {
        this.reasonToJoin = reasonToJoin;
    }

    public boolean isMember() {
        return isMember;
    }

    public void setMember(boolean member) {
        this.isMember = member;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
    
   
    
    
    

   
}
