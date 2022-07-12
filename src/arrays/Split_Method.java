package arrays;

public class Split_Method {

	public static void main(String[] args) {
		
		String name="I LOVE MY INDIA";
		
		String ar[]=name.split(" ");
		
		for(int i=0;i<=ar.length-1;i++) {
			System.out.println(ar[i]);
			
		}System.out.println("=============");

		String a="THIS_IS_MY_COUNTRY";
		
		String ab[]=a.split("_");
		
		for(int j=0;j<=ab.length-1;j++)
		{
			System.out.println(ab[j]);
		}System.out.println("=============");
		
		
		String name2="VAIBHAV";
		
		for(int c=0;c<name2.length();c++) {
			System.out.println(name2.charAt(c));
			
			
		}
		
		
	}
	

}
