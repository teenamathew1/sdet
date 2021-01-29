package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostingJobSteps {	
	WebDriver driver;
	WebDriverWait wait;
	
	@Given("^Open the Alchemy Jobs site$")
	public void openJobsSite() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 20);
		
		driver.get("https://alchemy.hguy.co/jobs/");
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
	}
	
	@And("^Go to Post a Job Page$")
	public void postJobSite() {
		driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/post-a-job/']")).click();
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
	}
	
	@Then("^User fills in job details with email \"(.*)\" title \"(.*)\" location \"(.*)\" jd \"(.*)\" url \"(.*)\"$")
    public void addjobDetails(String email, String title, String location, String jd, String url) throws InterruptedException {
    	 // Insert new user details
    	driver.findElement(By.id("create_account_email")).sendKeys(email);
        driver.findElement(By.id("job_title")).sendKeys(title);
        driver.findElement(By.id("job_location")).sendKeys(location);
        driver.findElement(By.xpath("//iframe[@id='job_description_ifr']")).sendKeys(jd);
        Thread.sleep(200);
        driver.findElement(By.xpath("//input[@id='application']")).sendKeys(url);
        driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("IBM India Pvt Ltd");
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.findElement(By.name("submit_job")).click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("job_preview_submit_button")));
        driver.findElement(By.id("job_preview_submit_button")).click();
        
        WebElement result = driver.findElement(By.xpath("//h1[@class='entry-title']"));
        System.out.println(result.getText());
    }
	
	@And("^Close the Browsers$")
	public void closeBrowser() {
		driver.close();
	}
	
}
