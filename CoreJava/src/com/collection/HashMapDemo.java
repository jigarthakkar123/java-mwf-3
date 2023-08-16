package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(101, "Krish");
		map.put(901, "Tanmay");
		map.put(789, "Anil");
		map.put(904, "Brijesh");
		
		System.out.println(map);
		System.out.println(map.get("Anil"));
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
