package com.example.holaspring.service;

import com.example.holaspring.dto.PersonDTO;

import java.util.List;

public interface IService {
    List<PersonDTO> getAllPersons();
}
