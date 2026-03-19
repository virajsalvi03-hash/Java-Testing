package iostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class IOtestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			FileOutputStream obj = new FileOutputStream("Read.txt",true);
			String str = "\nAppend this line";
			
			obj.write(str.getBytes());
			System.out.println("File Created Successffully");
			obj.close();
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		

	}

}
