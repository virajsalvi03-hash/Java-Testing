package java_oops;

public class Encapsule extends User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User obj = new User();
		obj.setPassword("John@123");
		System.out.println(obj.getPassword());
		obj.disname();
	

	}

}
