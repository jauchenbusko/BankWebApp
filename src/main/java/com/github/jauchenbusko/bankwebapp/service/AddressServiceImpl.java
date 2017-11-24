package com.github.jauchenbusko.bankwebapp.service;

import com.github.jauchenbusko.bankwebapp.dao.AddressDAO;
import com.github.jauchenbusko.bankwebapp.model.Address;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AddressServiceImpl implements AddressService{

    private AddressDAO addressDAO;

    public void setAddressDAO(AddressDAO addressDAO) {
        this.addressDAO = addressDAO;
    }

    @Override
    @Transactional
    public Address getAddressById(int id) {
        return this.addressDAO.getAddressById(id);
    }
}
