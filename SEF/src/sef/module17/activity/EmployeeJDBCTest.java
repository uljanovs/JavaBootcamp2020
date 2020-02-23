package sef.module17.activity;
// Needs to be completed
import java.sql.Connection;
import java.util.ArrayList;

import junit.framework.TestCase;

public class EmployeeJDBCTest extends TestCase {

	EmployeeJDBC emp;
	
	protected void setUp() throws Exception {
	//setUp() is used to initialize member data which would be used by all/most of its methods
		emp = new EmployeeJDBC();
	}

	public void testCreateConnection() {
		Connection con = emp.createConnection();
		assertNotNull(con);
		
	}

	public void testFindEmployeeById_MatchFound() {
		Employee e = emp.findEmployeeById("1");
		assertEquals("John", e.getFirstName());
		assertEquals("Doe", e.getLastName());
		assertEquals(2500, e.getSalary());
	}

	public void testFindEmployeeById_NoMatchFound() {
		Employee e1 = emp.findEmployeeById("99");
		assertNull(e1);
	}
	
	
	public void testFindEmployeeByName_MatchFound() {
		ArrayList<Employee> list = emp.findEmployeesByName("Doe");
		assertEquals(2, list.size());
		
	}
	
	public void testFindEmployeeByName_NoMatchFound() {
		ArrayList<Employee> list = emp.findEmployeesByName("Smith");
		assertEquals(0, list.size());
		
	}

	public void testFindEmployeeBySalary_MatchFound() {
		ArrayList<Employee> list = emp.findEmployeesBySalary(4900);
		assertEquals(1,list.size());
	}

	public void testFindEmployeeBySalary_NoMatchFound() {
		ArrayList<Employee> list = emp.findEmployeesBySalary(9000);
		assertEquals(0,list.size());
	}
	
	public void testInsertEmployee(){
		Employee e1 = new Employee();
		e1.setId("10");
		e1.setFirstName("Shane");
		e1.setLastName("Warne");
		e1.setSalary(2700);
		
		emp.insertEmployee(e1);
		
		Employee e2 = emp.findEmployeeById("10");
		assertEquals("Shane", e2.getFirstName());
		assertEquals("Warne", e2.getLastName());
		assertEquals(2700, e2.getSalary());
		
	}
}
