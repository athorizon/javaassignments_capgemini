package com.cg.eis.pl;
import com.cg.eis.bean.*;
import com.cg.eis.service.EmployeeService;

public class EmployeeDetails 
{
	public static void main(String args[])
	{
	Employee employee=new Employee();
	EmployeeService empservice=new EmployeeService();
	empservice.getEmployeeDetail(employee);
	empservice.getInsuranceScheme(employee);
	System.out.println(empservice.display(employee).toString());
	}
	

}
