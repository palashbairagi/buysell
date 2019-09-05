package com.exchange.buysell.Service;

import com.exchange.buysell.Entity.Stocks;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SearchServiceImp implements SearchService {


    @Override
    public List<Stocks> getStocks(String stockname) {

        List<Stocks> mylist = new ArrayList<>();
        Stocks stock1 = new Stocks();
        stock1.setStockId(1);
        stock1.setStockname("APPLE");
        stock1.setStockSymbol("APL");
        Stocks stock2 = new Stocks();
        stock2.setStockId(2);
        stock2.setStockname("Orange");
        stock2.setStockSymbol("ORG");
        mylist.add(stock1);
        mylist.add(stock2);

        mylist.stream().filter(s->s.getStockname().equals(stockname));

        return mylist;
    }
}
