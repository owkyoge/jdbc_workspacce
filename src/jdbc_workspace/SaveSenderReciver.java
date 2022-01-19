package jdbc_workspace;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SaveSenderReciver {

	public static void main(String[] args) {

		Connection con = null;
		try {
			con = DbConnection.getDBconnection();
		//	Statement st = con.createStatement();
		//	int result = st.executeUpdate("INSERT INTO SENDER (S_ID , S_NAME , S_AMOUNT) VALUES (2 , 'Unknown' , 1000)");
		//	System.out.println(result);
			
		    Statement st1 = con.createStatement();
		    int result1 = st1.executeUpdate("INSERT INTO RECIVER (RECIVER_ID , RECIVER_NAME , RECIVER_AMOUNT) VALUES (2 , 'Unknown' , 1000)");
			System.out.println(result1);
			
			
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
