package array;

import java.util.ArrayList;

public class ArrayListConcepts {

	public static void main(String[] args) {

		ArrayList ar=new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		System.out.println(ar.size());
		ar.add(400);
		ar.add(500);
		System.out.println(ar.size());
		ar.add("Manoj");
		ar.add('A');
		System.out.println(ar.size());
		
		System.out.println(ar.get(6));
		
		
		//Generics
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(100);
		ar1.add(200);
		System.out.println(ar1);
		
		ArrayList<String> empName=new ArrayList<String>();
		empName.add("Manoj");
		empName.add("Shree");
		System.out.println(empName);
		
		ArrayList<Object> infoList=new ArrayList<Object>();
		infoList.add("Manoj");
		infoList.add(35);
		infoList.add('M');
		infoList.add(1986);
		System.out.println(infoList);

	    

	}

}
