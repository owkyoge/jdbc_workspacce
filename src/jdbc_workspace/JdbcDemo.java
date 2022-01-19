package jdbc_workspace;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws Exception {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "Yogimarthand");
		Statement st = con.createStatement();
	//	ResultSet rs = st.executeQuery("SELECT STUDENT_ID , STUDENT_NAME , STUDENT_AGE  FROM STUDENTS");
		ResultSet rs1 = st.executeQuery("SELECT TEACHERS_ID , TEACHERS_NAME , TEACHERS_AGE  FROM TEACHERS");
	/*	while (rs.next()) {
			System.out.println(rs.getString("STUDENT_ID"));
			System.out.println(rs.getString("STUDENT_NAME"));
			System.out.println(rs.getString("STUDENT_AGE"));
		}*/
	  	while (rs1.next()) { 
			System.out.println(rs1.getString("TEACHERS_ID"));
			System.out.println(rs1.getString("TEACHERS_NAME"));
			System.out.println(rs1.getString("TEACHERS_AGE"));
		}
		con.close();

	}

}
