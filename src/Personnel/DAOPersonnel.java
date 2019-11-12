/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personnel;

import java.sql.*;


/**
 *
 * @author instm
 */
public class DAOPersonnel {
     public  int addPersonnel(Personnel emp)
   {
       String url = "jdbc:mysql://127.0.0.1/itpartner";
       int res=0;
    try { 
        Connection conn = DriverManager.getConnection(url, "root", "");
        Statement st = conn.createStatement();
         res=st.executeUpdate("insert into Personnel (nom,prenom,addresse,telephone,fonction) values ('"+emp.getNom()+"','"+emp.getPrenom()+"','"+emp.getAddresse()+"','"+emp.getTelephone()+"','"+emp.getFonction()+"')");
       


  }
  catch(Exception e){
    System.out.println("Problème de connexion avec la BD");
    System.out.println(e.getMessage());
    }  
    return res;
    
}
   
   public void modifierPersonnel(Personnel emp) {
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
   
  public  int supprimerPersonnel(Personnel emp)
   {
       String url = "jdbc:mysql://127.0.0.1/itpartner";
       int res=0;
    try { 
        Connection conn = DriverManager.getConnection(url, "root", "");
        Statement st = conn.createStatement();
         res=st.executeUpdate("delete from Personnel where id=2");

        

  }
  catch(Exception e){
    System.out.println("Problème de connexion avec la BD");
    System.out.println(e.getMessage());
    }  
    return res;
    
}
    
}
