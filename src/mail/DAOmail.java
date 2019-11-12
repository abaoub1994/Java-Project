/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mail;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;

/**
 *
 * @author instm
 */
public class DAOmail {
     public void afficherMail(mail emp) {
      String url = "jdbc:mysql://127.0.0.1/itpartner";
       int res=0;
    try { 
        Connection conn = DriverManager.getConnection(url, "root", "");
        Statement st = conn.createStatement();
         res=st.executeUpdate("Select * from mail");
       


  }
  catch(Exception e){
    System.out.println("Problème de connexion avec la BD");
    System.out.println(e.getMessage());
    }  
   }
   
     public void ajoutermail(mail emp) {
        String url = "jdbc:mysql://127.0.0.1/itpartner";
       int res=0;
    try { 
        Connection conn = DriverManager.getConnection(url, "root", "");
        Statement st = conn.createStatement();
         res=st.executeUpdate("insert into mail (nom) values ('"+emp.getNom()+"')");
  }
  catch(Exception e){
    System.out.println("Problème de connexion avec la BD");
    System.out.println(e.getMessage());
    }  
      
   }
     
     
     
     
   public void supprimerMail(mail emp) {
       String url = "jdbc:mysql://127.0.0.1/itpartner";
       int res=0;
    try { 
        Connection conn = DriverManager.getConnection(url, "root", "");
        Statement st = conn.createStatement();
         res=st.executeUpdate("delete from mail where id=1");

        

  }
  catch(Exception e){
    System.out.println("Problème de connexion avec la BD");
    System.out.println(e.getMessage());
    }  
   }
   
   public void archiverMail() {
      // TODO: implement
   }
    
}
