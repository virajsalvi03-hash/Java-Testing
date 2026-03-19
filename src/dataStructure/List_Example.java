package dataStructure;

import java.util.LinkedList;

public class List_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating linkedlist 
		LinkedList<String> ExStep = new LinkedList<String>();
		ExStep.add("Login");
		ExStep.add("Navigate to Fund-Transfer");
		ExStep.addFirst("Open browser");
		ExStep.addLast("Logout");
		System.out.println(ExStep);
		
		System.out.println(ExStep.contains("Login"));
		System.out.println(ExStep.contains("Open"));
		ExStep.clear();
		System.out.println(ExStep);
	}

}
