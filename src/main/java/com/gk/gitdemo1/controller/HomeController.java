package com.gk.gitdemo1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

    @GetMapping("/greet")
    public ResponseEntity<String> sayHello(){
        return new ResponseEntity<>("Hey there!", HttpStatus.OK);
    }
}
