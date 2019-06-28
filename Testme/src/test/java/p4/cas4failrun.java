package p4;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import p1.Utilityclass;

public class cas4failrun {
	WebDriver driver;
	@Given("Alex has registered in TestmeApp")
	public void alex_has_registered_in_TestmeApp() {
		driver=Utilityclass.getDriver("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
		 driver.findElement(By.name("userName")).sendKeys("lalitha");
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password123");
		 driver.findElement(By.name("Login")).click();
		
	   
	}

	@When("Alex search a particular product like Headphone")
	public void alex_search_a_particuklar_product_like_Headphone() {
		driver.findElement(By.id("myInput")).sendKeys("Head");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	}

	@And("Try to proceed payment without adding any item in the cart")
	public void try_to_proceed_payment_without_adding_any_item_in_the_cart() {
		 Assert.assertEquals( driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).getText(),
				  "Cart "+ driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]/b")).getText()+"   ");
		  System.out.println(driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).getText());
		  System.out.println( "Cart "+ driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]/b")).getText()+"   ");
		    
	    
	}

	@Then("Testme app doesn't display in the cart icon")
	public void testme_app_doesn_t_display_in_the_cart_icon() {
		
		driver.close();
	}
	@Given("user signin  TestmeApp")
	public void user_signin_TestmeApp() {
		driver=Utilityclass.getDriver("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
		 driver.findElement(By.name("userName")).sendKeys("lalitha");
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password123");
		 driver.findElement(By.name("Login")).click();
	}

	@When("user search product headphone")
	public void user_search_product_headphone() {
		driver.findElement(By.id("myInput")).sendKeys("Head");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	   
	}

	@When("user see the carticon page")
	public void user_see_the_carticon_page() {
		Assert.assertEquals( driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).getText(),
				  "Cart "+ driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]/b")).getText()+"   ");
		  System.out.println(driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).getText());
		  System.out.println( "Cart "+ driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]/b")).getText()+"   ");
		    
		
		driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]/b")).click();
		
	}

	@When("Conform the purchase details and click checkout")
	public void conform_the_purchase_details_and_click_checkout() {
		
		    
		 
		driver.findElement(By.xpath("//*[@id='cart']/tfoot/tr[2]/td[5]/a")).click();
		 
		driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();

	   
	}

	@When("proceed payment")
	public void proceed_payment() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h3")));
		 
		driver.findElement(By.xpath("//*[@id='swit']/div[1]/div/label")).click();
		 
		driver.findElement(By.id("btn")).click();
		 
		driver.findElement(By.name("username")).sendKeys("123456");
		 
		driver.findElement(By.name("password")).sendKeys("Pass@456");
		 
		driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/div/div[3]/input")).click();
		 
		WebDriverWait waitt = new WebDriverWait(driver, 10);
		 
		waitt.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h4")));
		 
		driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
		 
		driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/div/div[2]/input")).click();
		 
		

	   
	}

	@Then("purchase the product")
	public void purchase_the_product() {
		Assert.assertEquals(driver.getTitle(), "Order Details");
         System.out.println("order purchased successfully");
		
	   
	}


}
