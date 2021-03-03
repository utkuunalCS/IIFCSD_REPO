package com.edu.iifcsd.controller;

import com.edu.iifcsd.model.Payment;
import com.edu.iifcsd.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@CrossOrigin
@Controller
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("payment/health")
    public ResponseEntity<String> health(){
        return new ResponseEntity("200", HttpStatus.OK);
    }

    @GetMapping("payment/getPayment")
    public ResponseEntity<Payment> getPayment(String paymentID){
        return new ResponseEntity(paymentService.getPayment(paymentID), HttpStatus.OK);
    }

    @GetMapping("payment/getAllPayments")
    public ResponseEntity<List<Payment>> getAllPayments(){
        return new ResponseEntity(paymentService.getAllPayments(), HttpStatus.OK);
    }

    @GetMapping("payment/getAllPaymentsOfUser")
    public ResponseEntity<List<Payment>> getAllPaymentsOfUser(String userID){
        return new ResponseEntity(paymentService.getAllPayments(userID), HttpStatus.OK);
    }

    @DeleteMapping("payment/removePayment")
    public void removePayment(String paymentID){
        paymentService.removePayment(paymentID);
    }

    @PostMapping("payment/assignRandomProductsToPayments")
    public void assignRandomProductsToPayments(){
        paymentService.assignRandomProductsToPayments();
    }


}
