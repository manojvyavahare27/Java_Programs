package array;

import java.util.Arrays;

public class heighestNumberInArray {

	public static void main(String[] args) {

		
		int a[] = new int[5];
         a[0]=10;
         a[1]=20;
         a[2]=30;
         a[3]=40;
         a[4]=50;
         int max=a[0];
         System.out.println(Arrays.toString(a));
         for(int i=0;i<=a.length-1;i++)
         {
        	// System.out.println(a[i]);
        	 if(a[i]>max)
        	 {
        		 max = a[i];        		 
        	 }       	 
         }
         System.out.println("Max number is " + max);
         
	}

}
