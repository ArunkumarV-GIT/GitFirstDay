package File;

import java.io.File;
import java.io.IOException;

public class FileCreation {
public static void main(String[] args) throws IOException {
	//File f = new File ("C:\\Users\\Reyan\\Desktop\\BSNL\\Sample.txt");
	File f=new File ("C:\\Users\\Reyan\\Desktop\\BSNL\\Sample");
	//boolean b = f.createNewFile();
	//System.out.println(b);
	
	boolean c=f.canExecute();
	System.out.println(c);
	
	boolean d = f.canRead();
	System.out.println(d);
	
	boolean e = f.canWrite();
	System.out.println(e);
	
	boolean g=f.isDirectory();
	System.out.println(g);
	
	boolean h = f.isFile();
	System.out.println(h);
	
	/*String[] s =f.list();
	for(String x :s)
	{
		System.out.println(x);
	}*/
	
	
	File [] s =f.listFiles();
	for(File x :s)
	System.out.println(x);
}
}
