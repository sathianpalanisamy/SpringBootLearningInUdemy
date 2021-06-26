package com.in28minutes.microservices.currencyexchange;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CurrencyExchange {

	@Id
	private Long id;
	@Column(name = "CURRENCY_EXCHANGE_FROM")
	private String from;
	@Column(name = "CURRENCY_EXCHANGE_TO")
	private String to;
	private BigDecimal convertionMultipleRates;
	private String environment;

	public CurrencyExchange() {
		super();
	}

	public CurrencyExchange(Long id, String from, String to, BigDecimal convertionMultipleReates) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.convertionMultipleRates = convertionMultipleReates;
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

	public BigDecimal getConvertionMultipleRates() {
		return convertionMultipleRates;
	}

	public void setConvertionMultipleRates(BigDecimal convertionMultipleRates) {
		this.convertionMultipleRates = convertionMultipleRates;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

}
