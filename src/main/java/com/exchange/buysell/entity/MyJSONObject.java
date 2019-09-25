package com.exchange.buysell.entity;

import java.util.Collection;
import java.util.List;


public class MyJSONObject {
    private Collection<Data> data;

    public MyJSONObject() { }

    public MyJSONObject(List<Data> data) {
        this.data = data;
    }

    public Collection<Data> getDataList() {
        return data;
    }

    public void setDataList(List<Data> data) {
        this.data = data;
    }
}



