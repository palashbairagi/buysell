package com.exchange.buysell.service;
import com.exchange.buysell.entity.Stocks;
import jdk.nashorn.internal.objects.annotations.Property;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
@PropertySource(value={"classpath:application.properties"})
public class SearchServiceImp implements SearchService {


    @Value("${alphavantage.url}")
    private String alphaVantageURL;

    @Value("${alphavantage.apikey")
    private String alphaVantageAPIKEY;

    @Override
    public List<Stocks> getAllStock() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(alphaVantageURL+"/query?" +
                "function=SYMBOL_SEARCH&keywords=/*&apikey="+alphaVantageAPIKEY
                ,String.class);
        System.out.println(response);
        return new ArrayList<Stocks>();
    }

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
        for (Stocks stock : mylist) {
            if (stock.getStockname().equals(stockname)) {
                return mylist;
            }
        }
        return mylist;
    }
}