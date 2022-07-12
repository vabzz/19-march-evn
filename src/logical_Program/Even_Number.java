package logical_Program;

import java.util.Scanner;

public class Even_Number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter value");
		int a = sc.nextInt();
			if(a%2==0)
			{
				System.out.println("This is Even Number");
				
			}
			else
			{
				System.out.println("This is not Even Number");
			}
		}
	}


