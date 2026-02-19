package exceptionPractice;

import javax.management.RuntimeErrorException;

public class ExceptionTypes {

	public static void main(String[] args) {
//		Compilation error -  in syntax error
		int a =10;
		System.out.println(a);
		
//		Runtime error - give error during compiling the code
		try {
			System.out.println(a/0);
		int[] runtime = {0,1,2,3};
		 for(int i =0; i<=runtime.length;i++) {
			 System.out.println(runtime[i]);
			 
		 }
//		 System.out.println("without error");
		 
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("This code will be executed even if or if not the exception handle");
		}
		 
//		 Logical error-when syntax is correct but logical is wrong
		 
		 for(int i=0;i<=5;i++) {
			 System.out.println(i);
		 }
		System.out.println("End");
//		try - where error is expected
//		catch - when error occurs it caught by 'catch' with created object we can display error like msg and code run forward
//		finally - display inside msg dispissate error handle or not
//		throw - will give customize error msg
		int balance = -1;
		try {
			if(balance<0) {
				throw new RuntimeException("Invalid balance");
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println(balance);
		}
	}

}
