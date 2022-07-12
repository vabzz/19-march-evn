package star_logic_pattern;

public class ButterFly {

	public static void main(String[] args) {

//		*        *
//		**      **
//		***    ***
//		****  ****
//		**********
//		****  ****
//		***    ***
//		**      **
//		*        *

		int star1 = 1;
		int space1 = 4;
		int space2 = 4;
		int star2 = 1;
		
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=star1;j++) 
			{
				System.out.print("*");
			}
			for(int j=1;j<=space1;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=space2;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star2;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<5)
			{
				star1++;
				space1--;
				star2++;
				space2--;
			}
			else
			{
				star1--;
				space1++;
				star2--;
				space2++;
			}
		}
		

	}

}
