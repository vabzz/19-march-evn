package star_logic_pattern;

public class Triangle_Left_Descending {

	public static void main(String[] args) {
		//*****
		//****
		//***
		//**
		//*
		//row-->5  col-->5
		int star = 5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star;j++)
			{
			  System.out.print("*");	
			}
			System.out.println();
			star--;
		}

	}

}
