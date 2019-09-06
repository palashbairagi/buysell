package com.exchange.buysell.entity;

import javax.persistence.*;

@Entity
@Table(name="orders")
public class Orders {
    @Id
    @Column(name="order_Id")
    private  int orderId;
    @Column(name="cust_Id")
    private int customerId;
    @Column(name="stock_Id")
    private int stockId;
    @Column(name="order_Type")
    private String orderType;
    @Column(name="order_Quantity")
    private int orderQuantity;
    @Column(name="stock_Price")
    private double stockPrice;
    @Column(name="order_Date_Time")
    private String orderDateTime;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
    }

    public String getOrderDateTime() {
        return orderDateTime;
    }

    public void setOrderDateTime(String orderDateTime) {
        this.orderDateTime = orderDateTime;
    }

}
