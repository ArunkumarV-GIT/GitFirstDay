package org.tcs.tcs;

public class Sample1Constructor extends SampleConstructor  {

	public Sample1Constructor()
	{
		//this(100,"Arun");
		super(1000);
		System.out.println("child default Constructor");
		
	}
	public void normal() {
		System.out.println("child normal method");
	}
	public Sample1Constructor(int d)
	{
		super(2000);
		System.out.println("child parameterized constructor INT ");
		System.out.println(d);
	}

	public Sample1Constructor(int a,String b)
	{
		//this(999);
		System.out.println("child parametrized constructure INT STRING ");
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public static void main(String[] args) {
		System.out.println("start");
		Sample1Constructor s = new Sample1Constructor();
		
		Sample1Constructor s1 = new Sample1Constructor(100);
		Sample1Constructor s2 = new Sample1Constructor(100,"arun");
		//s.normal();*/
		System.out.println("end");
	}
}
