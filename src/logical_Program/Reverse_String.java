package logical_Program;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
	
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter String to be reversed");
			String a = sc.next();
			String b="";
			for(int i=a.length()-1;i>=0;i--)
			{
				 b= b+a.charAt(i);
			}
			System.out.println(b);
		}

	}

}
