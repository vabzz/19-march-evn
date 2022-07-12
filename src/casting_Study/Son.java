package casting_Study;

public class Son extends Father {

	public void car() //overriding
	{
		System.out.println("Honda City");
	}
	
	public void bike()  //overriding
	{
		System.out.println("R15 v4");
	}
	
	public void degree()
	{
		System.out.println("BE"); //own method of son -->not supported for up casting
	}
}
