package projetsis;

public class Datee implements Comparable {
    private int jour;
    private int mois;
    private int annee;
    
    public Datee(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
        }
    
    public String toString() {
        return jour + "/" + mois + "/" + annee;
        }
    
    public boolean equals(Object o) {
        if (o instanceof Datee) {
            Datee d = (Datee)o;
            return (annee == d.annee) && (mois == d.mois) && (jour == d.jour);
            }
        else
            return false;
        }
    
    // precondition : 'o' est une instance de 'Date' :
    public int compareTo(Object o) {
        Datee d = (Datee)o;
        if (annee != d.annee)
            return annee - d.annee;
        // ici on a forcement annee == d.annee :
        if (mois != d.mois)
            return mois  - d.mois;
        // ici on a forcement annee == d.annee et mois == d.mois :
        return jour - d.jour;
        }
    
    }
