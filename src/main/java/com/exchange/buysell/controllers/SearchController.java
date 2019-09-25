package com.exchange.buysell.controllers;

import com.exchange.buysell.entity.Data;
import com.exchange.buysell.exception.StatusException;
import com.exchange.buysell.services.SearchInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("stockapi/v1/search")
public class SearchController {
    @Autowired
    private SearchInterface Searchservice;

    @GetMapping(value = "/{symbol}")
    public ResponseEntity<List<Data>> findItem(@PathVariable(value = "symbol") String symbol) {

        System.out.println(symbol);

        List<Data> dataList = Searchservice.StockBySymbol(symbol);
        ResponseEntity<List<Data>> response = new ResponseEntity<>(dataList, HttpStatus.OK);

        try{

           if(response.getBody().isEmpty()){
               throw new StatusException("1001","Sorry No Data For that Value is found!");

           }

        } catch (StatusException e) {
            e.printStackTrace();
        }



        return new ResponseEntity<>(response.getBody(), HttpStatus.OK);

    }


}
