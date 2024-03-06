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
                        "CREATE TABLE "+ table_name.toLowerCase()
                                + "(ID integer NOT NULL, "
                                + " NAME varchar(80) NOT NULL, "
                                + " FIRSTNAME varchar(80) NOT NULL, "
                                + " PRIMARY KEY (ID))");
    }
}
