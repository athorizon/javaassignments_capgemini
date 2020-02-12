package com.cg.eis.bean;

public class Employee
{
	private int id;
	private String name;
	private int salary;
	private String designation;
	private String insuranceScheme;
	public int getId()
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getSalary()
	{
		return salary;
	}
	public void setSalary(int salary) 
	{
		this.salary = salary;
	}
	public String getDesignation()
	{
		return designation;
	}
	public void setDesignation(String designation) 
	{
		this.designation = designation;
	}
	public String getInsuranceScheme()
	{
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) 
	{
		this.insuranceScheme = insuranceScheme;
	}
	public String toString()
	{
		return id+" "+name+" "+salary+" "+designation+" "+insuranceScheme;
	}	
}
