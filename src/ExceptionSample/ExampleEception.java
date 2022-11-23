package ExceptionSample;

public class ExampleEception {
public static void main(String[] args) {
	System.out.println(0);
	 System.out.println(1);
	 System.out.println(2);
	 System.out.println(3);
	 try {
	 System.out.println(4/1);
	 String s="hi";
	 System.out.println(s.charAt(4));
	 }
	 catch(ArithmeticException e)
	 {
		 System.out.println("Please dont divide by zero");
	 }
	 catch(Exception e)
	 {
		 System.out.println("Null value");
	 }
	
	 
	 finally{
		 System.out.println("success");
		 
	 }
	 System.out.println(5);
	 System.out.println(6);
	 System.out.println(7);
}
}
