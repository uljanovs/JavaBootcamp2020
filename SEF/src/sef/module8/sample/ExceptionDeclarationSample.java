package sef.module8.sample;

import java.io.IOException;
import java.sql.SQLException;

//Needs to be completed
public class ExceptionDeclarationSample {

	public static void setAge(int age){		

		if(age < 18 ){
			//1 - Throw an instance of  IllegalArgumentException
			//The parameter passed would be printed in the output
			throw new IllegalArgumentException("You are not allowed to watch this movie" + "Your Age is: " + age);
		}

		System.out.println("Please watch this nice butifull video, your age is: " + age);
	}
	
	public static void main(String arg[]) throws IOException, SQLException {
		//2 - Call setAge with a negative parameter
		ExceptionDeclarationSample.setAge(45);
		ExceptionDeclarationSample.connectToDB(0);
	}

	public static void connectToDB (int I)throws SQLException, IOException {
		System.out.println(5/I);
	}

}
