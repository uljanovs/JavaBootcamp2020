package sef.module11.activity;
//Needs to be completed
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ConsoleToFileActivity {

	public static void main(String[] args) {
		
		//1 - Create variables to store name, age and phone number
		String name;
		int age;
		String phoneNo;
		
		//2 - Create an object of Scanner class which can read from keyboard 
		Scanner scan=new Scanner(System.in);
		
		//3 - Print messages to read name, age and phone number and accept all 3 
		System.out.print("Please enter your name : ");
		name=scan.next();
		
		System.out.print("\nPlease enter your age : ");
		age=scan.nextInt();
		
		System.out.print("\nPlease enter your phone number : ");
		phoneNo=scan.next();
		
		String data=name+":"+age+":"+phoneNo+"\n";
		
		//4 - Create an object of FileOutputStream
		FileOutputStream fos;
		try {
			//5 - Initialize FileOutputStream object which is associated with 
			// .\\src\\sef\\module11\\activity\\temp4.txt and also appends everytime it's opened for writing
			fos = new FileOutputStream(".\\src\\sef\\module11\\activity\\temp4.txt",true);
	
			//6 - Write the name, age and phone no to this file.
			//Make sure that this data is delimited by a colon (:)
			//and each record is written on a new line
			fos.write(data.getBytes());
			
			//7 - Close FileOutputStream object
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
System.out.println("Data is written on the file. Thank you.");
	}
}
