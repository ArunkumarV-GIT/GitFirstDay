package org.tcs.tcs;

public class StringExample {
public static void main(String[] args) {
	String s ="Greens 54";
	System.out.println(s);
	
	//length
	int len = s.length();
	System.out.println(len);
	
	//Touppercase
	String up = s.toUpperCase();
	System.out.println(up);
	
	//lowercase
	String low = s.toLowerCase();
	System.out.println(low);
	
	//starts with
	boolean start = s.startsWith("ge");
	System.out.println(start);
	
	//ends with
	boolean end = s.endsWith("54");
	System.out.println(end);
	
	//contains
	boolean con =s.contains("s ");
	System.out.println(con);
	
	//indexof
	int index = s.indexOf("e");
	System.out.println(index);
	
	//indexof
		int index1 = s.indexOf("z");
		System.out.println(index1);

		//indexof
		int index2 = s.lastIndexOf("e");
		System.out.println(index2);
		
	String S1= "greens 54";
	//compare
	boolean equ = s.equals(S1);
	System.out.println(equ);
	
	//compare case sensitive
	boolean equCase = s.equalsIgnoreCase(S1);
	System.out.println(equCase);
	
	//char 
	char ch = s.charAt(5);
	System.out.println(ch);
	
	//isempty
	String E = " ";
	boolean empty = E.isEmpty();
	System.out.println(empty);
}
}
