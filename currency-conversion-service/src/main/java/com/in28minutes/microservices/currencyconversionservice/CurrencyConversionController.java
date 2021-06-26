package com.in28minutes.microservices.currencyconversionservice;

import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {

	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion calculateCurrencyConversion(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {

		HashMap<String, String> map = new HashMap<>();
		map.put("from", from);
		map.put("to", to);
		ResponseEntity<CurrencyConversion> forEntity = new RestTemplate().getForEntity(
				"http://localhost:8000//currency-exchange/from/{from}/to/{to}", CurrencyConversion.class, map);

		CurrencyConversion currencyConversion = forEntity.getBody();

		return new CurrencyConversion(currencyConversion.getId(), from, to,
				currencyConversion.getConvertionMultipleRates(), quantity,
				quantity.multiply(currencyConversion.getConvertionMultipleRates()),
				currencyConversion.getEnvironment());

	}

}
