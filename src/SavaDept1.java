package jdbc_workspace;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SavaDept1 {

	public static void main(String[] args) {

		 Connection con = null;
		  try {
			  
		      con = DbConnection.getDBconnection();
			Statement st = con.createStatement();
	        int result = st.executeUpdate("INSERT INTO DEPARTMENT (DEPT_ID , DEPT_NAME) VALUES (1 , 'eee')");
	         System.out.println(result);
	        
		} catch (Exception e) {
			e.printStackTrace();
		}	
		  finally {
			  try {
				  con.close();
			  }
			  catch (Exception e ) {
				  e.printStackTrace();
			  }
			 
		  }
			
			
		
		
		
	}

}
