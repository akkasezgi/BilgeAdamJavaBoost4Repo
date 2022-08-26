package com.bilgeadam.boost.week03.lesson004;

public class Item {

	private String name;
	private String unit;
	private double unitPrice;
	private int vatRate;
	private int amount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getVatRate() {
		return vatRate;
	}

	public void setVatRate(int vatRate)
	{
		this.vatRate = vatRate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", unit=" + unit + ", unitPrice=" + unitPrice + ", vatRate=" + vatRate
				+ ", amount=" + amount + "]";
	}

	

}
