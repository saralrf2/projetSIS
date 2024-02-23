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

public class TestConnexionEtRequetes {

    public static void main(String[] args) {
        // Nom de la classe pour le pilote Oracle
        String jdbcDriver = "oracle.jdbc.driver.OracleDriver";

        // URL du serveur IM2AG de gestion de bases de données 
        String dbUrl = "jdbc:oracle:thin:@im2ag-oracle.univ-grenoble-alpes.fr:1521:im2ag";

        // Connection avec la base de données
        Connection connection = null;

        // Etape 1 : connexion au SGBD
        try {
            // Lecture de l'identifiant et du mot de passe
            Scanner scanner = new Scanner(System.in);
            System.out.println("Veuillez saisir votre identifiant :");
            String username = scanner.nextLine();
            System.out.println("Veuillez saisir votre mot de passe :");
            String password = scanner.nextLine();

            // Chargement du driver
            Class.forName(jdbcDriver);
            // Paramétrage de la limite de temps pour la tentative de connexion (en secondes)
            DriverManager.setLoginTimeout(4);
            // Tentative de connexion
            connection = DriverManager.getConnection(dbUrl, username, password);

        } catch (ClassNotFoundException ex) {
            // En cas de driver introuvable
            Logger.getLogger(TestConnexionEtRequetes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            // En cas d'erreur SQL au niveau du serveur de la BD
            Logger.getLogger(TestConnexionEtRequetes.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Si la connection est établie, tester une requête simple 
        // Note : cette requête ne nécessite pas de BD (elle utilise la table "dual")
        if (connection != null) {
            System.out.println("Connexion établie.");

            try {
                // Création de la requête
                Statement statement = connection.createStatement();

                // Demande d'exécution de la requête et récupération du résultat
                ResultSet resultSet = statement.executeQuery(
                        "SELECT 'La date d''aujourd''hui est '||"
                        + "to_char (sysdate, 'DD/MM/YYYY')"
                        + "FROM dual");

                // Affichage du résultat sur la sortie standard
                while (resultSet.next()) {
                    System.out.println(resultSet.getString(1));
                }

                // Vérifier si la table "blabla" existe déjà
                resultSet = statement.executeQuery(
                        "SELECT table_name "
                        + "FROM user_tables "
                        + "WHERE table_name = 'blabla'");
                // Si la réponse est vide, alors il n'y a pas de table blabla
                if (!resultSet.isBeforeFirst()) {
                    System.out.println("La table \"blabla\" n'existe pas.");

                    System.out.println("Creation de la table \"blabla\"");

                    // Création d'une nouvelle table
                    statement.executeUpdate(
                            "CREATE TABLE blabla "
                            + "(ID integer NOT NULL, "
                            + " NAME varchar(80) NOT NULL, "
                            + " FIRSTNAME varchar(80) NOT NULL, "
                            + " PRIMARY KEY (ID))");

                } else {
                    System.out.println("La table \"blabla\" existe.");
                }

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
                        "INSERT INTO blabla "
                        + "values(" + id + ", '" + name + "', '" + firstName + "')");

                // Lister le contenu de la table blabla
                resultSet = statement.executeQuery(
                        "SELECT ID, NAME, FIRSTNAME "
                        + "FROM blabla");
                while (resultSet.next()) {
                    id = resultSet.getInt("ID");
                    name = resultSet.getString("NAME");
                    firstName = resultSet.getString("FIRSTNAME");
                    System.out.println(name + " " + firstName + " a l'id " + id);
                }
                
                // Une fois le test terminé, fermeture du flux de résultat, de la requête et de la connexion
                resultSet.close();
                statement.close();
                connection.close();

            } catch (SQLException ex) {
                System.out.println("Erreur SQL :");
                // En cas d'erreur SQL au niveau du serveur de la BD
                Logger.getLogger(TestConnexionEtRequetes.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            // La connexion n'a pas pu être établie (la référence vaut null)
            System.out.println("Problème de connexion. Vérifiez votre configuration réseau.");
        }
    }
}