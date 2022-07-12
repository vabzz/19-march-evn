package arrays;

public class Multi_Diamensional_Array {

	

	public static void main(String[] args) {
		
		int a[][]=new int[2][2];
		
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a.length-1;j++) {
				 
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

		
		  int x = 3;
		  
	       for(int i=0; i<2; i++) {
	           for(int j=0; j<2; j++) {
	               //compare with x
	               if(a[i][j] == x) 
	               {
	                   System.out.println("x found at location (" + i + ", " + j + ")");
	               }
	           }
	}

}
}
	