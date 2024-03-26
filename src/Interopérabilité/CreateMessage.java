package Interopérabilité;

import ca.uhn.hl7v2.DefaultHapiContext;
import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v25.message.ADT_A01;
import ca.uhn.hl7v2.parser.Parser;

public class CreateMessage {
    public static void main(String[] args) throws Exception {
        // Créer le contexte HAPI
        HapiContext context = new DefaultHapiContext();

        // Créer un message ADT_A01
        ADT_A01 adt = new ADT_A01();

        // Remplir les champs du message ADT_A01
        adt.initQuickstart("ADT", "A01", "P");

        // Remplir les informations sur le patient
        adt.getPID().getPatientName(0).getFamilyName().getSurname().setValue("PATEAU");
        adt.getPID().getPatientName(0).getGivenName().setValue("Thomas");
//        adt.getPID().getDateTimeOfBirth().getTimeOfAnEvent().setValue("19800101000000");
        adt.getPID().getAdministrativeSex().setValue("M");

        // Convertir le message en chaîne HL7
        Parser parser = context.getPipeParser();
        String encodedMessage = parser.encode(adt);

        // Afficher le message HL7
        System.out.println("Message HL7 généré :");
        System.out.println(encodedMessage);
    }
}
