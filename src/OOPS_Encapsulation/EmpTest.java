package OOPS_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {
//		Employee e=new Employee();
//		e.setName("Manoj");
//		e.getName();		
//		e.setId(10);		
//		e.setCity("Pune");
//		e.setPerm(true);
//		
//		
//		System.out.println(e.getName());
//		System.out.println(e.getCity());
//		System.out.println(e.getId());
//		System.out.println(e.isPerm());
		
		Employee e=new Employee("Manoj", 10, "Mumbai", true);
		System.out.println(e.getName());
		System.out.println(e.getCity());
		System.out.println(e.getId());
		System.out.println(e.isPerm());
		
	}
}
