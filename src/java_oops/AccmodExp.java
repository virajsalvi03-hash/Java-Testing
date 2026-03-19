package java_oops;

import assignment4.ModifierAs;

public class AccmodExp {
	  protected String name;
	public void printname(){
//		name= "John";
		System.out.println(name);
	}
	
	private void printname2() {
		System.out.println(name);
	}
	void printname3() {
		System.out.println(name);
	}
	
	protected void printname4() {
		System.out.println("hello world");
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccmodExp obj = new AccmodExp();
		obj.name=("khan");
		obj.printname2();
		ModifierAs obj2 = new ModifierAs();
		System.out.println(obj2.sum);
//		System.out.println(obj2.num); --private variable of another class cannot be accessed in another class of another package
//		System.out.println(obj2.def); --default variable of another class cannot be accessed in another class of another package

	}


}
