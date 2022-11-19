package org.tcs.tcs;

public class Poly {
public void empInfo() {
	System.out.println("Employee info");
}
public void empName(String a) {
	System.out.println("Emplyee name"+ a);
}
public void empNum(int b) {
	System.out.println("Employee number"+ b);
	
}
public void empDetails(String c,long d) {
	System.out.println("Employee bank"+ c);
	System.out.println("Employee acc number"+ d);
}
public void empDetails2(long e,String f) {
	System.out.println("Employee pin code"+ e);
	System.out.println("Employee address"+ f);
}
public static void main(String[] args) {
	Poly many = new Poly();
	many.empInfo();
	many.empName("ARUN");
	many.empNum(5603);
	many.empDetails("ICICI", 123456789);
	many.empDetails2(641000, "COIMBATORE");
}
}
