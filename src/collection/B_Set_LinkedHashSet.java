package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class B_Set_LinkedHashSet {

	public static void main(String[] args) {


		LinkedHashSet<Object> lhs=new LinkedHashSet<>();
		lhs.add("Vaibhav");
		lhs.add("Vaibhav");
		lhs.add("Patil");
		lhs.add("QA Automation");
		lhs.add("Pune");
		lhs.add("R15 V4");
		lhs.add(9.5f);
		lhs.add('A');
		lhs.add(85000);
		lhs.add(null);
		
		System.out.println(lhs); // will Maintained Sequence print all the value added
		System.out.println(lhs.size()); //9
		System.out.println(lhs.isEmpty()); //false
		System.out.println(lhs.contains("R15 V4")); //true
		lhs.remove("Vaibhav");
		System.out.println(lhs.size());
		System.out.println(lhs);
		
		lhs.add("Vaibhav");	
		System.out.println(lhs.size());
		System.out.println(lhs);
		
		System.out.println("--print info in LinkedHashSet using iterator cursor-");
				Iterator<Object> itr = lhs.iterator();
				while(itr.hasNext())
				{
				System.out.println(itr.next());
				}
				System.out.println("--print info in LinkedHashSet using foreach loop-");
				for(Object s1:lhs)
				{
				System.out.println(s1);
		
				}
				
				
//				System.out.println("---Print ArrayList info using ListIterator cursor----");
//				ListIterator<Object> Litr = lhs.listIterator();
//				while(Litr.hasNext())
//				{
//				System.out.println(Litr.next());
//				}
				
		lhs.clear();
		System.out.println(lhs.size());
		System.out.println(lhs);

	}

}
