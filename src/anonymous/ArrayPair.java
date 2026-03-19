package anonymous;

public class ArrayPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int a=0;
		int b=0;
		int arr2[]= {0};
		for(int i=0;i<arr.length;i++) { 
			if(i+a==9) {
				for(int j=0;j<arr2.length;j++){
					arr2[j]=arr[i]+arr2[j];
					
				}
				break;
			}else {
				a=i;
			}
		}
		System.out.println("Sum of two number that gives 9 are"+a+" & ");

	}

}
