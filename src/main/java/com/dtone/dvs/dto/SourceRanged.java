package com.dtone.dvs.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SourceRanged extends ProductSource {

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
		return "SourceRanged [amount=" + amount + ", unitType=" + getUnitType() + ", unit=" + getUnit() + "]";
	}

}
