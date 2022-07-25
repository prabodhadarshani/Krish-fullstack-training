package com.prabodha.rentcloud.profileservice.controller;

import com.prabodha.rentcloud.commons.model.Customer;
import com.prabodha.rentcloud.profileservice.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")

public class ProfileController {


    //from  access model
    @Autowired
    CustomerService customerService;

   // @RequestMapping(value = "/profile", method = RequestMethod.POST)
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

//    @RequestMapping(value = "/profile", method = RequestMethod.GET)
//    public Customer fetch(@RequestParam int profileId) {
//        return customerService.fetchById(profileId);
//    }
//
//    @RequestMapping(value = "/profiles", method = RequestMethod.GET)
//    public List<Customer> fetch() {
//        return customerService.fetchAllProfiles();
   // }




}
