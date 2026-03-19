package assignment8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.Buffer;
import java.util.Scanner;

public class FileHandleAssignment {

	public static void main(String[] args) throws IOException {
		File obj = new File("date.txt");
//		try {
//			if(obj.createNewFile()) {
//				System.out.println("File created");
//			}else {
//				System.out.println("File already exist");
//			}
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//		FileWriter objwrite = new FileWriter("date.txt");
//		try {
//			objwrite.write("Text Execution :success \n");
////			objwrite.close();
//			System.out.println("Successfully written succed test case");
//			
//		}catch(Exception e) {
//			System.out.println("failed to write");
//			System.out.println(e.getMessage());
//		}
//		
//		try {
//			objwrite.write("Text Execution :failed \n");
////			objwrite.close();
//			System.out.println("Successfully written failed test case");
//			
//		}catch(Exception e) {
//			System.out.println("failed to write");
//			System.out.println(e.getMessage());
//		}
//		
//		try {
//			objwrite.append('A');
//			objwrite.close();
//			System.out.println("Append successful");
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		
//		Scanner objread= new Scanner("date.txt");
//		String line;
//		try {
//			while(objread.hasNextLine()) {
//				line =objread.next();
//				System.out.println(line);
//			}
//		}catch (Exception e) {
//			System.out.println("Error occured");
//			System.out.println(e.getMessage());
//		}
//		System.out.println("File read complete");
//		BufferedReader objread = new BufferedReader(new FileReader("date.txt"));
//		try {
//			
//			String str;
//			while((str=objread.readLine())!=null) {
//				System.out.println(str);
//			}
//			System.out.println("File read Complete");
//			objread.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//		}
		if(obj.delete()) {
			System.out.println("File is deleted");
		}else {
			System.out.println("File not deleted");
		}
		
		

	}

}
