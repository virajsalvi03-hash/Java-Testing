package lambdaex;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> obj = new ArrayList<>();
		obj.add(23);
		obj.add(55);
		obj.add(78);
		obj.add(84);
		int num=0;
		 System.out.println("Using for each loop");
		for(int i : obj) {
			
//			num=i+num;
			System.out.println(i+" ");
			
		}
//		System.out.println(num);
		System.out.println("Using lambda Expression");
		
		obj.forEach((i)->  System.out.println(i));

	}

}
