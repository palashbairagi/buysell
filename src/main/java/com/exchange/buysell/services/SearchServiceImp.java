package com.exchange.buysell.services;


import com.exchange.buysell.entity.Data;
import com.exchange.buysell.entity.MyJSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;

import java.util.List;


@Service
public class SearchServiceImp implements SearchInterface {
    private final String URL = "http://api.worldtradingdata.com/api/v1/stock?symbol=AB&api_token=cYDw6OCIFS7okSkLnHj4oR6kP5H3pbQJNBQ9RIFUKZ6MOZYQxAHHhaBWsTfx";

    public List<Data> StockBySymbol(String symbol){
        RestTemplate restTemplate = new RestTemplate();
        MyJSONObject myJSONObject = restTemplate.getForObject(URL, MyJSONObject.class);

        System.out.println(myJSONObject);

        return myJSONObject.getDataList();
    }

}
