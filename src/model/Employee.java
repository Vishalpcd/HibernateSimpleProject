package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp")
public class Employee {
	@Id
	private int id;
	private String emp_name,emp_addr;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_addr() {
		return emp_addr;
	}
	public void setEmp_addr(String emp_addr) {
		this.emp_addr = emp_addr;
	}

}
