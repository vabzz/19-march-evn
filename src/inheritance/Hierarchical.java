package inheritance;

public class Hierarchical {

	public static void main(String[] args) {
	
		
		Father f=new Father();
		
		
		Daughter d=new Daughter();
		
		
		Son s=new Son()	;
			
				
		f.money();     //Calling non static method father property
		Father.home();//Calling  static method father property
		
		d.makeupkit();    //Calling non static method daughter property
		Daughter.dress(); //Calling static method daughter property
		
		s.Bike();       //Calling non static method son property
		Son.Mobile();   //Calling static method son  property
		
		d.money();       //using daughter object calling father property
		Daughter.home();  //using daughter class calling father property
		s.money();        //using son object calling father property
		Son.home();       //using son class calling father property
		
		
		

	}

}
