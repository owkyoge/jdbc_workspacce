package jdbc_workspace;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SaveEmployeeDept3 {

	public static void main(String[] args) {

		Connection con = null;
		try {
			con = DbConnection.getDBconnection();
			con.setAutoCommit(false);

			
			Statement st = con.createStatement();
			int result = st.executeUpdate("INSERT INTO EMPLOYEE (EMPLOYEE_ID ,EMPLOYEE_NAME, DEPT_ID) VALUES (60,'Abhi00000',8)");
			System.out.println(result);
			
			
			
			Statement st1 = con.createStatement();
			int result1 = st1.executeUpdate("INSERT INTO DEPARTMENT (DEPT_ID , DEPT_NAME) VALUES (60,'EEE70')");
			System.out.println(result1);
			
			
			con.commit();
			
		} catch (Exception e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
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
