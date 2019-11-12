/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Charges;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;

/**
 *
 * @author instm
 */
public class DAOcharges {
    
    public void ajoutercharges(Charges emp) {
        String url = "jdbc:mysql://127.0.0.1/itpartner";
       int res=0;
    try { 
        Connection conn = DriverManager.getConnection(url, "root", "");
        Statement st = conn.createStatement();
         res=st.executeUpdate("insert into charges (loyer,electricite,gaz,wifi) values ('"+emp.getLoyer()+"','"+emp.getElectricite()+"','"+emp.getGaz()+"','"+emp.getWifi()+"')");
  }
  catch(Exception e){
    System.out.println("Problème de connexion avec la BD");
    System.out.println(e.getMessage());
    }  
      
   }
    
    public void afficherloyer() {
        String url = "jdbc:mysql://127.0.0.1/itpartner";
       int res=0;
    try { 
        Connection conn = DriverManager.getConnection(url, "root", "");
        Statement st = conn.createStatement();
         res=st.executeUpdate("select loyer from charges");
  }
  catch(Exception e){
    System.out.println("Problème de connexion avec la BD");
    System.out.println(e.getMessage());
    }  
      
   }
    
    public void afficherelectricite() {
        String url = "jdbc:mysql://127.0.0.1/itpartner";
       int res=0;
    try { 
        Connection conn = DriverManager.getConnection(url, "root", "");
        Statement st = conn.createStatement();
         res=st.executeUpdate("Select electricite from charges");
  }
  catch(Exception e){
    System.out.println("Problème de connexion avec la BD");
    System.out.println(e.getMessage());
    }  
      
   }
    
    public void affichergaz() {
        String url = "jdbc:mysql://127.0.0.1/itpartner";
       int res=0;
    try { 
        Connection conn = DriverManager.getConnection(url, "root", "");
        Statement st = conn.createStatement();
         res=st.executeUpdate("Select gaz from charges");
  }
  catch(Exception e){
    System.out.println("Problème de connexion avec la BD");
    System.out.println(e.getMessage());
    }  
      
   }
    
    public void afficherwifi() {
        String url = "jdbc:mysql://127.0.0.1/itpartner";
       int res=0;
    try { 
        Connection conn = DriverManager.getConnection(url, "root", "");
        Statement st = conn.createStatement();
         res=st.executeUpdate("Select wifi from charges");
  }
  catch(Exception e){
    System.out.println("Problème de connexion avec la BD");
    System.out.println(e.getMessage());
    }  
      
   }
    
    
   
   public void payercharge() {
      // TODO: implement
   }
}
