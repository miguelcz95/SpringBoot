package com.example.holaspring.controller;

import com.example.holaspring.service.IService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class StartController {

    IService service;
    private Gson gson = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();

    @Autowired
    public StartController(IService service) {
        this.service = service;
    }

    @Value("${index.message}")
    private String message2;

    @GetMapping("/")
    public String start(Model model) {
        String message = "Hello World with Thymeleaf";
        log.info("Executing Spring MVC controller");
        log.info("Starting main webpage with thymeleaf");
        model.addAttribute("message", message);
        model.addAttribute("message2", message2);
        String listPersons = gson.toJson(service.getAllPersons());
        model.addAttribute("persons", listPersons);
        return "index";
    }
}
