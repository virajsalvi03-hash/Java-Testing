package assignment;

public class ArrayLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {10,2,30,4,15};
		int lar=0;
		for(int i=0;i<num.length;i++) {
			if(lar<num[i]) {
				lar=num[i];
			}
		}
		System.out.println(lar);

	}

}
