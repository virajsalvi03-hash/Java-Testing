package iostream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			BufferedReader obj = new BufferedReader(new FileReader("config.txt"));
			String str;
			while((str=obj.readLine())!=null) {
				System.out.println(str);
			}
			System.out.println("File read Complete");
			obj.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
