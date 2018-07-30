package com.cospedia.helloservice.controller;

import com.cospedia.helloservice.model.Hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping
    private Hello hello() {
        return new Hello("Hi Welcome", "user-hello");
    }
}
