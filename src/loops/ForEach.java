package loops;

import java.util.Arrays;

public class ForEach {

	public static void main(String[] args) {

		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		//System.out.println(Arrays.toString(i));
//		for(int e:i)
//		{
//			System.out.println(e);
//			if(e==20)
//			{
//				System.out.println("Hi");
//			}
//		}
		
		String s[]=new String[4];
		s[0]="Java";
		s[1]="Net";
		s[2]="Python";
		s[3]="C++";
		//System.out.println(Arrays.toString(s));
//		for(int k=0;k<=s.length-1;k++)
//		{
//			System.out.println(s[k]);
//			if(s[k].equals("Java"))
//			{
//				System.out.println("Not using .Net");
//			}
//		}
		for(String st:s)
		{
			System.out.println(st);
			if(st.equals("Net"))
			{
				System.out.println("Not using Net");
			}
		}
	}

}
