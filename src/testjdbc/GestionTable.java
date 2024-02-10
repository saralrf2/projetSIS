package testjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class GestionTable {
    public static void creerTable(Connection connection,String nomTable) throws SQLException {
        try {
            Statement statement = connection.createStatement();

            // Vérifier si la table "blabla" existe déjà
           
            if (!tableExiste(statement, nomTable)) {
                System.out.println("La table "+ nomTable+" n'existe pas.");

                System.out.println("Creation de la table "+ nomTable);

                // Création d'une nouvelle table
                statement.executeUpdate(
                        "CREATE TABLE "+ nomTable.toLowerCase()
                                + "(ID integer NOT NULL, "
                                + " NAME varchar(80) NOT NULL, "
                                + " FIRSTNAME varchar(80) NOT NULL, "
                                + " PRIMARY KEY (ID))");
            } else {
                System.out.println("La table "+ nomTable +" existe.");
            }

            statement.close();
        } catch (SQLException ex) {
            System.out.println("Erreur SQL :");
            throw ex;
        }
    }

    private static boolean tableExiste(Statement statement, String table_name) throws SQLException {
        String sql = "SELECT table_name FROM user_tables WHERE table_name = '" + table_name + "'";
        return statement.executeQuery(sql).isBeforeFirst();
    }

    public static void insererDonnees(Connection connection, String nomTable) throws SQLException {
        
        try {
            Statement statement = connection.createStatement();

            // Ajout d'une nouvelle ligne (avec valeurs générées à chaque nouvelle exécution)
            int id = Math.abs((int) System.currentTimeMillis()); // valeur générée à partir du temps système
            Random random = new Random();
            // nom de 10 lettres généré au hasard avec des lettre minuscules
            String name = random.ints(97 /* lettre 'a' */, 122 /* lettre 'z' */ + 1)
                    .limit(10) /* 10 lettres */
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
            // prénom de 10 lettres généré au hasard avec des lettre minuscules
            String firstName = random.ints(97 /* lettre 'a' */, 122 /* lettre 'z' */ + 1)
                    .limit(10) /* 10 lettres */
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();

            statement.executeUpdate(
                    "INSERT INTO "+nomTable+ " "
                            + "values(" + id + ", '" + name + "', '" + firstName + "')");

            statement.close();
        } catch (SQLException ex) {
            System.out.println("Erreur SQL :");
            throw ex;
        }
    }
}
