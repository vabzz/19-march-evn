package this_And_super_keywordUse;

public class This_Use {

	int a=100;  //non static global variable
	int b=600;
	
	public static void main(String[] args) {
		
		This_Use t= new This_Use();
		t.addition();
		
	}

	public void addition()
	{
		int a=10; //local variable
		
		int sum=a+900; //value refer as local variable
		System.out.println("Addition is "+sum);
		
		int sum1=this.a+900;  //calling global value of a using this keyword
		System.out.println("Addition is "+sum1);
		
		System.out.println("Local value of a is "+a);
		System.out.println("Global value of a is "+this.a);
	}
}
