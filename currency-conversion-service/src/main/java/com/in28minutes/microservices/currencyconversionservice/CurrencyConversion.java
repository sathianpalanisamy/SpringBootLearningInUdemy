package com.in28minutes.microservices.currencyconversionservice;

import java.math.BigDecimal;

public class CurrencyConversion {

	private long id;
	private String from;
	private String to;
	private BigDecimal convertionMultipleRates;
	private BigDecimal quantity;
	private BigDecimal totalCalculatedAmount;
	private String environment;

	public CurrencyConversion() {
	}

	public CurrencyConversion(long id, String from, String to, BigDecimal multipleConvertion, BigDecimal quantity,
			BigDecimal totalCalculatedAmount, String environment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.convertionMultipleRates = multipleConvertion;
		this.quantity = quantity;
		this.totalCalculatedAmount = totalCalculatedAmount;
		this.environment = environment;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}

	public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

}
