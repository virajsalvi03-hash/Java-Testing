package anonymous;

public class SampleClass {
	
	//Anonymous class, is class without name; We cannot call object of this class into other class;
	interface Greeting{
		void greet();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Anonymous class implements unimplemented methods;
		Greeting obj = new Greeting() {
			
			@Override
			public void greet() {
				System.out.println("Hello this is Anonymous class");
				
			}
		};
		
		obj.greet();
		

	}

}
