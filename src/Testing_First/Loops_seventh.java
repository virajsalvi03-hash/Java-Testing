package Testing_First;

public class Loops_seventh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int attemp= 0;
		
//		-----------------------------------------------------------------------------------------------------------
//		do {
//			attemp++;
//			System.out.println("Attempts "+attemp);
//		}while(attemp<5);
		
//		---------------------------------------------------------------------------------------------------------
//		while(attemp<3) {
//			attemp++;
//			System.out.println("Attempts "+attemp);
//		}
		
//		----------------------------------------------------------------------------------------------------------
		
//		for(int reattemp=0; reattemp<3;reattemp++) {
//			System.out.println("Attempts "+reattemp);
//		if(reattemp == 0){	
//		break;}
//		}
//		System.out.println("Done");
//		
//		for(int reattemp=0; reattemp<5;reattemp++) {
//			if(reattemp==2) {
//				continue;
//			}
//			System.out.println("Attempts "+reattemp);
//			
//			
//		}
//		System.out.println("Done");
		
//		for(int i=0;i<5;i++) {
//			System.out.println("Outer Start");
//			for(int j=0;j<3;j++) {
//				System.out.println("iteration of i "+i+" iteration of j "+j);
//			}
//			System.out.println("Inner done");
//		}
//		System.out.println("Done");
		
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
