package array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDefineTypes {

	public static void main(String[] args) {


		//ArrayList
		ArrayList ar=new ArrayList();
		ar.add("Manoj");
		ar.add(2);
		ar.add(1986);
		ar.add('A');
		System.out.println(ar);
		
		ArrayList<Integer> numList=new ArrayList<>();
		numList.add(10);
		numList.add(20);
		numList.add(30);	
		numList.add(40);
		numList.add(50);
		System.out.println(numList);
		
		//asList
		ArrayList <String> StdList=new ArrayList<String>(Arrays.asList("Java","C#","Python"));
		System.out.println(StdList);
		StdList.add("Selenium");
		System.out.println(StdList);
		
		
				
		
	}

}
