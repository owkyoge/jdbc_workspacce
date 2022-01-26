package jdbc_workspace;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class S_EmployeeDaoImpl implements S_EmployeeDao {

	Connection con;

	public S_EmployeeDaoImpl(Connection con) {
		this.con = con;
	}
@Override
	public List<S_Employee> findS_EmployeeDao() throws Exception {

	            List<S_Employee> list = new ArrayList<S_Employee>();
	
	
	
		Statement st = con.createStatement();
		ResultSet result = st.executeQuery(
				"SELECT E_ID , E_NAME , E_PHNO ,E_VILLAGE , E_MANDAL , E_DIST , E_STATE FROM S_EMPLOYEE ");
		while (result.next()) {
			S_Employee e = new S_Employee();	

			e.seteID(result.getInt("E_ID"));
			e.seteName(result.getString("E_NAME"));
			e.setePhNo(result.getString("E_PHNO"));
			e.seteVillage(result.getString("E_VILLAGE"));
			e.seteMandal(result.getString("E_MANDAL"));
			e.seteDist(result.getString("E_DIST"));
			e.seteState(result.getString("E_STATE"));
			
			list.add(e);
			
		}
		return list; 
		
		
		}
		
		

	@Override
	public int saveS_EmployeeDao() throws Exception {
		Statement st = con.createStatement();
		int result = st.executeUpdate("INSERT INTO S_EMPLOYEE (E_ID , E_NAME , E_SALARY , E_PHNO , E_VILLAGE , E_MANDAL , E_DIST , E_STATE, E_COUNTRY , E_PINCODE , E_MARRISTATUS )VALUES( 20 , 'PEDDA MADAIAH' , 84848.83 , 7893762799 , 'BEERAVOLU' ,'BANAGAPALLI', 'KADAPA' , 'AP' , 'INDIA' , 518124 , 'MARRIED')");
		System.out.println(result);
		return result;

		
		
	}
	@Override
	public int updateS_EmployeeDao() throws Exception {
		
		Statement st = con.createStatement();
		int result  = st.executeUpdate("UPDATE S_EMPLOYEE SET E_SALARY = 2222.2 WHERE E_ID = 20 ");
		System.out.println(result);
		
		
		
		return result;
	}
	@Override
	public int deleteS_EmployeeDao() throws Exception {
		Statement st = con.createStatement();
		int result  = st.executeUpdate("DELETE FROM S_EMPLOYEE WHERE E_ID = 20");
		System.out.println(result);
		return result;
	}

}
