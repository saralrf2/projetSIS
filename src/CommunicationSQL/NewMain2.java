package CommunicationSQL;

import java.sql.*;
//

public class NewMain2 {

    // Méthode pour récupérer les contraintes de la table spécifiée

    public static void getConstraints(Connection connection, String tableName) throws SQLException {
        DatabaseMetaData metaData = connection.getMetaData();
        ResultSet resultSet = metaData.getColumns(null, null, tableName, null);
        while (resultSet.next()) {
            String columnName = resultSet.getString("COLUMN_NAME");
            String constraint = resultSet.getString("COLUMN_DEF");
            System.out.println("Contrainte sur la colonne " + columnName + ": " + constraint);
        }
    }

    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@im2ag-oracle.univ-grenoble-alpes.fr:1521:im2ag", "qezbourn", "d87b488b99")) {
            // Remplacez "ma_table" par le nom de votre table
            String tableName = "CONNEXION";

            getConstraints(connection, tableName);
        } catch (SQLException e) {
            System.err.println("Erreur lors de la connexion à la base de données : " + e.getMessage());
        }
    }
}
//}

//public class NewMain2 {
//
//    // Méthode pour récupérer les clés étrangères importées par une table
//
//    public static void getImportedKeys(Connection connection, String tableName) throws SQLException {
//        DatabaseMetaData metaData = connection.getMetaData();
//        ResultSet resultSet = metaData.getImportedKeys(null, null, tableName);
//        while (resultSet.next()) {
//            String fkTableName = resultSet.getString("FKTABLE_NAME");
//            String fkColumnName = resultSet.getString("FKCOLUMN_NAME");
//            String pkTableName = resultSet.getString("PKTABLE_NAME");
//            String pkColumnName = resultSet.getString("PKCOLUMN_NAME");
//            System.out.println("Clé étrangère sur la table " + fkTableName + " (colonne " + fkColumnName
//                    + ") référence la table " + pkTableName + " (colonne " + pkColumnName + ")");
//        }
//    }
//
//    public static void main(String[] args) {
//        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@im2ag-oracle.univ-grenoble-alpes.fr:1521:im2ag", "qezbourn", "d87b488b99")) {
//            String tableName = "PATIENT";
//            getImportedKeys(connection, tableName);
//        } catch (SQLException e) {
//            System.err.println("Erreur lors de la connexion à la base de données : " + e.getMessage());
//        }
//    }
//}
