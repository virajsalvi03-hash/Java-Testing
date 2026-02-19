package Testing_First;

public class Switch_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "Edge";
		
		switch(browser) {
		case "chrome":
			System.out.println("You are using chrome");
			break;
		case "Edge":
			System.out.println("You are using Edge");
			break;
		case "Firefox":
			System.out.println("You are using Firefox");
			break;
		default:
			System.out.println("Incorrect browser name");
			break;
		
		}

	}

}
