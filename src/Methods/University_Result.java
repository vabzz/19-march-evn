package Methods;

public class University_Result {

public static void main(String[] args) {
		

		University_Result ua = new University_Result();
		ua.studentInfo();
		ua.StudentInfo1("Mahesh", 110, 'B', 554.56f);
		ua.StudentInfo1("Suresh", 82, 'C', 550.4f);
	}

	public void studentInfo()
	{
		//Method without parameter
		//Name,RollName,Grade,TotalMarks
		String Name="velocity";
		int RollNum=110;
		char grade ='A';
		float TotalMarks=530.55f;
		
		System.out.println("=================================");
		System.out.println("Student Name is "+Name);
		System.out.println("Student RollNum "+RollNum);
		System.out.println("Student Grade "+grade);
		System.out.println("Student TotalMarks "+TotalMarks);
		System.out.println("=================================");
	}
	
	public void StudentInfo1(String StudentName,int Rollnum,char grade,float TotalMarks)
	{
		System.out.println("=================================");
		System.out.println("Student Name is "+StudentName);
		System.out.println("Student RollNum "+Rollnum);
		System.out.println("Student Grade "+grade);
		System.out.println("Student TotalMarks "+TotalMarks);
		System.out.println("=================================");
	}
}