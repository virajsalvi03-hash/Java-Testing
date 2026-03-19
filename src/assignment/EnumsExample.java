package assignment;

import java.lang.classfile.instruction.SwitchCase;

public class EnumsExample {
	enum Browser{
		Chrome, Firefox, Brave, Edge 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser browser =Browser.Brave;
		switch (browser) {
		case Chrome:
			System.out.println("Chrome Lanuched");
			break;
		case Firefox:
			System.out.println("Firefox Lanuched");
			break;
		case Brave:
			System.out.println("Brave Lanuched");
			break;
		case Edge:
			System.out.println("Edge Lanuched");
			break;
		default:
			System.out.println("Invalid Browser");
		

	}
	}

}
