package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;



public class Vector_Study {

	public static void main(String[] args) {
		
		Vector<Object> ve= new Vector<>();
		
		ve.add("Pune");
		ve.add('M');
		ve.add("Pune");
		ve.add(null);
		ve.add(null);
		ve.add(123);
		ve.add(12.23);
		ve.add(true);
		
		System.out.println(ve);

		System.out.println(ve.size());

		System.out.println(ve.isEmpty());
		
		System.out.println(ve.remove(0));

		System.out.println(ve);

		System.out.println(ve.get(3));
		
		for(int i=0;i<=ve.size()-1;i++)
		{
		System.out.println(ve.get(i));	
		}
		System.out.println("====================");
		
		//Iterator
		
		Iterator<Object> it = ve.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		 System.out.println("====================");
		 
		 //ListIterator
		 ListIterator<Object> lit = ve.listIterator();
		 
		 while(lit.hasNext()) {
			 System.out.println(lit.next());
		 }
		 System.out.println("====================");
		 
		 //enumeration
		
		 Enumeration<Object> en = ve.elements();
		 while(en.hasMoreElements())
		 {
			 System.out.println(en.nextElement());
		 }
		//2. Print ArrayList info using for loop cursor
			System.out.println("---Print ArrayList info using for loop cursor----");
			
			for(int i=0; i<=ve.size()-1; i++)
			{
			System.out.println(ve.get(i));
			}
			
			//3. Print ArrayList info Using foreach loop
			System.out.println("----Print ArrayList info Using foreach loop--");
			
			for(Object s1:ve)
			{
			System.out.println(s1);
			}
			 
		 

	}

}
