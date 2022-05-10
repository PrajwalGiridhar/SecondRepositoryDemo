package com.capgemini.entity;

import com.capgemini.intf.Certification;

public class Student implements Certification
{
	protected int rollNum;
	protected String sname;
	protected double marksObtained;
	
	public Student(int rollNum, String sname, double marksObtained) {
		super();
		this.rollNum = rollNum;
		this.sname = sname;
		this.marksObtained = marksObtained;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getMarksObtained() {
		return marksObtained;
	}

	public void setMarksObtained(double marksObtained) {
		this.marksObtained = marksObtained;
	}

	@Override
	public void getCertification(String cname)
	{
		System.out.println(sname+" is Certified in "+cname);
	}

	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", sname=" + sname + ", marksObtained=" + marksObtained + "]";
	}
	
	

}
