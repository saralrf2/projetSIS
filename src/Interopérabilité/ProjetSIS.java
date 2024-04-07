/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interopérabilité;

import CommunicationSQL.ConnectionSQL;
import UI.Acceuil;
import ca.uhn.hl7v2.DefaultHapiContext;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.v24.message.ADT_A01;
import ca.uhn.hl7v2.model.v24.message.MDM_T02;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alana
 */
public class ProjetSIS {

    /**
     * @param args the command line arguments
     */
    private static HapiContext context = new DefaultHapiContext();

    public static void main(String[] args) throws HL7Exception, IOException, Exception {
//        String msg = "MSH|^~\\&|SystèmeEmetteur|FaciliteDestinataire|ApplicationEmetteur|ApplicationDestinataire|20240328120000||ADT^A04|MSGID20240328120000001|P|2.5|\n"
//                + "EVN|A04|20240328120000|\n"
//                + "PID|1||123456789|test||19700101|M|||123 Main St^^Anytown^TX^12345^USA||(555)555-5555|||||1234567890|\n"
//                + "PV1|1|I|^^^Service^1||||12345^Doe^John^^^^^Facility|||||||||V1234^Doe^Jane^^^^^Facility|";

        MessageADT messageBuilder = new MessageADT();
        
        String test = messageBuilder.getHL7Message();
        System.out.println(test);
//
        ADT_A01 tut = messageBuilder.build();
        
        System.out.println(tut.getPID().encode());
        
        System.out.println("id " + tut.getPID().getPatientIdentifierList(0).getID());
        System.out.println("Nom " +tut.getPID().getPatientName(0).getFamilyName().getSurname());
        System.out.println("Prenom "+ tut.getPID().getPatientName(0).getGivenName());
        System.out.println("date "+ tut.getPID().getDateTimeOfBirth().getTimeOfAnEvent());
        
        MessageMDM messageBuilderMDM = new MessageMDM();
        String MDM = messageBuilderMDM.getHL7Message();
        MDM_T02 lol = messageBuilderMDM.build();
        System.out.println("MDM " + MDM);
        
        
//       AjoutPatientInterop nouveauPAtient = new AjoutPatientInterop(tut);
//       nouveauPAtient.AjoutPatient();
        
        
        

    }

}
