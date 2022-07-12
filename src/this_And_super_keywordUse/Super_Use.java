package this_And_super_keywordUse;

public class Super_Use extends This_Use{
	
	int a=500;//non static global variable(from subclass)

	public static void main(String[] args) {
		
		Super_Use s= new Super_Use();
		s.subtraction();
		

	}
	
	public void subtraction()
	{
		int a=800;  //local variable
	    int sub=a-70;
	    System.out.println("subtraction is "+sub);
	    
	    int sub1=this.a-70;   //using global value of a from same class
	    System.out.println("subtraction is "+sub1);
	    
	    int sub2=super.a-70;  //using global value of a from super class
	    System.out.println("subtraction is "+sub2);
	    
	}

}
