/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommunicationSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author alana
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

        Connection conn;
        conn = DriverManager.getConnection("jdbc:oracle:thin:@im2ag-oracle.univ-grenoble-alpes.fr:1521:im2ag", "qezbourn", "d87b488b99");

        String query = "UPDATE PATIENT SET DATENAISSANCE = ? WHERE DATENAISSANCE = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setDate(1, java.sql.Date.valueOf("2001-01-28"));
        ps.setDate(2, java.sql.Date.valueOf("2010-12-18"));
        ps.executeUpdate();
        
    }

}
