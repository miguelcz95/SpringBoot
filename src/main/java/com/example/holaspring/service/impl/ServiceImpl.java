package com.example.holaspring.service.impl;

import com.example.holaspring.dao.IPersonDAO;
import com.example.holaspring.dto.PersonDTO;
import com.example.holaspring.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements IService {

    IPersonDAO iPersonDAO;

    @Autowired
    public ServiceImpl(com.example.holaspring.dao.IPersonDAO iPersonDAO) {
        this.iPersonDAO = iPersonDAO;
    }

    @Override
    public List<PersonDTO> getAllPersons() {
        return iPersonDAO.getAllPersons();
    }
}
