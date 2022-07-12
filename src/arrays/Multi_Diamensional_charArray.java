package arrays;

public class Multi_Diamensional_charArray {

	public static void main(String[] args) {
		
		char grade[][]= {{'A','B'},{'C','D'}};
		
		for(int i=0;i<=grade.length-1;i++) {
			for(int j=0;j<=grade.length-1;j++) {
				System.out.print(grade[i][j]+" ");
			}
			System.out.println();
		}

	}

}
