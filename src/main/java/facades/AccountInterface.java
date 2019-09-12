/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import dto.AccountDTO;
import entities.Account;
import java.util.ArrayList;

/**
 *
 * @author emilt
 */
public interface AccountInterface {
    
    public Account addAccount(Account account);
        
    public void deleteAccount(Account account);
    
    public void deleteAllAccounts();
    
    public int getAmountOfMembers();
    
    public ArrayList<Account> getAccountsByUsername(String username);
    public ArrayList<Account> getAccountsByCharClass(String charClass);
    public ArrayList<Account> getAccountsBySpec(String spec);
    public ArrayList<Account> getAccountsByRole(String role);
    public ArrayList<Account> getAccountsByProf(String prof);
    
    public ArrayList<Account> getAllAccounts();
    
    public ArrayList<AccountDTO> getAccountsByUsernameDTO(String username);
    public ArrayList<AccountDTO> getAccountsByCharClassDTO(String charClass);
    public ArrayList<AccountDTO> getAccountsBySpecDTO(String spec);
    public ArrayList<AccountDTO> getAccountsByRoleDTO(String role);
    public ArrayList<AccountDTO> getAccountsByProfDTO(String prof);
    
    public ArrayList<AccountDTO> getAllAccountsDTO();
}
