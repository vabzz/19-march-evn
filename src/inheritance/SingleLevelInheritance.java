package inheritance;

public class SingleLevelInheritance {

	public static void main(String[] args) {
		
Single_vehicle sv= new Single_vehicle();//super class
sv.wheels();
Single_vehicle.steering();

single_Toyota to= new single_Toyota();// sub class
to.price();
single_Toyota.comfort();

to.wheels();
single_Toyota.steering();


	}

}
