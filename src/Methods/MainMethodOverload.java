package Methods;

public class MainMethodOverload {

	public static void main(String[] args) {		
		System.out.println("This is main Method.");
		MainMethodOverload.main(10);
	}
	public static void main(int a) {		
		System.out.println("This is a Method.");
	}
	public static void main(String name) {		
		System.out.println("This is name Method.");
	}
	public static void main(float s) {		
		System.out.println("This is float Method.");
	}

}
