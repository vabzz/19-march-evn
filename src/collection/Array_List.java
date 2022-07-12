package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Array_List {

	public static void main(String[] args) {
		
		ArrayList  <Object> al=new ArrayList  <Object>();
		
		al.add("Velocity");
		al.add('A');
		al.add("Velocity");
		al.add(null);
		al.add(null);
		al.add(123);
		al.add(123.36);
		al.add(true);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.contains("Velocity"));
		System.out.println(al.get(2));
		System.out.println(al.indexOf('A'));
		System.out.println(al.remove(2));
		System.out.println(al);
		al.add(2, "Pune");
		System.out.println(al);
		
		for(int i=0;i<=al.size()-1;i++) {
			
			System.out.println(al.get(i));
		}
			
			System.out.println("==========================");
			
			//Iterator
			
		    Iterator<Object> it = al.iterator();
			
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
			System.out.println("==========================");
			
			//ListIterator
			
			ListIterator<Object> lit = al.listIterator();
			
			while(lit.hasNext()) {
				System.out.println(lit.next());
			}
			System.out.println("==========================");
			
			//enumeration
			
			for(Object h:al) {
				System.out.println(h);
			}
			
			
			
			ArrayList<Integer>in=new ArrayList<>();
			in.add(5);
			in.add(6);
			in.add(8);
			in.add(10);
			in.add(0,4);//add element inbetween
			in.set(2, 15);//set as value in index
			System.out.println("==========================");
			
			for(Object p:in) {
				System.out.println(p);
			}
			System.out.println("==========================");
			
			Iterator<Integer> it1 = in.iterator();
			
			while(it1.hasNext()) {
				System.out.println(it1.next());
			}
			System.out.println("==========================");
			
			ListIterator<Integer> lit1 = in.listIterator();
			while(lit1.hasNext()) {
				System.out.println(lit1.next());
			}
			
			System.out.println("==========================");
			
			
			
			
			
			
			
			
			
			
			
			
			
				
		
		
		
	}

}
