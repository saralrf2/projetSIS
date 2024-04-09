package Interopérabilité;

import ca.uhn.hl7v2.HL7Exception;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HL7ListeningThread extends Thread {

    private final int port;

    public HL7ListeningThread(int port) {
        this.port = port;
    }

    @Override
    public void run() {
        HL7Listener hl7Listener = new HL7Listener(port);
        try {
            hl7Listener.startListening();
        } catch (HL7Exception ex) {
            Logger.getLogger(HL7ListeningThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
