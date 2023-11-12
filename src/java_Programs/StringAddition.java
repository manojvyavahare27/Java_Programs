package java_Programs;

import java.util.Scanner;

public class StringAddition {

	
	public static int sum(String a, String b)
	{
		int sum=(Integer.parseInt(a)+(Integer.parseInt(b)));
		return sum;				
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		
		int manoj=sum(a,b);
		System.out.println(manoj);
	}

}
