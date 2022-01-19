package usecase;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FundDaoImpl implements FundDao {

	
	Connection con = null;
	
	public FundDaoImpl (Connection con) {
		this.con = con;
	}
	
	
	@Override
	  public List<Fund> findFund(String accNumber) throws Exception  {
		  
		  List<Fund> lst = new ArrayList<>();
		  
		 Statement st = con.createStatement();
		 ResultSet result = st.executeQuery("SELECT ACC_NO , ACC_NAME , AMOUNT , IS_ACTIVE , CREATED_BY , CREATED_DT  FROM AMOUNT  WHERE ACC_NO = "+accNumber);
		 while (result.next()) {
			 
			 Fund fund = new Fund();
		
			 fund.setAccNumber(result.getLong("ACC_NO"));
			 fund.setAccName(result.getString("ACC_NAME"));
			 BigDecimal amount = new BigDecimal(result.getString("AMOUNT"));
			 fund.setAmount(amount);
			 fund.setIsActive(result.getString("IS_ACTIVE"));
			 fund.setCreatedBy(result.getString("CREATED_BY"));
			 fund.setCreatedDt(result.getDate("CREATED_DT"));
			 
			 lst.add(fund);
			
		 }
		 
		 return lst;
		 
		 
	  }
	  
	  
	 @Override
	  public void updateFund(BigDecimal amt , long accNumber) throws Exception {
		Statement st1 = con.createStatement();
		String query = "UPDATE AMOUNT SET AMOUNT = " + amt+  " WHERE ACC_NO = " + accNumber;
		System.out.println(query);
		int result1 = st1.executeUpdate(query);
			 System.out.println(result1);			
		}
		
	  }
	  
	  
	
	
	
	

