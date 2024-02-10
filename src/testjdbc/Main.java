package testjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        String jdbcDriver = "oracle.jdbc.driver.OracleDriver";
        String dbUrl = "jdbc:oracle:thin:@im2ag-oracle.univ-grenoble-alpes.fr:1521:im2ag";
        Connection connection = null;
        String nomTable = "Pauline";
        
        
        
        try {

            Class.forName(jdbcDriver);
            DriverManager.setLoginTimeout(4);
            connection = DriverManager.getConnection(dbUrl, "qezbourn", "d87b488b99");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestionTable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GestionTable.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (connection != null) {
            System.out.println("Connexion établie.");

            try {
                Statement statement = connection.createStatement();

                // Exécuter les opérations de création de table
                GestionTable.creerTable(connection, nomTable);
                GestionTable.insererDonnees(connection, nomTable);

                // Lister le contenu de la table blabla
                ResultSet resultSet = statement.executeQuery(
                        "SELECT ID, NAME, FIRSTNAME "
                        + "FROM blabla");
                while (resultSet.next()) {
                    int id = resultSet.getInt("ID");
                    String name = resultSet.getString("NAME");
                    String firstName = resultSet.getString("FIRSTNAME");
                    System.out.println(name + " " + firstName + " a l'id " + id);
                }

                resultSet.close();
                statement.close();
                connection.close();

            } catch (SQLException ex) {
                System.out.println("Erreur SQL :");
                Logger.getLogger(GestionTable.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Problème de connexion. Vérifiez votre configuration réseau.");
        }
    }
}
