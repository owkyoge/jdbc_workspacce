package jdbc_workspace;

import java.util.List;

public interface S_EmployeeDao {

	public abstract List<S_Employee> findS_EmployeeDao() throws Exception;
	
	public abstract int saveS_EmployeeDao() throws Exception;
    
	public abstract int updateS_EmployeeDao() throws Exception;
	
	public abstract int deleteS_EmployeeDao() throws Exception; 
	
	
}
