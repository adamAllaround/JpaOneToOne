package com.allaroundjava.dao;

import com.allaroundjava.model.Passport;
import com.allaroundjava.model.Person;
import org.junit.Assert;
import org.junit.Test;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Optional;

public class PersonDaoTest {
    private EntityManagerFactory emf;
    private PassportDao passportDao;
    private PersonDao personDao;

    public PersonDaoTest() {
        emf = Persistence.createEntityManagerFactory("jpaOneToOne");
        passportDao = new PassportDao(emf);
        personDao = new PersonDao(emf);
    }

    @Test
    public void havingPassport_whenRetrievingIt_thenPersonCanBeAccessed() {
        Person person = new Person("John Smith");
        personDao.persist(person);

        Passport passport = new Passport("ABC 123", person);
        passportDao.persist(passport);

        Optional<Passport> retrievedPassport = passportDao.getById(passport.getId());
        Assert.assertTrue(retrievedPassport.isPresent());
        Assert.assertEquals(person.getName(), retrievedPassport.get().getPerson().getName());
    }

    @Test
    public void havingPassport_whenRetrievingPerson_thenPassportCanBeAccessed() {
        Person person = new Person("James Jones");
        personDao.persist(person);

        Passport passport = new Passport("CDE 321", person);
        passportDao.persist(passport);

        Optional<Person> retrievedPerson = personDao.getById(person.getId());
        Assert.assertTrue(retrievedPerson.isPresent());

        Passport personPassport = retrievedPerson.get().getPassport();
        Assert.assertEquals(passport.getPassportNumber(), personPassport.getPassportNumber());
    }
}