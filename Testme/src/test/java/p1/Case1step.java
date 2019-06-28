package p1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import p1.Utilityclass;

public class Case1step {
	
	WebDriver driver;
	
@Given("user click the signup button")
public void user_click_the_signup_button() 
{
	driver=Utilityclass.getDriver("chrome");
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	driver.findElement(By.linkText("SignUp")).click();
}

@When("registration page is displayed")
public void registration_page_is_displayed() {
System.out.println("page is displayed");
}

@And("user enter the UserName {string}")
public void user_enter_the_UserName(String string) {
	 driver.findElement(By.id("userName")).sendKeys(string);   
}

@And("enter the First Name {string}")
public void enter_the_First_Name(String string) {

	  driver.findElement(By.name("firstName")).sendKeys(string);
}

@And("Enter the Last Name{string}")
public void enter_the_Last_Name(String string) {
	 driver.findElement(By.name("lastName")).sendKeys(string);
}

@And("Enter password is {string}")
public void enter_password_is(String string) {
	 driver.findElement(By.id("password")).sendKeys(string);
    
}

@And("Again enter the Confirm password {string}")
public void again_the_Confirm_password(String string) {
	
	 driver.findElement(By.id("pass_confirmation")).sendKeys(string);
}

@And("click the Gender {string}")
public void click_the_Gender(String string) {
	driver.findElement(By.xpath("//*[@id='gender']")).click();
}

@And("enter the Email address {string}")
public void enter_the_Email_address_priya_gmail_com(String string) {
	  driver.findElement(By.id("emailAddress")).sendKeys(string);
}

@And("enter the mobile number {string}")
public void enter_the_mobile_number(String string) {
	driver.findElement(By.id("mobileNumber")).sendKeys(string);
   
}

@And("select the dateofbirth in calender {string}")
public void select_the_dateofbirth_in_calender(String string) {
	driver.findElement(By.name("dob")).sendKeys(string);
}

@And("enter the Addres {string}")
public void enter_the_Addres(String string) {
	driver.findElement(By.id("address")).sendKeys(string);
}

@And("Select the security Question combobox {string}")
public void select_the_security_Question_combobox(String string) {
	Select question = new Select(driver.findElement(By.id("securityQuestion")));
	question.selectByValue(string);
	//System.out.println(string);
}

@And("enter the security Question Answer {string}")
public void enter_the_security_Question_Answer(String string) {
	 driver.findElement(By.id("answer")).sendKeys("string");
}

@Then("click on register button")
public void click_on_register_button() {
	  driver.findElement(By.name("Submit")).click();
	  Assert.assertEquals(driver.getTitle(), "Login");
	  System.out.println("Registration succesfull");
}


}
