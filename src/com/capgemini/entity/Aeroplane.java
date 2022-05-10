package com.capgemini.entity;

import com.capgemini.intf.FlayingObjects;

public class Aeroplane implements FlayingObjects 
{
	@Override
	public void fly()
	{
		System.out.println("Aeroplane is flying");
		
	}

}
