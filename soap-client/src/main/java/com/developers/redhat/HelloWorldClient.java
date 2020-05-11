package com.developers.redhat;

import javax.enterprise.context.ApplicationScoped;
import org.apache.cxf.frontend.ClientProxyFactoryBean;

@ApplicationScoped
public class HelloWorldClient {

    public String sayHi(String text) {
      ClientProxyFactoryBean factory = new ClientProxyFactoryBean();
      factory.setServiceClass(HelloWorld.class);
      factory.setAddress("http://localhost:8082/helloworld");
      HelloWorld client = (HelloWorld) factory.create();
      return client.sayHi(text);
    }
    
}