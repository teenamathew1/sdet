package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JobBoardUserCreationSteps {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Given("^User is on Job Board login page$")
	public void userIsOnJobBoardLoginPage() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 20);
		
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
	}
	
	@When("^User enters username and password$")
	public void UserLogin() throws InterruptedException {
		WebElement userName = driver.findElement(By.id("user_login"));
		WebElement password = driver.findElement(By.id("user_pass"));
		WebElement loginButton = driver.findElement(By.id("wp-submit"));

		userName.sendKeys("root");
		password.sendKeys("pa$$w0rd");
		loginButton.click();
		
		Thread.sleep(600);
		
		String loginTitle = driver.getTitle();
		System.out.println("Logged In Page title is: " + loginTitle);
	}
	
	@And("^Click on Users Menu and Add New button$")
	public void clickUsersMenuAndAddNew() throws InterruptedException {
		WebElement usersMenu = driver.findElement(By.linkText("Users"));
		usersMenu.click();
		Thread.sleep(1000);	
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("page-title-action")));
		driver.findElement(By.className("page-title-action")).click();
	
		String createUserTitle = driver.getTitle();
		System.out.println("Create User Page title is: " + createUserTitle);
	}
	
	@Then("^Create the new User$")
	public void createUser() {
		driver.findElement(By.id("user_login")).sendKeys("teen");
		driver.findElement(By.id("email")).sendKeys("teen@gmail.com");
		driver.findElement(By.id("first_name")).sendKeys("teen");
		driver.findElement(By.id("last_name")).sendKeys("teen");
		driver.findElement(By.id("url")).sendKeys("www.testurl.com");
		driver.findElement(By.id("createusersub")).click();
		
		
	}
	
	@And("^Close the browser$")
	public void closeBrowser() {
		driver.close();
	}
	

}
