package com.exchange.buysell.controller;
import com.exchange.buysell.exception.StatusException;
import com.exchange.buysell.entity.Orders;
import com.exchange.buysell.services.BuySellServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("stockapi/v1/order")
public class BuySellController {

    @Autowired
    private BuySellServicesInterface buysellservices;

    @PostMapping
    @RequestMapping(value = "/")
    public ResponseEntity<String> buySell(@RequestBody Orders orders) {

        System.out.println(" BuySellController [buySell(Orders)] ");

        System.out.println(orders.getOrderType());

        try {
            if (orders.getOrderType().equalsIgnoreCase("Buy")) {
                buysellservices.buy(orders);
            } else if (orders.getOrderType().equalsIgnoreCase("Sell")) {
                buysellservices.sell(orders);
            } else {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        } catch (StatusException statusException) {
            System.out.println("Status Exception");
            return new ResponseEntity(statusException, HttpStatus.BAD_REQUEST);
        } catch (Exception exception) {
            System.out.println("Exception");
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
