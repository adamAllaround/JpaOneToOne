package com.allaroundjava.model;


import org.hibernate.annotations.Immutable;

import javax.persistence.*;

@Entity
@Immutable
public final class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(mappedBy = "person")
    private Passport passport;

    Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public Passport getPassport() {
        return passport;
    }
}
