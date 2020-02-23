package sef.module13.activity;
// Needs to be completed

import java.util.Iterator;
import java.util.List;


public class AccountDAOClient {
	
	public static void main(String[] args) {
	AccountDAO obj = new AccountDAOImpl();
	
	try {
		
		//Test1 - Type code to test findAccount("1")
		Account a=obj.findAccount("1");
		System.out.println("The details are : ");
		System.out.println(a.getFirstName()+" "+a.getLastName()+" "+ a.getEmail()+" "+a.getBalance());
		
		
		//Test2 - Type code to test findAccount("J","D"). How many records do you get?
		List accounts = obj.findAccount("J","D");
		Iterator i = accounts.iterator(); 
		while(i.hasNext())
		{
			Account account = (Account)i.next();
			System.out.print(account.getId());
			System.out.print(account.getFirstName());
			System.out.print(account.getLastName());
			System.out.print(account.getEmail());
			System.out.println(account.getBalance());
			
		}
		
		//Test3 - Type code to test insertAccount("6","Sasha","Kohli","sasha.kohli@gmail.com",90000)
		obj.insertAccount("6","Sasha","Kohli","sasha.kohli@gmail.com",90000);
		
		//Test4 - Type code to test deposit("1",2000)
		obj.deposit("1",2000);
		
		//Test5 - Type code to test deposit("2",3000)
		obj.withdraw("2", 3000);
		
		//Test6 - Type code to test deleteAccount("6")
		obj.deleteAccount("6");
		
	} catch (AccountDAOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
}