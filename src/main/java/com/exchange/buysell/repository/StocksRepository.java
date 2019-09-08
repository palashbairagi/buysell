package com.exchange.buysell.repository;

import com.exchange.buysell.Entity.Stocks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StocksRepository extends JpaRepository<Stocks, Integer> {

}
