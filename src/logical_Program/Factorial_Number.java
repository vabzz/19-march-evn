package logical_Program;

public class Factorial_Number {

	public static void main(String[] args) {
		
		//4!=4*3*2*1
		
		int Num=8;
		int fact=1;
		
		for(int i=Num;i>=1;i--)//8,7,6...1
		{
			fact=i*fact;
//			8*1=8
//			7*8=56
//			6*56=336
		}
		System.out.println(fact);

	}

}
