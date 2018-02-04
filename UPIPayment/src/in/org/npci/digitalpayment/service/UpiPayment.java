
package in.org.npci.digitalpayment.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import in.org.npci.digitalpayment.service.UpiPayment;
import in.org.npci.digitalpayment.types.Reciept;
import in.org.npci.digitalpayment.types.UpiAccount;


/**
 * This class was generated by the JAXWS SI.
 * JAX-WS RI 2.0-b26-ea3
 * Generated source version: 2.0
 * 
 */
@WebService(name = "upiPayment", targetNamespace = "http://www.npci.org.in/digitalPayment/service", wsdlLocation = "WebContent\\WEB-INF\\upiPayment.wsdl")
public interface UpiPayment {


    /**
     * 
     * @param amount
     * @param fromAccount
     * @param toAccount
     * @return
     *     returns in.org.npci.digitalpayment.types.Reciept
     */
    @WebMethod(action = "http://www.npci.org.in/digitalPayment/service/sendMoney")
    @WebResult(name = "reciept", targetNamespace = "http://www.npci.org.in/digitalPayment/types")
    @RequestWrapper(localName = "sendMoney", targetNamespace = "http://www.npci.org.in/digitalPayment/service", className = "in.org.npci.digitalpayment.service.SendMoney")
    @ResponseWrapper(localName = "sendMoneyResponse", targetNamespace = "http://www.npci.org.in/digitalPayment/service", className = "in.org.npci.digitalpayment.service.SendMoneyResponse")
    public Reciept sendMoney(
        @WebParam(name = "from-account", targetNamespace = "http://www.npci.org.in/digitalPayment/types")
        UpiAccount fromAccount,
        @WebParam(name = "to-account", targetNamespace = "http://www.npci.org.in/digitalPayment/types")
        UpiAccount toAccount,
        @WebParam(name = "amount", targetNamespace = "http://www.npci.org.in/digitalPayment/types")
        double amount);

}
