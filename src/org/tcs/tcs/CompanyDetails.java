package org.tcs.tcs;

public class CompanyDetails {
public void companyId() {
	System.out.println("Company id is 678");
	
}
public void companyName() {
	System.out.println("Company name is ANA");
	
}
public static void main(String[] args) {
	CompanyDetails c = new CompanyDetails();
	c.companyId();
	c.companyName();
	
	EmployeeDetails e = new EmployeeDetails();
	e.empId();
	e.empName();
	
}
}
