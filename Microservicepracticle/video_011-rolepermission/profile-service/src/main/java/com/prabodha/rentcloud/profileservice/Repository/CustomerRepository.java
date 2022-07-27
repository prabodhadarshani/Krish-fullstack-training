package com.prabodha.rentcloud.profileservice.Repository;

import com.prabodha.rentcloud.commons.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
