package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Given("^User is on Google Home Page$")
	public void userIsOnGoogleHomePage() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver,15);
		
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
	}
	
	@When("^User types in Cheese and hits ENTER$")
	public void userTypesInCheeseAndHitsENTER() {
		//WebElement searchBox = driver.findElement(By.className("gsfi"));
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Cheese", Keys.RETURN);
		
	}
	
	@Then("^Show how many search results were shown$")
	public void showHowManySearchResultsWereShown() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("result-stats")));
		String resultStats = driver.findElement(By.id("result-stats")).getText();
		System.out.println("Number of results found: "+resultStats);
	}
	
	@And("^Close the browser$")
	public void closeBrowser() {
		driver.close();
	}
	
	

}
