package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_Study {

	public static void main(String[] args) {
		
		LinkedList <Object>l=new LinkedList<Object>();
		System.out.println(l.poll());
		//System.out.println(l.pop());

		l.add("pune");
		l.add("pune");
		l.add(123);
		l.add(1.1);
		l.add(null);
		l.add('a');
		l.add(true);
		l.add(null);
		
		System.out.println(l.pop());
		System.out.println("************************");
		System.out.println(l.size());
		System.out.println(l);
		System.out.println(l.peek());
		System.out.println(l);
		System.out.println(l.poll());
		System.out.println(l);
		System.out.println(l.pop());
		System.out.println(l);

		System.out.println("************************");

		for(int i=0;i<=l.size()-1;i++)
		{
			System.out.println(l.get(i));
		}
		System.out.println("************************");
		
		Iterator<Object> it = l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("************************");

		ListIterator<Object> lit = l.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}

		System.out.println("************************");

		for(Object A:l)
		{
			System.out.println(A);
		}
		//2. Print ArrayList info using for loop cursor
				System.out.println("---Print ArrayList info using for loop cursor----");
				
				for(int i=0; i<=l.size()-1; i++)
				{
				System.out.println(l.get(i));
				}
				
				//3. Print ArrayList info Using foreach loop
				System.out.println("----Print ArrayList info Using foreach loop--");
				
				for(Object s1:l)
				{
				System.out.println(s1);
				}
	
	}

		
	}


