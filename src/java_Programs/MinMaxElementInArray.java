package java_Programs;

public class MinMaxElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {10,40,50,60,25};
    int max=a[0];
    for(int i=1;i<a.length;i++)
    {
    	if(max<a[i])
    	{
    		max=a[i];
    	}
    	
    }
    System.out.println("Max number is: "+ max);
    
	}

}
