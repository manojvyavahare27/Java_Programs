package OOPS_Inheritance;

public class CarTest {

	public static void main(String[] args) {

		Bmw b=new Bmw();
		b.start();
		b.stop();
		b.refule();
		b.autoParking();
		b.engine();
		
		System.out.println("---------------------------");
		Audi a=new Audi();
		a.Autostart();    // Individual Method
		a.refule();       // Overridden method
		a.engine();       // Overridden method
		a.stop();         // Inherited method
		
		//Top Casting or Up Casting
		//In Top Casting we can create Reference variable of parent class who is pointing to child class objects.
		//Parent class reference variable can access all inherited and override method from child class.
		//Individual methods of child class can not be called by parent class reference variable.
		
		System.out.println("---------------------------");
		Car c=new Bmw();
		c.start();
		c.stop();
		c.refule();
		c.engine();
		//c.autoParking();  individual method can not be access by parent class reference variable.
		System.out.println("---------------------------");
		Car c1=new Audi();
		c1.start();
		//c1.autoStart();  individual method can not be access by parent class reference variable.
	}

}
