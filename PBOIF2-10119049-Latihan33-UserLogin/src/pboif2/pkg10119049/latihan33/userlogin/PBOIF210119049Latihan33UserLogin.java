/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119049.latihan33.userlogin;

import java.util.Scanner;
/**
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : program untuk user login
 */

import User.User;

public class PBOIF210119049Latihan33UserLogin {
    private static String usName,passWord;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // object scanner
        User user1 = new User(); // object user
        
        // user submit form
        System.out.print("Masukkan Username : ");
        usName = scan.nextLine();
        System.out.print("Masukkan Password : ");
        passWord = scan.nextLine();
        
        // process after submitted
        user1.pengecekkanLogin(usName,passWord);
        
    }
    
}
