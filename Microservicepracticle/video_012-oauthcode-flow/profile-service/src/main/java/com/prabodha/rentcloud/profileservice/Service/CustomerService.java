package com.prabodha.rentcloud.profileservice.Service;

import com.prabodha.rentcloud.commons.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer save(Customer customer);
    Customer fetchById(int profileId);

    List<Customer> fetchAllProfiles();
}
