package dataStructure;

import java.util.HashSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set not allowed duplicate values, no index numbering, no order.
		// Set interface implement on three classes -Hashset, Treeset, LinkedHashSet.
		//HashSet is faster then other sets
		//HashSet store randomly
		
		HashSet<String> objBro= new HashSet<String>();
		objBro.add("edge");
		objBro.add("chrome");
		objBro.add("firefox");
		objBro.add("brave");
		
		System.out.println("Displayed Hashset");
		System.out.println(objBro);
		System.out.println("Removed edge");
		objBro.remove("Edge");
		System.out.println(objBro);
		

	}

}
