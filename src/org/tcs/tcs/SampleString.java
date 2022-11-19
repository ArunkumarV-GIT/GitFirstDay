package org.tcs.tcs;

public class SampleString {
public static void main(String[] args) {
	String s="Arun";
	String s1="kumar";
	String s2 = s.concat(s1);
	System.out.println(s2);
	
	String a="I Have A Happy Lifein India";
	String sub = a.substring(5);
	System.out.println(sub);
	String su = a.substring(6, 21);
	System.out.println(su);
	
}
}
