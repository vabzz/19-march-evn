package string_Builder;

public class Test {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Tony");
		System.out.println(sb);
		
		//char at index 0
		System.out.println(sb.charAt(0));
		
		//set char at index 
	//	sb.setCharAt(0, 'p');
	//	System.out.println(sb);
		
		//insert char
	//	sb.insert(0, 'S');
	//	System.out.println(sb);
		
		sb.insert(2, 'n');
		System.out.println(sb);
		
		//delete char
		sb.delete(2, 3);
		System.out.println(sb);
		
		StringBuilder sb1 =new StringBuilder("h");
		
		//append use
		sb1.append("e");
		sb1.append("l");
		sb1.append("l");
		sb1.append("o");
		System.out.println(sb1);

	}

}
