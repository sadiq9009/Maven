package maven_project;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Emp {

	public Employee getEmployee(int emp_id) {
		 
		 Employee emp = new Employee();
		 JJ DC =new JJ();
		 
		 try {
				Statement stmt = DC.getConnection().createStatement(); 
				ResultSet  rs = stmt.executeQuery("select * from employees where employee_id="+emp_id);
				while(rs.next()) {
					emp.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
					emp.setFirst_name(rs.getString("FIRST_NAME"));
					emp.setLast_name(rs.getString("LAST_NAME"));
					emp.setEmail(rs.getString("EMAIL"));
					emp.setPhone(rs.getString("PHONE"));
					emp.setJob_title(rs.getString("JOB_TITLE"));
					emp.setHire_date(rs.getDate("HIRE_DATE"));
					emp.setManager_id(rs.getInt("MANAGER_ID"));
										
				}
			
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
			DC.closeConnection();
	}
return emp;
	}

}
