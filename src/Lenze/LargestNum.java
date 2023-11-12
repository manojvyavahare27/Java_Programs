package Lenze;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		int a=sc.nextInt();
		System.out.println("Enter 2nd Number:");
		int b=sc.nextInt();
		System.out.println("Enter 3rd Number:");
		int c=sc.nextInt();
		
		//int largest=a>b?a:b;
		int largest1=(a>b?a:b)>c?(a>b?a:b):c;
		System.out.println("The largest number is:"+ largest1);
		
	}

}
