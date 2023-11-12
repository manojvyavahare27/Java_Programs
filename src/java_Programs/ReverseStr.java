package java_Programs;

public class ReverseStr {
	public static String reverseString(String str)
	{
		if(str.equals(null))
		{
			return "Value is Null";
			//System.out.println("String is Null");
		}	
		
		String revStr="";
		int strlength=str.length();
		for(int i=strlength-1;i>=0;i--)
		{
			revStr=revStr+str.charAt(i);
		}
		System.out.println(revStr);
		return revStr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverseString("Manoj");
		
		reverseString("");

	}

}
