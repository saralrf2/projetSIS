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
       
    }

}
