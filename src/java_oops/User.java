package java_oops;

public class User {
	
	private String password;
	
	public void setPassword(String value) {
		password = "John@123";
	}
	
	public String getPassword() {
		return password;
	}
	private void printname2(String name) {
		System.out.println(name);
	}
	
	public void disname() {
		printname2("Jane");
	}

}
