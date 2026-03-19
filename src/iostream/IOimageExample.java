package iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOimageExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileInputStream obj = new FileInputStream("car.jpg");
			FileOutputStream obj2 = new FileOutputStream("car2.jpg");
			int data;
			while((data =obj.read())!=-1) {
				obj2.write(data);
				
			}
			System.out.println("Image copied successfully");
			obj.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
