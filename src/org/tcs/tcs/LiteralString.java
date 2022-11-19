package org.tcs.tcs;

public class LiteralString {
public static void main(String[] args) {
	String s="greens";
	String s1 = "greens";
	
	System.out.println("Literal string");
	System.out.println(System.identityHashCode(s));
	System.out.println(System.identityHashCode(s1));
	
	String s2 = new String("karthick");
	String s3 = new String("karthick");
	
	System.out.println(System.identityHashCode(s2));
	System.out.println(System.identityHashCode(s3));


		


}
}
