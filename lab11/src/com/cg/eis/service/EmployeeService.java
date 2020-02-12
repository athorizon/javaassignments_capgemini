package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.bean.Employee;

interface EmpService
{
	Employee getEmployeeDetail(Employee employee);
	Employee getInsuranceScheme(Employee employee);
	Employee display(Employee employee);
}
public class EmployeeService implements EmpService
{
	Scanner sc=new Scanner(System.in);
	int id=sc.nextInt();
	String name=sc.next();
	int salary=sc.nextInt();
	String designation=sc.next();
	
	@Override
	public Employee getEmployeeDetail(Employee employee) 
	{
		employee.setId(id);
		employee.setName(name);
		employee.setSalary(salary);
		employee.setDesignation(designation);
		return employee;
	}

	@Override
	public Employee getInsuranceScheme(Employee employee) 
	{
		if(employee.getSalary()>5000 && employee.getSalary()<20000 && employee.getDesignation().equals("System Associate"))
		{
			employee.setInsuranceScheme("Scheme C");
		}
		else if(employee.getSalary()>=20000 && employee.getSalary()<40000 && employee.getDesignation().equals("Programmer"))
		{
			employee.setInsuranceScheme("Scheme B");
		}
		else if(employee.getSalary()>=40000 && employee.getDesignation().equals("Manager"))
		{
			employee.setInsuranceScheme("Scheme A");
		}
		else if(employee.getSalary()<5000 && employee.getDesignation().equals("Clerk"))
		{
			employee.setInsuranceScheme("No Scheme");
		}
		return employee;
	}

	@Override
	public Employee display(Employee employee) 
	{
		return employee;
	}
	
}
