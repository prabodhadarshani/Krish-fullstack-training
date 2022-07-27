package com.prabodha.rentcloud.profileservice.controller;

import com.prabodha.rentcloud.commons.model.Customer;
import com.prabodha.rentcloud.profileservice.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services")

public class ProfileController {


    //from  access model
    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/customers", method = RequestMethod.POST)
    @PreAuthorize("hasAuthority('create_profile')")
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @RequestMapping(value = "/customers/{id}", method = RequestMethod.GET)
    public Customer fetch(@PathVariable(value = "id") int customerid) {
        return customerService.fetchById(customerid);
    }

//    public Customer fetch(@RequestParam int profileId) {
//        return customerService.fetchById(profileId);
 //  }

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    @PreAuthorize("hasRole('ROLE_admin')")
    public List<Customer> fetch() {
        return customerService.fetchAllProfiles();
    }




}
