package logical_Program;

public class Reverse_Number {

	public static void main(String[] args) {
		int n = 169;
		int rev =0;
		while(n>0)
		{
		rev = rev*10 + n%10;
		n=n/10;
		}
		System.out.println(rev);

	}

}
