/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missions;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;

/**
 *
 * @author instm
 */
public class DAOmission {
    
    public void ajouterMission(mission emp) {
         String url = "jdbc:mysql://127.0.0.1/itpartner";
       int res=0;
    try { 
        Connection conn = DriverManager.getConnection(url, "root", "");
        Statement st = conn.createStatement();
         res=st.executeUpdate("insert into missions (nom,membre,date,description) values ('"+emp.getNom()+"','"+emp.getMembre()+"','"+emp.getDate()+"','"+emp.getDescription()+"')");
       


  }
  catch(Exception e){
    System.out.println("Problème de connexion avec la BD");
    System.out.println(e.getMessage());
    }  
   }
   
   public void modifierMission(mission emp) {
String url = "jdbc:mysql://127.0.0.1/itpartner";
       int res=0;
    try { 
        Connection conn = DriverManager.getConnection(url, "root", "");
        Statement st = conn.createStatement();
    res= st.executeUpdate("update Personnel set nom = ? where id=?");

        

  }
  catch(Exception e){
    System.out.println("Problème de connexion avec la BD");
    System.out.println(e.getMessage());
    }  
   }
   
   public void supprimerMission(mission emp) {
      String url = "jdbc:mysql://127.0.0.1/itpartner";
       int res=0;
    try { 
        Connection conn = DriverManager.getConnection(url, "root", "");
        Statement st = conn.createStatement();
         res=st.executeUpdate("delete from Personnel where id=?");

        

  }
  catch(Exception e){
    System.out.println("Problème de connexion avec la BD");
    System.out.println(e.getMessage());
    }  
    
   }
    
}
