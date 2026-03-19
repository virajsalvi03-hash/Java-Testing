package assignment;

import java.util.HashSet;
import java.util.Scanner;

public class Students {
	String Name;
	
	

	public Students(String name) {
		this.Name= name;
		System.out.println("Student name is "+Name);
//		return Name;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students obj = new Students("Alex");
		Scanner s= new Scanner(System.in);
		HashSet<Integer> bag = new HashSet<Integer>();
		bag.add(10);
		bag.add(20);
		bag.add(30);
		bag.add(40);
		bag.add(50);
		bag.add(50);
		bag.add(50);
		
		int num = 40;
		int store=0;
		System.out.println(bag);
		
		for(int i:bag) {
			System.out.println(i);
//			store=i;
//			if(store==i) {
//				bag.remove(i);
//			}
		}
//		System.out.println("Your value is "+store);

	}

}
