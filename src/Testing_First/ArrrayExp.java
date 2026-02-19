package Testing_First;

public class ArrrayExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		<datatypes>[] arrayname = new <datatype>[size];
		
		double [] empsal = new double[4];
		empsal[0] = 12000.98;
		empsal[1] = 15000.20;
		empsal[2]= 20000.00;
		empsal[3]=19000.12;
		System.out.println("Salary = "+empsal[3]);
		
//		int[] empid = {01,02,03,04};
//		System.out.println("Employee ID = "+empid[0]);
//		System.out.println(empid.length);
		
//		for(int i=0;i<empsal.length;i++) {
//			System.out.println("EmployeeID = "+i+":"+empsal[i]);
//		}
		double sum = 0;
//		
//		for(double i: empsal) {
//			System.out.println("EmployeeID = "+i);
//			
//		}
		
//		for(double i:empsal) {
//			
//			sum = sum + i;
//			
//		}
//		System.out.println("Sum of all number are : "+sum);
		
		int[] evenum = {2,3,4,9,5,12,7,8,10};
		int count =0;
		
//		for(int i : evenum) {
//			if(i%2==0) {
//				System.out.println("Even numbers in array : "+i);
//				count++;
//				}
//			}
//		System.out.println("Count of even number is : "+count);
		
		for(int i :evenum) {
			if(count<i) {
				count = i;
			}
			}
		System.out.println("Highest value in array are : "+count);

}
}
