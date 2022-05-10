package com.capgemini.entity;

import com.capgemini.intf.ConvertUnits;

public class Product implements ConvertUnits
{
	protected String pname;
	protected double price;
	
	public Product(String pname, double price) {
		super();
		this.pname = pname;
		this.price = price;
	}
	
	public String getPname() {
		return pname;
	}
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void convert()
	{
		System.out.println("The price of the product in dollar is "+(price / dollar));

	}

}
