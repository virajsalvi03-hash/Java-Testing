package Testing_First;



public class Fourth_operators{

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//		-----------------Arithmetice operators : + - * / % ---------------------
//		-------------------Assignment Operators : = += -= /= %= ---------------
//		------------------COmparsion operators : == != > < => <= ------------------
//		-----------------------Logical OPeraotrs : && || ! ---------------------
		
		int num1 = 20;
		int num2 = 20;
		
		System.out.println("num1 + num2 :"+ (num1+num2));
		System.out.println("num1 - num2 :"+ (num1-num2));
		System.out.println("num1 * num2 :"+ (num1*num2));
		System.out.println("num2 / num1 :"+ (num2/num1));
		System.out.println("num1 % num2 :"+ (num1%num2));
//		-------------------Assignment Operators : = += -= /= %= ---------------
//		System.out.println("num1 += 5 :"+ (num1+=5));
//		System.out.println("num1 -= 3 :"+ (num1-=3));
//		System.out.println(num1 %=3);
//	
//		------------------COmparsion operators : == != > < => <= ------------------
		
		System.out.println(num1 == num2 );
		System.out.println(num1 != num2);
		System.out.println(num1);
		System.out.println(num2);
		
//		-----------------------Logical OPeraotrs : && || ! ---------------------
		 boolean con1 = true;
		 boolean con2 = false;
		 
		 System.out.println("con1 && con2 : "+ (con1 && con2));
		 System.out.println("con1 || con2 : "+ (con1 || con2));
		 System.out.println("!con1 : "+ (!con1));
		 
//		 --------------------Precedecnce operators-------------------
		 System.out.println("10+20*5 : " + (10+20*5));
		 System.out.println("(10+20)*5 : " + ((10+20)*5));
		 
	}
	

}
