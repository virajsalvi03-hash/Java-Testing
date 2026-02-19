package Testing_First;

public class Multi_D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		<datatyp>[rows][column] = new <datatype>[row size][column size];
//		rows= emp.length
//		column = emp[0].length
//		String[][] empcred = new String[3][2];
//		empcred[0][0] = "admin";
//		empcred[0][1] = "admin123";
//		empcred[1][0] = "user1";
//		empcred[1][1] = "user@123";
//		empcred[2][0] = "user2";
//		empcred[2][1] = "user@456";
//		
//		for(int i=0;i<empcred.length;i++) {
//			for(int j=0;j<empcred[0].length;j++) {
//				System.out.println("EmployeeCred row : "+j+" Column: "+i +":"+empcred[i][j]);
//			}
//		}
		
		int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
		int count1 =0;
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0; j<arr1[0].length;j++) {
//				System.out.println("EmployeeCred row : "+i+" Column: "+j +"table : "+arr1[i][j]);
//				count1 = arr1[i][j]+count1;
				arr1[i][j] = arr1[i][j] * arr1[i][j];
				System.out.println(arr1[i][j]);
			}
		}
		

	}

}
