package org.tcs.tcs;

public class MultipleInheritance implements Rbi,Sbi {

	@Override
	public void interest() {
		System.out.println("interset rate is 5%");
		
	}

	@Override
	public void savings() {
		System.out.println("savings is rs.2000");
		
	}

	@Override
	public void reporate() {
		System.out.println("reporate is 1888");
		
	}

	public static void main(String[] args) {
		MultipleInheritance a = new MultipleInheritance();
		a.interest();
		a.savings();
		a.reporate();
	}
}
