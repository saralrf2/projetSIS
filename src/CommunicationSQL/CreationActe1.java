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
import java.time.ZoneId;
import javax.swing.JOptionPane;
import projetsis.DateSIS;
import java.sql.Date;

public class CreationActe1 {

    private int IDActeradio;
    private double tarification;
    private String codeActe;
    private String significationCode;
    private String practicien;
    private DateSIS dateacte;
    private int idpatient;

    public CreationActe1(int IDacteradio, String codeActe, String significationcode, String practicien, DateSIS dateacte, int idpatientdouble, double tarification) {
        this.IDActeradio = IDacteradio;
        this.tarification = tarification;
        this.significationCode = significationcode;
        this.practicien = practicien;
        this.dateacte = dateacte;
        this.codeActe = codeActe;
        this.idpatient = idpatient;
    }

    public void CreerActe(PreparedStatement preparedStatement) throws SQLException {
        LocalDate dateJour = LocalDate.now();
        LocalDate dateacteLocalDate = LocalDate.of(dateacte.getAnnee(), dateacte.getMois(), dateacte.getJour());

        int comparison = dateacteLocalDate.compareTo(dateJour);

//        if (ID > 2147483600) {
//            throw new IllegalArgumentException("L'ID du patient dépasse la valeur maximale autorisée.");
//        }
        if (comparison > 0) {
            throw new IllegalArgumentException("La date de l'acte est postérieure à la date du jour");
        } else {
            preparedStatement.setString(1, String.valueOf(IDActeradio));
            preparedStatement.setString(2, codeActe);
            preparedStatement.setDouble(6, tarification);
            preparedStatement.setString(3, significationCode.substring(0, 1).toUpperCase() + significationCode.substring(1));
            preparedStatement.setString(4, practicien.substring(0, 1).toUpperCase() + practicien.substring(1));
            preparedStatement.setDate(5, java.sql.Date.valueOf(dateacteLocalDate));
//            preparedStatement.setInt(6, idpatient);

            preparedStatement.executeUpdate();
//        }
        }
    }
}
