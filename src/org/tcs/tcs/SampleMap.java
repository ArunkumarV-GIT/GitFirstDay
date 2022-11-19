package org.tcs.tcs;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SampleMap {

	public static void main(String[] args) {
		Map<Integer,String> mp = new LinkedHashMap<Integer,String>();
		mp.put(10,"JAVA");
		mp.put(20, "Oracle");
		mp.put(10, "sql");
		mp.put(30,"Cucumber");
		mp.put(400,"Oracle");
		System.out.println(mp);
		Set<Entry<Integer,String>> lo = mp.entrySet();
		
		
		
	}}
		/*System.out.println(mp);
		int si =mp.size();
		System.out.println(si);
		
		
		for(Entry<Integer,String> d : lo)
		{
		System.out.println(d.getKey());
		System.out.println(d.getValue());
		}
		}
		
		mp.put(500, "GIT");
		
		System.out.println(mp);
		int si1 =mp.size();
		System.out.println(si1);
		
		Collection<String> c =mp.values();
		System.out.println(c);
		for(String X:c)
		{
			System.out.println(X);
		}
		
		Set<Integer> k = mp.keySet();
		System.out.println(k);
		for(Integer i :k)
		{
		System.out.println(i);	
		}*/
		
	
