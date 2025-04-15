package com.helloworld.app.controller;

import org.apache.commons.collections.Transformer;
import org.apache.commons.collections.functors.InvokerTransformer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Welcome to vulnerable app!";
    }

    // Simulasi eksploitasi library vulnerable (SCA Test)
    @GetMapping("/transformer")
    public String testTransformer() {
        Transformer transformer = new InvokerTransformer("toString", null, null);
        return "Transformer created: " + transformer.toString();
    }
}
