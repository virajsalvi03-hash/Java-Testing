package assignment5;

 public class Employees {
	double salary =20000;
	 void salarycal() {
		System.out.println(salary);
	}
	  Employees() {
		 System.out.println("This is constructor");
	 }
	 public static void main(String[] args) {
		 Employees E = new Employees();
		 E.salarycal();
		
	}

}
