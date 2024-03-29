package com.exchange.buysell.services;

import com.exchange.buysell.exception.StatusException;
import com.exchange.buysell.entity.Orders;

public interface BuySellServicesInterface {
    public void buy(Orders order) throws Exception;
    public void sell(Orders order) throws Exception;
}
