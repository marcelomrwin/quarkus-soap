package com.developers.redhat;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import org.apache.cxf.frontend.ServerFactoryBean;
import io.quarkus.runtime.StartupEvent;

@ApplicationScoped
public class ServicePublisher {
    
    void onStart(@Observes StartupEvent ev) {
        // Create our service implementation
        HelloWorld helloWorld = new HelloWorldImpl();
        
        // Create our Server
        ServerFactoryBean svrFactory = new ServerFactoryBean();
        svrFactory.setServiceClass(HelloWorld.class);
        svrFactory.setAddress("http://localhost:8082/helloworld");
        svrFactory.setServiceBean(helloWorld);
        svrFactory.create();
    }
}