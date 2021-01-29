package stepDefinitions;

import org.junit.Assert;
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

public class SearchAndApplyJobSteps {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Given("^Open the Jobs page$")
	public void openJobsPage() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 20);
		
		driver.get("https://alchemy.hguy.co/jobs/jobs/");
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
	}
	
	@When("^Search for a fulltime tester job$")
	public void jobSearch() {
		WebElement keywordText = driver.findElement(By.xpath("//*[@id=\'search_keywords\']"));
		
		//Uncheck the freelance job
		WebElement freelance = driver.findElement(By.xpath("//*[@id=\'job_type_freelance\']"));
		if(freelance.isSelected())
			freelance.click();
		
		//Uncheck the inetrnship job
		WebElement internship = driver.findElement(By.xpath("//*[@id=\'job_type_internship\']"));
		if(internship.isSelected())
			internship.click();
		
		//Uncheck the partTime job
		WebElement partTime = driver.findElement(By.xpath("//*[@id=\'job_type_part-time\']"));
		if(partTime.isSelected())
			partTime.click();
		
		//Uncheck the temporary job
		WebElement temporary = driver.findElement(By.xpath("//*[@id=\'job_type_temporary\']"));
		if(temporary.isSelected())
			temporary.click();
		
		//Check the fulltime job
		WebElement fullTime = driver.findElement(By.xpath("//*[@id=\'job_type_full-time\']"));
		if(!fullTime.isSelected())
			fullTime.click();
		
		//Enter the keyword to search for jobs
		keywordText.sendKeys("Automation Tester");
		
		//Click on Search Jobs button
		WebElement searchJobs = driver.findElement(By.xpath("//input[@type='submit']"));
		searchJobs.click();
		
	}
	
	@And("^Find the job details and print the Job title$")
	public void findJobDetails() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'Search completed')]")));
		driver.findElement(By.xpath("(//h3[text()='Automation Tester1'])[1]")).click();
		
		Thread.sleep(500);
		
		//WebElement jobTitle = driver.findElement(By.xpath("//h1[@text='Automation Tester1']"));
		WebElement jobTitle = driver.findElement(By.xpath("//h1[@class='entry-title']"));
		
		System.out.println("Title of the job is " +jobTitle.getText());
		Assert.assertEquals("Automation Tester1", jobTitle.getText());
	}
	
	@Then("^Apply for the job$")
	public void applyJob() {
		//Click on Apply job
		driver.findElement(By.xpath("//input[@value='Apply for job']")).click();
	}
	
	@And("^Close the Browser$")
	public void closeBrowser() {
		driver.close();
	}

}
