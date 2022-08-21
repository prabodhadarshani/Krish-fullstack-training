package com.prabodha.orderservice.orderservice.Repository;

import dto.Inventory;
import dto.Order;
//import dto.OrderEvent;
import dto.OrderEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository <OrderEvent, String>{
//    @Query(value = "select * FROM order_event WHERE type = ?1",nativeQuery = true )
//    OrderEvent findById(String orderId);
}
