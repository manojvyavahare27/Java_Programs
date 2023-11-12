package OOPS_Encapsulation;

public class Employee {
	private String name;
	private int id1;
	private String city;
	private boolean isPerm;
	
	
	public Employee(String name, int id1, String city, boolean isPerm) {
		this.name = name;
		this.id1 = id1;
		this.city = city;
		this.isPerm = isPerm;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id1;
	}
	public void setId(int id1) {
		this.id1 = id1;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public boolean isPerm() {
		return isPerm;
	}
	public void setPerm(boolean isPerm) {
		this.isPerm = isPerm;
	}
	
	
	
	
	
	

}
