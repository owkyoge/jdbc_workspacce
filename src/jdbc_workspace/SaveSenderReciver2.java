package jdbc_workspace;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SaveSenderReciver2 {

	public static void main(String[] args) {

		Connection con = null;
		try {
			con = DbConnection.getDBconnection();

			con.setAutoCommit(false);

			saveSender(con);

			saveReciver(con);

			con.commit();

		} catch (SQLException e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	private static void saveReciver(Connection con) throws SQLException {
		Statement st1 = con.createStatement();
		int result1 = st1.executeUpdate(
				"INSERT INTO RECIVER (RECIVER_ID , RECIVER_NAME , RECIVER_AMOUNT) VALUES (4 , 'Pavan' , 11500)");
		System.out.println(result1);
	}

	private static void saveSender(Connection con) throws SQLException {
		Statement st = con.createStatement();
		int result = st.executeUpdate("INSERT INTO SENDER (S_ID , S_NAME , S_AMOUNT) VALUES (5 , 'Yogi' , 11500)");
		System.out.println(result);
	}

}
