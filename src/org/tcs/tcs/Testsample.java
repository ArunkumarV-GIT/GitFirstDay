package org.tcs.tcs;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Testsample {
	public static void main(String[] args) {
List<Integer> li = new LinkedList<Integer>();

li.add(10);
li.add(20);
li.add(30);
li.add(40);
li.add(50);
li.add(60);

System.out.println(li);
/*//SIZE
int a = li.size();
System.out.println(a);
//FETCH
int k =li.get(4);
System.out.println(k);
//CONTAIN
boolean b =li.contains(60);
System.out.println(b);
//INDEXOF
int in = li.indexOf(10);
System.out.println(in);
//LASTINDEXOF
int Lin = li.lastIndexOf(10);
System.out.println(Lin);

li.add(90);
System.out.println(li);

li.add(3,40);
System.out.println(li);

li.remove(4);
System.out.println(li);

li.set(6, 70);
System.out.println(li);
*/
List<Integer> si = new LinkedList<Integer>();
boolean b = si.isEmpty();
System.out.println(b);

si.add(100);
si.add(200);
si.add(30);
si.add(400);
si.add(50);
si.add(600);

for(int i=0;i<li.size();i++)
{
System.out.println(li.get(i));	
}

for(Integer x:si)

	System.out.println(x);

}
/*si.removeAll(li);
System.out.println(si);*/



	}

