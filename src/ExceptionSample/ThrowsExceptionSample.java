package ExceptionSample;

public class ThrowsExceptionSample {
public static void main(String[] args) throws AgeNotException {
	int a=10;
	System.out.println(a);
	int afterage = a+5;
	if(afterage<=18)
	{
		//System.out.println("age is not eligible");
		throw new AgeNotException();
	}
}
}
