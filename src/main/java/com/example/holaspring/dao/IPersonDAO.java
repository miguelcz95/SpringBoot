package com.example.holaspring.dao;

import com.example.holaspring.dto.PersonDTO;

import java.util.List;

public interface IPersonDAO {
    List<PersonDTO> getAllPersons();
}
