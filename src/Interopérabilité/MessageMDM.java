package Interopérabilité;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v24.datatype.XCN;
import ca.uhn.hl7v2.model.v24.message.MDM_T02;
import ca.uhn.hl7v2.model.v24.segment.EVN;
import ca.uhn.hl7v2.model.v24.segment.MSH;
import ca.uhn.hl7v2.model.v24.segment.PID;
import ca.uhn.hl7v2.model.v24.segment.PV1;
import ca.uhn.hl7v2.model.v24.datatype.NM;
import ca.uhn.hl7v2.model.v24.datatype.ST;
import ca.uhn.hl7v2.model.v24.segment.OBX;
import ca.uhn.hl7v2.model.v24.segment.ORC;
import ca.uhn.hl7v2.model.v24.segment.TXA;

public class MessageMDM {

    private MDM_T02 mdmMessage;

    public MessageMDM() throws HL7Exception, IOException, Exception {
        mdmMessage = this.build();
    }

    public MDM_T02 build() throws HL7Exception, IOException, Exception {
        String currentDateTimeString = getCurrentTimeStamp();
        mdmMessage = new MDM_T02();
        mdmMessage.initQuickstart("MDM", "T02", "P");
        this.createMSHSegment(currentDateTimeString);
        this.createEVNSegment(currentDateTimeString);
        this.createPIDSegment();
        this.createPv1Segment();
        this.createOBXSegment();
        this.createTXASegment();

        return mdmMessage;
    }

    public String getHL7Message() throws HL7Exception, IOException {
        // Concaténer tous les segments pour former le message complet
        StringBuilder hl7Message = new StringBuilder();
        hl7Message.append(mdmMessage.getMSH().encode());
        hl7Message.append('\n');
        hl7Message.append(mdmMessage.getEVN().encode());
        hl7Message.append('\n');
        hl7Message.append(mdmMessage.getPID().encode());
        hl7Message.append('\n');
        hl7Message.append(mdmMessage.getPV1().encode());
        hl7Message.append('\n');
        hl7Message.append(mdmMessage.getOBX().encode());
        hl7Message.append('\n');
        hl7Message.append(mdmMessage.getTXA().encode());

        return hl7Message.toString();
    }

    private void createMSHSegment(String currentDateTimeString) throws HL7Exception {
        MSH msh = mdmMessage.getMSH();
        msh.getFieldSeparator().setValue("|");
        msh.getEncodingCharacters().setValue("^~\\&");
        msh.getSendingApplication().getNamespaceID().setValue("YourSendingSystem");
        msh.getSendingFacility().getNamespaceID().setValue("YourFacility");
        msh.getReceivingApplication().getNamespaceID().setValue("TheirReceivingSystem");
        msh.getReceivingFacility().getNamespaceID().setValue("TheirFacility");
        msh.getDateTimeOfMessage().getTimeOfAnEvent().setValue(currentDateTimeString);
        msh.getMessageControlID().setValue(getSequenceNumber());
        msh.getVersionID().getVersionID().setValue("2.4");
    }

    private void createEVNSegment(String currentDateTimeString) throws HL7Exception {
        EVN evn = mdmMessage.getEVN();
        evn.getEventTypeCode().setValue("T02"); // Transaction
        evn.getRecordedDateTime().getTimeOfAnEvent().setValue(currentDateTimeString);
    }

    private void createPIDSegment() throws HL7Exception {
        PID pid = mdmMessage.getPID();
        pid.getPatientIdentifierList(0).getID().setValue("123456"); // Patient ID
        pid.getPatientName(0).getFamilyName().getSurname().setValue("PATEAU");
        pid.getPatientName(0).getGivenName().setValue("Thomas");
    }

    private void createPv1Segment() throws DataTypeException {
        PV1 pv1 = mdmMessage.getPV1();
        pv1.getPatientClass().setValue("P"); // to represent an 'Preadimeted patient'
        //PL assignedPatientLocation = pv1.getAssignedPatientLocation();
        //assignedPatientLocation.getFacility().getNamespaceID().setValue("Some Treatment Facility Name");
        //assignedPatientLocation.getPointOfCare().setValue("Some Point of Care");
        pv1.getAdmissionType().setValue("R"); //R pour routine 

        XCN referringDoctor = pv1.getReferringDoctor(0);
        referringDoctor.getIDNumber().setValue("test");
        referringDoctor.getFamilyName().getSurname().setValue("Smith");
        referringDoctor.getGivenName().setValue("Jack");
        //referringDoctor.getIdentifierTypeCode().setValue("456789");
        //pv1.getAdmitDateTime().getTimeOfAnEvent().setValue(getCurrentTimeStamp());
    }

    private void createOBXSegment() throws HL7Exception {
        // Créer un nouveau segment OBX
        OBX obx = mdmMessage.getOBX();

        // Définir le Set ID du segment OBX
        obx.getSetIDOBX().setValue("1"); // Choisir l'ID du set (généralement "1")

        // Définir le type de valeur (Value Type) du segment OBX
        obx.getValueType().setValue("ST"); // Ici, ST pour String

        // Définir l'identifiant de l'observation (Observation Identifier)
        obx.getObservationIdentifier().getIdentifier().setValue("001"); // Exemple d'identifiant d'observation

        // Définir la valeur de l'observation (Observation Value)
        ST observationValue = new ST(mdmMessage); // Créer un objet de type ST
        observationValue.setValue("Result value"); // Définir la valeur de l'observation
        obx.getObservationValue(0).setData(observationValue); // Ajouter la valeur à l'OBX segment

        // Définir le statut du résultat de l'observation (Observation Result Status)
        obx.getObservationResultStatus().setValue("F"); // "F" pour indiquer un résultat final

        // Définir la date/heure de l'observation (Date/Time of Observation)
        obx.getDateTimeOfTheObservation().getTimeOfAnEvent().setValue("202404050930"); // Exemple de date/heure

        // Définir l'identifiant de l'observateur responsable (Responsible Observer ID)
        obx.getResponsibleObserver().getIDNumber().setValue("Observer ID"); // Exemple d'identifiant d'observateur
    }
    
    private void createTXASegment() throws Exception {
        TXA txa = mdmMessage.getTXA();
        txa.getDocumentType().setValue("Report");
        txa.getActivityDateTime().getTimeOfAnEvent().setValue(getCurrentTimeStamp());
        txa.getTranscriptionistCodeName(0).getIDNumber().setValue("T123");
        txa.getTranscriptionDateTime().getTimeOfAnEvent().setValue(getCurrentTimeStamp());
    }

    private String getCurrentTimeStamp() {
        return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
    }

    private String getSequenceNumber() {
        return String.valueOf(System.currentTimeMillis());
    }
}
