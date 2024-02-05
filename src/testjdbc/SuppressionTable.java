package testjdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SuppressionTable {

    public static void main(String[] args) {
        // Nom de la classe pour le pilote Oracle
        String jdbcDriver = "oracle.jdbc.driver.OracleDriver";

        // URL du serveur IM2AG de gestion de bases de données 
        String dbUrl = "jdbc:oracle:thin:@im2ag-oracle.univ-grenoble-alpes.fr:1521:im2ag";

        // Connection avec la base de données
        Connection conn = null;

        // Etape 1 : connexion au SGBD
        try {
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
        // Note : cette requête ne nécessite pas de BD (elle utilise la table "dual")
        if (conn != null) {
            System.out.println("Connexion établie.");

            try {
                // Création de la requête
                Statement statement = conn.createStatement();
                String nomTable = "BLABLA";

               ResultSet resultSet = statement.executeQuery(
                        "SELECT table_name "
                        + "FROM user_tables "
                        + "WHERE table_name = 'blabla'");
                
                if (resultSet.isBeforeFirst()) {
                    System.out.println("La table " + nomTable + " existe.");

                    System.out.println("Suppression de la table " + nomTable);

                    // Création d'une nouvelle table
                    statement.executeUpdate(
                            "DROP TABLE " + nomTable
                    );

                } else {
                    System.out.println("La table " + nomTable + " a été supprimée.");
//                    DatabaseMetaData meta = conn.getMetaData();
//
//                    // Récupérer le nom du schéma (base de données) actuel
//                    String schema = conn.getSchema();
//
//                    // Récupérer les noms de toutes les tables dans le schéma actuel
//                    ResultSet resultats = meta.getTables(null, schema, "%", new String[]{"TABLE"});
//
//                    // Afficher les noms des tables
//                    while (resultats.next()) {
//                        String nomTable1 = resultats.getString("TABLE_NAME");
//                        System.out.println("Nom de la table : " + nomTable1);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
