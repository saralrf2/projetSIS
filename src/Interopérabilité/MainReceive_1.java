/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interopérabilité;

/**
 *
 * @author alana
 */
public class MainReceive_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int port = 50000; // Remplacez ceci par le port approprié
        HL7Listener hl7Listener = new HL7Listener(port);
        hl7Listener.startListening();
        
        
    }
    
    
}
