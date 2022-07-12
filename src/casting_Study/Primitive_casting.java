package casting_Study;

public class Primitive_casting {

	public static void main(String[] args) {
		
		int a=20;  //lower data type information
		System.out.println(a);
		
		double b=a; //converted higher data type-->implicit or widening casting
        System.out.println(b); 
		
		double c=10.5;  //higher data type information
		System.out.println(c);
		
		int d= (int) c;  //converted lower data type-->explicit or narrowing casting
		System.out.println(d);
	}

}
