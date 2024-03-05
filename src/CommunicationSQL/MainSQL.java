/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommunicationSQL;

import static java.lang.Integer.parseInt;
import java.sql.Connection;
//import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.Random;
import java.util.Scanner;
import projetsis.DateSIS;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.Date;
import static java.lang.Integer.parseInt;
import static oracle.jrockit.jfr.events.Bits.intValue;

public class MainSQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
////Connection
        Connection conn;
        conn = DriverManager.getConnection("jdbc:oracle:thin:@im2ag-oracle.univ-grenoble-alpes.fr:1521:im2ag", "qezbourn", "d87b488b99");

//
//////Création de Table
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Veuillez saisir le nom de la Table à créer :");
//        String nomTable = scanner.nextLine();
//  
//        CreationTable creationTable = new CreationTable();
//        Statement st1 = conn.createStatement();
//        creationTable.creationTable(st1, nomTable.toUpperCase());
//Creation de Patient // inutile car on a la fonctionnalité directement avec l'interface
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Veuillez saisir l'ID du Patient à créer :");
//        int IDPatient = parseInt(scanner.nextLine());
//        System.out.println("Veuillez saisir le nom du Patient à  créer :");
//        String nomPatient = scanner.nextLine();
//        System.out.println("Veuillez saisir le prennom du Patient à  créer :");
//        String prenomPatient = scanner.nextLine(); 
//        String sqlCreationTable = "INSERT INTO PATIENT (IDPatient, nom, prenom, dateNaissance, adresse) VALUES (?, ?, ?, ?, ?)"; 
//        CreationPatient nouveaupatient = new CreationPatient(IDPatient, nomPatient.toUpperCase(), prenomPatient, new DateSIS(28, 01, 2001), "5 rue");
//        PreparedStatement preparedStatementCreationPatient = conn.prepareStatement(sqlCreationTable);
//        nouveaupatient.CreerPatient(preparedStatementCreationPatient);
//        preparedStatementCreationPatient.close();
//        conn.close();
//Creation Personnel    
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Veuillez saisir l'ID du Personnel à créer :");
//        int IDPersonnel = parseInt(scanner.nextLine());
//        System.out.println("Veuillez saisir le MDP du Personnel à  créer :");
//        String MDPPersonnel = scanner.nextLine();
//        System.out.println("Veuillez saisir le prenom du Personnel à  créer :");
//        String POSTE = scanner.nextLine(); 
//      String sql = "INSERT INTO PERSONNEL (ID, MDP, POSTE) VALUES (?,?,?)";
//      PreparedStatement preparedStatementCreationPersonnel = conn.prepareStatement(sql);
//      CreationPersonnel personnel = new CreationPersonnel(IDPersonnel, MDPPersonnel, POSTE.substring(0,1).toUpperCase()+POSTE.substring(1));
//      personnel.CreerPersonnel(preparedStatementCreationPersonnel);
//      st.close();
//      conn.close();
//Suppression d'un Patient
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Veuillez saisir nomPatient à supprimer :");
//        int nomPatient = parseInt(scanner.nextLine());
//        String query = "DELETE FROM PATIENT WHERE nom = ?";
//        PreparedStatement preparedStatementSuppressionPatient = conn.prepareStatement(query);
//        preparedStatementSuppressionPatient.setString(1, nomPatient);
//        
//        double tarification = 1.5;
//        System.out.println("test = " + intValue(tarification)); 
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Veuillez saisir nom de la table à mettre à jour :");
//        String nomTable = scanner.nextLine();
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("Veuillez saisir la valeur 1 à mettre à jour :");
//        String valeur1 = scanner.nextLine();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le nom de la Table à modifier :");
        String nomTable = scanner.nextLine();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Veuillez saisir le nom de la colonne à modifier :");
        String nomcolonne = scanner.nextLine();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Veuillez saisir l'ancienne valeur :");
        String ancienneValeur = "'"+scanner.nextLine().trim()+"'";
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Veuillez saisir la valeur à modifier :");
        String nouvelleValeur = "'"+scanner.nextLine().trim()+"'";
//
        UpdateSQL majPatient = new UpdateSQL(nomTable, nomcolonne, nouvelleValeur, ancienneValeur);
        PreparedStatement ps = conn.prepareStatement(majPatient.MettreAJour());
        ps.executeUpdate();//cezuog
    }
}
