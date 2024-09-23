package com.wissen.review;

import java.util.ArrayList;

public class Service implements ServiceProvider {

	String s;
	ArrayList<Employee> al = new ArrayList<>();
	Employee e;

	@Override
	public String loginEmployee(int id, String password) {
		for (int i = 0; i < al.size(); i++) {

			if (id == al.get(i).getEmpId() && password.equals(al.get(i).getEmpPassword())) {
				s = "login successfull with empid:"+al.get(i).getEmpId()+" Empname: "+al.get(i).getEmpPassword();
				break;
			} else
				s = "login failed";
		}
		return s;

	}

	@Override
	public void createEmployee(Employee e) throws EmployeeAlreadyExistsException {
		if (al.contains(e.getEmpId())) {
			throw new EmployeeAlreadyExistsException("employee already exists" + e.getEmpId());
		} else {
			al.add(e);
			System.out.println("Employee Added Successfully with id:" + e.getEmpId());
		}

	}

	@Override
	public Employee displayEmployee(int empid) {

		for(int i=0;i<al.size();i++)
		{
			if(empid==al.get(i).getEmpId())
			{
				e=al.get(i);
				break;
			}
			else
				throw new EmployeeNotFoundException("Employee with id :"+empid+" is not found");
		}
		return e;
	}

}
