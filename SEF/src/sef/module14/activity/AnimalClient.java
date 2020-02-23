package sef.module14.activity;
// Needs to be completed
import java.util.ArrayList;

public class AnimalClient {
public static void main(String[] args) {
	
	//1 - Create a list of Animal objects 
	//Make sure to use Generics
	//so that it only allows Animal objects to be added to the list
	ArrayList <Animal> list = new ArrayList<Animal>();
	
	//2 - Add 4 Dog objects to the list. One example given below
	list.add(new Dog("Brown", 4,"Pomeranian"));
	list.add(new Dog("Black", 4,"German Shephard"));
	list.add(new Dog("Green", 4,"Pug"));
	list.add(new Dog("Blue", 4,"Dobermann"));
	
	//3 - Add 2 Cat objects
	list.add(new Cat("Black",4,"Brown"));
	list.add(new Cat("Green",4,"White"));
	
	//4 - Create 2 variables to keep a count of Dog and Cat Objects added to the list  
	int catCount=0;
	int dogCount=0;
	
	//5 - Create an enhanced for loop to traverse trough the list
	for(Animal i : list)
	{
		
	//6 - Count and print how many Dog and Cat objects are present in the list.
	//You can use instanceof to check which class does an object belong to	
		if(i instanceof Cat)
			catCount++;
		else if (i instanceof Dog)
			dogCount++;
	}
	System.out.println("Number of Cats added : "+catCount);
	System.out.println("Number of Dogs added : "+dogCount);
}
}
