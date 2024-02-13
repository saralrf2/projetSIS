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

import projetsis.DateNaissance;
import java.sql.PreparedStatement;

import java.sql.SQLException;


public class CreationPatient {
    String ID;
    String nom;
    String prenom;
    DateNaissance dateNaissance;
    String adresse;
    
    public CreationPatient(String id, String nom, String prenom, DateNaissance dateNaissance, String adresse){
        this.ID = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
    }
    
    public void CreerPatient(PreparedStatement preparedStatement) throws SQLException {
        // Utilisation de PreparedStatement pour éviter les problèmes d'injection SQL
        preparedStatement.setString(1, ID);
        preparedStatement.setString(2, nom);
        preparedStatement.setString(3, prenom);
        // Utilisez la méthode setXXX appropriée pour dateNaissance
        preparedStatement.setDate(4, new java.sql.Date(dateNaissance.toMillis())); // Supposant que DateNaissance a une méthode getTime()
        preparedStatement.setString(5, adresse);

        // Exécution de la requête préparée
        preparedStatement.executeUpdate();
    }
}
