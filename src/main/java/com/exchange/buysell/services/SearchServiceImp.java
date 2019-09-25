package com.exchange.buysell.services;


import com.exchange.buysell.entity.Data;
import com.exchange.buysell.entity.MyJSONObject;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;


@Service
public class SearchServiceImp implements SearchInterface {
    private final String URL = "https://api.worldtradingdata.com/api/v1/stock?symbol=AAPL&api_token=IMVwkyMvqyG1GSVEGbIDjFeRwPmW2rvYzibGVX1NelH7H0SgzOeKF5s3rAbO";

    public List<Data> StockBySymbol(String symbol){
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> responseEntity =  restTemplate.getForEntity(URL, String.class);
        System.out.println(responseEntity.toString());
        return null;//(List<Data>) myJSONObject.getDataList();
    }

}
