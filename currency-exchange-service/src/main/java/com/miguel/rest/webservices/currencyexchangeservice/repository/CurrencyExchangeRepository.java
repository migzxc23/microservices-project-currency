package com.miguel.rest.webservices.currencyexchangeservice.repository;

import com.miguel.rest.webservices.currencyexchangeservice.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {

    CurrencyExchange findByFromAndTo(String from, String to);

}
