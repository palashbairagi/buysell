package com.exchange.buysell.services;

import com.exchange.buysell.exception.StatusException;
import com.exchange.buysell.entity.Orders;

public interface BuySellServicesInterface {
    public void buy(Orders order) throws StatusException;
    public void sell(Orders order) throws StatusException;
}
