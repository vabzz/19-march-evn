package accessSpecifiers;

public class PrivateUse {

	public static void main(String[] args) {
		PrivateUse pu= new PrivateUse();
		pu.test1();//calling private method
		pu.test2();//calling default method
		pu.test3();//calling protected method
		pu.test4();//calling public method
		}
		private void test1()//only within the class. It can't be access from other classes.
		{
		System.out.println("Hi this is private test1 method ");
		}
		void test2()//remains only within the package.
		{
		System.out.println("Hi this is default test2 method ");
		}
		protected void test3()//remains only within the package, inheritance-->outside of package
		
		{
		System.out.println("Hi this is protected test3 method ");
		}
		public void test4()
		{
		System.out.println("Hi this is public test4 method ");

	}

}
