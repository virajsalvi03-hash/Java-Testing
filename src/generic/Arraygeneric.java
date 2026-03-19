package generic;

class Sauce<T>{
	
	T[] Arr;
	
	void set(T[] arr) {
		Arr =arr;
	}
	void get() {
		for(T a:Arr) {
			System.out.print(a);
		}
		
	}
	
	
}

public class Arraygeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sauce<String> obj = new Sauce<>();
		
		String[] num = {"1","2","3","4"};
		
		obj.set(num);
		obj.get();
		

	}

}
