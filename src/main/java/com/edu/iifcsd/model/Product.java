package com.edu.iifcsd.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;

enum CATEGORY {ELECTRONIC, HOME, PETS, HEALTH, FASHION, CHILDREN, OTHER}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    private long serialNumber;
    private String name;
    private String vendor;
    private String imgPath;
    private Date expiryDate;
    private CATEGORY category;
    private double price;
    private double rate;
    private int stockAmount;

}
