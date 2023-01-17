package com.dtone.dvs.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductPriceFixed extends ProductPrice {

	@JsonProperty(value = "amount")
	private Double amount;

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "ProductPriceFixed [amount=" + amount + ", unitType=" + getUnitType() + ", unit=" + getUnit()
				+ ", fee=" + getFee() + "]";
	}

}
