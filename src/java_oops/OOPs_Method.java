package java_oops;

import java.util.Scanner;

public class OOPs_Method {
	Scanner scan = new Scanner(System.in);
	void login(String name) {
		System.out.println("Login Successful");
		System.out.println("Name : "+name);
		
	}
	protected void search(String product,int num) {
		System.out.println("Product : "+product);
		System.out.println("Search ratings of product : "+num);
		login("viraj");
		return;
	}

	void search(String search, String brand) {
		System.out.println("Search the product : "+search);
		System.out.println("Product Brand : "+brand);
	}

	void addtocart(int num){
		System.out.println("Added to cart");
		System.out.println("Add Product contity : "+num);
		
	}
	void logout() {
				System.out.println("Logout successful");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		<class_name> objectname = new <class_name>();

		OOPs_Method obj = new OOPs_Method();
		//		obj.login();
		        obj.search("Airdrops","Apple");
//				obj.addtocart(2);
				obj.search("Airdrops",5);
		//		obj.logout();

	}

}
