package com.ra.model.entity;
import java.util.Date;

public class Order {
    private int orderID;
    private int customerID;
    private double totalAmount;
    private Date orderDate;
    private String status;
    private List<OrderDetail> orderDetails;
    private Customer customer;
}
