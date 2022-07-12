package collection;

import java.util.ArrayList;

public class A_List_ArrayList {

	public static void main(String[] args) {

		ArrayList<Object> al = new ArrayList<>(); // ArrayList(11)
		al.add("Vaibhav");
		al.add("Patil");
		al.add("QA Automation");
		al.add("Pune");
		al.add("Apache200");
		al.add(9.5f);
		al.add('A');
		al.add(85000);
		al.add(null);
		
		System.out.println(al); // will print all the value added
		System.out.println(al.size()); 
		System.out.println(al.isEmpty()); 
		System.out.println(al.contains("Apache200")); 
		System.out.println(al.get(3)); 

	}

}
