package Variable_Types;

public class Global_Variable {

	int a=10;           //global non static variable
	static int b=20;    //global static variable

	public static void main(String[] args) {
		
		//int sum=a+10;	
		//int sum= b-5;
		
		Global_Variable obj= new Global_Variable();
		obj.test1();
		test2();

	}

	public void test1()
	{
		int sum=a+20;
		int sub=b-5;
		System.out.println("sum is "+sum);
		System.out.println("sub is "+sub);
	}
	
	public static void test2()
	{
		//int sum=a+20;
		int sub=b-5;
		//System.out.println("sum is "+sum);
		System.out.println("sub is "+sub);
	}
}
