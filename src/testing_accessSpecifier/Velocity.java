package testing_accessSpecifier;

import accessSpecifiers.PrivateUse;

public class Velocity extends PrivateUse {

	public static void main(String[] args) {
		
		PrivateUse p= new PrivateUse();// created object of another class
		p.test4();//calling public method
		// p.test3();
		
		
		Velocity v= new Velocity();// created object of child class
		v.test3();// calling protected method from another package
		v.test4();//

	}

}
