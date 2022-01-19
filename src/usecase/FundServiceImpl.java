package usecase;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import jdbc_workspace.DbConnection;

public class FundServiceImpl {

	public static void main(String[] args) {

		BigDecimal transferAmount = new BigDecimal(5000);
		
		Connection con = null;

		try {
			con = DbConnection.getDBconnection();
			con.setAutoCommit(false);
			
			FundDao fund = new FundDaoImpl(con);
			
			String eswarAccNumber="1181234567";
			List<Fund> yogiList = fund.findFund(eswarAccNumber);

			Fund yogiFundObj = yogiList.get(0);			
			BigDecimal eswarBalanceAmt = yogiFundObj.getAmount();
			int isAvailableBalance = eswarBalanceAmt.compareTo(transferAmount);
			long yogAccNumber = yogiFundObj.getAccNumber();
			
			if(isAvailableBalance == 1) {
				
				
				String saiAccNumber = "1182345678";
				
				List<Fund> saiList = fund.findFund(saiAccNumber);
				Fund saidFundObj = saiList.get(0);
				String saiAccisActive = saidFundObj.getIsActive();
				
				
				if (saiAccisActive.equalsIgnoreCase("Y")) {
					
					BigDecimal saiBalAmount = saidFundObj.getAmount();
					saiBalAmount.add(transferAmount);
					fund.updateFund(saiBalAmount, saidFundObj.getAccNumber() );
					
					BigDecimal yogiAmount = yogiFundObj.getAmount();
					BigDecimal yogiRemainAmount = yogiAmount.subtract(transferAmount);
					System.out.println(yogiRemainAmount);
					fund.updateFund(yogiRemainAmount , yogAccNumber );
					
				}
				}
				
			
			
			
			
			
			con.commit();
			
		} catch (Exception e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}		}

	}

}
