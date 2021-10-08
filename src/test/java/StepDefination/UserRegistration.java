package StepDefination;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistration {

	WebDriver driver = null;

	@Before
	public void intiliaseBrowser() {
		String browserPath = System.getProperty("user.dir");

		String driverPath = browserPath + "\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome driver used");

	}

	@Test(priority=1)
	@Given("User wants to land on homePage")
	public void user_wants_to_land_on_home_page() throws InterruptedException {
		driver.get("https://phptravels.com/demo/");
		Thread.sleep(3000);
		System.out.println("Test case 1");
	}

	@Test(priority=2)
	@When("User Passes the userCredentials")
	public void user_passes_the_user_credentials() throws InterruptedException {

		WebElement loginBtn = driver.findElement(By.xpath("/html/body/header/div/nav/a[6]"));

		loginBtn.click();

		Thread.sleep(5000);

		String handle = driver.getWindowHandle();

		Set<String> handles = driver.getWindowHandles();

		for (String SS : handles) {

			if (!SS.equals(handle)) {
				driver.switchTo().window(SS);
				System.out.println("Window Switched");

			}
		}

		Thread.sleep(8000);

		WebElement accountBtn = driver.findElement(By.xpath("//*[@id='Secondary_Navbar-Account']"));

		accountBtn.click();

		WebElement registerBtn = driver.findElement(By.xpath("//*[@id='Secondary_Navbar-Account-Register']"));

		registerBtn.click();

		System.out.println("Test Case 2");
	}

	@Test(priority=3)
	@Then("user shoudl be able to see the landing page")
	public void user_shoudl_be_able_to_see_the_landing_page() {

		WebElement logoPresence = driver.findElement(By.xpath("//*[@id='header']/div/a/img"));

		Boolean flag = logoPresence.isDisplayed();

		Assert.assertTrue(flag);
		
		System.out.println("3rd Test Case");

	}

	@Test(priority=4)
	@And("User should be able to pass the credentials")
	public void user_should_be_able_to_pass_the_credentials() {

		WebElement userName = driver.findElement(By.xpath("//*[@name='firstname']"));
		WebElement lastName = driver.findElement(By.xpath("//*[@name='lastname']"));
		WebElement emailId = driver.findElement(By.xpath("//*[@name='email']"));
		WebElement phoneNumber = driver.findElement(By.xpath("//*[@name='phonenumber']"));

		userName.sendKeys("Cucumber");
		lastName.sendKeys("Test");
		emailId.sendKeys("test@test.com");
		phoneNumber.sendKeys("999999999");
		System.out.println("4th Test Case");

	}

	@Test(priority=5)
	@Then("User should be able to pass the credentials to complete Registration")
	public void user_should_be_able_to_pass_the_credentials_to_complete_registration(DataTable table) {

		WebElement userName = driver.findElement(By.xpath("//*[@name='firstname']"));
		WebElement lastName = driver.findElement(By.xpath("//*[@name='lastname']"));
		WebElement emailId = driver.findElement(By.xpath("//*[@name='email']"));
		WebElement phoneNumber = driver.findElement(By.xpath("//*[@name='phonenumber']"));

		// Handling DataTables

		List<List<String>> userList = table.asLists(String.class);

		for (List<String> LL : userList) {
			System.out.println(LL);

			userName.sendKeys(LL.get(0));
			lastName.sendKeys(LL.get(1));
			emailId.sendKeys(LL.get(2));
			phoneNumber.sendKeys(LL.get(3));
			System.out.println("4th Test Case");
		}
	}
	
	@Test(priority=6)
	@Then("User should be able to pass the credentials to complete Registration {string} , {string} ,{string} ,{string}")
	public void user_should_be_able_to_pass_the_credentials_to_complete_registration(String FirstName, String LastName, String Email, String Phone) {
		WebElement userName = driver.findElement(By.xpath("//*[@name='firstname']"));
		WebElement lastName = driver.findElement(By.xpath("//*[@name='lastname']"));
		WebElement emailId = driver.findElement(By.xpath("//*[@name='email']"));
		WebElement phoneNumber = driver.findElement(By.xpath("//*[@name='phonenumber']"));

		userName.sendKeys(FirstName);
		lastName.sendKeys(LastName);
		emailId.sendKeys(Email);
		phoneNumber.sendKeys(Phone);
		
		System.out.println("4th Test Case");
	}
	
	
	
	  @After 
	  public void closeApplication() { 
		  driver.quit(); 
		  }
	 
	
	
	
}
