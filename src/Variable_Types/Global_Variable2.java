package Variable_Types;

public class Global_Variable2 {

	int a=10;            //global non static variable
	static int b=90;     //globle static variable

	public static void main(String[] args) {
		
		Global_Variable2 gv = new Global_Variable2();
		
		System.out.println("Value of a is "+gv.a);
		System.out.println("Value of b is "+b);
		gv.test();
		test1();
		
		Global_Variable2_driver gv2 = new Global_Variable2_driver();
		System.out.println(gv2.p);
		System.out.println(Global_Variable2_driver.q);
	}

	public void test()
	{
		int add=a+10;    //we can call global non static variable
		int sub=b-10;    //we can call global static variable
		System.out.println(add);
		System.out.println(sub);
	}
	
	public static void test1()
	{
		//int add=a+10;   //we can not call global non static variable 
		int sub=b-10;     // we call global static variable
		System.out.println(sub);
				
	}
}
