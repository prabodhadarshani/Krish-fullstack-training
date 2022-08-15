package com.prabodha.orderservice.orderservice.Controller;


//import com.prabodha.basecommons.basecommons.dto.Order;
//import com.prabodha.basecommons.basecommons.dto.OrderEvent;
import com.prabodha.orderservice.orderservice.Repository.OrderRepository;
import com.prabodha.orderservice.orderservice.kafka.OrderProducer;
import dto.Order;
import dto.OrderEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/order")
public class OrderController {

    private OrderProducer orderProducer;
//    @Autowired
//    private OrderRepository orderRepository;

    public OrderController(OrderProducer orderProducer) {
        this.orderProducer = orderProducer;
    }

    @PostMapping(value= "/orders")
    public String placeOrder(@RequestBody Order order) {


      //  order.setId(order.getId());
        OrderEvent orderEvent = new OrderEvent();
        orderEvent.setOrderId(UUID.randomUUID().toString());
        orderEvent.setStatus("PENDING");
        orderEvent.setMessage("order status is in pending state");
      //  orderEvent.setOrder(order);
        orderEvent.setCapacity(order.getCapacity());
        orderEvent.setGasStationName(order.getGasStationName());
        orderEvent.setType(order.getType());

        orderProducer.sendMessage(orderEvent);
//       orderRepository.save(orderEvent);
        return "Order placed successfully ...";
    }


//    @GetMapping(value= "/orders")
//    public List<OrderEvent> all() {
//        List<OrderEvent> orderEvent = new ArrayList<>();
//    return orderProducer.getMessage(orderEvent);
//       // return orderEvent;
//    }

}