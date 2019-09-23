package com.exchange.buysell.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;


@Service
public class SearchServiceImp implements SearchInterface {
    private  static  final Logger log= LoggerFactory.getLogger(SearchServiceImp.class);



//    @Override
//    public List<data> getStocks(@RequestParam String stockname) {
//      //  String stockSymbol=stockname.toLowerCase();
//        log.info("In get Stocks");
//        RestTemplate rt =new RestTemplate();
//      data data = rt.getForObject("http://api.worldtradingdata.com/api/v1/stock?symbol="+stockname+"&api_token=cYDw6OCIFS7okSkLnHj4oR6kP5H3pbQJNBQ9RIFUKZ6MOZYQxAHHhaBWsTfx", data.class);
//        System.out.println(data.getPrice());
//
//        List<data> mylist = new ArrayList<>();
//            mylist.add(data);
//
//       // mylist.stream().filter(s->s.getStockname().equals(stockname));
//
//        return mylist;
//    }
    public ResponseEntity<String> getStocks(String stockname){
        RestTemplate rt =new RestTemplate();
        ResponseEntity<String> st = rt.getForEntity("http://api.worldtradingdata.com/api/v1/stock?symbol={stockname}&api_token=cYDw6OCIFS7okSkLnHj4oR6kP5H3pbQJNBQ9RIFUKZ6MOZYQxAHHhaBWsTfx", String.class,stockname);
    return  st;
    }
}
