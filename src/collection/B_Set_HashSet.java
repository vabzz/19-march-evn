package collection;

import java.util.HashSet;
import java.util.Iterator;

public class B_Set_HashSet {

	public static void main(String[] args) {
		
		HashSet<Object> hs=new HashSet<>();
		
		hs.add("Vaibhav");
		hs.add("Vaibhav");
		hs.add("Patil");
		hs.add("QA Automation");
		hs.add("Pune");
		hs.add("R15 V4");
		hs.add(9.5f);
		hs.add('A');
		hs.add(85000);
		hs.add(null);
		
		System.out.println(hs); // will Randomly print all the value added
		System.out.println(hs.size()); 
		System.out.println(hs.isEmpty()); 
		System.out.println(hs.contains("R15 V4")); 
		hs.remove("Vaibhav");
		System.out.println(hs.size());
		System.out.println(hs);
		
		hs.add("Vaibhav");
		System.out.println(hs.size());
		System.out.println(hs);
		
		//1. Print ArrayList info using Iterator cursor
		System.out.println("---Print ArrayList info using Iterator cursor----");
		Iterator<Object> itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//2. Print ArrayList info Using foreach loop
		System.out.println("----Print ArrayList info Using foreach loop--");
		for(Object s1:hs)
		{
			System.out.println(s1);
		}
		
				
		System.out.println("----Use Clear Function----");
		hs.clear();
		System.out.println(hs);
		
		
		
	}

}
