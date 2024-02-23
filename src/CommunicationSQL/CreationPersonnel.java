/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommunicationSQL;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class CreationPersonnel {

    private int ID;
    private String MDP;//test
    private String Poste;

    public CreationPersonnel(int id, String mdp, String poste) {
        this.ID = id;
        this.MDP = mdp;
        this.Poste = poste;
    }

    public void CreerPersonnel(PreparedStatement ps) throws SQLException {

        if (ID > 2147483600) {//test si l'IDPatient entré est valide donc en dépasse pas la taille limite des int
            throw new IllegalArgumentException("L'ID du patient dépasse la valeur maximale autorisée.");
        } else {//si toutes les conditions sont valides on créer les attributs au sein de la BD

            ps.setString(1, String.valueOf(ID));
            ps.setString(2, MDP);
            ps.setString(3, Poste.substring(0,1).toUpperCase()+Poste.substring(1));

            ps.executeUpdate(); //cela permet de manipuler le SQL, donc d'insert, update, delete
        }
    }
}