package review;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingEmployeeMapAndFlatMap {

	public static void main(String[] args) {

		//transform data from lowercase to uppercase ---> Map
		//convert stream of stream into single stream ---> FlatMap
		List<Customer> customerList=SortingEmployeeMapAndFlatMap.getAll();
		
		//printing list of emails using map
		List<String> emailsList=customerList.stream().map(Customer::getEmail).collect(Collectors.toList());
		System.out.println(emailsList);
		
		//getting list of phone numbers using map()
		List<List<String>> phonesList=customerList.stream().map(Customer::getNumList).collect(Collectors.toList());
		System.out.println(phonesList);
		
		//getting list of phone numbers using flatMap()
		List<String> phonesList1=customerList.stream().flatMap(customer->customer.getNumList().stream()).collect(Collectors.toList());
		System.out.println(phonesList1);
		
		
	}

	public static List<Customer> getAll(){
		return (List<Customer>) Stream.of(new Customer(1, "cus1", "cu189@gmail.com", Arrays.asList("123","456")),
				new Customer(1, "cus2", "cu257@gmail.com", Arrays.asList("678","910"))).collect(Collectors.toList());
		
	}
}
