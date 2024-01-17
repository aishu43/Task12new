package com.example.hrtest;

import com.example.hr.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();

	    // Set values using setter methods
	    employee.setEmployeeId(10);
	    employee.setEmployeeName("Catherine");
	    employee.setEmployeesalary(5300.0);

	    // Get values using getter methods
	    int employeeId = employee.getEmployeeId();
	    String employeeName = employee.getEmployeeName();
	    String formattedSalary = employee.getFormattedSalary();

	    // Print the values
	    System.out.println("Employee Details:");
	    System.out.println("ID: " + employeeId);
	    System.out.println("Name: " + employeeName);
	    System.out.println("Salary: " + formattedSalary);
	  }
	
	}


