package sef.module12.activity;
// Needs to be completed
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientActivity {

	public static void main(String arg[]){
		Socket socket=null;
		
		try {
			//1 - Instantiate Socket Object and pass Server's IP address and port number
			socket = new Socket("localhost", 9999);
			
			//Obtaining InputStream to be able to read messages sent by Server
			BufferedReader in = new BufferedReader(
					new InputStreamReader(
					socket.getInputStream()));
			
			//2 - Obtain Keyboard's InputStream to read data from keyboard 
			BufferedReader myIn = new BufferedReader(
					new InputStreamReader(
					System.in));
			
			//3 - Obtain Socket's OutputStream to write/send messages on it.
			PrintWriter out = new PrintWriter(
                    socket.getOutputStream(), true);
			
			//Reading the message sent by server
			String serverMsg = in.readLine();
			while (serverMsg != null){
				System.out.println("Server said : " +serverMsg);
				//4 - Read from keyboard using myIn.readLine()
				String myMsg = myIn.readLine();
				
				//Sending this message to the Server
				out.println(myMsg);
				//Reading what server has sent
				serverMsg=in.readLine();
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
