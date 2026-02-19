package java_oops;

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

	}


}
