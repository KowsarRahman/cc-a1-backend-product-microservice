package com.products.products.Repositories;

import com.products.products.Model.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Integer> {

    List<Order> findByOrderPerson(String orderPerson);
    List<Order> findByOrderSeller(String orderSeller);
}
