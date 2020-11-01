package com.edu.iifcsd.repository;

import com.edu.iifcsd.model.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepository extends MongoRepository<Payment, String> {
}
