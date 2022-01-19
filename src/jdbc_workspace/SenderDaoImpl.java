package jdbc_workspace;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SenderDaoImpl {
	
	public static void saveSender(Connection con) throws SQLException {
		Statement st = con.createStatement();
		int result = st.executeUpdate("INSERT INTO SENDER (S_ID , S_NAME , S_AMOUNT) VALUES (9 , 'YESWANTH' , 2500)");
		System.out.println(result);
	}

}
