package com.exchange.buysell.controllers;

import com.exchange.buysell.entity.Stocks;
import com.exchange.buysell.service.SearchService;
import com.exchange.buysell.service.SearchServiceImp;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("“stockapi/v1/search")
public class SearchController {

//    @RequestMapping(name = "“stockapi/v1/search/{stockname}?pageNumber=1&offset=10” ", method = RequestMethod.GET)
//    public List<Stocks> findItem(@PathVariable(name = "stockname") String stockname) {
//        SearchService service=new SearchServiceImp();
//
//        return  service.getStocks(stockname);
//
//
//    }

    @RequestMapping(name="/", method = )
}
