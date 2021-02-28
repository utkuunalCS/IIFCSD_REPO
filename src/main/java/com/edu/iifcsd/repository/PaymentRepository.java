package com.edu.iifcsd.repository;

import com.edu.iifcsd.model.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component("paymentRepository")
public interface PaymentRepository extends MongoRepository<Payment, String> {
}
