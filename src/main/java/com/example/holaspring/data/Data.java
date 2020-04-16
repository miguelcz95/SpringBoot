package com.example.holaspring.data;

import com.example.holaspring.dto.PersonDTO;

import java.util.ArrayList;
import java.util.List;

public class Data {

    public Data() {
    }

    static List<PersonDTO> listPerson;

    static {
        listPerson = new ArrayList<PersonDTO>();
        listPerson.add(new PersonDTO("Miguel", "Campuzano", "miguel@gmail.com"));
        listPerson.add(new PersonDTO("Luis", "Zuleta", "luis@gmail.com"));
    }

    public static List<PersonDTO> getListPerson() {
        return listPerson;
    }

    public static void setListPerson(List<PersonDTO> listPerson) {
        Data.listPerson = listPerson;
    }
}
