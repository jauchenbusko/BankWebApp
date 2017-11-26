package com.github.jauchenbusko.bankwebapp.model.service.impl;

import com.github.jauchenbusko.bankwebapp.model.dao.AddressDAO;
import com.github.jauchenbusko.bankwebapp.model.domain.Address;
import com.github.jauchenbusko.bankwebapp.model.service.AddressService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AddressServiceImpl implements AddressService {

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
