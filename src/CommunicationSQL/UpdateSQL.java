/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommunicationSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author alana
 */
public class UpdateSQL {

    private String nomTable;
    private String nomColonne;
    private String nouvelleValeur;
    private String ancienneValeur;
    private String condition;
    private boolean continuer = true;

    public UpdateSQL(String nomTable, String nomColonne, String ancienneValeur) {
        this.nomTable = nomTable;
        this.nomColonne = nomColonne;
        this.nouvelleValeur = "";
        this.ancienneValeur = ancienneValeur;
        this.condition = nomColonne + " = " + ancienneValeur;
    }

    public UpdateSQL(String nomTable, String nomColonne, String nouvelleValeur, String ancienneValeur) {
        this.nomTable = nomTable;
        this.nomColonne = nomColonne;
        this.nouvelleValeur = nouvelleValeur;
        this.ancienneValeur = ancienneValeur;
        this.condition = nomColonne + " = " + ancienneValeur;
    }

    public String MettreAJour() {
        if (nouvelleValeur.equals("")) {
            String s = "UPDATE " + nomTable + " SET " + nomColonne + " = " + nouvelleValeur + " WHERE " + condition;
            return s;
        }
        String s = "UPDATE " + nomTable + " SET " + nomColonne + " = " + nouvelleValeur + " WHERE " + condition;
        return s;

    }

}
