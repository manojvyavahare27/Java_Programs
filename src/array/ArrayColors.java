package array;

import java.util.ArrayList;

public class ArrayColors {

	public static void main(String[] args) {


		ArrayList<String> color=new ArrayList<>();
		color.add("Red");
		color.add("Black");
		color.add("Pink");
		color.add("White");
		System.out.println(color);
		color.set(1, "Yellow");   //here Set method replace the value for the given Index
		System.out.println(color);
		color.add(3,"Green");    //here add method shift the value.
		System.out.println(color);
		
		String str="Green";
		for(String c:color)
		{
			if(c.equals(str))
			{
			System.out.println(str +" "+ "Color is found");
			break;
			}		
		}		
	}
}
