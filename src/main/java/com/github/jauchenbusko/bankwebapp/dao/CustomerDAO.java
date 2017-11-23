package com.github.jauchenbusko.bankwebapp.dao;

import com.github.jauchenbusko.bankwebapp.model.Customer;

public interface CustomerDAO {

    Customer getCustomerById(int id);
}
