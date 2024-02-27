/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommunicationSQL;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author alana
 */
public class UpdateClass {

    public UpdateClass() {
    }

    public void UpdateTable(Statement statement, String table_name) throws SQLException {
       statement.executeUpdate(
                        "UPDATE TABLE "+ table_name.toLowerCase()
                                + " (IDACTERADIO integer NOT NULL, "
                                + " TARIFICATION integer NOT NULL, "
                                + " SIGNIFICATIONCODE varchar(80) NOT NULL, "
                                + " PRACTICIEN varchar(80) NOT NULL, "
                                + " DATEACTE varchar(80) NOT NULL, "
                                + " PRIMARY KEY (IDACTERADIO))");
    }
}
