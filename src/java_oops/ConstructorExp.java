package java_oops;

public class ConstructorExp {
	String name;
	int age;
//	ConstructorExp() {
//		name = "jane";
//		age = 25;
//		System.out.println("Name : "+name+" Age : "+age);
//	}
	
	ConstructorExp(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Name : "+name+" Age : "+age);
	}
	ConstructorExp() {
		// TODO Auto-generated constructor stub
		System.out.println("Default");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorExp obj = new ConstructorExp("John",34);
		ConstructorExp obj2 = new ConstructorExp();
		

	}

}
