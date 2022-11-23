package ExceptionSample;

public class AgeNotException extends Exception{
public String getMessage() {
	String s = "Age is below 18 and uneligible";
	return s;
}
}
