package Methods;

public class non_staticMethod {

	public static void main(String[] args) {
		
		non_staticMethod obj= new non_staticMethod();
	obj.demo();
	
	nonStatic_another m= new nonStatic_another();
	m.demo2();
	

	}
public void demo()
{
	System.out.println("This is non static Method");
}
}