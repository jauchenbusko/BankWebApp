package com.github.jauchenbusko.bankwebapp.model.dao;

import com.github.jauchenbusko.bankwebapp.model.domain.Customer;

public interface CustomerDAO {

    Customer getCustomerById(int id);
}
