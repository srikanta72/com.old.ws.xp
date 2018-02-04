// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package com.irctc.web.provider;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.encoding.literal.DetailFragmentDeserializer;
import com.sun.xml.rpc.encoding.simpletype.*;
import com.sun.xml.rpc.encoding.soap.SOAPConstants;
import com.sun.xml.rpc.encoding.soap.SOAP12Constants;
import com.sun.xml.rpc.streaming.*;
import com.sun.xml.rpc.wsdl.document.schema.SchemaConstants;
import javax.xml.namespace.QName;

public class IRCTCTicket_getTicketForBooking_RequestStruct_SOAPSerializer extends ObjectSerializerBase implements Initializable {
    private static final javax.xml.namespace.QName ns1_JourneyInfo_1_QNAME = new QName("", "JourneyInfo_1");
    private static final javax.xml.namespace.QName ns2_JourneyInfo_TYPE_QNAME = new QName("http://irctc.com/partners/ticketsinfo/types", "JourneyInfo");
    private CombinedSerializer ns2_myJourneyInfo_SOAPSerializer;
    private static final javax.xml.namespace.QName ns1_PassengerInfo_2_QNAME = new QName("", "PassengerInfo_2");
    private static final javax.xml.namespace.QName ns2_PassengerInfo_TYPE_QNAME = new QName("http://irctc.com/partners/ticketsinfo/types", "PassengerInfo");
    private CombinedSerializer ns2_myPassengerInfo_SOAPSerializer;
    private static final int myJOURNEYINFO_1_INDEX = 0;
    private static final int myPASSENGERINFO_2_INDEX = 1;
    
    public IRCTCTicket_getTicketForBooking_RequestStruct_SOAPSerializer(QName type, boolean encodeType, boolean isNullable, String encodingStyle) {
        super(type, encodeType, isNullable, encodingStyle);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws java.lang.Exception {
        ns2_myJourneyInfo_SOAPSerializer = (CombinedSerializer)registry.getSerializer(SOAPConstants.NS_SOAP_ENCODING, com.irctc.web.provider.JourneyInfo.class, ns2_JourneyInfo_TYPE_QNAME);
        ns2_myPassengerInfo_SOAPSerializer = (CombinedSerializer)registry.getSerializer(SOAPConstants.NS_SOAP_ENCODING, com.irctc.web.provider.PassengerInfo.class, ns2_PassengerInfo_TYPE_QNAME);
    }
    
    public java.lang.Object doDeserialize(SOAPDeserializationState state, XMLReader reader,
        SOAPDeserializationContext context) throws java.lang.Exception {
        com.irctc.web.provider.IRCTCTicket_getTicketForBooking_RequestStruct instance = new com.irctc.web.provider.IRCTCTicket_getTicketForBooking_RequestStruct();
        com.irctc.web.provider.IRCTCTicket_getTicketForBooking_RequestStruct_SOAPBuilder builder = null;
        java.lang.Object member;
        boolean isComplete = true;
        javax.xml.namespace.QName elementName;
        
        reader.nextElementContent();
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_JourneyInfo_1_QNAME)) {
                member = ns2_myJourneyInfo_SOAPSerializer.deserialize(ns1_JourneyInfo_1_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new com.irctc.web.provider.IRCTCTicket_getTicketForBooking_RequestStruct_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, myJOURNEYINFO_1_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setJourneyInfo_1((com.irctc.web.provider.JourneyInfo)member);
                }
                reader.nextElementContent();
            }
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_PassengerInfo_2_QNAME)) {
                member = ns2_myPassengerInfo_SOAPSerializer.deserialize(ns1_PassengerInfo_2_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new com.irctc.web.provider.IRCTCTicket_getTicketForBooking_RequestStruct_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, myPASSENGERINFO_2_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setPassengerInfo_2((com.irctc.web.provider.PassengerInfo)member);
                }
                reader.nextElementContent();
            }
        }
        
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (isComplete ? (java.lang.Object)instance : (java.lang.Object)state);
    }
    
    public void doSerializeAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws java.lang.Exception {
        com.irctc.web.provider.IRCTCTicket_getTicketForBooking_RequestStruct instance = (com.irctc.web.provider.IRCTCTicket_getTicketForBooking_RequestStruct)obj;
        
    }
    
    public void doSerializeInstance(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws java.lang.Exception {
        com.irctc.web.provider.IRCTCTicket_getTicketForBooking_RequestStruct instance = (com.irctc.web.provider.IRCTCTicket_getTicketForBooking_RequestStruct)obj;
        
        ns2_myJourneyInfo_SOAPSerializer.serialize(instance.getJourneyInfo_1(), ns1_JourneyInfo_1_QNAME, null, writer, context);
        ns2_myPassengerInfo_SOAPSerializer.serialize(instance.getPassengerInfo_2(), ns1_PassengerInfo_2_QNAME, null, writer, context);
    }
}
