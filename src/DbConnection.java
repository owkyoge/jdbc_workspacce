package jdbc_workspace;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static Connection getDBconnection() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:sudhakar", "system", "N@nd1@gr0up");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}

}
   