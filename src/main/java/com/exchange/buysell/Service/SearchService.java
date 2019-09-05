package com.exchange.buysell.Service;

import com.exchange.buysell.Entity.Stocks;

import java.util.List;

public interface SearchService {
    public List<Stocks> getStocks(String stockname);

}
