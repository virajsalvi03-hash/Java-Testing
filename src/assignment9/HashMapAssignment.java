package assignment9;

import java.util.HashMap;

public class HashMapAssignment {

	public static void main(String[] args) {
		
		HashMap<String, String> UserCred = new HashMap<String, String>();
		
		UserCred.put("Jane", "jane@123");
		UserCred.put("Smith", "sm@13");
		UserCred.put("Rohan", "Rone@345");
		UserCred.put("Glenn", "Glenn@893");
		
		System.out.println(UserCred);

	}

}
