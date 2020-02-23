package sef.module10.sample;
//Needs to be completed
public class MyThread1Client {
	public static void main(String args[]) {
		System.out.println("Thread Name :" + Thread.currentThread().getName());
			
		//1 - Instantiate an object (say m1) of MyThread1 class 
		MyThread1 m1 = new MyThread1();
		
		//2 - Create 2 objects of Thread class and pass m1 and a thread name as its parameters
		Thread t1=new Thread(m1, "Thread One");
		Thread t2=new Thread(m1, "Thread Two");
		
		//3 - Start both the threads using start()
		t1.start();
		t2.start();
	}
}