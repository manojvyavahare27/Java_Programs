package Practices;

import java.util.Scanner;

public class FiboniccieSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc =new Scanner(System.in);
		
		int n1=0, n2=1;
		int sum=0;
		for(int i=2;i<=10;i++)
		{
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.print(sum+ " ");
		}
		//System.out.println();

	}

}
