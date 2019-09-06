package com.exchange.buysell.repository;

import com.exchange.buysell.entity.Orders;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface StockBuySell extends JpaRepository<Orders, Integer> {

}
