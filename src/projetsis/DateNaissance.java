/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsis;

import java.util.Calendar;
        
        
        
public class DateNaissance {
    private int jour; 
    private int mois; 
    private int annee; 
    
    public DateNaissance(int jour, int mois, int annee){
        this.jour = jour; 
        this.mois = mois;
        this.annee = annee;
    
    }
    public String toString(){
        return jour+"/"+mois+"/"+annee;
        
    }
    
    public long toMillis() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(annee, mois - 1, jour, 0, 0, 0); // -1 pour le mois car janvier est 0
        calendar.set(Calendar.MILLISECOND, 0); // Remettre les millisecondes à zéro
        return calendar.getTimeInMillis();
    }
}
