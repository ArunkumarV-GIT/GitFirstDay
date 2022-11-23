package ExceptionSample;

import java.util.ArrayList;
import java.util.List;

public class IndexOutOfBondException {
 public static void main(String[] args) {
	List<Integer> li=new ArrayList<Integer>();
	li.add(10);
	li.add(20);
	li.add(30);
	
	Integer a = li.get(3);
		System.out.println(a);
}
}
