package com.developers.redhat;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.frontend.ClientProxyFactoryBean;

@Path("/hello")
public class ExampleResource {

    // @Inject
    // ClientProxyFactoryBean factory;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
      ClientProxyFactoryBean factory = new ClientProxyFactoryBean();
      factory.setServiceClass(HelloWorld.class);
      factory.setAddress("http://localhost:8082/helloworld");
      HelloWorld client = (HelloWorld) factory.create();
        return client.sayHi("Quarkus SOAP Service");
    }

    
}