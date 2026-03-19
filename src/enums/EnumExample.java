package enums;

public class EnumExample {
	
	//enum constant is just constant they are not any datatype
	enum Browser{
		Chrome,Edge,Firefox
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		final String browser ="Chromee"; // if their is a typo error in constant we might get invalid input 
//		lanuchbrowser(browser);
		lanuchbrowser(Browser.Edge);
		

	}
	
	public static void lanuchbrowser(Browser browsername) {
		switch(browsername) {
		case Chrome:
			System.out.println("Lanuching Chrome");
			break;
		case Edge:
			System.out.println("Lanuching Edge");
			break;
		case Firefox:
			System.out.println("Lanuching FireFox");
			break;
		default :
			System.out.println("Invalid Browser");
		}
	}

}
