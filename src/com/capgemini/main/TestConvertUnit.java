package com.capgemini.main;

import com.capgemini.entity.Employee;
import com.capgemini.entity.Product;

public class TestConvertUnit
{
	public static void main(String[] args)
	{
		Employee e = new Employee(43343, "Prajwal", "E", 70000.00);
		e.convert();
		
		Product p = new Product("mobile", 25000.00);
		p.convert();
		
	}

}
