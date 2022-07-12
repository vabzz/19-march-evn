package interface_Study;

public class Son implements Father,Mother
{

	public static void main(String[] args) {
		
		Son s=new Son();  //object creating of implementation class
		s.receipe();
		s.care();
		s.love();
		s.nature();
		s.money();
		

	}

	@Override
	public void receipe() {
		System.out.println("Mother receipe completed in sons class");
		
	}

	@Override
	public void care() {
		System.out.println("Mother care completed in sons class");
		
	}

	@Override
	public void love() {
		System.out.println("Father love completed in sons class");
		
	}

	@Override
	public void nature() {
		System.out.println("Father nature completed in sons class");
		
	}

	@Override
	public void money() {
		
		Father.super.money();
		Mother.super.money();
	}

}
