package logical_Program;

public class ArmStrongNumber {

	public static void main(String[] args) {

		int num=153;
		int armnum=0;
		 
		for(int i=num;i>0;i=i/10)// 153,15,1
		{
			int rem = i%10;//3,5,1
			armnum=armnum+(rem*rem*rem);
		}
		System.out.println(armnum);

		if(num==armnum)
		{
			System.out.println("Number is arm Strong Number");
		}
		else
		{
			System.out.println("Number is not arm Strong Number");
		}

	}

}
