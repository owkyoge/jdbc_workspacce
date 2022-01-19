package jdbc_workspace;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SaveDEPT {

	public static void main(String[] args) {

		Connection con = null;

		try {

			// Step 1    Load the Drivers
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Step 2     Get the Connections
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "Yogimarthand");
			// Step 3     Createthe Statement 
			Statement st = con.createStatement();
			
			// Step 4 Execute the Statement 
			int result = st.executeUpdate(
					"INSERT INTO EMPLOYEE (EMPLOYEE_ID , EMPLOYEE_NAME , DEPT_ID ) VALUES (4 , 'PAVAN' , 3)");

			System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
