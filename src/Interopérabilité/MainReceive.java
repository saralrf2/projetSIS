/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interopérabilité;

import ca.uhn.hl7v2.HL7Exception;

/**
 *
 * @author alana
 */
public class MainReceive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws HL7Exception {
        int port = 50000; // Remplacez ceci par le port approprié
        HL7Listener hl7Listener = new HL7Listener(port);
        hl7Listener.startListening();

//        AjoutPatientInterop nouveauPAtient = new AjoutPatientInterop(tut);
//        nouveauPAtient.AjoutPatient();

    }

}
