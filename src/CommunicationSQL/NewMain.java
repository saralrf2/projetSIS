/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommunicationSQL;

import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author alana
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Connection conn;
        conn = DriverManager.getConnection("jdbc:oracle:thin:@im2ag-oracle.univ-grenoble-alpes.fr:1521:im2ag", "qezbourn", "d87b488b99");
        String creerTable = "CREATE TABLE ACTERADIOLOGIQUE (IDACTERADIO INT PRIMARY KEY NOT NULL, TARIFICATION double NOT NULL, SIGNIFICATIONCODE varchar(100) NOT NULL, NOMPRACTICIEN varchar(100) NOT NULL, DATEACTE DATE NOT NULL)";
        PreparedStatement ct = conn.prepareStatement(creerTable);
        ct.executeUpdate();
        String query = "INSERT INTO MaTable (id, ma_date) VALUES (789, ?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setDate(1, Date.valueOf("1997-07-13"));
        ps.executeUpdate();

    }

}
