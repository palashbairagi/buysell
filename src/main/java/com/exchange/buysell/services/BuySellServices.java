package com.exchange.buysell.services;
import com.exchange.buysell.entity.Orders;
import com.exchange.buysell.exception.StatusException;
import com.exchange.buysell.repository.StockBuySell;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalDate;

import java.util.Optional;

@Service
public class BuySellServices implements BuySellServicesInterface {

    @Autowired
    private StockBuySell stockBuySell;

    public void buy(Orders order) throws Exception{

        System.out.println("BuySellService[buy(Order)]");
        try {
            boolean isValidCard = true;

            /*.
            Validate Credit Card
            double quantity = order.getOrderQuantity();
            double price = order.getStockPrice();
            */

            if (isValidCard) {

                //order.setOrderDateTime();

                LocalDate today = LocalDate.now();
                order.setOrderDateTime(today.toString());

                stockBuySell.save(order);
            }
            else
                throw new StatusException("1045", "Insufficient balance");
        } catch (StatusException statusException) {
            System.out.println("StatusException in BuySellServices [buy(order)] " + statusException);
            throw statusException;
        }
        catch (Exception e) {
            System.out.println("Exception in BuySellServices [buy(order)] " + e);
            throw new Exception();
        }
    }

    public void sell(Orders order) throws Exception{

        System.out.println("BuySellService[sell(Order)]");
        
        try {

            Optional<Orders> orders = stockBuySell.findById(order.getStockId()); // Need to update the repository method




            if (orders.isPresent()) {

                int stockQuantity = orders.get().getOrderQuantity();

                if (stockQuantity >= order.getOrderQuantity()) {
                    stockBuySell.save(order);
                } else {
                    throw new StatusException("1046", "Insufficient Shares");
                }
            }
        }catch (StatusException statusException) {
            System.out.println("StatusException in BuySellServices [sell(order)] " + statusException);
            throw statusException;
        }catch (Exception e) {
            System.out.println("Exception in BuySellServices [sell(order)] " + e);
            throw new Exception();
        }
    }
}
