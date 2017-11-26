package com.github.jauchenbusko.bankwebapp.model.dao.impl;

import com.github.jauchenbusko.bankwebapp.model.dao.AddressDAO;
import com.github.jauchenbusko.bankwebapp.model.domain.Address;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class AddressDAOImpl implements AddressDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public Address getAddressById(int id) {

        Session session = this.sessionFactory.getCurrentSession();
        return session.load(Address.class, id);
    }

}