/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommunicationSQL;

/**
 *
 * @author alana
 */
import UI.AjoutPatient;
import UI.Connexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import projetsis.DateNaissance;

public class CreationPatient {

    private int ID;
    private String nom;
    private String prenom;
    private DateNaissance dateNaissance;
    private String adresse;

    public CreationPatient(int id, String nom, String prenom, DateNaissance dateNaissance, String adresse) {
        this.ID = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;

    }

    public Date convertirDateNaissance() {//permet de convertir un type DateNaissance en LocalDate
        LocalDate localDateDeNaissance = LocalDate.of(dateNaissance.getJour(), dateNaissance.getMois(), dateNaissance.getAnnee());
        return Date.from(localDateDeNaissance.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }
    
    public void CreerPatient(PreparedStatement preparedStatement) throws SQLException {

        LocalDate dateJour = LocalDate.now();//Permet de récupérer la date du jour
        Date dateduJour = Date.from(dateJour.atStartOfDay(ZoneId.systemDefault()).toInstant());//permet de convertir un type LocalDate en Date
        
        Date date = this.convertirDateNaissance();//appel de la méthode permettant la conversion dateNaissance en Date
//        System.out.println("test"+date);// ça ressort bien la bonne transformation
//        System.out.println(dateduJour);
        int comparison = date.compareTo(dateduJour);// permet de comparer les date entre elles
        
        if (ID > 2147483600) {//test si l'IDPatient entré est valide donc en dépasse pas la taille limite des int
            throw new IllegalArgumentException("L'ID du patient dépasse la valeur maximale autorisée.");
        } 
        if(comparison >0){//test si la dateNaissance est bien antérieure à la date du jour
             throw new IllegalArgumentException("La date de naissance est postérieure à la date du jour");

        } else {//si toutes les conditions sont valides on créer les attributs au sein de la BD
            preparedStatement.setString(1, String.valueOf(ID));//le premier paramètre de la méthode permet de classer les attributs dans les bonnes colonnes
            preparedStatement.setString(2, nom.toUpperCase());//Permet une nomenclature universelle
            preparedStatement.setString(3, prenom.substring(0,1).toUpperCase()+prenom.substring(1));//Les prénoms commencent par une majuscule
            preparedStatement.setDate(4, new java.sql.Date(dateNaissance.getJour(), dateNaissance.getMois(), dateNaissance.getAnnee()));//permet d'avoir notre format dateNaissance compatible avec les date en sql

            preparedStatement.setString(5, adresse);

            preparedStatement.executeUpdate(); //cela permet de manipuler le SQL, donc d'insert, update, delete

        }
    }
}
