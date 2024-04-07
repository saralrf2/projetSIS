package Interopérabilité;

public class HL7ListeningThread extends Thread {

    private final int port;

    public HL7ListeningThread(int port) {
        this.port = port;
    }

    @Override
    public void run() {
        HL7Listener hl7Listener = new HL7Listener(port);
        hl7Listener.startListening();
    }
}
