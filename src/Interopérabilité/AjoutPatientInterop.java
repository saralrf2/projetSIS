/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interopérabilité;

import CommunicationSQL.CreationPatient;
import CommunicationSQL.GestionnaireCommunicationSQL;
import UI.AjoutPatient;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.v24.datatype.ST;
import ca.uhn.hl7v2.model.v24.message.ADT_A01;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import projetsis.DateSIS;

/**
 *
 * @author alana
 */
public class AjoutPatientInterop {

    private String nom;
    private String prenom;
    private DateSIS date;
    private int id;
    private Connection conn;

    public AjoutPatientInterop(ADT_A01 admission) throws HL7Exception, IOException {
        MessageADT messageBuilder = new MessageADT();
        admission = messageBuilder.build();

        id = Integer.parseInt(String.valueOf(admission.getPID().getPatientIdentifierList(0).getID()));
        nom = String.valueOf(admission.getPID().getPatientName(0).getFamilyName().getSurname());
        prenom = String.valueOf(admission.getPID().getPatientName(0).getGivenName());

        date = new DateSIS(String.valueOf(admission.getPID().getDateTimeOfBirth().getTimeOfAnEvent()));
        
        conn = GestionnaireCommunicationSQL.obtenirConnexion();

    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    public void AjoutPatient() {
        CreationPatient nouveauPatient = new CreationPatient(id, nom, prenom, date, "adresseinconnue");

        GestionnaireCommunicationSQL.insererPatient(conn, nouveauPatient);
    }

}
