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
public class testtablexiste {

    public testtablexiste() {
    }

    public void tableExiste(Statement statement, String table_name) throws SQLException {
       statement.executeUpdate(
                        "CREATE TABLE "+ table_name.toLowerCase()
                                + "(ID integer NOT NULL, "
                                + " NAME varchar(80) NOT NULL, "
                                + " FIRSTNAME varchar(80) NOT NULL, "
                                + " PRIMARY KEY (ID))");
    }
}
