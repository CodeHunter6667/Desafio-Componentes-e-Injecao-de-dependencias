package com.devsuperior.Frete.services;

import com.devsuperior.Frete.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    private double shipmentPrice;

    public double shipment(Order order){
        if (order.getBasicPrice() < 100.0){
            shipmentPrice = 20.0;
        } else if (order.getBasicPrice() > 100.0 && order.getBasicPrice() < 200.0)  {
            shipmentPrice = 12.0;
        } else if (order.getBasicPrice() > 200.0) {
            shipmentPrice = 0.0;
        }
        return shipmentPrice;
    }
}
