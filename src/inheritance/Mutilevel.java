package inheritance;

public class Mutilevel {

	public static void main(String[] args) {
		
		University u= new University();//created obj.of university class
		
		college c=new college();  //created obj.of college class
		
        Department d= new Department();  //created obj.of department class
        
        
        u.paper();      //non static university property
        University.tally();// static university property
        
        c.computer_dpt();//non static college property
        college.mechanical();// static college property
        
        d.practical();//non static department property
        Department.lecture();// static department property
        
        
        
        
        d.computer_dpt();// by using department obj.we are calling computer property 
        d.paper(); // by using department obj.we are calling university property  
       Department.mechanical();//by using department class name calling college static property
       Department.tally();//by using department class name calling university static property
       
       
   
       c.paper();// by using college obj.we are calling university property
       college.tally();// by using college name using we are calling university property
       
      
        
	}

}
