package array;

import java.util.ArrayList;

public class ArrayListIteration {

	public static void main(String[] args) {

       ArrayList<Integer> numList=new ArrayList<Integer>();
       numList.add(100);
       numList.add(200);
       numList.add(300);
       numList.add(400);
       numList.add(500);
       System.out.println(numList);
       
       //for loops
       for(int i=0;i<numList.size();i++)
       {
    	   System.out.println(numList.get(i));
       }
      
       
       //for each
       for(Integer a:numList)
       {
    	   System.out.println(a);
       }
       

	}

	private static char[] numList(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
