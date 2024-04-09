package CommunicationSQL;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import projetsis.DateSIS;
import UI.DossierMedicalRadiologie;

/**
 * Classe représentant la création d'un acte radiologique dans la base de
 * données.
 */
public class CreationActe {

    private int IDActeradio;
    private double tarification;
    private String codeActe;
    private String significationCode;
    private String practicien;
    private DateSIS dateacte;
    private int idpatient;
    private DossierMedicalRadiologie acte;

    /**
     * Constructeur de la classe CreationActe.
     *
     * @param acte Objet DossierMedicalRadiologie représentant l'acte médical.
     * @param IDacteradio Identifiant de l'acte radiologique.
     * @param codeActe Code de l'acte radiologique.
     * @param significationcode Signification du code de l'acte radiologique.
     * @param practicien Nom du praticien effectuant l'acte.
     * @param dateacte Date de l'acte radiologique.
     * @param idpatient Identifiant du patient associé à l'acte.
     * @param tarification Tarification de l'acte radiologique.
     */
    public CreationActe(DossierMedicalRadiologie acte, int IDacteradio, String codeActe, String significationcode, String practicien, DateSIS dateacte, int idpatientdouble, double tarification) {
        this.IDActeradio = IDacteradio;
        this.tarification = tarification;
        this.significationCode = significationcode;
        this.practicien = practicien;
        this.dateacte = dateacte;
        this.codeActe = codeActe;
        this.acte = acte;
        this.idpatient = acte.getIdPatient();
    }

    /**
     * Méthode pour créer un nouvel acte radiologique dans la base de données.
     *
     * @param preparedStatement PreparedStatement pour exécuter la requête
     * d'insertion.
     * @throws SQLException si une erreur SQL survient lors de l'exécution de la
     * requête.
     */
    public void CreerActe(PreparedStatement preparedStatement) throws SQLException {
        LocalDate dateJour = LocalDate.now();
        LocalDate dateacteLocalDate = LocalDate.of(dateacte.getAnnee(), dateacte.getMois(), dateacte.getJour());

        // Comparaison de la date de l'acte avec la date du jour
        int comparison = dateacteLocalDate.compareTo(dateJour);

        // Récupération des informations sur le code de l'acte radiologique
        EnumerationCodesActesRadiologiques code = EnumerationCodesActesRadiologiques.valueOf(codeActe);
        tarification = code.getCout();
        significationCode = code.getLibelle();

        // Vérification des contraintes sur l'ID de l'acte et la date de l'acte
        if (IDActeradio > 2147483600) {
            throw new IllegalArgumentException("L'ID de l'acte dépasse la valeur maximale autorisée.");
        }
        if (comparison > 0) {
            throw new IllegalArgumentException("La date de l'acte est postérieure à la date du jour");
        } else {
            // Configuration des paramètres pour la requête d'insertion
            preparedStatement.setString(1, String.valueOf(IDActeradio));
            preparedStatement.setString(2, codeActe);
            preparedStatement.setDouble(7, tarification);
            preparedStatement.setString(3, significationCode.substring(0, 1).toUpperCase() + significationCode.substring(1));
            preparedStatement.setString(4, practicien.substring(0, 1).toUpperCase() + practicien.substring(1));
            preparedStatement.setDate(5, java.sql.Date.valueOf(dateacteLocalDate));
            preparedStatement.setInt(6, idpatient);

            // Exécution de la requête d'insertion
            preparedStatement.executeUpdate();
        }
    }
}
