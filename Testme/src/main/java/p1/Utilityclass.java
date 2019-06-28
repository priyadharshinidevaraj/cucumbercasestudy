package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Utilityclass {
	
	 static WebDriver driver;
	public static WebDriver getDriver(String browser)
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_C2a.05.05\\Desktop\\selenium folder\\DRIVERS\\chromedriver.exe" );
			driver= new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Training_C2a.05.05\\Desktop\\selenium folder\\DRIVERS\\geckodriver.exe");
			driver= new FirefoxDriver();
			driver.get("https://www.google.com/");
		}
		else if(browser.equalsIgnoreCase("internetexplorer"))
		{
			System.setProperty("webdriver.ie.driver","C:\\Users\\Training_C2a.05.05\\Desktop\\selenium folder\\DRIVERS\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
			driver.get("https://www.google.com/");
		}
		else
			System.out.println("invalid Browser !!");
		return driver;
	}
}
