package filehandiling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileMangement {

	public static void main(String[] args) throws IOException {
		
		//Create this reference of the file name and the path mentioned
		File objFile = new File("C:\\Users\\viraj\\OneDrive\\Desktop\\Logs\\Executionlog.log");
//		try {
//		if(objFile.createNewFile()) {
//			System.out.println("File created");
//		}else {
//			System.out.println("File already exists");
//		}
//		}catch(IOException e) {
//			System.out.println(e.getMessage());
//		}
//		
//		//create an object to write content in the file
//		try {
//		FileWriter objwrite = new FileWriter("Executionlog.log");
//		
//		objwrite.write("Test execution started");
//		objwrite.write("\nExecution test case number1");
//		objwrite.close();
//		}catch (IOException e) {
//			System.out.println(e.getMessage());
//		}
//		
//		//read the content from the file
//		
//		try {
//		Scanner objread = new Scanner(objFile);
//		
//		while(objread.hasNextLine()) {
//			System.out.println(objread.nextLine());
//		}
//		
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//		System.out.println("File read complete");
		
		if(objFile.delete()) {
			System.out.println("File deleted");
		}else {
			System.out.println("File is not deleted");
		}

	}

}
