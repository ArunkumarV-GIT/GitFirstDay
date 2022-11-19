package org.tcs.tcs;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setExample {
public static void main(String[] args) {
	Set<Integer> si = new TreeSet<Integer>();
	si.add(10);
	si.add(40);
	si.add(20);
	si.add(10);
	
	System.out.println(si);
	
	for(int a:si)
	{
		System.out.println(a);
	}
	
	Set<Integer> si1 = new TreeSet<Integer>();
	boolean b = si1.isEmpty();
	System.out.println(b);
	
	si1.add(40);
	si1.add(100);
	si1.add(300);
	si1.add(10);
	
	
	System.out.println(si1);
		//System.out.println(in);
		for(int a:si1)
		{
			System.out.println(a);
		}	
		
		si1.removeAll(si);
		System.out.println(si1);
		
}
}
