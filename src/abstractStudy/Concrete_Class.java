package abstractStudy;

public class Concrete_Class extends Abstract_class {

	public static void main(String[] args) {
		
		Concrete_Class c= new Concrete_Class();
		c.test1();
		c.test2();
		c.test();
		c.sample();
		
	}

	@Override
	public void test() 
	{
		System.out.println("This method complete in concrete class");
	}
	
     public void sample()
     {
    	 System.out.println("This is own method of concrete class ");
     }

	
	
}
