/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DatabaseMetaData;

public class Recup_Tables {

    public static void main(String[] args) throws SQLException {
        // Nom de la classe pour le pilote Oracle
        String jdbcDriver = "oracle.jdbc.driver.OracleDriver";

        // URL du serveur IM2AG de gestion de bases de données 
        String dbUrl = "jdbc:oracle:thin:@im2ag-oracle.univ-grenoble-alpes.fr:1521:im2ag";

        // Connection avec la base de données
        Connection conn = null;

        // Etape 1 : connexion au SGBD
        try {
            // Lecture de l'identifiant et du mot de passe
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Veuillez saisir votre identifiant :");
//            String username = scanner.nextLine();
//            System.out.println("Veuillez saisir votre mot de passe :");
//            String password = scanner.nextLine();

            // Chargement du driver
            Class.forName(jdbcDriver);
            // Paramétrage de la limite de temps pour la tentative de connexion (en secondes)
            DriverManager.setLoginTimeout(4);
            // Tentative de connexion
            conn = DriverManager.getConnection(dbUrl, "qezbourn", "d87b488b99");

        } catch (ClassNotFoundException ex) {
            // En cas de driver introuvable
            Logger.getLogger(TestConnexionEtRequetes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            // En cas d'erreur SQL au niveau du serveur de la BD
            Logger.getLogger(TestConnexionEtRequetes.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Si la connection est établie, tester une requête simple 
        // Note : cette 6 ne nécessite pas de BD (elle utilise la table "dual")
        if (conn != null) {
            System.out.println("Connexion établie.");

            try {
                DatabaseMetaData meta = conn.getMetaData();

                // Récupérer le nom du schéma (base de données) actuel
                String schema = conn.getSchema();

                // Récupérer les noms de toutes les tables dans le schéma actuel
                ResultSet resultats = meta.getTables(null, schema, "%", new String[]{"TABLE"});

                // Afficher les noms des tables
                while (resultats.next()) {
                    String nomTable = resultats.getString("TABLE_NAME");
                    System.out.println("Nom de la table : " + nomTable);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
