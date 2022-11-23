package ExceptionSample;

import java.util.Scanner;

public class InputMismatchException {
public static void main(String[] args) {
	Scanner scr = new Scanner (System.in);
			System.out.println("please input dta");
			int in = scr.nextInt();
System.out.println(in);
}
}
