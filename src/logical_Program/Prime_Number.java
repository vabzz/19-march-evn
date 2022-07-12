package logical_Program;

public class Prime_Number {

	public static void main(String[] args) {

		int Num=11;
		int count=0;
		
		for(int i=2; i<Num; i++)
		{
			if(Num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==1)
		{
			System.out.println("Given Number is not Prime Number");
		}
		else
		{
			System.out.println("Given number is prime number");
		}

		

	}

}
