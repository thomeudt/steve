
package de.rwth.idsg.sensor.inform;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.3.1
 * Wed Sep 18 17:43:14 CEST 2013
 * Generated source version: 2.3.1
 * 
 */

public final class InformService_InformServiceSOAP12_Client {

    private static final QName SERVICE_NAME = new QName("urn://de/rwth/idsg/sensor/inform", "InformService");

    private InformService_InformServiceSOAP12_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = InformService_Service.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        InformService_Service ss = new InformService_Service(wsdlURL, SERVICE_NAME);
        InformService port = ss.getInformServiceSOAP12();  
        
        {
        System.out.println("Invoking informParking...");
        de.rwth.idsg.sensor.inform.InformParkingRequest _informParking_parameters = null;
        java.lang.String _informParking_chargeBoxIdentity = "";
        de.rwth.idsg.sensor.inform.InformParkingResponse _informParking__return = port.informParking(_informParking_parameters, _informParking_chargeBoxIdentity);
        System.out.println("informParking.result=" + _informParking__return);


        }

        System.exit(0);
    }

}