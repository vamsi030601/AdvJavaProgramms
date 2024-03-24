package com.sathya.jdbc2;

public class EmployeeInfo {
  private int empId;
  private String empName;
  private Double empSalary;
public EmployeeInfo(int empId, String empName, double empSalary) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empSalary = empSalary;
}
@Override
public String toString() {
	return "EmployeeInfo [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public Double getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(Double empSalary) {
	this.empSalary = empSalary;
}
public EmployeeInfo() {
	super();
	
}
  
  
  
}
	