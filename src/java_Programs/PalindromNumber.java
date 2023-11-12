package java_Programs;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int org=num;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+(num%10);
			num=num/10;
		}
		System.out.println("Original numner is"+org);
		System.out.println("Reverse number is"+rev);
		if(rev==org)
		{
			System.out.println("Number is Palindrom");
		}
		else
		{
			System.out.println("Number is not Palindrom");
		}

	}

}
