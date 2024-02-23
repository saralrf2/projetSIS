/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsis;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
        
        
        
public class DateNaissance {
    private int jour; 
    private int mois; 
    private int annee; 
    
    public DateNaissance(int annee, int mois, int jour){
        this.jour = jour; 
        this.mois = mois;
        this.annee = annee;
    
    }
    public String toString(){
        return getAnnee()+"/"+getMois()+"/"+getJour();
        
    }
    
    public Datee toDate(){
        Datee date = new projetsis.Datee(this.getAnnee(),this.getMois(), this.getJour());
        return date;        
    }
    public Date toUtilDate(){
        Date date = new java.util.Date(this.getAnnee(),this.getMois(), this.getJour());
        return date;        
    }
    
     public Date convertirEnUtilDate(DateNaissance dateNaissance) {
        LocalDate localDateDeNaissance = LocalDate.of(dateNaissance.getAnnee(), dateNaissance.getMois(), dateNaissance.getJour());
        return Date.from(localDateDeNaissance.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }
    
//    public long toMillis() {
//        Calendar calendar = Calendar.getInstance();//renvoie un calendrier
//        calendar.set(getAnnee(), getMois() - 1, getJour(), 0, 0, 0); // -1 pour le mois car janvier est 0
//        calendar.set(Calendar.MILLISECOND, 0); // Remettre les millisecondes à zéro
//        return calendar.getTimeInMillis();
//    }

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
