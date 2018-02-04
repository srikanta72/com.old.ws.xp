// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package in.co.irctc.web.provider.pojo;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.encoding.literal.DetailFragmentDeserializer;
import com.sun.xml.rpc.encoding.simpletype.*;
import com.sun.xml.rpc.encoding.soap.SOAPConstants;
import com.sun.xml.rpc.encoding.soap.SOAP12Constants;
import com.sun.xml.rpc.streaming.*;
import com.sun.xml.rpc.wsdl.document.schema.SchemaConstants;
import javax.xml.namespace.QName;

public class Ticket_SOAPSerializer extends ObjectSerializerBase implements Initializable {
    private static final javax.xml.namespace.QName ns1_pnr_QNAME = new QName("", "pnr");
    private static final javax.xml.namespace.QName ns3_long_TYPE_QNAME = SchemaConstants.QNAME_TYPE_LONG;
    private CombinedSerializer ns3_myns3__long__long_Long_Serializer;
    private static final javax.xml.namespace.QName ns1_seatNo_QNAME = new QName("", "seatNo");
    private static final javax.xml.namespace.QName ns3_string_TYPE_QNAME = SchemaConstants.QNAME_TYPE_STRING;
    private CombinedSerializer ns3_myns3_string__java_lang_String_String_Serializer;
    private static final javax.xml.namespace.QName ns1_trainNumber_QNAME = new QName("", "trainNumber");
    private static final javax.xml.namespace.QName ns3_int_TYPE_QNAME = SchemaConstants.QNAME_TYPE_INT;
    private CombinedSerializer ns3_myns3__int__int_Int_Serializer;
    private static final int myPNR_INDEX = 0;
    private static final int mySEATNO_INDEX = 1;
    private static final int myTRAINNUMBER_INDEX = 2;
    
    public Ticket_SOAPSerializer(QName type, boolean encodeType, boolean isNullable, String encodingStyle) {
        super(type, encodeType, isNullable, encodingStyle);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws java.lang.Exception {
        ns3_myns3__long__long_Long_Serializer = (CombinedSerializer)registry.getSerializer(SOAPConstants.NS_SOAP_ENCODING, long.class, ns3_long_TYPE_QNAME);
        ns3_myns3_string__java_lang_String_String_Serializer = (CombinedSerializer)registry.getSerializer(SOAPConstants.NS_SOAP_ENCODING, java.lang.String.class, ns3_string_TYPE_QNAME);
        ns3_myns3__int__int_Int_Serializer = (CombinedSerializer)registry.getSerializer(SOAPConstants.NS_SOAP_ENCODING, int.class, ns3_int_TYPE_QNAME);
    }
    
    public java.lang.Object doDeserialize(SOAPDeserializationState state, XMLReader reader,
        SOAPDeserializationContext context) throws java.lang.Exception {
        in.co.irctc.web.provider.pojo.Ticket instance = new in.co.irctc.web.provider.pojo.Ticket();
        in.co.irctc.web.provider.pojo.Ticket_SOAPBuilder builder = null;
        java.lang.Object member;
        boolean isComplete = true;
        javax.xml.namespace.QName elementName;
        
        reader.nextElementContent();
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_pnr_QNAME)) {
                member = ns3_myns3__long__long_Long_Serializer.deserialize(ns1_pnr_QNAME, reader, context);
                instance.setPnr(((Long)member).longValue());
                reader.nextElementContent();
            }
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_seatNo_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_seatNo_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new in.co.irctc.web.provider.pojo.Ticket_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, mySEATNO_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setSeatNo((java.lang.String)member);
                }
                reader.nextElementContent();
            }
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_trainNumber_QNAME)) {
                member = ns3_myns3__int__int_Int_Serializer.deserialize(ns1_trainNumber_QNAME, reader, context);
                instance.setTrainNumber(((java.lang.Integer)member).intValue());
                reader.nextElementContent();
            }
        }
        
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (isComplete ? (java.lang.Object)instance : (java.lang.Object)state);
    }
    
    public void doSerializeAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws java.lang.Exception {
        in.co.irctc.web.provider.pojo.Ticket instance = (in.co.irctc.web.provider.pojo.Ticket)obj;
        
    }
    
    public void doSerializeInstance(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws java.lang.Exception {
        in.co.irctc.web.provider.pojo.Ticket instance = (in.co.irctc.web.provider.pojo.Ticket)obj;
        
        ns3_myns3__long__long_Long_Serializer.serialize(new Long(instance.getPnr()), ns1_pnr_QNAME, null, writer, context);
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getSeatNo(), ns1_seatNo_QNAME, null, writer, context);
        ns3_myns3__int__int_Int_Serializer.serialize(new java.lang.Integer(instance.getTrainNumber()), ns1_trainNumber_QNAME, null, writer, context);
    }
}
