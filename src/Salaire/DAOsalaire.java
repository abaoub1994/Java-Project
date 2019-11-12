/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salaire;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;


/**
 *
 * @author instm
 */
public class DAOsalaire {
     public void ajouterSalaire(Salaire emp) {
 String url = "jdbc:mysql://127.0.0.1/itpartner";
       int res=0;
    try { 
        Connection conn = DriverManager.getConnection(url, "root", "");
        Statement st = conn.createStatement();
         res=st.executeUpdate("insert into Salaire (montant,augmentation,heuresSupp) values ('"+emp.getMontant()+"','"+emp.getAugmentation()+"','"+emp.getHeuresSupp()+"')");
       


  }
  catch(Exception e){
    System.out.println("Problème de connexion avec la BD");
    System.out.println(e.getMessage());
    }  
    
     }
   
   public void modifierSalaire(Salaire emp) {
     String url = "jdbc:mysql://127.0.0.1/itpartner";
       int res=0;
    try { 
        Connection conn = DriverManager.getConnection(url, "root", "");
        Statement st = conn.createStatement();
    res= st.executeUpdate("update Salaire set montant = ? where id=?");

        

  }
  catch(Exception e){
    System.out.println("Problème de connexion avec la BD");
    System.out.println(e.getMessage());
    }  
   }
   
 
      
   
   
   public void supprimerSalaire(Salaire emp) {
       String url = "jdbc:mysql://127.0.0.1/itpartner";
       int res=0;
    try { 
        Connection conn = DriverManager.getConnection(url, "root", "");
        Statement st = conn.createStatement();
         res=st.executeUpdate("delete from Salaire where id=?");

        

  }
  catch(Exception e){
    System.out.println("Problème de connexion avec la BD");
    System.out.println(e.getMessage());
    }  
   }
    
}
