// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package com.ola.services;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.encoding.literal.DetailFragmentDeserializer;
import com.sun.xml.rpc.encoding.simpletype.*;
import com.sun.xml.rpc.encoding.soap.SOAPConstants;
import com.sun.xml.rpc.encoding.soap.SOAP12Constants;
import com.sun.xml.rpc.streaming.*;
import com.sun.xml.rpc.wsdl.document.schema.SchemaConstants;
import javax.xml.namespace.QName;

public class RideDetails_SOAPSerializer extends ObjectSerializerBase implements Initializable {
    private static final javax.xml.namespace.QName ns1_cabNo_QNAME = new QName("", "cabNo");
    private static final javax.xml.namespace.QName ns3_string_TYPE_QNAME = SchemaConstants.QNAME_TYPE_STRING;
    private CombinedSerializer ns3_myns3_string__java_lang_String_String_Serializer;
    private static final javax.xml.namespace.QName ns1_driverName_QNAME = new QName("", "driverName");
    private static final javax.xml.namespace.QName ns1_driverMobileNo_QNAME = new QName("", "driverMobileNo");
    private static final javax.xml.namespace.QName ns1_estimatedAmount_QNAME = new QName("", "estimatedAmount");
    private static final javax.xml.namespace.QName ns3_float_TYPE_QNAME = SchemaConstants.QNAME_TYPE_FLOAT;
    private CombinedSerializer ns3_myns3__float__float_Float_Serializer;
    private static final int myCABNO_INDEX = 0;
    private static final int myDRIVERNAME_INDEX = 1;
    private static final int myDRIVERMOBILENO_INDEX = 2;
    private static final int myESTIMATEDAMOUNT_INDEX = 3;
    
    public RideDetails_SOAPSerializer(QName type, boolean encodeType, boolean isNullable, String encodingStyle) {
        super(type, encodeType, isNullable, encodingStyle);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws java.lang.Exception {
        ns3_myns3_string__java_lang_String_String_Serializer = (CombinedSerializer)registry.getSerializer(SOAPConstants.NS_SOAP_ENCODING, java.lang.String.class, ns3_string_TYPE_QNAME);
        ns3_myns3__float__float_Float_Serializer = (CombinedSerializer)registry.getSerializer(SOAPConstants.NS_SOAP_ENCODING, float.class, ns3_float_TYPE_QNAME);
    }
    
    public java.lang.Object doDeserialize(SOAPDeserializationState state, XMLReader reader,
        SOAPDeserializationContext context) throws java.lang.Exception {
        com.ola.services.RideDetails instance = new com.ola.services.RideDetails();
        com.ola.services.RideDetails_SOAPBuilder builder = null;
        java.lang.Object member;
        boolean isComplete = true;
        javax.xml.namespace.QName elementName;
        
        reader.nextElementContent();
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_cabNo_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_cabNo_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new com.ola.services.RideDetails_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, myCABNO_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setCabNo((java.lang.String)member);
                }
                reader.nextElementContent();
            }
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_driverName_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_driverName_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new com.ola.services.RideDetails_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, myDRIVERNAME_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setDriverName((java.lang.String)member);
                }
                reader.nextElementContent();
            }
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_driverMobileNo_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_driverMobileNo_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new com.ola.services.RideDetails_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, myDRIVERMOBILENO_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setDriverMobileNo((java.lang.String)member);
                }
                reader.nextElementContent();
            }
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_estimatedAmount_QNAME)) {
                member = ns3_myns3__float__float_Float_Serializer.deserialize(ns1_estimatedAmount_QNAME, reader, context);
                instance.setEstimatedAmount(((Float)member).floatValue());
                reader.nextElementContent();
            }
        }
        
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (isComplete ? (java.lang.Object)instance : (java.lang.Object)state);
    }
    
    public void doSerializeAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws java.lang.Exception {
        com.ola.services.RideDetails instance = (com.ola.services.RideDetails)obj;
        
    }
    
    public void doSerializeInstance(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws java.lang.Exception {
        com.ola.services.RideDetails instance = (com.ola.services.RideDetails)obj;
        
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getCabNo(), ns1_cabNo_QNAME, null, writer, context);
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getDriverName(), ns1_driverName_QNAME, null, writer, context);
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getDriverMobileNo(), ns1_driverMobileNo_QNAME, null, writer, context);
        ns3_myns3__float__float_Float_Serializer.serialize(new Float(instance.getEstimatedAmount()), ns1_estimatedAmount_QNAME, null, writer, context);
    }
}
