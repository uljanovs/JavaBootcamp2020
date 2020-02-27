package sef.module8.sample;
//Needs to be completed
//Run this class with -ea option enabled in JVM arguments
public class AssertSample {

	public static void test()
	{
		int x = 5;
		int y = 2;
		/*
		System.out.println("5%2 result is: "+ x % y);
		x = 6;
		y = 2;
		System.out.println("6%2 result is: "+ x % y);
		*/
		//1 - Type assert 5%2 and 6%2 in separate statements
		assert 5%2 == 1;
		assert 6%2 == 1 : "This is wrong!!!";
	}
	public static void main(String arg[]){
		//2 - Call test()
		AssertSample.test();
		
	}			
}
