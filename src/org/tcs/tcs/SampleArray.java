package org.tcs.tcs;

public class SampleArray {
/*public static void main(String[] args) {
	int b[]=new int[5];
	b[0]=10;
	b[1]=20;
	b[2]=30;
	b[3]=40;
	b[4]=50;
	b[2]=30000;
	System.out.println("enhanced for loop");
	for(int s:b)
	{
	System.out.println(s);
}
	System.out.println("Normal for loop");
	for(int i=0;i<b.length;i++)
	{
		System.out.println(b[i]);
	}

	}*/
	public static void main(String[] args) {
		int b[][]=new int[2][5];
		b[0][0]=10;
		b[0][1]=20;
		b[0][2]=30;
		b[0][3]=40;
		b[0][4]=50;
		
		b[1][0]=100;
		b[1][1]=200;
		b[1][2]=300;
		b[1][3]=400;
		b[1][4]=500;
		
		System.out.println(b[1][3]);
		
		for(int i=0;i<1;i++)
		{
			for(int j=0;j<5;j++)
			{
			System.out.println(b[i][j]);
		}
		}
	}
	}

