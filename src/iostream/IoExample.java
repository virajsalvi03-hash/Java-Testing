package iostream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IoExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileInputStream obj = new FileInputStream("config.txt");
			int data;
			while((data =obj.read())!=-1) {
				System.out.print((char)data);
				
				
			}
			obj.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
