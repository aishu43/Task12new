package com.example.hr;

public class Employee {

	
	public int employee_id;
	public String employee_name;
	public double employee_salary;
	
	public int getEmployeeId()
	
	{
		return employee_id;
	
	}
	public void setEmployeeId(int employeeId)
	{
		this.employee_id =employeeId;
	}

public String getEmployeeName()
	
	{
		return employee_name;
	
	}
	public void setEmployeeName(String employeeName)
	{
		this.employee_name =employeeName;
	}

public double getEmployeesalary()
	
	{
		return employee_salary;
	
	}
	public void setEmployeesalary(double employeeSalary)
	{
		this.employee_salary =employeeSalary;
	}
	public String getFormattedSalary() {
	    return String.format("$%.2f", employee_salary);
	  }
}
