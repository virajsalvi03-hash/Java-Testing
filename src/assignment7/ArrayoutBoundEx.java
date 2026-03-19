package assignment7;

public class ArrayoutBoundEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		try {
			for(int i=0;i<=5;i++) {
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		String s= null;
		try {
		System.out.println(s.equals("Hello"));
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}

	}

}
