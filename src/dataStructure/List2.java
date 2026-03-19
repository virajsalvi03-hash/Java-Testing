package dataStructure;

import java.util.ArrayList;
import java.util.Collections;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//list,Map,set -are interfaces that are implemented on given classes;
		
		//creating Arraylist that help us to make array add and removing data dynamically
		ArrayList<String> EmpArr = new ArrayList<String>();
		
		EmpArr.add("John");
		EmpArr.add("Marco");
		EmpArr.add("Smith");
		
		for(String i:EmpArr) {
			System.out.println(i);
		}
		
		EmpArr.add("Johnny");
		EmpArr.add("David");
		 System.out.println("Update list");
		for(String i:  EmpArr) {
			System.out.println(i);
		}
		EmpArr.remove(4);
		System.out.println("Update list");
		for(String i:  EmpArr) {
			System.out.println(i);
		}
		EmpArr.set(2, "Rahul"); // replace the value by index number.
		
		System.out.println("The new name in list : "+EmpArr.get(2));
		System.out.println("The Orignal array : "+EmpArr);
		System.out.println("The Reversed array : "+EmpArr.reversed());
		System.out.println("Sorting the Array : ");
		Collections.sort(EmpArr);
		System.out.println(EmpArr);
		System.out.println("Reversing through collection : ");
		Collections.sort(EmpArr,Collections.reverseOrder());
		System.out.println(EmpArr);
		
		
		

	}

}
