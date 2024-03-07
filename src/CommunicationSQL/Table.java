/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommunicationSQL;

/**
 *
 * @author alana
 */
public class Table {
    private int capaciteMax;
    private int nombreObjets;

    public Table(int capaciteMax) {
        this.capaciteMax = capaciteMax;
        this.nombreObjets = 0;
    }

    public void ajouterObjet() {
        if (nombreObjets < capaciteMax) {
            nombreObjets++;
            System.out.println("Objet ajouté à la table.");
        } else {
            System.out.println("La table est pleine, impossible d'ajouter plus d'objets.");
        }
    }

    public boolean estPleine() {
        return nombreObjets >= capaciteMax;
    }

    public int getNombreObjets() {
        return nombreObjets;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public static void main(String[] args) {
        Table table = new Table(5); // Création d'une table avec une capacité maximale de 5 objets
        
        // Ajout d'objets à la table
        table.ajouterObjet();
        table.ajouterObjet();
        table.ajouterObjet();
        table.ajouterObjet();
        table.ajouterObjet();
        
        // Vérification si la table est pleine
        if (table.estPleine()) {
            System.out.println("La table est pleine.");
        } else {
            System.out.println("Il reste de la place sur la table.");
        }
    }
}
