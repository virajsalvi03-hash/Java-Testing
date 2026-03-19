package assignment9;

import java.util.HashSet;

public class HashSetAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> dup = new HashSet<Integer>();
		dup.add(1);
		dup.add(2);
		dup.add(3);
		dup.add(4);
		dup.add(3);
		
		System.out.println(dup);

	}

}
