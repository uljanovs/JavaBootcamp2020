package sef.module8.activity;
//Needs to be completed

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//The following program throws a checked exception. 
public class SQLExceptionActivity {


    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost/activity1";
        String user = "root";
        String pass = "abcd1234";

        //The following code would not compile unless it's put inside a try catch
        //1 - put it in a try block and handle ClassNotFoundException

        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException c) {
            System.out.println("The driver class is not found");
        }

        //2 - You also need to catch SQLException for it to compile

        try {
            Connection cn = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection successfully established! \n");
            cn.close();
        } catch (SQLException s) {
            System.out.println("There is an SQLException. Please check the connection parameters.");
        }
    }

}
