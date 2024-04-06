/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interopérabilité;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class HL7Listener {

    private final int port;

    public HL7Listener(int port) {
        this.port = port;
    }

    public void startListening() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("En attente de connexion sur le port " + port + "...");
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Connexion acceptée depuis " + clientSocket.getInetAddress().getHostName());

                // Lecture du message HL7
                try (
                        InputStream fluxdonneesClient = clientSocket.getInputStream();
                        InputStreamReader convertionOctet = new InputStreamReader(fluxdonneesClient);
                        BufferedReader reader = new BufferedReader(convertionOctet)) {
                    
                    StringBuilder hl7Message = new StringBuilder();
                    String line;
                    //tant qu'il y a une ligne a lire dans le reader
                    while ((line = reader.readLine()) != null) {
                        // on ajoute la ligne lue au StringBuilder
                        hl7Message.append(line).append("\n");
                    }
                    System.out.println("Message HL7 reçu : ");
                    System.out.println(hl7Message.toString());

                    // Traiter le message HL7 ici
                    
                    System.out.println();
                    // Vous pouvez ajouter votre logique de traitement des messages HL7
                    
                   
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
             
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        String msg = "MSH|^~\\&|SystèmeEmetteur|FaciliteDestinataire|ApplicationEmetteur|ApplicationDestinataire|20240328120000||ADT^A04|MSGID20240328120000001|P|2.5|\n" +
                                   "EVN|A04|20240328120000|\n" +
                                   "PID|1||123456789|Doe^John||19700101|M|||123 Main St^^Anytown^TX^12345^USA||(555)555-5555|||||1234567890|\n" +
                                   "PV1|1|I|^^^Service^1||||12345^Doe^John^^^^^Facility|||||||||V1234^Doe^Jane^^^^^Facility|";
        
        //séparation 
    }

}
