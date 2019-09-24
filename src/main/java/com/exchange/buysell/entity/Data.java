package com.exchange.buysell.entity;

import java.util.List;


class MyJSONObject {
    private List<Data> dataList;

    public MyJSONObject() { }

    public MyJSONObject(List<Data> dataList) {
        this.dataList = dataList;
    }

    public List<Data> getDataList() {
        return dataList;
    }

    public void setDataList(List<Data> dataList) {
        this.dataList = dataList;
    }
}


public class Data {

    private String symbol;

    public Data() { }

    public Data(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
