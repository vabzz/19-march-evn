package Control_Statement;

public class Switch_statement {

	public static void main(String[] args) {
		// Year 1--> Welcome to 1st year engg
				// Year 2--> Welcome to 2nd year engg
				// Year 3--> Welcome to 3rd year engg
				// Year 4--> Welcome to 4th year engg
				// Year default--> Please enter year between 1-4
		
		int Year=1;
		
		switch (Year) {
		case 1:System.out.println("Welcome to 1st year engg");
		    break;
		case 2:System.out.println("Welcome to 2nd year engg");
		    break;
		case 3:System.out.println("Welcome to 3rd year engg");
		    break;
		case 4:System.out.println("Welcome to 4th year engg");
			
			break;

		default:System.out.println("please enter year 1-4");
			break;
		}
	}

}
