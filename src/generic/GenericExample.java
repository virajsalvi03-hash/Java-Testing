package generic;

 class Box<T>{
	 
	 T value;
	 
	 void Set(T val) {
		 value=val;
	 }
	 
	  T get() {
		 return value;
	 }
 }

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> obj = new Box<>();
		obj.Set(234);
		System.out.println(obj.get());

	}

}
