package Control_Statement;

public class Switch_statement2 {

	public static void main(String[] args) {
		// PNQ--> Welcome to Pune AirPort
				// BOM--> Welcome to Mumbai AirPort
				// NGP--> Welcome to Nagpur AirPort
				
				String City="PNQ";
				
				switch (City) {
				case "PNQ":System.out.println("Welcome to Pune AirPort");
				break;

				case "BOM":System.out.println("Welcome to Mumbai AirPort");
				break;
				
				case "NGP": System.out.println("Welcome to Nagpur AirPort");
				break;
				
				default:System.out.println("Please enter valid city between Pune Mum and Nagpur");
				break;
				}
				

			}

		
	}


