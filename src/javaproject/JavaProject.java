/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import Charges.Charges;
import Charges.DAOcharges;
import Personnel.DAOPersonnel;
import Personnel.Personnel;
import Salaire.DAOsalaire;
import Salaire.Salaire;
import Societe.DAOsociete;
import Societe.societe;
import java.util.Date;
import mail.DAOmail;
import mail.mail;
import missions.DAOmission;
import missions.mission;

/**
 *
 * @author instm
 */
public class JavaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //Personne
        /*
  String nom="masouud";
 String Prenom="saad";
 String addresse = "ariana";
 int  telephone = 24082778;
 String fonction ="Projet manager";
 Personnel per1 = new Personnel();
 
 per1.setNom(nom);
 per1.setPrenom(Prenom);
 per1.setAddresse(addresse);
 per1.setTelephone(telephone);
 per1.setFonction(fonction);
 
         // instanciation du DAOEMP

         DAOPersonnel de = new DAOPersonnel();
         de.addPersonnel(per1);
        // de.supprimerPersonnel(per1); 
        */
 //Salaire:
            
       /* int montant = 1000;
        int augmentation = 200;
        int heuressupp = 24;
        Salaire per2 = new Salaire ();
        per2.setMontant(montant);
        per2.setAugmentation(augmentation);
        per2.setHeuresSupp(heuressupp);
        
        DAOsalaire re = new DAOsalaire();
        re.ajouterSalaire(per2); */
       
      // Charges:
       /*
       int loyer = 1200;
       int electricite = 450;
       int gaz = 300;
       int wifi = 200;
       
       Charges per3 = new Charges ();
       per3.setLoyer(loyer);
       per3.setElectricite(electricite);
       per3.setGaz(gaz);
       per3.setWifi(wifi);
       
       DAOcharges me = new DAOcharges();
       me.ajoutercharges(per3);
        //me.afficherelectricite();
        //System.out.println(me.getLoyer);
              */
       
       
       //mail
       /*String nom = "Confirmation mail";
       
       mail per4 = new mail ();
       per4.setNom(nom);
       
       DAOmail se = new DAOmail();
       se.ajoutermail(per4); */
       
       
       //missions:
        /*   
        String nom= "formation";
        String membre = "Med Slim";
       String date = "27/02/2019";
        String description = "Cette mission consiste à former des membres de la societé xyz";
        mission per5 = new mission();
       per5.setNom(nom);
       per5.setMembre(membre);
       per5.setDate(date);
       per5.setDescription(description);
      
        DAOmission xx = new DAOmission();
        xx.ajouterMission(per5); 
              */
        
        //Societé:
        
         int idSociete;
    String nom="Odoo";
    String addresse="Lac";
    int capital=555665;
    int chiffreDaffaire=566556;
        societe per6 = new societe();
       per6.setNom(nom);
       per6.setAddresse(addresse);
       per6.setCapital(capital);
       per6.setChiffreDaffaire(chiffreDaffaire);
      
        DAOsociete ww = new DAOsociete();
        ww.ajouterSociete(per6); 
       //ww.afficherCapital();
       //System.out.println(ww.getCapital);
              
     
    }
    
}
