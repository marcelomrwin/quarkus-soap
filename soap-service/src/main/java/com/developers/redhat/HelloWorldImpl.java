package com.developers.redhat;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
 
@WebService(serviceName = "/helloworld", portName = "ServicePort")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class HelloWorldImpl implements HelloWorld {
  
    public String sayHi(String text) {
        return "Hello " + text;
    }
}