package array;

import java.util.Arrays;

public class arrayConcepts {

	public static void main(String[] args) {

		// int
		int a[] = new int[6];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		a[5] = 60;
		
		System.out.println(Arrays.toString(a));		
		System.out.println("--------------------");
		System.out.println("Reverse array");
		for (int j = a.length - 1; j >= 0; j--) {
			System.out.println(a[j]);
		}

		// String

		String s[] = new String[4];
		s[0] = "Manoj";
		s[1] = "computer";
		s[2] = "Laptop";
		s[3] = "Core Java";
		System.out.println(Arrays.toString(s));
		System.out.println("String array lenght is:" + s.length);

		System.out.println("**********For loop Index based*******************");
		for (int i = 0; i <= s.length-1; i++) {
			System.out.println(s[i]);
		}

		System.out.println("*************For each loop****************");
		for (String str : s) {
			System.out.println(str);
			if (str.equals("computer")) {
				System.out.println("This is my computer");
				// break;
			}
		}

		System.out.println("*********Reverse Array********************");
		for (int j1 = s.length-1 ; j1 >= 0; j1--) {
			System.out.println(s[j1]);
		}

		String str1[] = new String[3];
		System.out.println(Arrays.toString(str1));
		str1[0] = "one";
		System.out.println(Arrays.toString(str1));
		
		System.out.println("*********Float Array********************");
		float num[]=new float[3];
		num[0]=11.22f;
		num[1]=25.87f;
		num[2]=100;
		for(float f:num)
		{
			System.out.println(f);
		}
		
		
		System.out.println("*********Object Array********************");
		Object empdata[]=new Object[6];
		empdata[0]="Manoj";
		empdata[1]="34";
		empdata[2]="QA";
		empdata[3]="10.5";
		empdata[4]="A";
		empdata[5]="27-10-1988";
		System.out.println(Arrays.toString(empdata));
		for(int o=0;o<empdata.length;o++)
		{
			System.out.println(empdata[o]);
		}
		System.out.println("*********for loop Array********************");
		for(int i=0;i<empdata.length;i++)
		{
			System.out.println(i +" = " + empdata[i]);
		}
		
		System.out.println("*********For each Array********************");
		int count=0;
		for(Object e:empdata)
		{
			System.out.println(count + " = " + e);
			count++;
		}
		
		
		
		
	}

}
