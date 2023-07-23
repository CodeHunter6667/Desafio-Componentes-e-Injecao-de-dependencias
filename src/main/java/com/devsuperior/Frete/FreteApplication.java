package com.devsuperior.Frete;

import com.devsuperior.Frete.entities.Order;
import com.devsuperior.Frete.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FreteApplication implements CommandLineRunner {

	@Autowired
	OrderService orderService = new OrderService();
	public static void main(String[] args) {
		SpringApplication.run(FreteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var order = new Order(1309,95.9,0);

		System.out.print("Codigo Pedido: " + order.getCode());
		System.out.println();
		System.out.print("Valor Total: " + orderService.order(order));
	}
}