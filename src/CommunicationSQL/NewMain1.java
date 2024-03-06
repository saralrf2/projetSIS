package CommunicationSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class NewMain1 {

    public static void main(String[] args) {

        // Nom de la table parent dont vous voulez trouver les tables enfants
        String tableName = "PATIENT";

        // Établir la connexion à la base de données
        try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@im2ag-oracle.univ-grenoble-alpes.fr:1521:im2ag", "qezbourn", "d87b488b99")) {
            // Créer l'objet Statement
            Statement stmt = conn.createStatement();

            // Exécuter la requête SQL pour récupérer les informations sur les contraintes de clé étrangère
         String query = "SELECT constraint_name, constraint_type, table_name, r_constraint_name "
            + "FROM user_constraints "
            + "WHERE table_name = '" + tableName + "'";


ResultSet rs = stmt.executeQuery(query);

            // Parcourir les résultats et afficher les informations
            while (rs.next()) {
                String constraintName = rs.getString("constraint_name");
                String childTableName = rs.getString("table_name");
//                String childColumnName = rs.getString("column_name");
                String parentConstraintName = rs.getString("r_constraint_name");
                String parentConstraintType = rs.getString("constraint_type");
//                String parentTableName = rs.getString("r_table_name");
//                String parentColumnName = rs.getString("r_column_name");

                System.out.println("Contrainte de clé étrangère : " + constraintName);
                System.out.println("Table enfant : " + childTableName);
//                System.out.println("Colonne de la table enfant : " + childColumnName);
                System.out.println("Contrainte de clé étrangère parente : " + parentConstraintName);
//                System.out.println("Table parente : " + parentTableName);
                System.out.println("Colonne de la table parente : " + parentConstraintType);
//                System.out.println("Colonne de la table parente : " + parentColumnName);
                System.out.println("-------------------------------------------");
            }

            // Fermer les ressources
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
