/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import entities.Account;

/**
 *
 * @author emilt
 */
public class AccountDTO {
    private String account_username;
    private String account_charClass;
    private String account_spec;
    private String account_role;
    private String account_prof1;
    private String account_prof2;
    private int account_level;

    public AccountDTO(Account ac) {
        this.account_username = ac.getUsername();
        this.account_charClass = ac.getCharClass();
        this.account_level = ac.getLevel();
        this.account_spec = ac.getSpec();
        this.account_role = ac.getRole();
        this.account_prof1 = ac.getProf1();
        this.account_prof2 = ac.getProf2();
    }

    public String getUsername() {
        return account_username;
    }

    public void setUsername(String username) {
        this.account_username = username;
    }

    public String getCharClass() {
        return account_charClass;
    }

    public void setCharClass(String charClass) {
        this.account_charClass = charClass;
    }

    public int getLevel() {
        return account_level;
    }

    public void setLevel(int level) {
        this.account_level = level;
    }

    public String getSpec() {
        return account_spec;
    }

    public void setSpec(String spec) {
        this.account_spec = spec;
    }

    public String getRole() {
        return account_role;
    }

    public void setRole(String role) {
        this.account_role = role;
    }

    public String getProf1() {
        return account_prof1;
    }

    public void setProf1(String prof1) {
        this.account_prof1 = prof1;
    }

    public String getProf2() {
        return account_prof2;
    }

    public void setProf2(String prof2) {
        this.account_prof2 = prof2;
    }
}
