package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/user-info")
    public UserResponse getUserInfo() {
        Attributes attributes = new Attributes(
                "n11111",
                "ES-ES",
                "eolallam@gruposantander.es",
                "RODRIGUEZ PEREZ",
                "DON JOSE",
                "DON BAILONGO RODRIGUEZ PEREZ",
                "n11111"
        );

        UserResponse userResponse = new UserResponse(
                "n11111",
                "STSSanBceCertV1",
                attributes
        );

        return userResponse;
    }
}