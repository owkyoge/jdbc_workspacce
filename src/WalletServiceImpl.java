package jdbc_workspace;

import java.sql.Connection;
import java.sql.SQLException;

public class WalletServiceImpl {

	public static void main(String[] args) {

		Connection con = null;
		
		try {
			 con = DbConnection.getDBconnection();
			
			con.setAutoCommit(false);
			
			WalletDao wallet = new WalletDaoImpl(con);

			wallet.findWallet();
			wallet.saveWallet();
			wallet.updateWallet();
			wallet.deleteWallet();
			
			con.commit();
			
		} catch (Exception e) {
			try { 
				con.rollback();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
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
