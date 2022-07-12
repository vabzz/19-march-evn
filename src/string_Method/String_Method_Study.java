package string_Method;



public class String_Method_Study {

	public static void main(String[] args) {
		
		String name="Velocity";
		//length() method use
		System.out.println(name.length());
		
		int lengthstring = name.length();
		System.out.println(lengthstring);
		System.out.println("==================");
		
		//toUpperCase() method use
		System.out.println(name.toUpperCase());
		
		String uppercase = name.toUpperCase();
		System.out.println(uppercase);
		System.out.println("==================");
		
		//toLowerCase() method use
		System.out.println(name.toLowerCase());
		
		String lowercase = name.toLowerCase();
		System.out.println(lowercase);
		System.out.println("==================");
		
		//equals() method use
		String a="Velocity";
		String b="Velocity";
		String c=new String("Velocity");
		String d= new String("Velocity");
		String e= new String("VELOCITY");
		
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(c==d);//values are same but object created 2 times so there are two different method
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(b.equals(e));//case sensitivity
		
		boolean result = a.equals(c);
		System.out.println("a and c are equals=="+result);
		System.out.println("=====================");
		
		//equalsIgnoreCase() method use
		String city="Pune";
		String locality="Pune";
		String dist="PUNE";
		
		System.out.println(city.equals(locality));
		System.out.println(city.equals(dist));
		System.out.println(city.equalsIgnoreCase(dist));
		System.out.println("=====================");
		
		//contains() method use
		String k="Katraj";
		System.out.println(k.contains("Ka"));
		System.out.println(k.contains("ar"));
		System.out.println(k.contains("aj"));
		System.out.println("=====================");
		
		//isEmpty() method use
		String p="Test";
		String q=" ";
		//String r=null;
		String s="";
		
		System.out.println(p.isEmpty());
		System.out.println(q.isEmpty());
		//System.out.println(r.isEmpty());//NullPointerException
		System.out.println(s.isEmpty());
		System.out.println("=====================");
		
		//isBlank() method use
		System.out.println(q.isBlank());
		System.out.println(s.isBlank());
		System.out.println("=====================");
		
		// charAt method use
		String country="INDIA";
		System.out.println(country.charAt(4));
		
		char charstore = country.charAt(3);
		System.out.println(charstore);
		System.out.println("=====================");
		
		//for(int i = 0;i<country.length();i++)
		//	System.out.println(country.charAt(i));
		//System.out.println("=====================");
		
		//endsWith method use
		System.out.println(country.endsWith("IND"));
		System.out.println(country.endsWith("IA"));
		System.out.println(country.endsWith("NA"));
		System.out.println("=====================");
		
		//startsWith method use
		System.out.println(country.startsWith("INDIA"));
		System.out.println(country.startsWith("IA"));
		System.out.println(country.startsWith("I"));
		System.out.println("=====================");
		
		//substring method use
		String testing="VELOCITY CORPORATE TRAINING CENTER";
		System.out.println(testing.length());
		System.out.println(testing.substring(28));
		System.out.println(testing.substring(9));
		
		System.out.println(testing.substring(9, 28));
		System.out.println(testing.substring(28, 34));
		System.out.println("=====================");
		
		//concat method study
		String x="City ";
		String y="Pune";
		
		System.out.println(x.concat(y));
		System.out.println(x.concat(y).concat(" Katraj"));
		System.out.println("=====================");
		
		//indexOf
		String state="Maharashtra";
		System.out.println(state.indexOf('a'));
		System.out.println(state.indexOf('a', 4));
		System.out.println("=====================");
		
		//lastIndex
		System.out.println(state.lastIndexOf('a'));
		System.out.println("=====================");
		
		//replace
		String place="Pune Mumbai Nagpur";
		System.out.println(place.replace('P', 'T'));
		System.out.println(place.replace("Pu","Ku"));
		System.out.println(place.replace(" ", "#"));
		
		
		
		
		
		
		
		
	}

}
