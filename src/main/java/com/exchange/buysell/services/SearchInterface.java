package com.exchange.buysell.services;

import com.exchange.buysell.entity.Data;

import java.util.List;

public interface SearchInterface {
    public List<Data> StockBySymbol(String symbol);
}
