package com.exchange.buysell.services;

import com.exchange.buysell.entity.data;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SearchInterface {
        public ResponseEntity<String> getStocks(String stockname);

    }
