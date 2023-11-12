package Methods;

public class LoginOverloading {

	public void login(String un, String pwd)
	{
		System.out.println("Username is " + un +"  "+ "Password is" + " " + pwd);
	}
	
	public void login(String un, String pwd, int opt)
	{
		System.out.println("Username is "+ un + " " + "Password" +" " + pwd +" " + "With Otp"+ " "+ opt);
	}
	
	public void login(String un, String pwd, String email)
	{
		System.out.println("Username is "+ un + " " + "Password" +" " + pwd +" " + "Email is"+ " "+ email);
	}
	
	public static void main(String[] args) {

		LoginOverloading lo=new LoginOverloading();
		lo.login("manoj", "Manoj@123");
		lo.login("manoj", "Manoj@123",7548);
		lo.login("manoj", "Manoj@123","manoj@gmail.com");
		
	}

}
