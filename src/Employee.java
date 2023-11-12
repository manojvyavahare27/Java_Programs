
public class Employee {

	//Class : is a blueprint / template / category of the objects.
	//Objects: is a physical entity created from class/ template / category.
	
	
	
	//class variables
	String name;
	int empIdl;
	String Dept;
	boolean isActive;
	double salary;
	
	public static void main(String[] args) {

		int i=10;  //local variable
		
		
		
		Employee e1=new Employee();
		e1.name="Manoj";
		e1.empIdl=001;
		e1.Dept="QA";
		e1.isActive=true;
		e1.salary=12.11;
		System.out.println(e1.name);
		System.out.println(e1.empIdl);
		System.out.println(e1.isActive);
		System.out.println(e1.salary);
		System.out.println(i);
		
		System.out.println("-------------------");
		
		Employee e2=new Employee();
		System.out.println(e2.name);
		System.out.println(e2.empIdl);
		System.out.println(e2.isActive);
		System.out.println(e2.salary);
		
		System.out.println("********************");
		Employee e3=new Employee();
		e3=null;
		e3.name="Naveen";   //it will give NullPointerException exception object e3 is referred to null.
		System.out.println(e3.name);
		
		//No reference object.
		new Employee();
		new Employee().name="Selenium";
		new Employee().Dept="Testing";  
		
		System.gc();   //normally garbage collector called by JVM automatically 
		               //but with System.gc() we can call it forcefully. not sure it will call here.
		
		               //Objects are created in Heap and reference are created in stack always.
		               // Once garbage collector will called by JVM, Objects with no reference variables and 
		               //objects which referred to null will be deleted from heap and memory gets free. 
		
	}

}
