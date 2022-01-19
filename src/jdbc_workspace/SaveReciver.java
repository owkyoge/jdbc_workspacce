package jdbc_workspace;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SaveReciver {

	public static void main(String[] args) {

		Connection con = null;
		try {
			con = DbConnection.getDBconnection();
			Statement st = con.createStatement();
		//	boolean execute = st.execute("CREATE TABLE RECIVER (RECIVER_ID NUMBER(3) , RECIVER_NAME VARCHAR(20) , RECIVER_AMOUNT NUMBER(7)) ");
		//	System.out.println(execute);
			int result = st.executeUpdate("INSERT INTO RECIVER (RECIVER_ID , RECIVER_NAME , RECIVER_AMOUNT) VALUES (1 , 'SAI' , 0)");
			System.out.println(result);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
