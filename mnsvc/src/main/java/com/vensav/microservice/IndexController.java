package com.vensav.microservice;

import com.vensav.loader.Counter;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/example")
public class IndexController {

    @Get(produces= MediaType.TEXT_PLAIN)
    public String getExample(){
        String text = "We the People of the United States of America";
        Counter counter = new Counter();
        counter.count(text);
        return "Completed";
    }
}