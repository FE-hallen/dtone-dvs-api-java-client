package com.dtone.dvs.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductPriceRanged extends ProductPrice {

	@JsonProperty(value = "amount")
	private AmountRanged amount;

	public AmountRanged getAmount() {
		return amount;
	}

	public void setAmount(AmountRanged amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "ProductPriceRanged [amount=" + amount + ", unitType=" + getUnitType() + ", unit=" + getUnit()
				+ ", fee=" + getFee() + "]";
	}

}
