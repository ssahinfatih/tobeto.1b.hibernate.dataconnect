package com.tobeto.spring.b.controllers;


import com.tobeto.spring.b.entities.Order;
import com.tobeto.spring.b.repositories.OrderRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/orders")
public class OrdersController {
    private final OrderRepository orderRepository;

    public OrdersController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping
    public List<Order> getAll() {return orderRepository.findAll();}

    @GetMapping("{id}")
    public Order getById(@PathVariable int id){
        return orderRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void add(@RequestBody Order order) {
        orderRepository.save(order);
    }

    @PutMapping("{id}")
    public void update(@PathVariable int id, @RequestBody Order order) {
        Order orderUpdate = orderRepository.findById(id).orElseThrow();
        orderUpdate.setCar(order.getCar());
        orderUpdate.setCustomer(order.getCustomer());
        orderUpdate.setOrderDate(order.getOrderDate());
        orderUpdate.setStartDate(order.getStartDate());
        orderUpdate.setEndDate(order.getEndDate());
        orderUpdate.setDiscount(order.getDiscount());
        orderUpdate.setPrice(order.getPrice());


        orderRepository.save(orderUpdate);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        Order orderDelete = orderRepository.findById(id).orElseThrow();
        orderRepository.delete(orderDelete);
    }

}
