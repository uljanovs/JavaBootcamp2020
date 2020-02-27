package sef.module8.activity;
//Complete code
//The error is due to the order in which exceptions are being handled
//Since Exception class catches all the exceptions,
//ArithmeticException becomes unreachable code

public class ExceptionSequenceActivity {
public static void main(String[] args) {
	new ExceptionSequenceActivity().divide(10,0);
}

void divide(int num1,int num2)
{
	try{
	System.out.println(num1/num2);	
	}
//In participants workspace, the order in whcih catch blocks are given would be different
	catch(ArithmeticException a)
	{
		System.out.println("Division by zero is not allowed");
	}
	catch(Exception e)
	{
		System.out.println("Exception!!!");
	}

}
}
