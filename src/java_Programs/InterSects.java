package java_Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class InterSects {

	public static String FindIntersection(String[] strArr) {
	    // code goes here  
	    String[] set1=strArr[0].split("[,]");
	  //  String set2=strArr[1].split("[,]");
	    HashSet<String> set=new HashSet<>();
	    set.addAll(Arrays.asList(set1));
	  //  set.retainAll(Arrays.asList(set2));
	    System.out.println(set);

	    return strArr[0];
	  }

	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	   // System.out.print(FindIntersection(s.nextLine())); 
	  }

}
