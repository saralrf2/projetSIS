package testjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SupprimerPatient {

//     Méthode pour supprimer un patient avec le nom "VIOLETTE" de la table PATIENT
    public void supprimerPatientViolette(Connection conn) {
        PreparedStatement stmt = null;
        try {
//             Requête SQL pour supprimer le patient avec le nom "VIOLETTE"
            String sql = "DELETE FROM PATIENT WHERE IDPATIENT = 1";
            stmt = conn.prepareStatement(sql);
//            stmt.setString(1, "1");

//             Exécution de la requête de suppression
            int rowsAffected = stmt.executeUpdate();
            System.out.println(rowsAffected + " patient(s) supprimé(s) avec succès.");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
//             Fermeture de la ressource PreparedStatement
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws SQLException {
        // Supposons que vous avez déjà une connexion à la base de données
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@im2ag-oracle.univ-grenoble-alpes.fr:1521:im2ag", "qezbourn", "d87b488b99");

        // Création d'une instance de PatientManager
        SupprimerPatient patientManager = new SupprimerPatient();
        // Appel de la méthode pour supprimer le patient VIOLETTE en passant la connexion en argument
        patientManager.supprimerPatientViolette(conn);

        // N'oubliez pas de fermer la connexion lorsque vous avez fini avec elle
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
