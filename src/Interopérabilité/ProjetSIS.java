
package Interopérabilité;

import ca.uhn.hl7v2.DefaultHapiContext;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.v24.message.ADT_A01;
import java.io.IOException;
public class ProjetSIS {

    private static HapiContext context = new DefaultHapiContext();

    public static void main(String[] args) throws HL7Exception, IOException, Exception {
// creation msg adt
//        MessageADT messageBuilder = new MessageADT();
//        
//        String test = messageBuilder.getHL7Message();
//        System.out.println(String.valueOf(messageBuilder.getHL7Message()));
////
//        ADT_A01 tut = messageBuilder.build();
        
        try {
            MessageADT messageADT = new MessageADT();
            ADT_A01 adtMessage = messageADT.getAdtMessage();
            System.out.println(adtMessage);
            // Maintenant vous avez un objet ADT_A01 prêt à être envoyé ou utilisé
            // Vous pouvez l'envoyer en utilisant une méthode appropriée d'envoi de message HL7
        } catch (HL7Exception | IOException e) {
            System.err.println("Erreur lors de la construction du message ADT_A01 : " + e.getMessage());
        }
    }
        
//        System.out.println(tut.encode());
//        
//        System.out.println("id " + tut.getPID().getPatientIdentifierList(0).getID());
//        System.out.println("Nom " +tut.getPID().getPatientName(0).getFamilyName().getSurname());
//        System.out.println("Prenom "+ tut.getPID().getPatientName(0).getGivenName());
//        System.out.println("date "+ tut.getPID().getDateTimeOfBirth().getTimeOfAnEvent());
//        
//       
        
//        
//       AjoutPatientInterop nouveauPAtient = new AjoutPatientInterop(tut);
//       nouveauPAtient.AjoutPatient();
//        
//        
//         MessageMDM messageBuilderMDM = new MessageMDM();
//        String MDM = messageBuilderMDM.getHL7Message();
//        MDM_T02 lol = messageBuilderMDM.build();
//        System.out.println("MDM " + MDM);

    }