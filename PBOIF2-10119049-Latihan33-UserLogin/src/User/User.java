/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author Nur Sasongko
 */
public class User {
    private String username = "RizkiAdam";
    private String password = "terbaikselalu";
    private Boolean statusAkun;
    
    private boolean cekAkun(String parUserName, String parPassword){
       if(parUserName.equals(username) && parPassword.equals(password)){
           return true;
       }
       return false;
    }
    
    private void hasilLogin(boolean status, String parUserName){
       if(status == true){
           System.out.printf("\n******HALLO %s******\n",parUserName);
           System.out.printf("Selamat Datang di Aplikasi ini\n");
       }
       else{
           System.out.printf("\nOoops, Username atau Password anda salah\n");
       }  
    }
    
    public void pengecekkanLogin(String parUserName, String parPassword){
        hasilLogin(cekAkun(parUserName,parPassword),parUserName);
        
    }
}
