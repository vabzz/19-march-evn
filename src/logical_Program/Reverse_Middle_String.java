package logical_Program;

public class Reverse_Middle_String {

	public static void main(String[] args) {

		String a="I LOVE MY INDIA";
		String[] ar = a.split(" ");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			if(i%2!=0) 
			{
			String s = ar[i];
			ar[i]=reverse(s);
			
			}
		}
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}


	}
	public static  String reverse(String imp) 
	{
		String rev = "";
		for(int i=imp.length()-1;i>=0;i--)
		{
			rev=rev+imp.charAt(i);
		}
		return rev;
	}

}
