package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    TestValue testValue;

    @GetMapping("/")
    public String index(Model model) {
        String message = testValue.getMessage();
        model.addAttribute("message", message);
        System.out.println("메시지: " + message);
        return "login";
    }


}