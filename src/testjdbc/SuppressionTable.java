import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SuppressionTable {

    public static void main(String[] args) {
        String jdbcDriver = "oracle.jdbc.driver.OracleDriver";
        String dbUrl = "jdbc:oracle:thin:@im2ag-oracle.univ-grenoble-alpes.fr:1521:im2ag";
        Connection conn = null;

        try {
            Class.forName(jdbcDriver);
            DriverManager.setLoginTimeout(4);
            conn = DriverManager.getConnection(dbUrl, "qezbourn", "d87b488b99");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SuppressionTable.class.getName()).log(Level.SEVERE, null, ex);
            return; // Quitte le programme si la connexion échoue
        }

        if (conn != null) {
            System.out.println("Connexion établie.");

            try {
                Statement statement = conn.createStatement();
                String nomTable = "MANON";

                // Utilisation de PreparedStatement pour éviter les problèmes d'injection SQL
                PreparedStatement preparedStatement = conn.prepareStatement(
                        "SELECT table_name FROM user_tables WHERE table_name = ?");
                preparedStatement.setString(1, nomTable.toUpperCase()); // Convertir en majuscules
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    System.out.println("La table " + nomTable + " existe.");
                    System.out.println("Suppression de la table " + nomTable);
                    statement.executeUpdate("DROP TABLE " + nomTable);
                    System.out.println("La table " + nomTable + " a été supprimée.");
                } else {
                    System.out.println("La table " + nomTable + " n'existe pas.");
                }

            } catch (SQLException e) {
                Logger.getLogger(SuppressionTable.class.getName()).log(Level.SEVERE, null, e);
            } finally {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SuppressionTable.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
