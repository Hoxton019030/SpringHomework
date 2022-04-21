package com.jerrymvc.springdemo.model;

import java.util.LinkedHashMap;

public class Car {

	private String brand;

	private String color;

	private String country;

	private LinkedHashMap<String, String> countryOptions;

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public Car() {
		countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("GM", "�w��");
		countryOptions.put("JP", "�饻");
		countryOptions.put("KR", "����");
		countryOptions.put("US", "����");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}