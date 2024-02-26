/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommunicationSQL;

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

    public void CreerPatient(PreparedStatement preparedStatement) throws SQLException {
        LocalDate dateJour = LocalDate.now();
        LocalDate dateNaissanceLocalDate = LocalDate.of(dateNaissance.getAnnee(), dateNaissance.getMois(), dateNaissance.getJour());

        int comparison = dateNaissanceLocalDate.compareTo(dateJour);

        if (ID > 2147483600) {
            throw new IllegalArgumentException("L'ID du patient dépasse la valeur maximale autorisée.");
        }
        if (comparison > 0) {
            throw new IllegalArgumentException("La date de naissance est postérieure à la date du jour");
        } else {
            preparedStatement.setString(1, String.valueOf(ID));
            preparedStatement.setString(2, nom.toUpperCase());
            preparedStatement.setString(3, prenom.substring(0, 1).toUpperCase() + prenom.substring(1));
            preparedStatement.setDate(4, java.sql.Date.valueOf(dateNaissanceLocalDate));
            preparedStatement.setString(5, adresse);

            preparedStatement.executeUpdate();
        }
    }
}
