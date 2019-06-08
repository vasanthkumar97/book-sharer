package com.booksharer.controller;

import com.booksharer.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;

@RestController
@RequestMapping("/")
public class HelloWorldController {
    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping(value = "/")
    public String login() throws URISyntaxException {
        return helloWorldService.getHello();
    }


}