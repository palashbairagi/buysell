package com.exchange.buysell.service;

import com.exchange.buysell.entity.Stocks;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SearchService {
    public List<Stocks> getAllStock();
    public List<Stocks> getStocks(String stockname);

}
