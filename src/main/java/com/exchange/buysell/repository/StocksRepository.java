package com.exchange.buysell.repository;

import com.exchange.buysell.entity.data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StocksRepository extends JpaRepository<data, Integer> {

}
