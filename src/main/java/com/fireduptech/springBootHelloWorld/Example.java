package com.fireduptech.springBootHelloWorld;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping( "/{name}" )
    String getName( @PathVariable( "name" ) String urlName ) {
        return "Hello " + urlName;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}






