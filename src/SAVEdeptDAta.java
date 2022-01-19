package jdbc_workspace;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SAVEdeptDAta {

	public static void main(String[] args) {

		Connection con = null;
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "Yogimarthand");
			Statement st = con.createStatement();
			int result = st.executeUpdate("INSERT INTO DEPARTMENT (DEPT_ID , DEPT_NAME) VALUES (3,'ECE')");
		      System.out.println(result);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
