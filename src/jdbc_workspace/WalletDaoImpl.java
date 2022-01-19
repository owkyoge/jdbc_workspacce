package jdbc_workspace;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class WalletDaoImpl implements WalletDao{

	Connection con = null;
	
     public WalletDaoImpl(Connection con) {
		this.con = con;
	}
	
	
	@Override
	public void findWallet() throws Exception {
		Statement st = con.createStatement();
		ResultSet result = st.executeQuery("SELECT W_ID ,W_NAME , W_ACCNO FROM Wallet");
		while (result.next()) {
		System.out.println(result.getInt("W_ID"));
	    System.out.println(result.getString("W_NAME"));
	    System.out.println(result.getString("W_ACCNO"));

		}
	}

	
	@Override
	public int saveWallet() throws Exception {
		
		Statement st = con.createStatement();
		int result = st.executeUpdate("INSERT INTO Wallet (W_ID , W_Name ,W_ACCNO ) VALUES (1, 'PAVAN' , 54637892018)");
		
		System.out.println(result);
		return result;
		
	}

	@Override
	public int updateWallet() throws Exception{
		Statement st = con.createStatement();
		int result1 = st.executeUpdate("UPDATE Wallet SET W_ID = 2, W_Name = 'YESWANTH', W_ACCNO= 626262626 WHERE W_ID = 1");
		System.out.println(result1);
		return result1;
	}

	@Override
	public int deleteWallet() throws Exception {
		Statement st = con.createStatement();
		int result2 = st.executeUpdate("DELETE FROM Wallet WHERE W_ID = 3");
		System.out.println(result2);
		return result2;
		
	}
 
	
	
	
	
	
	
}
