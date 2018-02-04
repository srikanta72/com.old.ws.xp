// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package com.ola.partner.service;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.util.exception.LocalizableExceptionAdapter;

public class Passenger_SOAPBuilder implements SOAPInstanceBuilder {
    private com.ola.partner.service.Passenger _instance;
    private java.lang.String passengerId;
    private java.lang.String passengerName;
    private java.lang.String passengerMobileNo;
    private java.lang.String passengerEmail;
    private int noOfPassenger;
    private static final int myPASSENGERID_INDEX = 0;
    private static final int myPASSENGERNAME_INDEX = 1;
    private static final int myPASSENGERMOBILENO_INDEX = 2;
    private static final int myPASSENGEREMAIL_INDEX = 3;
    private static final int myNOOFPASSENGER_INDEX = 4;
    
    public Passenger_SOAPBuilder() {
    }
    
    public void setPassengerId(java.lang.String passengerId) {
        this.passengerId = passengerId;
    }
    
    public void setPassengerName(java.lang.String passengerName) {
        this.passengerName = passengerName;
    }
    
    public void setPassengerMobileNo(java.lang.String passengerMobileNo) {
        this.passengerMobileNo = passengerMobileNo;
    }
    
    public void setPassengerEmail(java.lang.String passengerEmail) {
        this.passengerEmail = passengerEmail;
    }
    
    public void setNoOfPassenger(int noOfPassenger) {
        this.noOfPassenger = noOfPassenger;
    }
    
    public int memberGateType(int memberIndex) {
        switch (memberIndex) {
            case myPASSENGERID_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            case myPASSENGERNAME_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            case myPASSENGERMOBILENO_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            case myPASSENGEREMAIL_INDEX:
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
                case myPASSENGERID_INDEX:
                    _instance.setPassengerId((java.lang.String)memberValue);
                    break;
                case myPASSENGERNAME_INDEX:
                    _instance.setPassengerName((java.lang.String)memberValue);
                    break;
                case myPASSENGERMOBILENO_INDEX:
                    _instance.setPassengerMobileNo((java.lang.String)memberValue);
                    break;
                case myPASSENGEREMAIL_INDEX:
                    _instance.setPassengerEmail((java.lang.String)memberValue);
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
        _instance = (com.ola.partner.service.Passenger)instance;
    }
    
    public java.lang.Object getInstance() {
        return _instance;
    }
}