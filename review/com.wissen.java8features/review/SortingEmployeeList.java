package review;

import java.util.ArrayList;
import java.util.List;

import com.wissen.review.Employee;


public class SortingEmployeeList {

	public static void main(String[] args) {
		List<Integer> stringList=new ArrayList<>();
		stringList.add(45);
		stringList.add(89);
		stringList.add(5);
		stringList.add(7);
		
		//Ascending
//		Collections.sort(stringList);
//		stringList.stream().sorted().forEach(System.out::println);
		//descending
//		Collections.reverse(stringList);
//		stringList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		List<Employee> employeelist=new ArrayList<>();
		employeelist.add(new Employee(1219, "testuser", "ggggg", "eee", 50000.00, "shanthi nagar"));
		employeelist.add(new Employee(1225, "superuser", "ttfghh", "eee", 12000.00, "colony-cmrit"));
		employeelist.add(new Employee(1204, "wuser", "ttfghh", "eee", 29000.00, "colony-beml"));
		employeelist.add(new Employee(1201, "vuser", "ttfghh", "eee", 40000.00, "brifge-colony"));
		employeelist.add(new Employee(1210, "auser", "ttfghh", "eee", 88000.00, "street-colony"));
//		Collections.sort(employeelist);
		
		//using anonymous class
//		Collections.sort(employeelist, new Comparator<Employee>() {
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return (int) (o1.getSalary()-o2.getSalary());
//			}
//		});
		
//		Collections.sort(employeelist,(o1,o2)->(int)(o1.getSalary()-o2.getSalary()));
		// using java8
//		employeelist.stream().sorted((o1,o2)->(int)(o1.getSalary()-o2.getSalary())).forEach(System.out::println);
//		employeelist.stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(System.out::println);
		
		//using java8 method reference
//		employeelist.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
//		employeelist.stream().sorted(Comparator.comparing(Employee::getEmpId)).forEach(System.out::println);
		
		
	}
	
	

}
