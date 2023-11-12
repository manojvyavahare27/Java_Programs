package Methods;

public class OverloadingConcepts {
	
	public void test()
	{
		System.out.println("");
	}
	public void test(int a)
	{
		System.out.println(a);
	}
	public void test(String s)
	{
		System.out.println(s);
	}

	public static void main(String[] args) {
		OverloadingConcepts o=new OverloadingConcepts();
		o.test();
		o.test(10);
		o.test("Manoj");
				

		
	}

}
