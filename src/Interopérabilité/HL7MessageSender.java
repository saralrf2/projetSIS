/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interopérabilité;

import ca.uhn.hl7v2.model.v24.message.ADT_A01;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class HL7MessageSender {

    private final String host;
    private final int port;

    public HL7MessageSender(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void sendMessage(ADT_A01 hl7Message) {
        try (Socket socket = new Socket(host, port);
             OutputStream outputStream = socket.getOutputStream();
             PrintWriter out = new PrintWriter(outputStream, true)) {
            
            // Envoi du message HL7
            out.println(hl7Message);
            System.out.println("Message HL7 envoyé avec succès.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}
