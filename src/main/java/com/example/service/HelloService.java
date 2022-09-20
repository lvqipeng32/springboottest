package com.example.service;
import org.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/hello")
public class HelloService {

    @RequestMapping(value="say/{name}",method = RequestMethod.GET)
    public String sayname(@PathVariable String name){
        return "Your name is"+name;
    }

}
