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
import projetsis.DateNaissance;
import java.sql.Date;

public class CreationActe1 {

    private int IDActeradio;
    private String tarification;
    private String codeActe;
    private String significationCode;
    private String practicien;
    private Date dateacte;

    public CreationActe1(int IDacteradio, String tarification, String codeActe, String significationcode, String practicien, Date dateacte) {
        this.IDActeradio = IDacteradio;
        this.tarification = tarification;
        this.significationCode = significationcode;
        this.practicien = practicien;
        this.dateacte = dateacte;
        this.codeActe = codeActe;
    }

    public void CreerActe(PreparedStatement preparedStatement) throws SQLException {
//        LocalDate dateJour = LocalDate.now();
//        LocalDate dateLocalDate = LocalDate.of(dateacte);
//
//        int comparison = dateNaissanceLocalDate.compareTo(dateJour);

//        if (ID > 2147483600) {
//            throw new IllegalArgumentException("L'ID du patient dépasse la valeur maximale autorisée.");
//        }
//        if (comparison > 0) {
//            throw new IllegalArgumentException("La date de l'acte est postérieure à la date du jour");
//        } else {
            preparedStatement.setString(1, String.valueOf(IDActeradio));
            preparedStatement.setString(2, codeActe);
            preparedStatement.setString(3, tarification);
            preparedStatement.setString(4, significationCode.substring(0, 1).toUpperCase() + significationCode.substring(1));
            preparedStatement.setString(5, practicien.substring(0, 1).toUpperCase() + practicien.substring(1));
            preparedStatement.setDate(6, dateacte);

            preparedStatement.executeUpdate();
//        }
    }
}
