package array;

import java.net.MulticastSocket;
import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {
		
		
		// When we don;t know the values
		int i[] = new int[10];
		 System.out.println("Length of Int Array is: " + i.length);
       i[0]=5;
       i[1]=10;
       System.out.println(Arrays.toString(i));
       
       String me[]=new String[5];
       System.out.println("Length of String Array is: " + me.length);
       me[0]="Shree";
       me[1]="Om";
       System.out.println(Arrays.toString(me));
       
       //Array Literals,  when we know the values
       int arr[]= {10,20,30,40,50,60};
       System.out.println(Arrays.toString(arr));
       System.out.println(arr.length);
       
       System.out.println("For loop");
       for(int j=0;j<arr.length;j++)
       {
    	   System.out.println(arr[j]);
       }
       
       
       System.out.println("******For each loop********");
       for(int e:arr)
       {
    	   System.out.println(e);
       }
       
       System.out.println("*******reverse array******");
       for(int k=arr.length-1;k>=0;k--)
       {
    	   System.out.println(arr[k]);
       }
       
       System.out.println("******String Litearls******");
       String str[]= {"Om","Shree","Shreyas","Shivraj"};
       System.out.println(Arrays.toString(str));
       for(int s=0;s<str.length;s++)
       {
    	   System.out.println(str[s]);
       }
       
       
	}

}
