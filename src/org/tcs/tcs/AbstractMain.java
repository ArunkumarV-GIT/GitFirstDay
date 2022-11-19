package org.tcs.tcs;

public class AbstractMain implements fullyAbstraction {
	@Override
	public void name()
	{
		System.out.println("name is arun");
	}
	@Override
	public void id()
	{
		System.out.println("id is 5603");
	}
	
	public static void main(String[] args) {
		AbstractMain a = new AbstractMain();
		a.name();
		a.id();
	}

}
