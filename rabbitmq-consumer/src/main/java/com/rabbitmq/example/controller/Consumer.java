package com.rabbitmq.example.controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.rabbitmq.example.dto.PaymentStatus;

@Component
public class Consumer {

	public static final String QUEUE_1 = "queue-1";
	
	@RabbitListener(queues = QUEUE_1)
	public void consumeMessageFromQueue(PaymentStatus paymentStatus) {
		System.out.println("Message received from queue: \n\n" + paymentStatus.toString());
	}
}
