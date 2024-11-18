package org.mastercode.datastructurealgoritms.stub;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.4.2
 * 2024-10-21T17:06:01.244+04:00
 * Generated source version: 3.4.2
 *
 */
@WebService(targetNamespace = "http://fortunawsc.isube.asb.com/", name = "test_asb_plastik_card_servicesSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface TestAsbPlastikCardServicesSoap {

    @WebMethod(operationName = "MakeDeposit", action = "http://fortunawsc.isube.asb.com/MakeDeposit")
    @RequestWrapper(localName = "MakeDeposit", targetNamespace = "http://fortunawsc.isube.asb.com/", className = "az.goldenpay.pg.mieplugin.asbdepositcard.stub.MakeDeposit")
    @ResponseWrapper(localName = "MakeDepositResponse", targetNamespace = "http://fortunawsc.isube.asb.com/", className = "az.goldenpay.pg.mieplugin.asbdepositcard.stub.MakeDepositResponse")
    @WebResult(name = "MakeDepositResult", targetNamespace = "http://fortunawsc.isube.asb.com/")
    public MakeDepositResponsee makeDeposit(

            @WebParam(name = "req", targetNamespace = "http://fortunawsc.isube.asb.com/")
            MakeDepositRequest req
    );

    @WebMethod(operationName = "MakeCardPayment", action = "http://fortunawsc.isube.asb.com/MakeCardPayment")
    @RequestWrapper(localName = "MakeCardPayment", targetNamespace = "http://fortunawsc.isube.asb.com/", className = "az.goldenpay.pg.mieplugin.asbdepositcard.stub.MakeCardPayment")
    @ResponseWrapper(localName = "MakeCardPaymentResponse", targetNamespace = "http://fortunawsc.isube.asb.com/", className = "az.goldenpay.pg.mieplugin.asbdepositcard.stub.MakeCardPaymentResponse")
    @WebResult(name = "MakeCardPaymentResult", targetNamespace = "http://fortunawsc.isube.asb.com/")
    public MakeCardPaymentResponsee makeCardPayment(

            @WebParam(name = "req", targetNamespace = "http://fortunawsc.isube.asb.com/")
            MakeCardPaymentRequest req
    );

    @WebMethod(operationName = "GetCurrencyRate", action = "http://fortunawsc.isube.asb.com/GetCurrencyRate")
    @RequestWrapper(localName = "GetCurrencyRate", targetNamespace = "http://fortunawsc.isube.asb.com/", className = "az.goldenpay.pg.mieplugin.asbdepositcard.stub.GetCurrencyRate")
    @ResponseWrapper(localName = "GetCurrencyRateResponse", targetNamespace = "http://fortunawsc.isube.asb.com/", className = "az.goldenpay.pg.mieplugin.asbdepositcard.stub.GetCurrencyRateResponse")
    @WebResult(name = "GetCurrencyRateResult", targetNamespace = "http://fortunawsc.isube.asb.com/")
    public ArrayOfGetCurrencyRateResponse getCurrencyRate(

            @WebParam(name = "req", targetNamespace = "http://fortunawsc.isube.asb.com/")
            GetCurrencyRateRequest req
    );

    @WebMethod(operationName = "CheckTransactionResult", action = "http://fortunawsc.isube.asb.com/CheckTransactionResult")
    @RequestWrapper(localName = "CheckTransactionResult", targetNamespace = "http://fortunawsc.isube.asb.com/", className = "az.goldenpay.pg.mieplugin.asbdepositcard.stub.CheckTransactionResult")
    @ResponseWrapper(localName = "CheckTransactionResultResponse", targetNamespace = "http://fortunawsc.isube.asb.com/", className = "az.goldenpay.pg.mieplugin.asbdepositcard.stub.CheckTransactionResultResponse")
    @WebResult(name = "CheckTransactionResultResult", targetNamespace = "http://fortunawsc.isube.asb.com/")
    public TransactionResultResponse checkTransactionResult(

            @WebParam(name = "req", targetNamespace = "http://fortunawsc.isube.asb.com/")
            TransactionResultRequest req
    );

    @WebMethod(operationName = "GetCustomerData", action = "http://fortunawsc.isube.asb.com/GetCustomerData")
    @RequestWrapper(localName = "GetCustomerData", targetNamespace = "http://fortunawsc.isube.asb.com/", className = "az.goldenpay.pg.mieplugin.asbdepositcard.stub.GetCustomerData")
    @ResponseWrapper(localName = "GetCustomerDataResponse", targetNamespace = "http://fortunawsc.isube.asb.com/", className = "az.goldenpay.pg.mieplugin.asbdepositcard.stub.GetCustomerDataResponse")
    @WebResult(name = "GetCustomerDataResult", targetNamespace = "http://fortunawsc.isube.asb.com/")
    public CustomerDataResponse getCustomerData(

            @WebParam(name = "req", targetNamespace = "http://fortunawsc.isube.asb.com/")
            CustomerDataRequest req
    );

    @WebMethod(operationName = "ResendEdvWithoutMakeDeposit", action = "http://fortunawsc.isube.asb.com/ResendEdvWithoutMakeDeposit")
    @RequestWrapper(localName = "ResendEdvWithoutMakeDeposit", targetNamespace = "http://fortunawsc.isube.asb.com/", className = "az.goldenpay.pg.mieplugin.asbdepositcard.stub.ResendEdvWithoutMakeDeposit")
    @ResponseWrapper(localName = "ResendEdvWithoutMakeDepositResponse", targetNamespace = "http://fortunawsc.isube.asb.com/", className = "az.goldenpay.pg.mieplugin.asbdepositcard.stub.ResendEdvWithoutMakeDepositResponse")
    @WebResult(name = "ResendEdvWithoutMakeDepositResult", targetNamespace = "http://fortunawsc.isube.asb.com/")
    public int resendEdvWithoutMakeDeposit(

            @WebParam(name = "req1", targetNamespace = "http://fortunawsc.isube.asb.com/")
            String req1
    );
}