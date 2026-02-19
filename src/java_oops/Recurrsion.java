package java_oops;

public class Recurrsion {
	void printname() {
		System.out.println("Hello world");
	}
	void countdown(int num) {
		while(num>0) {
			System.out.println("Retrying..."+num);
			num--;

		}
		System.out.println("Completed!!");
	}
	
	protected void retry(int count) {
		if(count==0) {
			System.out.println("Completed!!");
			countdown(7); //we can call another method of same class in which were method
			return;
		}
		System.out.println("Retrying..."+count);
		count--;
		retry(count);// we call method inside method
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recurrsion obj = new Recurrsion();
		obj.retry(9);
//		obj.countdown(5);
		
	}
}
