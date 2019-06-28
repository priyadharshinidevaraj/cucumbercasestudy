package p3;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import p1.Utilityclass;

public class Case3step {
	WebDriver driver;
	@Given("user enter credantials and login to home")
	public void user_enter_credantials_and_login_to_home() {
		driver=Utilityclass.getDriver("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		 driver.findElement(By.linkText("SignIn")).click();
		 driver.findElement(By.name("userName")).sendKeys("lalitha");
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password123");
		 driver.findElement(By.name("Login")).click();
	}

	@And("enter the product name in search box")
	public void enter_the_product_name_in_search_box() {
		driver.findElement(By.id("myInput")).sendKeys("Head");
		
		
	    
	}

	@Then("click on find button")
	public void click_on_find_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Assert.assertEquals(driver.getTitle(), "Search");
		System.out.println("user navigate into addto cart page");
	}


}
