package com.spring.security.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class GreetingsController {

    @GetMapping("/hi")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello from our API");
    }

    @GetMapping("/bye")
    public ResponseEntity<String> sayBye() {
        return ResponseEntity.ok("Good bye and see you later");
    }
}
