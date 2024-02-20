/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommunicationSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.Random;
import java.util.Scanner;
import projetsis.DateNaissance;

public class MainSQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@im2ag-oracle.univ-grenoble-alpes.fr:1521:im2ag", "qezbourn", "d87b488b99");
//
////        CreationTable test = new CreationTable();
////
////        Statement st = conn.createStatement();
////
////        test.creationTable(st, "manonp");
//        String sql = "INSERT INTO PATIENT (IDPatient, nom, prenom, dateNaissance, adresse) VALUES (?, ?, ?, ?, ?)";
//        PreparedStatement preparedStatement = conn.prepareStatement(sql);
//
//        CreationPatient patient = new CreationPatient("4", "VIOLETTE", "Alana", new DateNaissance(28, 01, 2001), "5 rue");
//        // Appel de la méthode CreerPatient() avec le PreparedStatement
//        patient.CreerPatient(preparedStatement);
//
//        // Fermeture du PreparedStatement et de la connexion
//        preparedStatement.close();
//        conn.close();

//        String nomPatient = "VIOLETTE";
//        String query = "DELETE FROM PATIENT WHERE nom = ?";
//        PreparedStatement preparedStatementDeux = conn.prepareStatement(query);
//        preparedStatementDeux.setString(1, "VIOLETTE");
//        
//        SupprimerPatient supprimerPatient = new SupprimerPatient();
//        supprimerPatient.supprimerPatient(preparedStatementDeux, "VIOLETTE");
//        preparedStatementDeux.close();
//        conn.close();
        
        
//        NewClass patientManager = new NewClass();
//        // Appel de la méthode pour supprimer le patient VIOLETTE en passant la connexion en argument
//        patientManager.supprimerPatientViolette(conn);
//        conn.close();

    }
}
