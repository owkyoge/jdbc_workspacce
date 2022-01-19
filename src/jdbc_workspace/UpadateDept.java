package jdbc_workspace;

import java.sql.Connection;
import java.sql.Statement;

public class UpadateDept {

	public static void main(String[] args) {

		Connection con = null;
		try {
			con = DbConnection.getDBconnection();
			Statement st = con.createStatement();
			
			int result = st.executeUpdate("UPDATE DEPARTMENT SET DEPT_NAME = 'IT2' WHERE DEPT_ID  = '5'");
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
