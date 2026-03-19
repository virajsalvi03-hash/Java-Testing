package iostream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferredWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			BufferedWriter obj = new BufferedWriter(new FileWriter("output.txt"));
			obj.write("Automation Successful\n");
			obj.write("Test case 1 passed\n");
			obj.write("Test case 2 Failed");
			obj.close();
			System.out.println("Test Execution Complete");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
