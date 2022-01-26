package jdbc_workspace;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DbConnection1 {

	public static Connection getDBconnection() {
		Connection con = null;
		try {
			
			FileReader fr = new FileReader("D:\\Eswar\\workspace\\jdbc_workspace\\src\\jdbc_workspace\\db.properties");

			Properties p = new Properties();

			p.load(fr);

			String y = p.getProperty("drivername") + ":" + p.getProperty("hostname") + ":" + p.getProperty("port") + ":"
					+ p.getProperty("schema") + " ," + p.getProperty("user") + " ," + p.getProperty("password");

			// System.out.println( y + o + g + i + a + b );

		//	System.out.println(y);
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(y);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}

	public static void main(String[] args) throws Exception {

		

	}

}
