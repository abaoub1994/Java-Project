/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notification;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;
import mail.mail;


/**
 *
 * @author instm
 */
public class DAOnotification {
    
    public void afficherNotification() {
        String url = "jdbc:mysql://127.0.0.1/itpartner";
       int res=0;
    try { 
        Connection conn = DriverManager.getConnection(url, "root", "");
        Statement st = conn.createStatement();
         res=st.executeUpdate("Select * from notification");
       


  }
  catch(Exception e){
    System.out.println("Problème de connexion avec la BD");
    System.out.println(e.getMessage());
    }  
   }
   
  
        

  
  
   
   
   public void supprimerNotification() {
     
       String url = "jdbc:mysql://127.0.0.1/itpartner";
       int res=0;
    try { 
        Connection conn = DriverManager.getConnection(url, "root", "");
        Statement st = conn.createStatement();
         res=st.executeUpdate("delete from notification where id=?");

        

  }
  catch(Exception e){
    System.out.println("Problème de connexion avec la BD");
    System.out.println(e.getMessage());
    }  
   }
    
}
