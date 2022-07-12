package logical_Program;

import java.util.Scanner;

public class Reverse_Number2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter value");
		int a = sc.nextInt();
		//int a=123;
		int revNum = 0;
		
		for(int i=a;i>0;i=i/10) //
		{
			int rem = i%10;
			revNum=revNum*10+rem;
		}
		System.out.println(revNum);
	}

}
