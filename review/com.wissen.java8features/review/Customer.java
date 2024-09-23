package review;

import java.util.List;

public class Customer {

	Integer id;
	String name;
	String email;
	List<String> numList;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getNumList() {
		return numList;
	}
	public void setNumList(List<String> numList) {
		this.numList = numList;
	}
	public Customer(Integer id, String name, String email, List<String> numList) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.numList = numList;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", numList=" + numList + "]";
	}
	
}
