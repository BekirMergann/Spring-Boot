package com.mergan.callname;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallNameApp {

    @GetMapping("/call-name")
    public String sayHello() {
        return "Mein name ist Bekir";
    }
}
