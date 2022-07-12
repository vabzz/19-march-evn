package Polymorphism;

public class Method_overloading {

	public static void main(String[] args) {
		
		Method_overloading m=new Method_overloading();
		m.division();
		m.division(100, 10);
		m.division(0, 60, 3);

		m.multiplication();
		m.multiplication(20.3f, 50);
		m.multiplication(4.2f, 5.0f, 7.3f);
		multiplication(4.1f, 5, 6, 5.6f);
	}
	public void division()
	{
		int a=50;
		int b=5;
		int div=a/b;
		System.out.println("division is : "+div);
	}

	public void division(int a,int b)
	{
		int div=a/b;
		System.out.println("division is : "+div);
	}
	
	public void division(int a,int b,int c)
	{
		int div=b/c;
		System.out.println("division is : "+div);
	}
	
	public void multiplication()
	{
		int c=50;
		float d=5f;
		float mul=c*d;
		System.out.println("mutiplication is : "+mul);
		
	}
	
	public void multiplication(float c,int d)
	{
		
		float mul=c*d;
		System.out.println("mutiplication is : "+mul);
		
	}
	public void multiplication(float c,float d,float e)
	{
		
		float mul=c*d*e;
		System.out.println("mutiplication is : "+mul);
	}
	
	
	public static void multiplication(float c,int d,int e,float f)
	{
		float mul=c*d*e*f;
		System.out.println("mutiltiplication is: "+mul);
		
	}
	
}
	
	
