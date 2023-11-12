package java_Programs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int rem, arm = 0;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Enter the Number:");
		int origin = num;
		while (num > 0) {
			rem = num % 10;
			arm = ((rem * rem * rem) + arm);
			num = num / 10;
		}
		if (origin == num) {
			System.out.println("Number is armstrong");
		}
	}

}
