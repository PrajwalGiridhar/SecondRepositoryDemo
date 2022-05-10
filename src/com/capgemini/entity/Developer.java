package com.capgemini.entity;

import com.capgemini.intf.Certification;

public class Developer extends Employee implements Certification
{
	protected int noOfProjectDone;
	

	public int getNoOfProjectDone() {
		return noOfProjectDone;
	}
	public void setNoOfProjectDone(int noOfProjectDone) {
		this.noOfProjectDone = noOfProjectDone;
	}

	public Developer(int empCode, String empName, String dept, double salary, int noOfProjectDone) {
		super(empCode, empName, dept, salary);
		this.noOfProjectDone = noOfProjectDone;
	}


	@Override
	public void getCertification(String cname)
	{
		System.out.println(empName+" is Certified in "+cname);
	}
	
	
	
	

}
