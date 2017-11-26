package com.github.jauchenbusko.bankwebapp.controller;


import com.github.jauchenbusko.bankwebapp.model.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    @Qualifier(value = "customerService")
    public void setCustomerService(CustomerService customerService){
        this.customerService = customerService;
    }

    @RequestMapping("customerdata/{id}")
    public String customerData(@PathVariable("id") int id, Model model){

        model.addAttribute("customer", this.customerService.getCustomerById(id));

        return "customerdata";
    }
}
