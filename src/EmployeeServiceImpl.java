package jdbc_workspace;

import java.sql.Connection;
import java.sql.SQLException;

public class EmployeeServiceImpl {

	public static void main(String[] args) {
		
		saveEmployee();
	}

	private static void saveEmployee() {
		Connection con = null;
		try {
			con = DbConnection.getDBconnection();
			 con.setAutoCommit(false);
			 EmployeeDaoImpl.saveEmployee(con);
			 
			 EmployeeDaoImpl.findEmployee(con);
			 
			 EmployeeDaoImpl.updateEmployee(con);
			 
			 EmployeeDaoImpl.deleteEmployee(con);
			
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
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
