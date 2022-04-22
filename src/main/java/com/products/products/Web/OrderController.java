package com.products.products.Web;

import com.products.products.Model.Order;
import com.products.products.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@CrossOrigin
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/addOrder")
    public ResponseEntity<Order> createNewOrder(@RequestBody Order order) {
        Order order1 = orderService.saveOrder(order);
        return new ResponseEntity<>(order1, HttpStatus.CREATED);
    }

    @GetMapping("/findOrderByPerson/{orderPerson}")
    public List<Order> findOrderPerson(@PathVariable String orderPerson) {
        List<Order> returnList = orderService.getAllOrdersByPerson(orderPerson);
        Collections.reverse(returnList);
        return returnList;
    }

    @GetMapping("/findOrderBySeller/{orderSeller}")
    public List<Order> findOrderSeller(@PathVariable String orderSeller) {
        List<Order> returnList = orderService.getAllOrdersBySeller(orderSeller);
        Collections.reverse(returnList);
        return returnList;
    }

    @GetMapping("/orderById/{id}")
    public Order findOrderById(@PathVariable int id) {
        return orderService.getOrderById(id);
    }
}
