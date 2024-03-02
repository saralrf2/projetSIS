/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsis;

import java.util.Calendar;
        
        
        
public class DateSIS {
    private int jour; 
    private int mois; 
    private int annee; 
    
    public DateSIS(int jour, int mois, int annee){
        this.jour = jour; 
        this.mois = mois;
        this.annee = annee;
    
    }
    public String toString(){
        return getJour()+"/"+getMois()+"/"+getAnnee();
        
    }
    
    public long toMillis() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(getAnnee(), getMois() - 1, getJour(), 0, 0, 0); // -1 pour le mois car janvier est 0
        calendar.set(Calendar.MILLISECOND, 0); // Remettre les millisecondes à zéro
        return calendar.getTimeInMillis();
    }

    /**
     * @return the jour
     */
    public int getJour() {
        return jour;
    }

    /**
     * @return the mois
     */
    public int getMois() {
        return mois;
    }

    /**
     * @return the annee
     */
    public int getAnnee() {
        return annee;
    }
}
