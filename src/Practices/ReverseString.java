package Practices;

public class ReverseString {

	public static String reverseString(String str)
	{
		if(str.equals(""))
		{
			System.out.println("Please pass the string");
		}
		String revstr="";
		int strlength=str.length();
		for(int i=strlength-1;i>=0;i--)
		{
			revstr=revstr+str.charAt(i);
		}
		System.out.println(revstr);
		return revstr;
		
	}
	public static void main(String[] args) {
      reverseString("Manoj");

	}

}
