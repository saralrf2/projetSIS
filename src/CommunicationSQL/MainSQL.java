/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommunicationSQL;

import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.Date;
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
import static java.lang.Integer.parseInt;
import java.sql.Timestamp;
import java.time.Month;
import static oracle.jrockit.jfr.events.Bits.intValue;

public class MainSQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//Connection
        Connection conn;
        conn = DriverManager.getConnection("jdbc:oracle:thin:@im2ag-oracle.univ-grenoble-alpes.fr:1521:im2ag", "qezbourn", "d87b488b99");
//        Scanner scanner00 = new Scanner(System.in);
//        System.out.println("Veuillez saisir l'action à faire");
//        String action = scanner00.nextLine();

//Création de Table
//        Scanner scanner01 = new Scanner(System.in);
//        System.out.println("Veuillez saisir le nom de la Table à créer :");
//        String nomTable0 = scanner01.nextLine();
//
//        CreationTable creationTable = new CreationTable();
//        Statement st1 = conn.createStatement();
//        creationTable.creationTable(st1, nomTable0);
////Creation de Patient // inutile car on a la fonctionnalité directement avec l'interface
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Veuillez saisir l'ID du Patient à créer :");
//        int ID = parseInt(scanner.nextLine());
//        System.out.println("Veuillez saisir le nom du Patient à  créer :");
//        String NOM = scanner.nextLine();
//        System.out.println("Veuillez saisir la date du Patient à  créer :");
//        
//        
//        
////        int jour = scanner.nextInt(); 
////        int mois = scanner.nextInt(); 
////       int annee =  scanner.nextInt(); 
////        scanner.nextLine();
//      
//        String date = scanner.nextLine();
//        String sqlCreationTable = "INSERT INTO TEST (ID, NOM, DATETEST) VALUES (?, ?, ?)"; 
////        CreationPatient nouveaupatient = new CreationPatient(IDPatient, nomPatient.toUpperCase(), prenomPatient, new DateSIS(28, 01, 2001), "5 rue");
//        PreparedStatement pds = conn.prepareStatement(sqlCreationTable);
////        nouveaupatient.CreerPatient(preparedStatementCreationPatient);
////        DateSIS dateSIS = new DateSIS(jour, mois, annee);
////        LocalDate date = LocalDate.of(dateSIS.getAnnee(),dateSIS.getMois(), dateSIS.getJour());
//                
//        pds.setString(1, String.valueOf(ID));
//        pds.setString(2, NOM);
////        pds.setDate(3,java.sql.Date.valueOf(date));//local date
//        pds.setDate(3, java.sql.Date.valueOf(date));
//        pds.executeUpdate();
//        conn.close();
//        System.out.println(java.sql.Date.valueOf(date));
////Suppression dun Patient
//        Scanner scanner000 = new Scanner(System.in);
//        System.out.println("Veuillez saisir nomPatient à supprimer :");
//        String nomPatient = "'" + scanner000.nextLine().trim() + "'";
//        String query = "DELETE FROM PATIENT WHERE PRENOM = " + nomPatient;
//        PreparedStatement preparedStatementSuppressionPatient = conn.prepareStatement(query);
//        preparedStatementSuppressionPatient.executeUpdate();
//Mettre a jour données      
//        boolean continuer = true;
//        Scanner scanner = new Scanner(System.in);
//        while (continuer) {
//            System.out.println("Veuillez saisir nom de la table à mettre à jour :");
//            String nomTable = scanner.nextLine();
//
//            System.out.println("Veuillez saisir le nom de la colonne à modifier :");
//            String nomColonne = scanner.nextLine();
//
//            System.out.println("Veuillez saisir l'ancienne valeur :");
//            String ancienneValeur = "'" + scanner.nextLine().trim() + "'";
//
//            try {
//                System.out.println("Veuillez saisir la valeur à modifier :");
//                String nouvelleValeur = "'" + scanner.nextLine().trim() + "'";
//                UpdateSQL majPatient = new UpdateSQL(nomTable, nomColonne, nouvelleValeur, ancienneValeur);
//                PreparedStatement ps = conn.prepareStatement(majPatient.MettreAJour());
//                ps.executeUpdate();
//                System.out.println("Mise à jour effectuée avec succès.");
//            } catch (Exception e) {
//                System.out.println("Une erreur s'est produite : " + e.getMessage());
//            }
//            System.out.println("Voulez-vous effectuer une autre mise à jour ? (Oui/Non)");
//            String choix = scanner.nextLine();
//            continuer = choix.equalsIgnoreCase("oui");
//   String query = "UPDATE PATIENT SET PRENOM = 'Lucie' WHERE  ADRESSE = 'adresse3'";
//        PreparedStatement ps = conn.prepareStatement(query);
//        ps.executeUpdate();
        
//        String query = "INSERT INTO PATIENT1 (IDPATIENT, NOM, PRENOM, DATENAISSANCE, ADRESSE) VALUES (1, 'COIN', 'MATHIS', ?, '1 rue')";
//        PreparedStatement ps = conn.prepareStatement(query);
//        ps.setDate(1, java.sql.Date.valueOf("1999-07-13"));
//        ps.executeUpdate();

        Code code = Code.CS;
        Code test = Code.valueOf("CS");
        Facturation facture = new Facturation(test);
        System.out.println(facture.getTarification());
        System.out.println(code.getCout());
    }
}
