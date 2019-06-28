package p2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import p1.Utilityclass;
import java.util.List;
import java.util.Map;

public class Case2step {
	WebDriver driver;
	@Given("User click on signin Button")
	public void user_click_on_signin_Button() {
		driver=Utilityclass.getDriver("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
	    
	}
	@When("I want to enter credantials")
		public void i_want_to_enter_credantials(io.cucumber.datatable.DataTable dataTable) 
		{
			  List<Map<String,String>> list= dataTable.asMaps(String.class,String.class);
			  for(int i=0;i<list.size();i++)
		     {
				  
				  driver.findElement(By.name("userName")).sendKeys(list.get(i).get("name"));
				  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(list.get(i).get("password"));
				  driver.findElement(By.name("Login")).click();
				  driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/a")).click();
				  WebDriverWait wait=new WebDriverWait(driver,10);
				  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a")));
				  Assert.assertEquals(driver.getTitle(), "Home");
				  System.out.println("user navigated to home page after signout");
				  driver.findElement(By.linkText("SignIn")).click();
				  System.out.println(list.get(i).get("name"));
		          System.out.println(list.get(i).get("password"));
		     }
		}

		
	    @Then("I am login succesfully")
public void i_am_login_succesfully() {
		System.out.println("users signin successfully");
  
}

	
}
