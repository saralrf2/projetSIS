package CommunicationSQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CopyTable {
    // Méthode pour copier le contenu d'une table source vers une table de destination
    public static void copyTable(String sourceTableName, String destinationTableName) {
        Connection connection = null;
        PreparedStatement selectStatement = null;
        PreparedStatement insertStatement = null;
        ResultSet resultSet = null;

        try {
            // Connexion à la base de données Oracle
            connection = DriverManager.getConnection("jdbc:oracle:thin:@im2ag-oracle.univ-grenoble-alpes.fr:1521:im2ag", "qezbourn", "d87b488b99");
            
            // Requête pour sélectionner les données de la table source
            String selectQuery = "SELECT * FROM " + sourceTableName;
            selectStatement = connection.prepareStatement(selectQuery);
            resultSet = selectStatement.executeQuery();

            // Requête pour insérer les données dans la table de destination
            String insertQuery = "INSERT INTO " + destinationTableName + " VALUES (?, ?, ?, ?, ?)";
            insertStatement = connection.prepareStatement(insertQuery);

            // Parcourir les résultats de la requête de sélection
            while (resultSet.next()) {
                // Ajouter les valeurs de chaque ligne dans la requête d'insertion
                insertStatement.setInt(1, resultSet.getInt("IDPATIENT"));
                insertStatement.setString(2, resultSet.getString("NOM"));
                insertStatement.setString(3, resultSet.getString("PRENOM"));
                insertStatement.setDate(4, resultSet.getDate("DATENAISSANCE"));
                insertStatement.setString(5, resultSet.getString("ADRESSE"));
                
                // Exécuter la requête d'insertion
                insertStatement.executeUpdate();
            }
            
            System.out.println("Table copied successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fermeture des ressources
            try {
                if (resultSet != null) resultSet.close();
                if (selectStatement != null) selectStatement.close();
                if (insertStatement != null) insertStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Méthode main pour tester la copie de table
    public static void main(String[] args) {
        // Spécifiez le nom de la table source et de la table de destination
        String sourceTableName = "PATIENT";
        String destinationTableName = "PATIENTS";

        Connection connection = null;
        
    }
}
