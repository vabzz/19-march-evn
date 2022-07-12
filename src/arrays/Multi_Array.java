package arrays;

public class Multi_Array {

	public static void main(String[] args) {
		
		int a[][]= {{1,2,3,4,5},{5,4,3,2,1},{1,1,20,2,3}};
		
		for(int i = 0;i<=2;i++) {
			for(int j = 0;j<=4;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			
		}
		
		int x = 20;
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=4;j++) {
				if(a[i][j]==x) 
				{
					//System.out.println("x found at location (" + i + " , " + j + ")");
					System.out.println(i+" , "+ j);
				}
			}
		}

	}

}
