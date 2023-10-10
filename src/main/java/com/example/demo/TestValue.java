package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestValue {

    @Value("${myapp.message}")
    private String message;

    public String getMessage() {
        return message;
    }
}