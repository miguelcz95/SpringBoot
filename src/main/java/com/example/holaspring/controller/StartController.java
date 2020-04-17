package com.example.holaspring.controller;

import com.example.holaspring.dto.PersonDTO;
import com.example.holaspring.service.IService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

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
        /*PersonDTO personDTO = service.getAllPersons().get(0);
        model.addAttribute("person", personDTO);*/
        /*String listPersons = gson.toJson(service.getAllPersons());
        model.addAttribute("personas",listPersons);*/
        model.addAttribute("personas",service.getAllPersons());
        //Lista Vacia
        /*List<PersonDTO> lista = new ArrayList();
        model.addAttribute("personas",  lista );*/
        /*service.getAllPersons().forEach(
                p -> {
                    log.info("Person extracted" + p);
                    model.addAttribute("persona", p);
                });*/
        return "index";
    }
}
