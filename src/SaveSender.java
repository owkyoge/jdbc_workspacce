package jdbc_workspace;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SaveSender {

	public static void main(String[] args) {

		Connection con = null;
	    try {
	    	 con = DbConnection.getDBconnection();
			Statement st = con.createStatement();
		//	boolean result = st.execute("CREATE TABLE SENDER (S_ID NUMBER (3) , S_NAME VARCHAR2(20), S_AMOUNT NUMBER (7))");
		//	System.out.println(result);
			int result = st.executeUpdate("INSERT INTO SENDER (S_ID , S_NAME , S_AMOUNT) VALUES (1 , 'YOGI' , 5000)");
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
