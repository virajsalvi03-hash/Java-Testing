package exceptionPractice;

public class Exceptiontype2 {
	void div(int value) throws Exception{
		System.out.println(10/value);
	}

	public static void main(String[] args) {
		Exceptiontype2 obj = new Exceptiontype2();
		try {
			obj.div(0);
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}
