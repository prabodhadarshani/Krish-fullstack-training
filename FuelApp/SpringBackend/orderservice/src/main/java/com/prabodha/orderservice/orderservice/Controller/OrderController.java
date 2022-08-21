package com.prabodha.orderservice.orderservice.Controller;


//import com.prabodha.basecommons.basecommons.dto.Order;
//import com.prabodha.basecommons.basecommons.dto.OrderEvent;
//import com.prabodha.inventoryservice.inventoryservice.Repository.OrderRepository;
import com.prabodha.orderservice.orderservice.Repository.OrderRepository;
import com.prabodha.orderservice.orderservice.kafka.OrderProducer;
import com.prabodha.orderservice.orderservice.kafka.SheduleProducer;
import dto.Order;
import dto.OrderEvent;
import lombok.val;
import org.apache.kafka.common.errors.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.config.StreamsBuilderFactoryBean;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/order")
public class OrderController {

    private OrderProducer orderProducer;
    private SheduleProducer sheduleProducer;
   @Autowired
    private OrderRepository orderRepository;



    private StreamsBuilderFactoryBean kafkaStreamsFactory;


    public OrderController(OrderProducer orderProducer,SheduleProducer sheduleProducer) {
        this.orderProducer = orderProducer;
        this.sheduleProducer = sheduleProducer;
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

   @GetMapping(value= "/")
   public List<OrderEvent> getAll() {
       return orderRepository.findAll();

   }


    @PutMapping(value= "/shedule/{orderId}")
    public String sheduleOrder(@RequestBody Order order, @PathVariable String orderId) {

            OrderEvent orderEvent =orderRepository.findById(orderId).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + orderId));

        orderEvent.setStatus("ACCEPT");
        orderEvent.setMessage("order status is in pending state");
        //  orderEvent.setOrder(order);
        orderEvent.setShedule_date(order.getShedule_date());
     //   orderEvent.setGasStationName(order.getGasStationName());
     //   orderEvent.setType(order.getType());

        sheduleProducer.sendMessage(orderEvent);
//       orderRepository.save(orderEvent);
        return "Order placed successfully ...";
    }











//    @PutMapping("/shedule/{id}")
//    public String sheduleOrder(@PathVariable String orderId, @RequestBody OrderEvent order) {
//
//      // Optional<OrderEvent> orderEvent = orderRepository.findById(order.getOrderId());
//        val orderEvent = orderRepository.findById(orderId);
//
//        OrderEvent orderEvents = new OrderEvent();
//
//        //orderEvents.setOrderId(order.getOrderId());
//
//        orderEvents.setStatus("ACCEPT");
//        orderEvents.setMessage("order status is in Sheudling state");
//        //  orderEvent.setOrder(order);
////        orderEvent.setCapacity(order.getCapacity());
////        orderEvent.setGasStationName(order.getGasStationName());
////        orderEvent.setType(order.getType());
//
//        orderProducer.sendMessage(orderEvents);
////       orderRepository.save(orderEvent);
//        return "";
//
//    }


}