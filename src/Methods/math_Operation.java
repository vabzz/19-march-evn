package Methods;

public class math_Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		math_Operation obj= new math_Operation();
		obj.add();
		obj.mul();
		
		sub();
		div();
		
		math_Operation_driver m= new math_Operation_driver();
		m.mul();
		math_Operation_driver.add();
	}

	public void add()
	{
		int a=500;
		int b=122;
		int addition=a+b;
		System.out.println("Addition is "+addition);
	}
	public static void sub()
	{
		int a=411;
		int b=155;
		int subtraction=a-b;
		System.out.println("Subtraction is "+subtraction);
	}
	public void mul()
	{
		int a=50;
		int b=25;
		int multiplication=a*b;
		System.out.println("Multiplication is "+multiplication);
	}
	public static void div()
	{
		int a=100;
		int b=25;
		int division=a/b;
		System.out.println("Division Is "+division);
	}
}