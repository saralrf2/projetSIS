/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interopérabilité;

import ca.uhn.hl7v2.DefaultHapiContext;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.message.ADT_A01;
import ca.uhn.hl7v2.parser.Parser;
import ca.uhn.hl7v2.parser.PipeParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class HL7Listener {

    private final int port;
    private MessageADT lastReceivedMessage;

    public HL7Listener(int port) {
        this.port = port;
        this.lastReceivedMessage = null;
    }

    public void startListening() throws HL7Exception {
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

                   
                    // Utiliser HAPI pour parser le message HL7
        HapiContext context = new DefaultHapiContext();
        Parser parser = context.getGenericParser();
        Message hl7ParsedMessage = parser.parse(hl7Message.toString()); //ici ca coince
        
        // Vérifier si le message parsé est un ADT_A01
        if (hl7ParsedMessage instanceof ADT_A01) {
            
            ADT_A01 adtMessage = (ADT_A01) hl7ParsedMessage;
            // Maintenant vous pouvez manipuler adtMessage qui est de type ADT_A01
            // Par exemple, vous pouvez accéder aux segments et champs comme suit :
            String patientName = adtMessage.getPID().getPatientName(0).getFamilyName().getSurname().getValue();
            System.out.println("Nom du patient : " + patientName);
        } else {
            System.out.println("Le message n'est pas de type ADT_A01.");
        }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public MessageADT getLastReceivedMessage() {
        return lastReceivedMessage;
    }

}
