package com.allaroundjava.dao;

import com.allaroundjava.model.Person;

import javax.persistence.EntityManagerFactory;

public class PersonDao extends BaseDao<Person> {
    PersonDao(EntityManagerFactory emf) {
        super(Person.class, emf);
    }
}
