package org.hcl.hcl;

public class ClientDetail extends CompanyDetails {
	public void ClientId() {
		System.out.println("Client id is");
	}
	public void ClientName() {
		System.out.println("Client name is");
	}
	public static void main(String[] args) {
		System.out.println("my brach is pradeep");
		ClientDetail cli = new ClientDetail();
		cli.ClientId();
		cli.ClientName();
		
		cli.EmpId();
		cli.EmpName();
		
		cli.CmpId();
		cli.CmpName();
	}
}
