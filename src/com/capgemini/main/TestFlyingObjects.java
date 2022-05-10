package com.capgemini.main;

import com.capgemini.entity.Aeroplane;
import com.capgemini.entity.Bird;
import com.capgemini.intf.FlayingObjects;

public class TestFlyingObjects
{
	public static void main(String[] args)
	{
		Bird b = new Bird();
		Aeroplane ae = new Aeroplane();
		
		b.fly();
		ae.fly();
		
		FlayingObjects fo = new Bird();
		
		fo.fly();
		
		fo = new Aeroplane();
		
		fo.fly();
	}
}
