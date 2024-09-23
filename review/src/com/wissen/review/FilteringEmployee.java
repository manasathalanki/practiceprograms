package com.wissen.review;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringEmployee {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(1, "m", "ma", "1", 45000.00, "empty"));
		list.add(new Employee(1, "m", "ma", "1", 25000.00, "empty"));
		list.add(new Employee(1, "m", "ma", "1", 35000.00, "empty"));
		list.add(new Employee(1, "m", "ma", "1", 15000.00, "empty"));
		list.add(new Employee(1, "m", "ma", "1", 10000.00, "empty"));
		
		List<Employee> employeelist =list.stream().filter(e->e.getSalary()>15000.00).collect(Collectors.toList());
//		List<Employee> employeelist1 =list.stream().filter(e->e.getSalary()>15000.00)
//				.forEach(System.out::println));
		
		//9912125194
	}

}
