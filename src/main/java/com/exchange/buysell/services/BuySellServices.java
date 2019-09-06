package com.exchange.buysell.services;
import com.exchange.buysell.entity.Orders;
import com.exchange.buysell.exception.StatusException;
import com.exchange.buysell.repository.StockBuySell;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BuySellServices implements BuySellServicesInterface {

    @Autowired
    private StockBuySell stockBuySell;

    public void buy(Orders order) throws StatusException{

        boolean isValidCard = true;
        /*.
        Validate Credit Card
        double quantity = order.getOrderQuantity();
        double price = order.getStockPrice();
        */

        if(isValidCard)
            stockBuySell.save(order);
        else
            throw new StatusException("1045","Insufficient balance");
    }

    public void sell(Orders order) throws StatusException{

        Optional<Orders> orders = stockBuySell.findById(order.getStockId()); // Need to update the repository method

        if(orders.isPresent()) {

            double stockQuantity = orders.get().getOrderQuantity();

            if(stockQuantity >= order.getOrderQuantity())
            {
                stockBuySell.save(order);
            }
            else
            {
                throw new StatusException("1046", "Insufficient Shares");
            }
        }
    }
}
