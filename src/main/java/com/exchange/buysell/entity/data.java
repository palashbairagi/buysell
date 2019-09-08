package com.exchange.buysell.entity;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.persistence.*;

@Entity
@Table(name="stocks")

public class data {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="stockId")
    private  int stockId;
    private String symbol;
    private double price;
    private double day_high;
    private double day_low;
    @Column(name="stockname")
    private  String  name;


    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDay_high() {
        return day_high;
    }

    public void setDay_high(double day_high) {
        this.day_high = day_high;
    }

    public double getDay_low() {
        return day_low;
    }

    public void setDay_low(double day_low) {
        this.day_low = day_low;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
