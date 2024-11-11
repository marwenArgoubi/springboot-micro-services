package com.ma.microservices.CurrencyExchangeService.Bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CurrencyExchange {
	
	@Id
	private Long id;
	@Column(name="currency_from")
	private String from;
	@Column(name="currency_to")
	private String to;
	private double rate;
	private String environnment;

	public CurrencyExchange(Long id, String from, String to, double rate) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.rate = rate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public String getEnvironnment() {
		return environnment;
	}
	public void setEnvironnment(String environnment) {
		this.environnment = environnment;
	}

}
