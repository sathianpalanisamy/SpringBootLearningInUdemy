package com.in28minutes.microservices.currencyexchange;

import java.math.BigDecimal;

public class CurrencyExchange {

	private Long id;
	private String from;
	private String to;
	private BigDecimal convertionMultipleReates;
	private String environment;

	public CurrencyExchange(Long id, String from, String to, BigDecimal convertionMultipleReates) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.convertionMultipleReates = convertionMultipleReates;
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

	public BigDecimal getConvertionMultipleReates() {
		return convertionMultipleReates;
	}

	public void setConvertionMultipleReates(BigDecimal convertionMultipleReates) {
		this.convertionMultipleReates = convertionMultipleReates;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

}
