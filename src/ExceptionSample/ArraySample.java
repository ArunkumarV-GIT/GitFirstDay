package ExceptionSample;

public class ArraySample {
public static void main(String[] args) {
	int a[] = new int[5];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[6]=60;
	for(int i=0;i<a.length;i++)
	{
	System.out.println(a[i]);
	}
	
}
}
