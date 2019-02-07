package com.allaroundjava.dao;

import com.allaroundjava.model.Passport;

import javax.persistence.EntityManagerFactory;

public class PassportDao extends BaseDao<Passport> {
    PassportDao(EntityManagerFactory emf) {
        super(Passport.class, emf);
    }
}
