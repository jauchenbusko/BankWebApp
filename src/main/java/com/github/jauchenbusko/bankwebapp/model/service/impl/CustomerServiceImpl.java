package com.github.jauchenbusko.bankwebapp.model.service.impl;

import com.github.jauchenbusko.bankwebapp.model.dao.CustomerDAO;
import com.github.jauchenbusko.bankwebapp.model.domain.Customer;
import com.github.jauchenbusko.bankwebapp.model.service.CustomerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerDAO customerDAO;

    public void setCustomerDAO(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    @Transactional
    public Customer getCustomerById(int id) {
        return this.customerDAO.getCustomerById(id);
    }

}
