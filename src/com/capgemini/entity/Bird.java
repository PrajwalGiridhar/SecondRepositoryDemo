package com.capgemini.entity;

import com.capgemini.intf.FlayingObjects;

public class Bird implements FlayingObjects 
{
	@Override
	public void fly()
	{
		System.out.println("Bird is flying");
		
	}

}
