package maven_project;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JJ {

 private static final String url="jdbc:oracle:thin:@microcareacademydb_high?TNS_ADMIN=C://Users//DELL//Downloads//Wallet_MicrocareAcademyDB";
 private static final String Username="ADMIN";
 private static final String Password="Muzammil073#";
 
 private Connection conn;
	 static {
		 try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
		 }
		 catch(ClassNotFoundException cnfe) {
			 cnfe.printStackTrace();
			 
		 }
	 }
//	 public Employee getEmployee(int emp_id) {
//		 
//		 Employee emp = new Employee();
//		 try {
//				Statement stmt = getConnection().createStatement(); 
//				ResultSet  rs = stmt.executeQuery("select * from employees where employee_id="+emp_id);
//				while(rs.next()) {
//					emp.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
//					emp.setFirst_name(rs.getString("FIRST_NAME"));
//					emp.setLast_name(rs.getString("LAST_NAME"));
//					emp.setEmail(rs.getString("EMAIL"));
//					emp.setPhone(rs.getString("PHONE"));
//					emp.setJob_title(rs.getString("JOB_TITLE"));
//					emp.setHire_date(rs.getDate("HIRE_DATE"));
//					emp.setManager_id(rs.getInt("MANAGER_ID"));
//										
//				}
//			
//	}catch(SQLException e) {
//		e.printStackTrace();
//	}finally {
//			closeConnection();
//	}
//return emp;
//	}

public  Connection getConnection() {
	try {
        conn = DriverManager.getConnection(url, 
				Username, Password);
} catch (SQLException e) {
	e.printStackTrace();	
}
return conn;
}

public  void closeConnection() {
	try {
		conn.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
}

}
