package org.tcs.tcs;

public class Sample {
	public static void main(String[] args) {
		String s="greens";
		String s1 = "greens";
		
		System.out.println("Immutable string");
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		s = s.concat(s1);
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		
		/*StringBuilder s2 = new StringBuilder("karthick");
		StringBuilder s3 = new StringBuilder("karthick");*/
		
		StringBuffer s2 = new StringBuffer("karthick");
		StringBuffer s3 = new StringBuffer("karthick");
		
		
		System.out.println("Mutable string");
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));

		s2 = s2.append(s3);
		System.out.println(s2);
		System.out.println(System.identityHashCode(s2));

			
	}

	}