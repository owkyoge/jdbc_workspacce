package jdbc_workspace;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDaoImpl {

	
	public static void saveEmployee(Connection con) throws Exception {
		Statement st = con.createStatement();
		int result = st.executeUpdate("INSERT INTO Employee (E_ID , E_Name ,E_SALARY ) VALUES (1, 'AAAA' , 1000)");
		System.out.println(result);
	}
	
	public static void findEmployee(Connection con) throws Exception {
		Statement st = con.createStatement();
		ResultSet result1 = st.executeQuery("SELECT  E_ID , E_NAME , E_SALARY FROM Employee");
		while (result1.next()) {
			System.out.println(result1.getInt("E_ID"));
			System.out.println(result1.getString("E_NAME"));
			System.out.println(result1.getInt("E_SALARY"));
		}
		
	}
	
	public static void updateEmployee(Connection con) throws Exception {
		
		 Statement st = con.createStatement();
		 int result2 = st.executeUpdate("UPDATE Employee SET E_ID = 1 WHERE E_ID =2");
		 System.out.println(result2);
		
	}
	
	public static void deleteEmployee(Connection con) throws Exception {
		
		Statement st = con.createStatement();
		int result3 = st.executeUpdate("DELETE FROM Employee WHERE E_ID = 3");
		System.out.println(result3);
		
		
	}
	
	
	
	
}
