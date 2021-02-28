package com.edu.iifcsd.service;

import com.edu.iifcsd.model.Payment;
import com.edu.iifcsd.model.Product;
import com.edu.iifcsd.model.User;
import com.edu.iifcsd.repository.PaymentRepository;
import com.edu.iifcsd.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PaymentService {

    @Autowired
    @Qualifier("paymentRepository")
    private PaymentRepository paymentRepository;


    public Payment insert(Payment payment){
        return paymentRepository.insert(payment);
    }

    public Optional<Payment> getPayment(String paymentID){
        return paymentRepository.findById(paymentID);
    }

    public void removePayment(String productID){
        paymentRepository.deleteById(productID);
    }

    public List<Payment> getAllPayments(){
        return paymentRepository.findAll();
    }

    public List<Payment> getAllPayments(String userID){
        return paymentRepository.findAll(Sort.by(Sort.Direction.DESC, "userID"));
    }

}
