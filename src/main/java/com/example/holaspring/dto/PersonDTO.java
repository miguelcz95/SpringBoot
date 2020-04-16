package com.example.holaspring.dto;

import lombok.Data;

@Data
public class PersonDTO {

    private String name;
    private String lastname;
    private String email;

    public PersonDTO(String name, String lastname, String email) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
    }
}
