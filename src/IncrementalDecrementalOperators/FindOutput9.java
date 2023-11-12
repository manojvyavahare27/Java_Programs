package IncrementalDecrementalOperators;

public class FindOutput9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 0, n = 0;
        int p = --m * --n * n-- * m--;
        System.out.println(m);
        System.out.println(n);
        System.out.println(p);
	}
}
