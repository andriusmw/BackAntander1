package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Map<String, String> sayHello() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "{\n" +
                "\"uid\": \"n11111\",\n" +
                "\"realm\": \"STSSanBceCertV1\",\n" +
                "\"attributes\": {\n" +
                "\"uid\": \"n11111\",\n" +
                "\"preferredLanguage\": \"ES-ES\",\n" +
                "\"mail\": \"eolallam@gruposantander.es\",\n" +
                "\"surname\": \"RODRIGUEZ PEREZ\",\n" +
                "\"givenName\": \"DON JOSE\",\n" +
                "\"fullName\": \"DON BAILONGO RODRIGUEZ PEREZ\",\n" +
                "\"username\": \"n11111\"\n" +
                "}\n" +
                "}");
        return response;
    }
}