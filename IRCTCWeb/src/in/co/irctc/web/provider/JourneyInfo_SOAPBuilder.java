// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package in.co.irctc.web.provider;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.util.exception.LocalizableExceptionAdapter;

public class JourneyInfo_SOAPBuilder implements SOAPInstanceBuilder {
    private in.co.irctc.web.provider.JourneyInfo _instance;
    private java.lang.String destination;
    private java.lang.String journeyDate;
    private java.lang.String source;
    private static final int myDESTINATION_INDEX = 0;
    private static final int myJOURNEYDATE_INDEX = 1;
    private static final int mySOURCE_INDEX = 2;
    
    public JourneyInfo_SOAPBuilder() {
    }
    
    public void setDestination(java.lang.String destination) {
        this.destination = destination;
    }
    
    public void setJourneyDate(java.lang.String journeyDate) {
        this.journeyDate = journeyDate;
    }
    
    public void setSource(java.lang.String source) {
        this.source = source;
    }
    
    public int memberGateType(int memberIndex) {
        switch (memberIndex) {
            case myDESTINATION_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            case myJOURNEYDATE_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            case mySOURCE_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            default:
                throw new IllegalArgumentException();
        }
    }
    
    public void construct() {
    }
    
    public void setMember(int index, java.lang.Object memberValue) {
        try {
            switch(index) {
                case myDESTINATION_INDEX:
                    _instance.setDestination((java.lang.String)memberValue);
                    break;
                case myJOURNEYDATE_INDEX:
                    _instance.setJourneyDate((java.lang.String)memberValue);
                    break;
                case mySOURCE_INDEX:
                    _instance.setSource((java.lang.String)memberValue);
                    break;
                default:
                    throw new java.lang.IllegalArgumentException();
            }
        }
        catch (java.lang.RuntimeException e) {
            throw e;
        }
        catch (java.lang.Exception e) {
            throw new DeserializationException(new LocalizableExceptionAdapter(e));
        }
    }
    
    public void initialize() {
    }
    
    public void setInstance(java.lang.Object instance) {
        _instance = (in.co.irctc.web.provider.JourneyInfo)instance;
    }
    
    public java.lang.Object getInstance() {
        return _instance;
    }
}
