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
public class MainSend_1 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        final String SERVER_HOST = "192.168.43.24"; // Mettez l'adresse IP ou le nom d'hôte du serveur approprié
        final int SERVER_PORT = 5678; // Mettez le port approprié

        HL7MessageSender messageSender = new HL7MessageSender(SERVER_HOST, SERVER_PORT);

        // Créer un message HL7
        String hl7Message = "MSH|^~\\&|Sender|Receiver|System|System|20240327120000||ADT^A01|123456|P|2.5|\nPID|1|1234567890|^^^^MR||Doe^John^^^^||19700101|M|||123 Some Street^^Somewhere^ON^A1B2C3^CA|||||||";
        String message = "aelxia";
        // Envoyer le message HL7
        messageSender.sendMessage(message);
        messageSender.sendMessage(hl7Message);
    }
    
}
