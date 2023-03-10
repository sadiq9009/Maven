package maven_project;

import java.sql.Date;

public class Employee {

	private int employee_id;
	private String first_name;
	private String last_name;
	private String email;
	private String phone;
	private Date hire_date;
	private String job_title;
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", email=" + email + ", phone=" + phone + ", hire_date=" + hire_date + ", job_title=" + job_title
				+ ", manager_id=" + manager_id + ", getEmployee_id()=" + getEmployee_id() + ", getFirst_name()="
				+ getFirst_name() + ", getLast_name()=" + getLast_name() + ", getEmail()=" + getEmail()
				+ ", getPhone()=" + getPhone() + ", getHire_date()=" + getHire_date() + ", getJob_title()="
				+ getJob_title() + ", getManager_id()=" + getManager_id() + "]";
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getHire_date() {
		return hire_date;
	}
	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	private int manager_id;
	



	}


