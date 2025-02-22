package com.wissen.review;

public class Employee {
	
	Integer empId;
	String  empName;
	String empPassword;
	String dept;
	double salary;
	String address;
	
	public Employee() {
		
	}

	public Employee(Integer empId, String empName, String empPassword, String dept, double d, String address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empPassword = empPassword;
		this.dept = dept;
		this.salary = d;
		this.address = address;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpPassword() {
		return empPassword;
	}

	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empPassword=" + empPassword + ", dept=" + dept
				+ ", salary=" + salary + ", address=" + address + "]";
	}
	
	

}
