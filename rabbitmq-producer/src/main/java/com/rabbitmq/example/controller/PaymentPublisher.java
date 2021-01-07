package com.rabbitmq.example.controller;

import java.util.Date;
import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rabbitmq.example.constants.Constants;
import com.rabbitmq.example.dto.Payment;
import com.rabbitmq.example.dto.PaymentStatus;

@RestController
@RequestMapping("/api/v1/payment/publish")
public class PaymentPublisher {

	@Autowired
	private RabbitTemplate template;

	@PostMapping
	public ResponseEntity<String> makePayment(@RequestBody Payment payment) {

		// Mocked payment object
		payment.setPaymentId(UUID.randomUUID().toString().toUpperCase().replaceAll("-", ""));

		// Mocked Payment Status object
		PaymentStatus paymentStatus = new PaymentStatus();
		paymentStatus.setStatus("SUCCESS");
		paymentStatus.setPayment(payment);
		paymentStatus.setMessage("Payment has been successful");

		template.convertAndSend(Constants.EXCHANGE_1, Constants.ROUTING_KEY_1, paymentStatus);
		return new ResponseEntity<>("Success", HttpStatus.OK);
	}
}
