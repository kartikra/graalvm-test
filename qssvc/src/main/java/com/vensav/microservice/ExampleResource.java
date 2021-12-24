package com.vensav.microservice;
import com.vensav.loader.Counter;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/example")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        new Counter().count("We the People of the United States of America");
        return "Completed";
    }
}