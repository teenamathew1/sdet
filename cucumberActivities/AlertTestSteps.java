package stepDefinitions;

import org.openqa.selenium.Alert;
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

public class AlertTestSteps {
	WebDriver driver;
	WebDriverWait wait;
	Alert alert;
	
	@Given("^User is on the page$")
	public void userIsOnThePage() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 10);
		
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
	}
	
	@When("^User clicks the Simple Alert button$")
	public void simpleAlertClick() {
		driver.findElement(By.id("simple")).click();		
	}
	
	@When("^User clicks the Confirm Alert button$")
	public void confirmAlertClick() {
		driver.findElement(By.id("confirm")).click();
	}
	
	@When("^User clicks the Prompt Alert button$")
	public void promptAlertClick() {
		driver.findElement(By.id("prompt")).click();
	}
	
	@Then("^Alert opens$")
	public void alertOpens() {
		alert = driver.switchTo().alert();
	}
	
	@And("^Read the text from it and print it$")
	public void readTheTextFromItAndPrintIt() {
		System.out.println("Alert says: " + alert.getText());
	}
	
	@And("^Write a custom message in it$")
	public void writeACustomMessageInIt() {
		alert.sendKeys("Custom Message In alert");
	}
	
	@And("^Close the alert$")
	public void closeTheAlert() {
		alert.accept();
	}
	
	@And("^Close the alert with Cancel$")
	public void closeTheAlertWithCancel() {
		alert.dismiss();
	}

	
	@And("^Close Browser$")
	public void closeBrowser() {
		driver.close();
	}

}
