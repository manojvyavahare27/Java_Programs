package array;

import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {

		int a[][]=new int[4][5];
		a[0][0]=100;
		a[0][1]=200;
		a[0][2]=300;
		a[01][0]=400;

		System.out.println(a[0][0]);
		System.out.println(a.length);
		
		int num[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		System.out.println(Arrays.toString(num));
		for(int row=0;row<num.length;row++)
		{
			for(int col=0;col<num[row].length;col++)
			{
				System.out.print(num[row][col]+" ");
			}
			System.out.println();
		}

		
	}

}
