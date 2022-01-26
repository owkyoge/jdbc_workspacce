package jdbc_workspace;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class S_EmployeeServiceImpl {

	public static void main(String[] args) throws Exception {

		Connection con = null;
		try {
			con = DbConnection.getDBconnection();
			con.setAutoCommit(false);

			S_EmployeeDao employee = new S_EmployeeDaoImpl(con);
			List<S_Employee> list = employee.findS_EmployeeDao();
					
			for (S_Employee e:list) {
				
				System.out.println(e.geteID());
				System.out.println(e.geteName());
				System.out.println(e.getePhNo());
				System.out.println(e.geteVillage());
				System.out.println(e.geteMandal());
				System.out.println(e.geteDist());
				System.out.println(e.geteState());
				
			}
					
			employee.saveS_EmployeeDao();
			employee.updateS_EmployeeDao();
			employee.deleteS_EmployeeDao();

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
