package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexRest {

    @GetMapping("")
    public String init(){
        return "Hello world - Andony";
    }
}
