package com.products.products.Services;

import com.products.products.Model.Order;
import com.products.products.Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    public List<Order> getAllOrders() {
        return (List<Order>) orderRepository.findAll();
    }

    public List<Order> getAllOrdersByPerson(String orderPerson) {
        return (List<Order>) orderRepository.findByOrderPerson(orderPerson);
    }

    public List<Order> getAllOrdersBySeller(String orderSeller) {
        return (List<Order>) orderRepository.findByOrderSeller(orderSeller);
    }

    public Order getOrderById(int id) {
        return orderRepository.findById(id).orElse(null);
    }
}
