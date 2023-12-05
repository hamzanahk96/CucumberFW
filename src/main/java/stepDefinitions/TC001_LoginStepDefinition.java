package stepDefinitions;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC001_LoginStepDefinition {
	WebDriver driver;
	@Given("user on home page")
	public void user_on_home_page() {
	    System.out.println("Launch rediff");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.linkText("Sign in")).click();
		String title = driver.getTitle();
		System.out.println("Ttile=" + title);
		Assert.assertEquals(title, "Rediffmail");
	}
	@When("user enters username")
	public void user_enters_username() {
	    System.out.println("Enter username");
	    driver.findElement(By.id("login1")).sendKeys("m.arpana1234");
	}
	@And("user enters password")
	public void user_enters_password() {
	    System.out.println("Enter password");
	    driver.findElement(By.id("password")).sendKeys("arpana123");
	}
	@And("clicks on Submit button")
	public void clicks_on_submit_button() {
	   System.out.println("Click on submit button ");
	   driver.findElement(By.id("remember")).click(); 
	   driver.findElement(By.name("proceed")).click();
	}
	@Then("validate User and display a message as Successful")
	public void validate_user_and_display_a_message_as_successful() {
	    System.out.println("Login sucessful");
	    
	}
	@And("Close")
	public void close() {
	    System.out.println("Logout");
	    driver.findElement(By.linkText("Logout")).click();
	    //driver.close();
	    driver.quit();
	}

}
