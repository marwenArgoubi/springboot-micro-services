package com.ma.microservices.CurrencyExchangeService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ma.microservices.CurrencyExchangeService.Bean.CurrencyExchange;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private Environment environment;
	@RequestMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange getExchangeRate(@PathVariable String from, @PathVariable String to) {
		CurrencyExchange currencyExchange = new CurrencyExchange(1L,from, to, 10);
		String port = environment.getProperty("local.server.port");
		currencyExchange.setEnvironnment(port);
	
		return currencyExchange;
	}
}
