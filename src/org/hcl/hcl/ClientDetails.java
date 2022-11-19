package org.hcl.hcl;

import org.tcs.tcs.CompanyDetails;
import org.tcs.tcs.EmployeeDetails;

public class ClientDetails {
	public void clientId() {
		System.out.println("Client id is 000");
		
	}
public void clientName() {
	System.out.println("Client name is CLIENTNAME AGES");
}
public static void main(String[] args) {
	ClientDetails cl = new ClientDetails();
	cl.clientId();
	cl.clientName();
	
	EmployeeDetails em = new EmployeeDetails();
	em.empId();
	em.empName();
	
	CompanyDetails cm = new CompanyDetails();
	cm.companyId();
	cm.companyName();
		
		
}
}
