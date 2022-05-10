package com.capgemini.main;

import com.capgemini.entity.Developer;
import com.capgemini.entity.Employee;
import com.capgemini.entity.Student;

public class TestCertification
{
	public static void main(String[] args)
	{
		Employee e = new Employee(8272, "Prajwal", "E", 20000);
		//e.getCertification("AEE");
		System.out.println(e);
		
		Developer d = new Developer(872878, "Ujwal", "SE", 30000, 2);
		d.getCertification("DCJP");
		System.out.println(d);
		
		Student s = new Student(21, "Giridhar", 98);
		s.getCertification("OWCD");
		System.out.println(s);
		
	}

}
