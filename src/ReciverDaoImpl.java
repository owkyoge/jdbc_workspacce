package jdbc_workspace;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ReciverDaoImpl {

	
	public static void saveReciver(Connection con) throws SQLException {
		Statement st1 = con.createStatement();
		int result1 = st1.executeUpdate(
				"INSERT INTO RECIVER (RECIVER_ID , RECIVER_NAME , RECIVER_AMOUNT) VALUES (5, 'INDRA' , 2500)");
		System.out.println(result1);
	}
}
