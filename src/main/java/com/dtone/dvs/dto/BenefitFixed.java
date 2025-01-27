package com.dtone.dvs.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BenefitFixed extends Benefit {

	@JsonProperty(value = "amount")
	private BenefitAmountFixed amount;

	public BenefitAmountFixed getAmount() {
		return amount;
	}

	public void setAmount(BenefitAmountFixed amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "BenefitFixed [amount=" + amount + ", type=" + getType() + ", unitType=" + getUnitType()
				+ ", unit=" + getUnit() + ", additionalInformation=" + getAdditionalInformation() + "]";
	}

}
