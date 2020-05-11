package com.developers.redhat;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class ExampleResource {

    @Inject  
    HelloWorldClient client;

    @Path("/hello")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
      
        return client.sayHi("Quarkus SOAP Service");
    }

    @Path("/demo")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String demo() {
      
        return "demo";
    }

    
}