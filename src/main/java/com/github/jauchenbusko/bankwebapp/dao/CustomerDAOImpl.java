package com.github.jauchenbusko.bankwebapp.dao;

import com.github.jauchenbusko.bankwebapp.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

   private SessionFactory sessionFactory;

   public void setSessionFactory(SessionFactory sessionFactory){
       this.sessionFactory = sessionFactory;
   }

    @Override
    public Customer getCustomerById(int id) {

        Session session = this.sessionFactory.getCurrentSession();

        return session.load(Customer.class, id);
    }
}