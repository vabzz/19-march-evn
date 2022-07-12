package interface_Study;

public class MyClass implements My_Interface
{

	public static void main(String[] args) {
		
		MyClass m=new MyClass();//object creating of implementation class
		
		System.out.println("value of a "+a);// calling variable of interface
		m.Test();
		m.Test1();
		m.mymethod();
		
		
		//a=a+10; we can't update variable from interface

	}

	@Override
	public void Test() //providing definition to incomplete method from interface
	{
		System.out.println("Hi this method completed in implementation class");
		
	}

	@Override
	public void Test1() //providing definition to incomplete method from interface
	{
		System.out.println("Hi this method completed in implementation class");
		
	}

	void mymethod()// own method MyClass
	{
		System.out.println("this is myclass method");
	}
}
