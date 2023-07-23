package com.devsuperior.Frete.services;

import com.devsuperior.Frete.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double discount(Order order){
        double discountPercent = order.getBasicPrice() * (order.getDiscount() / 100);
        return order.getBasicPrice() - discountPercent;
    }

    public double order(Order order){
        return discount(order) + shippingService.shipment(order);
    }
}