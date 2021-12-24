package com.vensav.microservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.jaxrs.QueryParam;

@Path("/greeting")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@QueryParam(value="name") String name) {
        String resp = "Hello world";
        if (name == null || name.isBlank()){
            return resp;
        }
        return "Hello " + name;
    }
}