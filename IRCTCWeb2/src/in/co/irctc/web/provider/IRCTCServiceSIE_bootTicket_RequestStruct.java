// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package in.co.irctc.web.provider;


public class IRCTCServiceSIE_bootTicket_RequestStruct {
    protected in.co.irctc.web.provider.pojo.JourneyInfo JourneyInfo_1;
    protected in.co.irctc.web.provider.pojo.PassengerInfo PassengerInfo_2;
    
    public IRCTCServiceSIE_bootTicket_RequestStruct() {
    }
    
    public IRCTCServiceSIE_bootTicket_RequestStruct(in.co.irctc.web.provider.pojo.JourneyInfo JourneyInfo_1, in.co.irctc.web.provider.pojo.PassengerInfo PassengerInfo_2) {
        this.JourneyInfo_1 = JourneyInfo_1;
        this.PassengerInfo_2 = PassengerInfo_2;
    }
    
    public in.co.irctc.web.provider.pojo.JourneyInfo getJourneyInfo_1() {
        return JourneyInfo_1;
    }
    
    public void setJourneyInfo_1(in.co.irctc.web.provider.pojo.JourneyInfo JourneyInfo_1) {
        this.JourneyInfo_1 = JourneyInfo_1;
    }
    
    public in.co.irctc.web.provider.pojo.PassengerInfo getPassengerInfo_2() {
        return PassengerInfo_2;
    }
    
    public void setPassengerInfo_2(in.co.irctc.web.provider.pojo.PassengerInfo PassengerInfo_2) {
        this.PassengerInfo_2 = PassengerInfo_2;
    }
}
