package assignment7;

public class ExceptionAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=9;
		int div;
		try {
			div=num/0;
			System.out.println(div);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
