package jdbc_workspace;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SenderReciverServiceImpl {

	public static void main(String[] args) {

		Connection con = null;
		try {
			con = DbConnection.getDBconnection();

			con.setAutoCommit(false);

			SenderDaoImpl.saveSender(con);

			ReciverDaoImpl.saveReciver(con);

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

	

	

	
	
}
