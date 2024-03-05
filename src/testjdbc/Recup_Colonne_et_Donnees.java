package testjdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Recup_Colonne_et_Donnees {

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
            Logger.getLogger(Recup_Colonne_et_Donnees.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            // En cas d'erreur SQL au niveau du serveur de la BD
            Logger.getLogger(Recup_Colonne_et_Donnees.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Si la connexion est établie, récupérer les noms de colonnes et les données
        if (conn != null) {
            System.out.println("Connexion établie.");

            try {
               
                Scanner scanner = new Scanner(System.in);
                System.out.println("Veuillez saisir le nom de la Table à créer :");
                String nomTable = scanner.nextLine();

                // Récupérer les métadonnées de la base de données
                DatabaseMetaData metaData = conn.getMetaData();

                // Récupérer les données de la table
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM " + nomTable);
                System.out.println("\nDonnées de la table " + nomTable + " :");
                while (resultSet.next()) {
                    for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
                        String nomColonne = resultSet.getMetaData().getColumnName(i);
                        String valeurColonne = resultSet.getString(i);
                        System.out.print(nomColonne + " = " + valeurColonne + " ");
                    }
                    System.out.println();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Recup_Colonne_et_Donnees.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
