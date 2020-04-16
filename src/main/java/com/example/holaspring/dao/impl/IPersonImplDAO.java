package com.example.holaspring.dao.impl;

import com.example.holaspring.dao.IPersonDAO;
import com.example.holaspring.data.Data;
import com.example.holaspring.dto.PersonDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class IPersonImplDAO implements IPersonDAO {

    @Override
    public List<PersonDTO> getAllPersons() {
        return Data.getListPerson();
    }
}
