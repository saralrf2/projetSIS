package CommunicationSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Classe utilisée pour gérer la communication avec la base de données SQL.
 */
public class GestionnaireCommunicationSQL {

    /**
     * Insère un nouveau patient dans la base de données.
     *
     * @param conn Connexion à la base de données.
     * @param nouveauPatient Instance de CreationPatient représentant le nouveau
     * patient à insérer.
     */
    public static void insererPatient(Connection conn, CreationPatient nouveauPatient) {
        try {
            String sql = "INSERT INTO PATIENT (IDPATIENT, NOM, PRENOM, DATENAISSANCE, ADRESSE) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            // Appeler la méthode CreerPatient() pour insérer les données dans la base de données
            nouveauPatient.CreerPatient(preparedStatement);

            // Fermer la connexion
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (IllegalArgumentException e) {
            if (e.getMessage().equals("L'ID du patient dépasse la valeur maximale autorisée.")) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "L'ID du patient dépasse la valeur maximale autorisée.", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Date de naissance postérieure à la date du jour", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     * Établit une connexion à la base de données.
     *
     * @return Connexion à la base de données.
     */
    public static Connection obtenirConnexion() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@im2ag-oracle.univ-grenoble-alpes.fr:1521:im2ag", "qezbourn", "d87b488b99");
        } catch (SQLException ex) {
            Logger.getLogger(GestionnaireCommunicationSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
