/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interopérabilité;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class HL7MessageHandler {
    private final String host;
    private final int port;

    public HL7MessageHandler(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void sendMessage(String hl7Message) {
        try (Socket socket = new Socket(host, port);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {
            out.println(hl7Message);
            System.out.println("Message HL7 envoyé avec succès.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void receiveMessage() {
        try (Socket socket = new Socket(host, port);
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            System.out.println("En attente de réception du message HL7...");
            StringBuilder receivedMessage = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                receivedMessage.append(line).append("\n");
            }
            System.out.println("Message HL7 reçu :");
            System.out.println(receivedMessage.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
