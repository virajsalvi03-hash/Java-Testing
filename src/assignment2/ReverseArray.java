package assignment2;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.println(arr[i]);
//		}
		
		int num =0;
//		do {
//			num++;
//			System.out.println(num);
//			
//		}while(num<10);
		
		int sum = 5;
//		for(int i=1;i<=10;i++) {
//			System.out.println("5x"+i+"="+(i*sum));
//		}
		
		int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
		int add =0;
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				add = add + arr1[i][j];
			}
		}
		System.out.println(add);
//		System.out.println(sum++ + sum++);
	}

}
