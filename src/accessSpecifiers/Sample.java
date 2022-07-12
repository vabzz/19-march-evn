package accessSpecifiers;

public class Sample {

	public static void main(String[] args) {
		
		PrivateUse p= new PrivateUse();// created object of another class

		//p.test1(); we cant call private method outside of class
		p.test2();//calling default method
		p.test3();//calling protected method
		p.test4();//calling public method
		
		

	}

}
