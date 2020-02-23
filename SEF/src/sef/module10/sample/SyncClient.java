package sef.module10.sample;
//Needs to be completed
public class SyncClient {

		  public static void main(String[] args) {
			  
			  Sync s1=new Sync();
			  
			  //1 - Create two threads and pass s1 as a parameter.
			  //Also pass a name for these threads
			  Thread t1=new Thread(s1, "Thread One: ");
			  Thread t2=new Thread(s1, "Thread Two: ");
			  
			  //2 - Start both the threads using start()
			  t1.start();
			  t2.start();
		}
		 

}
