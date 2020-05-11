package com.developers.redhat;

import javax.xml.ws.WebServiceRef;

public class HelloWorldClient {

    @WebServiceRef(wsdlLocation =
      "http://localhost:9005/helloworld?wsdl")
    private static HelloWorld service;

    public void callHelloWorld() {
        System.out.println("Result:" + service.sayHi("Nikhil is testing here"));
    }
    
}