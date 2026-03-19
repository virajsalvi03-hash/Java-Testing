package assignment3;

public class OverloadAs {
	
	void calculate(double a, double b) {
		System.out.println("Sum of two decimal number are : "+(a+b));
	}
	
	void  calculate(int a, int b) {
		System.out.println("Sum of two integers are : "+(a+b));
	}
	int sum = 0;
	
	void circle(int n) {
		
		if(n==0) {
			return;
			}else {
			sum=sum+n;
			n--;
			circle(n);
		}
	}
	void display() {
		System.out.println("Sum of all integers are : "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadAs obj = new OverloadAs();
//		obj.calculate(100.89, 56.87);
//		obj.calculate(25, 45);
		obj.circle(15);
		obj.display();

	}

}
