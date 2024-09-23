package com.wissen.review;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws EmployeeAlreadyExistsException {

		System.out.println("Enter the input:create/display");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		Scanner sc = new Scanner(System.in);
		ServiceProvider provider = new Service();
		switch (input) {

		case "create": {
			System.out.println("Enter the Employee  Details:");

			System.out.println("Enter Employee id");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Employee name");
			String name = sc.nextLine();
			System.out.println("Enter Employee password");
			String pass = sc.nextLine();
			System.out.println("Enter Employee dept");
			String dept = sc.nextLine();
			System.out.println("Enter Employee salary");
			float sal = sc.nextFloat();
			sc.nextLine();
			System.out.println("Enter Employee location");
			String location = sc.nextLine();

			System.out.println("Created the Employee");

			provider.createEmployee(new Employee(id, name, pass, dept, sal, location));

			System.out.println("logging of the employee");
			int i = sc.nextInt();
			sc.nextLine();
			String password = sc.nextLine();

			String msg = provider.loginEmployee(i, password);
			System.out.println(msg);

			break;
		}
		case "display": {
			System.out.println("Display the Employee Details");
			System.out.println("Enter employee id");
			int dis = sc.nextInt();
			Employee emp = provider.displayEmployee(dis);
			System.out.println(emp);
			break;
		}
		default:
			System.out.println("invalid input");

		}

	}

}
