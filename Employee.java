package com.zensar.java8;

import java.io.Serializable;



public class Employee {
private int employeeId;
private String employeeName;
private int employeeSalary;



public Employee() {
super();
}



public Employee(int employeeId, String employeeName, int employeeSalary) {
super();
this.employeeId = employeeId;
this.employeeName = employeeName;
this.employeeSalary = employeeSalary;
}



public int getEmployeeId() {
return employeeId;
}



public void setEmployeeId(int employeeId) {
this.employeeId = employeeId;
}



public String getEmployeeName() {
return employeeName;
}



public void setEmployeeName(String employeeName) {
this.employeeName = employeeName;
}



public int getEmployeeSalary() {
return employeeSalary;
}



public void setEmployeeSalary(int employeeSalary) {
this.employeeSalary = employeeSalary;
}



@Override
public String toString() {
return employeeId + " " + employeeName + " " + employeeSalary;
}





@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + employeeId;
	result = prime * result
			+ ((employeeName == null) ? 0 : employeeName.hashCode());
	result = prime * result + employeeSalary;
	return result;
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (employeeId != other.employeeId)
		return false;
	if (employeeName == null) {
		if (other.employeeName != null)
			return false;
	} else if (!employeeName.equals(other.employeeName))
		return false;
	if (employeeSalary != other.employeeSalary)
		return false;
	return true;
}



public int calculateSalary() {
return 0;
}

public  void printEmployee(String name) {
	System.out.println(name);
}






}














