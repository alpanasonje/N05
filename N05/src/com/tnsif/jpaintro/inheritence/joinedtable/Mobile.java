package com.tnsif.jpaintro.inheritence.joinedtable;

import javax.persistence.Entity;

@Entity
public class Mobile extends Device{
	private String series;
	private float price;
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return super.toString()+"Mobile [series=" + series + ", price=" + price + "]";
	}
	
	
}

