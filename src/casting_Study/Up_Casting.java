package casting_Study;

public class Up_Casting {

	public static void main(String[] args) {
		
		Son s=new Son();
		s.bike();
		s.car();
		s.degree();
		
		Father f=new Son();//creating object of sub class and give reference super class
		f.bike();  //eligible for casting
		f.car();  //eligible for casting
		//f.degree(); //it's not eligible for up casting as its not common super class method
		
		
	}

}
