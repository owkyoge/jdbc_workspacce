package jdbc_workspace;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SaveEmployee {

	public static void main(String[] args) {

		
		Connection con = null;
		try {
			con = DbConnection.getDBconnection();
			Statement st = con.createStatement();
			int result = st.executeUpdate("INSERT INTO EMPLOYEE (EMPLOYEE_ID ,EMPLOYEE_NAME, DEPT_ID) VALUES (7,'Abhi',8)");
	         System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
