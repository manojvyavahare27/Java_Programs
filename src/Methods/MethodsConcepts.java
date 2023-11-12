package Methods;

public class MethodsConcepts {

	//void: can not return any value.
	public void test()
	{
		System.out.println("Test methods");
	}
	
	//No input but return something
	public int add()
	{
		System.out.println("Addition of Numbers.");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	public int sum(int a, int b)  //Parameters
	{
		int c=a+b;
		return c;
	}
	
	public float getBill(int foodBill, int drinkBill, float tax)
	{
		System.out.println("Total Bill");
		float finalBill=foodBill+drinkBill+tax;
		return finalBill;
		
	}
	public static void main(String[] args) {
    
		MethodsConcepts obj=new MethodsConcepts();
		obj.test();
		int c=obj.add();
		
		System.out.println(c+20-10);
		
		int d= obj.sum(20, 30);   //arguments
		System.out.println(d);
		
		float bill=obj.getBill(100, 50, 0.10f);
		System.out.println(bill-20+5);
			   
	}
}
