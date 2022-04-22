package com.products.products.Model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="ORDER_TBL")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String orderProduct;
    private String orderPrice;
    private String orderQuantity;
    private String orderPerson;
    private String orderSeller;
    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private Date created_at;
    private String status;

    public String getOrderSeller() {
        return orderSeller;
    }

    public void setOrderSeller(String orderSeller) {
        this.orderSeller = orderSeller;
    }

    public int getId() {
        return id;
    }

    public String getOrderProduct() {
        return orderProduct;
    }

    public String getOrderPrice() {
        return orderPrice;
    }

    public String getOrderQuantity() {
        return orderQuantity;
    }

    public String getOrderPerson() {
        return orderPerson;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public String getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOrderProduct(String orderProduct) {
        this.orderProduct = orderProduct;
    }

    public void setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
    }

    public void setOrderQuantity(String orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public void setOrderPerson(String orderPerson) {
        this.orderPerson = orderPerson;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
