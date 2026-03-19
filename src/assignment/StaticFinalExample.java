package assignment;

public class StaticFinalExample {
	
	static int num=35;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int var =45;
		num=67;
		System.out.println(num);
		try {
			System.out.println(var);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());;
		}

	}

}
