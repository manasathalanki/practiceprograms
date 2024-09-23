package com.wissen.review;

public interface ServiceProvider {
	
	public String loginEmployee(int id,String password);
	public void createEmployee(Employee e) throws EmployeeAlreadyExistsException;
	public Employee displayEmployee(int empid);

}
