package Testing_First;

public class Conditional_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 20;
		boolean citizen = false;
	
		
		if(age>=18 && citizen) {
			System.out.println(" You are eligible to vote!!" );
		}
		else {
			System.out.println("You are not eligible to vote!!!");
		}
		
		float marks = 59.99f;
		if(marks >=35 && marks<60) {
			System.out.println("You are Passed");
		}else if(marks>=60 && marks<70) {
			System.out.println("You have got first Class");
		}else if(marks>=75) {
			System.out.println("You have got Distinction");
		}else {
			System.out.println("You have Failed");
		}
		
//		---------------------------------------------------------------------------------------------
		
		int num2= 2;
		
		if(num2%2==0) {
			System.out.println("Number is even ");
		}else {
			System.out.println("Number is odd");
		}
	
	
//	---------------------------------------------------------------------------------------------------
	
	int num3 = 0;
	int num4 = 4;
	
	if(num3>num4) {
		System.out.println(num3+">"+num4);
	}else if(num3 == num4) {
		System.out.println(num3+"=="+num4);
	}
	else {
		System.out.println(num4+">"+num3);
	}
	
//	----------------------------------------------------------------------------------------------------
	
	if(num3>0) {
		System.out.println("Positive Number");
	}else if(num3==0) {
		System.out.println("It is Zero!");
	}else {
		System.out.println("Negative Number");
	}
	
//	-----------------------------------------------------------------------------------------------------
	if(num2>num3) {
		System.out.println("Num2 is greater than Num3");
		if(num2>num4) {
			System.out.println("Num2 is greatest");
		}else {
			System.out.println("Num2 is less than Num4");
		}
	}else {
		System.out.println("Num2 is less than Num3");
	}

}
}
