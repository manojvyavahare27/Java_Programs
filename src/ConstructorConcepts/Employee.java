package ConstructorConcepts;

public class Employee {

	String name;
	int id;
	double salary;
	
	//Constructor name is same as class name.
	//Does not have any return type.
	//Does not return any value.
	//Does not made for business logic.
	//Helping initialized the class variable.
	//Call automatically when object is created.
	
	public Employee()
	{
		System.out.println("This is Default Constructor..");
	}
	
	public Employee( String name)
	{
		this.name=name;       //this.global variable=local variable
	}
	public static void main(String[] args) {

		Employee e1=new Employee();
		
		Employee e2=new Employee("Manoj");
		System.out.println(e2.name);
	}
}
