package StringConcepts;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java";
		String str1=new String("Java");
		String str2="java";
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str==str1); // compare reference, 
		System.out.println(str.equals(str1));// compare actual value

		System.out.println(str==str2);


	}

}
