package jdbc_workspace;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDept1 {

	public static void main(String[] args) {

		 Connection con = null;
	  try {
	       con = DbConnection.getDBconnection();
		Statement st = con.createStatement();
         ResultSet result = st.executeQuery("SELECT DEPT_ID , DEPT_NAME FROM DEPARTMENT");
        
         while (result.next()) {
        	 System.out.println(result.getString("DEPT_ID") + "...."+ result.getString("DEPT_NAME"));
         }
         
         
        
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
