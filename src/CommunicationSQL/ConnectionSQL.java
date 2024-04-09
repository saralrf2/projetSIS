///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package CommunicationSQL;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.Random;
//import java.util.Scanner;
//
//public class ConnectionSQL {
//
//    String jdbcDriver;
//    String dbUrl;
//    Connection connection;
//    Scanner scanner;
//
//    public ConnectionSQL() throws ClassNotFoundException, SQLException {
//        jdbcDriver = "oracle.jdbc.driver.OracleDriver";
//        dbUrl = "jdbc:oracle:thin:@im2ag-oracle.univ-grenoble-alpes.fr:1521:im2ag";
////        connection = DriverManager.getConnection(dbUrl, "qezbourn", "d87b488b99");
////        this.connection = connection;
//        scanner = new Scanner(System.in);
//        
//        // Chargement du driver
//            Class.forName(jdbcDriver);
//            // Paramétrage de la limite de temps pour la tentative de connexion (en secondes)
//            DriverManager.setLoginTimeout(4);
//            // Tentative de connexion
//            
//
//    }
//
//    
//
//}
