package java_Programs;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First No:");
		int a=sc.nextInt();
		System.out.println("Enter Second No:");
		int b=sc.nextInt();
		System.out.println("Enter Third No:");
		int c=sc.nextInt();
		
		//First Approch
		
		/*if(a>b&&a>c)
		{
			System.out.println(a +" is Greter Number");
		}
		else if (b>a&&b>c) {
			System.out.println(b+" is Greater Number. ");
			
		}
		else {
			System.out.println(c+" is greter Number");
		}*/
		
		//Second Approch
		
		//int largest=a>b?a:b;
		int largest1=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(largest1+" is the largest number.");
	}

}
