package com.prabodha.inventoryservice.inventoryservice.Repository;

//import dto.OrderEvent;

import dto.OrderEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository <OrderEvent, Long>{

}
