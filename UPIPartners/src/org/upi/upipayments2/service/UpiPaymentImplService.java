
package org.upi.upipayments2.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import org.upi.upipayments2.service.UpiPayment;
import org.upi.upipayments2.service.UpiPaymentImplService;


/**
 * This class was generated by the JAXWS SI.
 * JAX-WS RI 2.0-b26-ea3
 * Generated source version: 2.0
 * 
 */
@WebServiceClient(name = "UpiPaymentImplService", targetNamespace = "http://service.upipayments2.upi.org/", wsdlLocation = "http://localhost:8080/UPIPayments2/upiPay?wsdl")
public class UpiPaymentImplService
    extends Service
{

    private final static URL WSDL_LOCATION;
    private final static QName UPIPAYMENTIMPLSERVICE = new QName("http://service.upipayments2.upi.org/", "UpiPaymentImplService");
    private final static QName UPIPAYMENTIMPLPORT = new QName("http://service.upipayments2.upi.org/", "UpiPaymentImplPort");

    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/UPIPayments2/upiPay?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public UpiPaymentImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UpiPaymentImplService() {
        super(WSDL_LOCATION, UPIPAYMENTIMPLSERVICE);
    }

    /**
     * 
     * @return
     *     returns UpiPayment
     */
    @WebEndpoint(name = "UpiPaymentImplPort")
    public UpiPayment getUpiPaymentImplPort() {
        return (UpiPayment)super.getPort(UPIPAYMENTIMPLPORT, UpiPayment.class);
    }

}
