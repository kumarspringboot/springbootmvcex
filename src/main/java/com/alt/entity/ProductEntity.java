package com.alt.bean;

import lombok.Data;

import java.util.Date;

@Data
public class ProductEntity{
    private long id;
    private String name;
    private String brand;
    private int warranty;
    private int prize;
    private int stock;
    private Date mfd;
    private String[] purpose;
}
