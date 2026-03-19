package assignment4;

public class ClassMethodsEx {
	void great(int A, int B) {
		if(A>B) {
			System.out.println("Great Number between two number are : "+A);
		}else {
			System.out.println("Great Number between two number are : "+B);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassMethodsEx obj = new ClassMethodsEx();
		ModifierAs obj1 = new ModifierAs();
//		obj.great(12, 100);
		System.out.println(obj1.sum);
//		System.out.println(obj1.num); --private variable of another class cannot be accessed in another class of same package
		System.out.println(obj1.def);
		

	}

}
