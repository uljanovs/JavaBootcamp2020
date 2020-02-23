package sef.module13.activity;
// Needs to be completed
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountDAOImpl implements AccountDAO {

	private Connection conn;

	public AccountDAOImpl() {
		String url = "jdbc:mysql://localhost/activity";
		String user = "root";
		String pass = "abcd1234";
		
		try {
			//1 - Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//2 - Obtain a connection using DriverManager class
			Connection cn = DriverManager.getConnection(url, user, pass);
			this.conn = cn;
			conn.setAutoCommit(false);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	//3 - implement findAccount method which returns a list of accounts matching the first name and last name combination
	public List findAccount(String firstName, String lastName)
			throws AccountDAOException {
		List<Account> results = new ArrayList<Account>();
		try {
			PreparedStatement pStmt = conn
					.prepareStatement("select * from Account where upper(FIRST_NAME) like ? and upper(LAST_NAME) like ? order by ID ASC");
			pStmt.setString(1, '%' + firstName.toUpperCase() + '%');
			pStmt.setString(2, '%' + lastName.toUpperCase() + '%');

			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				results.add(new AccountImpl(rs.getString(1), rs
						.getString(2), rs.getString(3), rs
						.getString(4),rs.getFloat(5)));
			}

		} catch (SQLException e) {
			throw new AccountDAOException(AccountDAOException.ERROR_FIND_NAME,
					e);
		}
		return results;
	}

	//4 - Complete implementation for findAccount method
	public Account findAccount(String id) throws AccountDAOException {

		try {
			PreparedStatement pStmt = conn
					.prepareStatement("select * from Account where ID = ? ");
			pStmt.setString(1, id);
			ResultSet rs = pStmt.executeQuery();
			if (rs.next()) {
				return new AccountImpl(rs.getString(1), rs
						.getString(2), rs.getString(3), rs
						.getString(4),rs.getFloat(5));
			}

		} catch (SQLException e) {
			throw new AccountDAOException(AccountDAOException.ERROR_FIND_ID, e);
		}

		return null;
	}

	//5 - Complete implementation for insertAccount
	public boolean insertAccount(String id, String firstName, String lastName, String email, float balance)
			throws AccountDAOException {

		try {
			PreparedStatement pStmt = conn
					.prepareStatement("insert into Account VALUES (?,?,?,?,?)");

			pStmt.setString(1, id);
			pStmt.setString(2, firstName);
			pStmt.setString(3, lastName);
			pStmt.setString(4, email);
			pStmt.setFloat(5, balance);

			int rows = pStmt.executeUpdate();
			conn.commit();
			if (rows == 1) {
				return true;
			}else{
				return false;
			}
		} catch (SQLException ex) {
			try {
				conn.rollback();
			} catch (SQLException e) {
				throw new AccountDAOException(
						AccountDAOException.ERROR_INSERT_ACCOUNT, e);

			}
			throw new AccountDAOException(
					AccountDAOException.ERROR_INSERT_ACCOUNT, ex);
		}

	}
	
	//6 - Complete implementation for deposit. It should ensure that the account balance is increased by the amount deposited. 	
	public boolean deposit(String id, float amount ) throws AccountDAOException
	{
		boolean flag = false;
		try{
		PreparedStatement pStmt = conn
		.prepareStatement("update Account set balance = balance + ? where id=?");

pStmt.setFloat(1, amount);
pStmt.setString(2, id);


int rows = pStmt.executeUpdate();
conn.commit();
if (rows == 1) {
	flag = true;
}else{
	flag = false;
}
} catch (SQLException ex) {
	try {
		conn.rollback();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
} 
return flag;
}

	
	//7 - Complete implementation for withdraw. It should ensure that the account balance is reduced by the amount deposited.
	public boolean withdraw(String id, float amount ) throws AccountDAOException
	{		
		boolean flag = false;
		
		try{
		PreparedStatement pStmt = conn
		.prepareStatement("update Account set balance = balance - ? where id=?");

pStmt.setFloat(1, amount);
pStmt.setString(2, id);


int rows = pStmt.executeUpdate();
conn.commit();
if (rows == 1) {
	flag = true;
}else{
	flag = false;
}
} catch (SQLException ex) {
	try {
		conn.rollback();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
} 
return flag;
}
	
	//8 - Complete implementation for deleteAccount
	public boolean deleteAccount(String id) throws AccountDAOException
	{
		boolean flag = false;
		try{
			PreparedStatement pStmt = conn
			.prepareStatement("delete from Account where id = ?");

	pStmt.setString(1, id);


	int rows = pStmt.executeUpdate();
	conn.commit();
	if (rows == 1) {
		flag = true;
	}else{
		flag = false;
	}
	} catch (SQLException ex) {
		try {
			conn.rollback();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	} 
	return flag;
	}

}
