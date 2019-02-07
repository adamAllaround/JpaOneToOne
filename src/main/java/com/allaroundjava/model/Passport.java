package com.allaroundjava.model;

import javax.persistence.*;

@Entity
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String passportNumber;

    @OneToOne(optional = false)
    @JoinColumn
    private Person person;

    Passport() {
    }

    public Passport(String passportNumber, Person person) {
        this.passportNumber = passportNumber;
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public Person getPerson() {
        return person;
    }
}
