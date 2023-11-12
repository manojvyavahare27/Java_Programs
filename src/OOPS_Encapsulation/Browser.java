package OOPS_Encapsulation;

public class Browser {
	public void launchBrowser()
	{
		cpuUtilsation();
		checkRAM();
		upgradeBrowser();
		checkVersion();
		System.out.println("Browser is launching");
	}
	private void cpuUtilsation()
	{
		System.out.println("Check CPU Utilisation");		
	}
	private void checkRAM()
	{
		System.out.println("Checking RAM");
	}
	private void upgradeBrowser()
	{
		System.out.println("Checking Upgrade");
	}
	private void checkVersion()
	{
		System.out.println("Check Version");
	}

}
