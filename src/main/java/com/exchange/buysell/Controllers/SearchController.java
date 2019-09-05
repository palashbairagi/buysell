package com.exchange.buysell.Controllers;

import com.exchange.buysell.Entity.Stocks;
import com.exchange.buysell.Service.SearchService;
import com.exchange.buysell.Service.SearchServiceImp;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("“stockapi/v1/search")
public class SearchController {


    @RequestMapping(name = "“stockapi/v1/search/{stockname}?pageNumber=1&offset=10” ", method = RequestMethod.GET)
    public List<Stocks> findItem(@PathVariable(name = "stockname") String stockname) {
        SearchService service=new SearchServiceImp();

        return  service.getStocks(stockname);


    }
}
