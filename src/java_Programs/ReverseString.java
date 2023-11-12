package java_Programs;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Manoj";
		int len=str.length();
		String RevStr="";
		for(int i=len-1;i>=0;i--)
		{
			RevStr=RevStr+str.charAt(i);
		}
		System.out.println(RevStr);

		StringBuffer sb=new StringBuffer(str);
		StringBuffer rev=sb.reverse();
		System.out.println(rev);
		
	}

}
