package com.exchange.buysell.controllers;

import com.exchange.buysell.entity.data;
import com.exchange.buysell.exception.StatusException;
import com.exchange.buysell.services.SearchInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.exchange.buysell.services.SearchServiceImp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("stockapi/v1/search")
public class SearchController {
    @Autowired
    private SearchInterface Searchservice;

    @RequestMapping(value = "/{stockname}", method = RequestMethod.GET)
    public ResponseEntity<String> findItem(@PathVariable(value = "stockname") String stockname) {


        System.out.println(stockname);

        ResponseEntity<String> response= Searchservice.getStocks(stockname);

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
