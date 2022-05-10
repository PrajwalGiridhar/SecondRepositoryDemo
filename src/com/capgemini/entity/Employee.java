package com.capgemini.entity;

import com.capgemini.intf.Certification;
import com.capgemini.intf.ConvertUnits;

public class Employee implements ConvertUnits
{
	protected int empCode;
	protected String empName;
	protected String dept;
	protected double salary;
	
	public Employee(int empCode, String empName, String dept, double salary) {
		super();
		this.empCode = empCode;
		this.empName = empName;
		this.dept = dept;
		this.salary = salary;
	}
	
	
	public int getEmpCode() {
		return empCode;
	}

	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public void convert()
	{
		System.out.println("The salary of Employee in dollar is "+(salary / dollar));
	}
	

	/*@Override
	public void getCertification(String cname)
	{
		System.out.println(empName+"is Certified in "+cname);
	}*/

	

}
