package Lenze;

import java.util.Scanner;

public class Palindrom {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();		
		int orgnum=num;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+(num%10);
			num=num/10;
		}
		System.out.println(rev);
		if(orgnum==rev)
		{
			System.out.println("Number is palindrom");
		}
		else
		{
			System.out.println("Number is not palindrom");
		}
}
}

