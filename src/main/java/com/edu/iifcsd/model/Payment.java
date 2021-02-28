package com.edu.iifcsd.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.sql.Date;
import java.util.List;

enum METHOD {VISA, MASTERCARD, AMERICAN_EXPRESS, GPAY, PAYPAL, PROMOCODE}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    @Id
    private long referenceID;
    private String userID;
    private Date date;
    //Payment method
    private METHOD method;
    //Total payment amount
    private double totalAmount;
    //Keep products' IDs
    private List<String> productList;

}
