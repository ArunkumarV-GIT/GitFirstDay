package ExceptionSample;

public class NullPointerException {
public static void main(String[] args) {
	
	String s=null;
	System.out.println(System.identityHashCode(s));
	System.out.println(s.charAt(9));

}
}
