/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interopérabilité;

import ca.uhn.hl7v2.HL7Exception;
import java.io.IOException;

/**
 *
 * @author alana
 */
public class MainSend {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws HL7Exception, IOException {
        final String SERVER_HOST = "localhost"; // Mettez l'adresse IP ou le nom d'hôte du serveur approprié
        final int SERVER_PORT = 50000; // Mettez le port approprié

        HL7MessageSender messageSender = new HL7MessageSender(SERVER_HOST, SERVER_PORT);

        // Créer un message HL7
        MessageADT messageBuilder = new MessageADT();

//        String test = messageBuilder.getHL7Message();
//        String hl7Message = "MSH|^~\\&|YourSendingSystem|YourFacility|TheirReceivingSystem|TheirFacility|20240408092833||ADT^A01^ADT_A01|1712561313555|P|2.4\n"
//                + "EVN|A01|20240408092833\n"
//                + "PID|||324988||SIN^Liam||20110812\n"
//                + "PV1||P||R||||test^Smith^Jack";// Envoyer le message HL7

//        messageSender.sendMessage(hl7Message);
        System.out.println("Message HL7 à envoyer : ");
        System.out.println(messageBuilder.build());
        messageSender.sendMessage(messageBuilder.build()); // j envoie un adt
    }

}
