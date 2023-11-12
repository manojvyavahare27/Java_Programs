package Practices;

public class DuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]= {"C", "C++", "Java", "C#", "Groovy","C#", "C++"};
		for(int i=0;i<=a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]+" is Duplicate");
				}
			}
		}
		

	}

}
