package com.exchange.buysell.entity;

import java.util.List;


public class MyJSONObject {
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



