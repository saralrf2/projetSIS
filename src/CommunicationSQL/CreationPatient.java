package CommunicationSQL;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import projetsis.DateSIS;

/**
 * Classe représentant la création d'un nouveau patient dans la base de données.
 */
public class CreationPatient {

    private int ID;
    private String nom;
    private String prenom;
    private DateSIS dateNaissance;
    private String adresse;

    /**
     * Constructeur de la classe CreationPatient.
     *
     * @param id Identifiant du patient.
     * @param nom Nom du patient.
     * @param prenom Prénom du patient.
     * @param dateNaissance Date de naissance du patient (objet DateSIS).
     * @param adresse Adresse du patient.
     */
    public CreationPatient(int id, String nom, String prenom, DateSIS dateNaissance, String adresse) {
        this.ID = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
    }

    /**
     * Méthode pour créer un nouveau patient dans la base de données.
     *
     * @param preparedStatement PreparedStatement pour exécuter la requête
     * d'insertion.
     * @throws SQLException si une erreur SQL survient lors de l'exécution de la
     * requête.
     */
    public void CreerPatient(PreparedStatement preparedStatement) throws SQLException {
        LocalDate dateJour = LocalDate.now();
        LocalDate dateNaissanceLocalDate = LocalDate.of(dateNaissance.getAnnee(), dateNaissance.getMois(), dateNaissance.getJour());

        // Comparaison de la date de naissance avec la date du jour
        int comparison = dateNaissanceLocalDate.compareTo(dateJour);

        // Vérification des contraintes sur l'ID du patient et la date de naissance
        if (ID > 2147483600) {
            throw new IllegalArgumentException("L'ID du patient dépasse la valeur maximale autorisée.");
        }
        if (comparison > 0) {
            throw new IllegalArgumentException("La date de naissance est postérieure à la date du jour.");
        } else {
            // Configuration des paramètres pour la requête d'insertion
            preparedStatement.setString(1, String.valueOf(ID));
            preparedStatement.setString(2, nom.toUpperCase());
            preparedStatement.setString(3, prenom.substring(0, 1).toUpperCase() + prenom.substring(1));
            preparedStatement.setDate(4, java.sql.Date.valueOf(dateNaissanceLocalDate));
            preparedStatement.setString(5, adresse);

            // Exécution de la requête d'insertion
            preparedStatement.executeUpdate();
        }
    }

    /**
     * Méthode permettant de mettre à jour la date de naissance du patient.
     *
     * @param nouvelleDateNaissance Nouvelle date de naissance à affecter au
     * patient.
     */
    public void setDateNaissance(DateSIS nouvelleDateNaissance) {
        this.dateNaissance = nouvelleDateNaissance;
    }

}
