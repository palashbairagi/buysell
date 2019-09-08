package com.exchange.buysell.controllers;

import com.exchange.buysell.entity.data;
import com.exchange.buysell.services.SearchInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("stockapi/v1/search")
public class SearchController {
    @Autowired
    private SearchInterface Searchservice;

    @RequestMapping(value = "/{stockname}", method = RequestMethod.GET)
    public ResponseEntity<String> findItem(@PathVariable(value = "stockname") String stockname) {


        System.out.println(stockname);


        return Searchservice.getStocks(stockname);



    }


}
