package final_keyword_use;

public  class Test {

	public static void main(String[] args) {
		 
		int a=20;
		 a=a+10;
		System.out.println("value of a "+a);
		
		final int b=20;
		//b=10+b;   we make any variable as final then we can't update value again
		
		System.out.println("value of b "+b);
		
		Test t=new Test();
		t.demo();

	}
	public final void demo()
	{
		System.out.println("hii this is demo method of test class ");
	}

	public void demo(int a)
	{
		
	}
}
