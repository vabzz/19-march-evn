package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class B_Set_TreeSet {

	public static void main(String[] args) {
		
		TreeSet<String> Tset = new TreeSet<>();
		Tset.add("ABC");
		Tset.add("BCD");
		Tset.add("CDE");
		Tset.add("DEF");
		Tset.add("EFG");
		Tset.add("FGH");
		Tset.add("AAA");
		
		System.out.println("--Print info in TreeSet Using Iterator Cursor--");
		Iterator<String> itr = Tset.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
		System.out.println("--Print info in TreeSet Using foreach Cursor--");
		for(Object s1:Tset)
		{
		System.out.println(s1);
		}
System.out.println("---Print ArrayList info using for loop cursor----");
		
		
	}

}
