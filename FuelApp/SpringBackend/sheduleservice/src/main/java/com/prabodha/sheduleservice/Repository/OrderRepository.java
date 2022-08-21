package com.prabodha.sheduleservice.Repository;

//import dto.OrderEvent;

import dto.OrderEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository <OrderEvent, Long>{

    @Query(value = "select * FROM order_event WHERE type = ?1",nativeQuery = true )
    OrderEvent findById(String orderId);
}
