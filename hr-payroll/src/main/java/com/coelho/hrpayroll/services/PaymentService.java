package com.coelho.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.coelho.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		
		return new Payment("Coelho", 200.0, days);
	}
}
