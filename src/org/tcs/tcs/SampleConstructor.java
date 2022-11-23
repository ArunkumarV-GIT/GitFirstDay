package org.tcs.tcs;

public class SampleConstructor {
	

public SampleConstructor()
{
	//this(100,"Arun");
	//super();
	System.out.println("parent default Constructor");
	
}
public void normal() {
	System.out.println("parent normal method");
}
public SampleConstructor(int d)
{
	System.out.println("parent parameterized constructor INT ");
	System.out.println(d);
}

public SampleConstructor(int a,String b)
{
	//this(999);
	System.out.println("Parent parametrized constructure INT STRING ");
	System.out.println(a);
	System.out.println(b);
	
}


}
