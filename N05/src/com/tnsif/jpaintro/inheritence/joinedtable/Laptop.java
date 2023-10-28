package com.tnsif.jpaintro.inheritence.joinedtable;

import javax.persistence.Entity;

@Entity
public class Laptop extends Device {
	private String processor;
	private int storage;
	private float price;

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [processor=" + processor + ", storage=" + storage + ", price=" + price + ", toString()="
				+ super.toString() + "]";
	}

}
