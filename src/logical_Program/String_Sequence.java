package logical_Program;

import java.util.Arrays;

public class String_Sequence {

	public static void main(String[] args) {
		
		String Char="JAVA PROGRAMMING";
		char[]a=Char.toCharArray();
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<=Char.length();i++) 
		{
			System.out.println(Char.charAt(i));
		}

	}

}
