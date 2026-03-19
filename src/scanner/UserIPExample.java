package scanner;

import java.util.Scanner;

public class UserIPExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the browser name : ");
		String browser = scan.nextLine();
		lanuchbrowser(browser);
		scan.close();

	}
	
	public static void lanuchbrowser(String browsername) {
		switch(browsername.trim().toLowerCase()) {
		case "chrome":
			System.out.println("Lanuching Chrome");
			break;
		case "edge":
			System.out.println("Lanuching Edge");
			break;
		case "firefox":
			System.out.println("Lanuching FireFox");
			break;
		default :
			System.out.println("Invalid Browser");
		}
	}

}
