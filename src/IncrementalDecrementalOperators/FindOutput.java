package IncrementalDecrementalOperators;

public class FindOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b = a++ + ++a * --a - a--; 
		System.out.println(b);
		System.out.println(a);
		}
	}
