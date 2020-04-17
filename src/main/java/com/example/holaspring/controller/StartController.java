package com.example.holaspring.controller;

import com.example.holaspring.service.IService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping("/")
    public String start(Model model) {
        log.info("Ejecutando Spring");
        model.addAttribute("personas", service.getAllPersons());
        return "index";
    }
}
