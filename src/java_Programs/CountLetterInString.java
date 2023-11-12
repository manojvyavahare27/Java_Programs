package java_Programs;

public class CountLetterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I am";
		int len=str.length();
		int count=0;
		for(int i=len-1;i>=0;i--)
		{
			if(str.charAt(i)>65 || str.charAt(i)==32)
			{
				count++;
				
			}
		}
		System.out.println(count);

	}

}
