package assignment4;

public class DepartmentExample extends EmployeeExample {
	void Tester(String des) {
		emp1();
		System.out.println("Designation : "+des);
		
	}
	void Developer(String des) {
		emp2();
		System.out.println("Designation : "+des);
	}
	void BA(String des) {
		emp3();
		System.out.println("Designation : "+des);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepartmentExample obj = new DepartmentExample();
		obj.BA("BA");
		obj.Developer("Developer");
		obj.Tester("Tester");

	}

}
