package Methods;

public class Browser {
	
	public boolean launchBrowser(String browserName)
	{
		boolean flag=true;
		
		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			System.out.println("chrome launch");
			break;
		case "firefox":
			System.out.println("firefox launch");
			break;
		case "edge":
			System.out.println("edge launch");
			break;
		case "safari":
			System.out.println("safari launch");
			break;

		default:
			System.out.println("Please pass correct browser name.");
			flag=false;
			break;
		}
		return flag;
	}

	public static void main(String[] args) {
		
	 Browser br=new Browser();
	 boolean flag = br.launchBrowser(" Chrome ");  //call by value
	 if(flag)
	 {
		 System.out.println("Enter url");
	 }
	 else
	 {
		 System.out.println("Something wrong.");
	 }

	}

}
