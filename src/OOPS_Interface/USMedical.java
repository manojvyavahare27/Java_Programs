package OOPS_Interface;

public interface USMedical extends WHO {
	//Default method with no body
	//Defaults are abstract
	//Can't create object of interface.
	//All abstract methods must implements
	
	public void physioService();
	public void oncologyService();
	public void pediaService();
	public void emergency();

	//After 1,8 jdk it is allowed to create static method in interface
	//Static method can't be overload
	public static void billing()
	{
		System.out.println("USMedical....Billing");
	}
	
	 default void RnD()
	{
		System.out.println("USMedical...RnD");
	}
	

}
