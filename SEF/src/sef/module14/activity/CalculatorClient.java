package sef.module14.activity;
// Needs to be completed
class Calculator {

	//1- Create an add method which can add multiple integer values
	//Use variable arguments for this
	
	int add(int ... num)
	{
		int sum=0;
		for(int i : num)
		{
			sum = sum + i;
		}
		return sum;
	}
}

public class CalculatorClient
{
	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		//2 - Call add method with multiple values
		System.out.println("Sum is : " + c.add(10,20));
		System.out.println("Sum is : " + c.add(30,40,50,9999));
		
	}
}