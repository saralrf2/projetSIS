package CommunicationSQL;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author alana
 */
public class CreationTable {

    public CreationTable() {
    }

    public void creationTable(Statement statement, String table_name) throws SQLException {
        statement.executeUpdate(
                "CREATE TABLE " + table_name.toLowerCase()
                + "(IDPATIENT integer NOT NULL, "
                + " NOM varchar(80) NOT NULL, "
                + " PRENOM varchar(80) NOT NULL, "
                + " DATENAISSANCE DATE NOT NULL, "
                + " ADRESSE varchar(80) NOT NULL, "
                + " PRIMARY KEY (IDPATIENT))");
    }
}
