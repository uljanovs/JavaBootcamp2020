package sef.module10.sample;
//Needs to be completed
public class ThreadPriorityClient {

		  public static void main(String args[]){ 
			  
		  //1 - Create an object of ThreadPriority 
		  ThreadPriority m1=new ThreadPriority("My Thread One");
		  //2 - Set a priority (MIN_PRIORITY) for this thread.
		  m1.setPriority(Thread.MIN_PRIORITY);
		  //3 - Start this thread
		  m1.start();
		  
		  //1 - Create an object of ThreadPriority2
		  ThreadPriority2 m2=new ThreadPriority2("My Thread Two");
		  //2 - Set a priority (MAX_PRIORITY) for this thread.
		  m2.setPriority(Thread.MAX_PRIORITY);
		  //3 - Start this thread
		  m2.start();
		  }
		
}
