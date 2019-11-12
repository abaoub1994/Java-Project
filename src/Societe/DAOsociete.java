/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Societe;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;

/**
 *
 * @author instm
 */
public class DAOsociete {

    public boolean getCapital;
         public void ajouterSociete(societe emp) {
 String url = "jdbc:mysql://127.0.0.1/itpartner";
       int res=0;
    try { 
        Connection conn = DriverManager.getConnection(url, "root", "");
        Statement st = conn.createStatement();
         res=st.executeUpdate("insert into societe (nom,addresse,capital,chiffreDaffaire) values ('"+emp.getNom()+"','"+emp.getAddresse()+"','"+emp.getCapital()+"','"+emp.getChiffreDaffaire()+"')");
       


  }
  catch(Exception e){
    System.out.println("Problème de connexion avec la BD");
    System.out.println(e.getMessage());
    }  
    
     }
     public void afficherCapital() {
      String url = "jdbc:mysql://127.0.0.1/itpartner";
       int res=0;
    try { 
        Connection conn = DriverManager.getConnection(url, "root", "");
        Statement st = conn.createStatement();
         res=st.executeUpdate("Select capital from societe");
       


  }
  catch(Exception e){
    System.out.println("Problème de connexion avec la BD");
    System.out.println(e.getMessage());
    }  
   }
   
   public void calculerChiffreDaffaire() {
      // TODO: implement
   }
}
