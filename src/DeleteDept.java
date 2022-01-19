package jdbc_workspace;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDept {

	public static void main(String[] args) {

		Connection con = DbConnection.getDBconnection();
		try {
			con = DbConnection.getDBconnection();
			Statement st = con.createStatement();
			int result = st.executeUpdate("DELETE FROM DEPARTMENT");
			System.out.println(result);
		} catch (SQLException e) {
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
