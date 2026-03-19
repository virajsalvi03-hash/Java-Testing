package assignment;

public class Student extends Person {
	int StudentID;
	String Course;
	String Name;
	

	void display() {
		print();
		System.out.println("Student ID : "+StudentID);
		System.out.println("Course : "+Course);
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s= new Student();
		s.name="Allen";
		s.age=27;
		s.StudentID=109;
		s.Course="B.Tech";
		s.display();
		

	}

}
