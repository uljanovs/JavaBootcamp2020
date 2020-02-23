package sef.module13.sample;
// Needs to be completed
import java.sql.*;

public class StatementSample {

	public static void main(String[] args) {
		try{
			String url = "jdbc:mysql://localhost/activity";
			String user = "root";
			String pass = "abcd1234";
			
			//1 - Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//2 - Obtain a connection
			Connection cn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection successfully established!");
			
			//3 - Create a Statement
			Statement st = cn.createStatement();
			
			//4 - Execute a query
			ResultSet rs = st.executeQuery("select * from Employee");			
			
			System.out.println("ID\tComplete Name\tSalary");
			//5 - Traverse through the ResultSet and print all the records  
			while(rs.next()){
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t"+rs.getString(3)+"\t");
				System.out.print(rs.getInt(4)+"\n");
			}
			
			//closing the connection
			cn.close();
			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		
	}

}
