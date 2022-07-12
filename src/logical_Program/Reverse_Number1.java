package logical_Program;

public class Reverse_Number1 {

	public static void main(String[] args) 
	{
		
		int a=123;
		String str = Integer.toString(a);
		String rev = "";
		for(int i=str.length()-1;i>=0;i--)
		{
		    rev=rev+str.charAt(i);	
		    
		}
		System.out.println(rev);

	}

}
