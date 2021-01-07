package com.rabbitmq.example.dto;

public class PaymentStatus {

	private Payment payment;
	private String status;
	private String message;

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Status: ");
		sb.append(this.getStatus());
		sb.append("\n");
		sb.append("Message: ");
		sb.append(this.getMessage());
		sb.append("\n");
		sb.append("\nPayment Details: \n");
		sb.append(this.getPayment().toString());
		return sb.toString();
	}
}
