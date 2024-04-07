package Interopérabilité;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v24.datatype.XCN;
import ca.uhn.hl7v2.model.v24.message.ADT_A01;
import ca.uhn.hl7v2.model.v24.segment.EVN;
import ca.uhn.hl7v2.model.v24.segment.MSH;
import ca.uhn.hl7v2.model.v24.segment.PID;
import ca.uhn.hl7v2.model.v24.segment.PV1;

public class MessageADT {

    private ADT_A01 adtMessage;
    
    public MessageADT() throws HL7Exception, IOException{
        adtMessage = this.build();
    }

    public ADT_A01 build() throws HL7Exception, IOException {
        String currentDateTimeString = getCurrentTimeStamp();
        adtMessage = new ADT_A01();
        adtMessage.initQuickstart("ADT", "A01", "P");
        this.createMSHSegment(currentDateTimeString);
        this.createEVNSegment(currentDateTimeString);
        this.createPIDSegment();
        this.createPv1Segment();
        
        return adtMessage;
    }

    public String getHL7Message() throws HL7Exception, IOException {
        // Concaténer tous les segments pour former le message complet
        StringBuilder hl7Message = new StringBuilder();
        hl7Message.append(adtMessage.getMSH().encode());
        hl7Message.append('\n');
        hl7Message.append(adtMessage.getEVN().encode());
        hl7Message.append('\n');
        hl7Message.append(adtMessage.getPID().encode());
        hl7Message.append('\n');
        hl7Message.append(adtMessage.getPV1().encode());

        return hl7Message.toString();
    }

    private void createMSHSegment(String currentDateTimeString) throws HL7Exception {
        MSH msh = adtMessage.getMSH();
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
        EVN evn = adtMessage.getEVN();
        evn.getEventTypeCode().setValue("A01"); // Admission
        evn.getRecordedDateTime().getTimeOfAnEvent().setValue(currentDateTimeString);
    }

    private void createPIDSegment() throws HL7Exception {
        PID pid = adtMessage.getPID();
        pid.getPatientIdentifierList(0).getID().setValue("324988"); // Patient ID
        pid.getPatientName(0).getFamilyName().getSurname().setValue("SIN");
        pid.getPatientName(0).getGivenName().setValue("Liam");
        pid.getDateTimeOfBirth().getTimeOfAnEvent().setValue("20110812");
    }

    private void createPv1Segment() throws DataTypeException {
        PV1 pv1 = adtMessage.getPV1();
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

    private String getCurrentTimeStamp() {
        return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
    }

    private String getSequenceNumber() {
        return String.valueOf(System.currentTimeMillis());
    }
}
