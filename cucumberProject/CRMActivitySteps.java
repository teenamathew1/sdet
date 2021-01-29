package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CRMActivitySteps {
	  WebDriver driver1;
	    WebDriverWait wait;
	    
	    @Before ("@countDashlets or @createLeads or @meetingSchedule or @createproduct")
	    public void openBrowser(){
	        //Setup instances
	    	driver1 = new FirefoxDriver();
	        wait = new WebDriverWait(driver1, 10);
	      
	       }
	    
	    @Given("^User logs on to CRM Site page$")
	    public void crmSite() {       
	        //Navigate to
	    	  driver1.get("https://alchemy.hguy.co/crm/");
	    	  
	    WebElement username = driver1.findElement(By.id("user_name"));
	    username.sendKeys("admin");
	    WebElement password = driver1.findElement(By.id("username_password"));
	    password.sendKeys("pa$$w0rd");
	    driver1.findElement(By.xpath("//input[@id='bigbutton']")).click();;
}
	
 // Activity_1
	    
	    @When("^User counts the number of Dashlets and print them on console$")
	    public void DashletCount() throws InterruptedException {
	    	
	    	Thread.sleep(5000);
	    	
	    	List<WebElement> Dashlets = driver1.findElements(By.xpath("//div[contains(@id,'dashlet_header_')]"));
	    	  	
	    	
	    	int Count = Dashlets.size();

	    	  	System.out.println("the number of dashlets of the homepage are" + Count);
	    	
	    	for (WebElement webElement : Dashlets) {
	            String name = webElement.getText();
	            System.out.println(name);
	        }
	    }
	    @When ("^User Navigate to create Leads$")
	    public void ClickSales() {
	    	
	    	//sales tab

	    			WebElement SalesTab = driver1.findElement(By.xpath("//a[@id='grouptab_0']"));

	    			wait.until(ExpectedConditions.elementToBeClickable(SalesTab));

	    			//click on sales tab

	    			SalesTab.click();
		    }
	    
	    @And ("^Select the Leads option")
	    public void ClickLeads() throws InterruptedException {
	    	
	    	
	    	WebElement Leadsoption= driver1.findElement(By.xpath("//li/a[@id='moduleTab_9_Leads']"));
	    	wait.until(ExpectedConditions.visibilityOf(Leadsoption));
			Leadsoption.click();

			Thread.sleep(5000);
	    }
	    
	    @And ("^Clicks on Create Lead option$")
	    public void ClickCreateLead() throws InterruptedException {
	    	
	    	driver1.findElement(By.linkText("Create Lead")).click();
	    	
	    	Thread.sleep(5000);
	    }
	    
	    @And("^User enters the values\"(.*)\"and\"(.*)\"and\"(.*)\"$")
	    public void User_enters_the_values_and_(String FirstName, String LastName, String EmailID) throws Throwable {
	    	
	    	WebElement Name = driver1.findElement(By.xpath("//*[@id=\"first_name\"]"));
	    	wait.until(ExpectedConditions.elementToBeClickable(Name));
	    	Name.sendKeys(FirstName);
	    	
	    	WebElement Surname = driver1.findElement(By.xpath("//*[@id=\"last_name\"]"));
	    	wait.until(ExpectedConditions.elementToBeClickable(Surname));
	    	Surname.sendKeys(LastName);
	    	
	    	WebElement Email = driver1.findElement(By.xpath("//*[@id=\"Leads0emailAddress0\"]"));
	    	wait.until(ExpectedConditions.elementToBeClickable(Email));
	    	Email.sendKeys(EmailID);
	    	
	    }
	    
	    @And ("^Click save buton to finish$")
	    public void SaveLead() {
	    	driver1.findElement(By.id("SAVE")).click();
	    }
	    
	    @Then ("^Navigates to the View Leads Page to see results$")
	    public void NavigatePage() {
	    	
	    	driver1.findElement(By.cssSelector("li.actionmenulinks:nth-child(4) > a:nth-child(1) > div:nth-child(2)")).click();
	    }
	    @When ("^User navigates to Activities option$")
	    public void ClickActivities() {
	    	
	    	//Activities tab

	    			WebElement ActivitiesTab = driver1.findElement(By.xpath("//*[@id='grouptab_3']"));

	    			wait.until(ExpectedConditions.elementToBeClickable(ActivitiesTab));

	    			//click on activities tab

	    			ActivitiesTab.click();
	  	
	    }
	    
	    @And ("^Select the Meeting option")
	    public void ClickMeeting() throws InterruptedException {
	    	
	    	WebElement Meetingoption= driver1.findElement(By.xpath("//*[@id='moduleTab_9_Meetings']"));
	    	wait.until(ExpectedConditions.elementToBeClickable(Meetingoption));

	    	Meetingoption.click();

			Thread.sleep(5000);
	    }
	    
	    @And ("^Clicks on Schedule a Meeting option$")
	    public void ClickScheduleMeeting()  throws InterruptedException {
	    	
	    	driver1.findElement(By.linkText("Schedule Meeting")).click();
	    	
	    	Thread.sleep(5000);
	    }
	    
	    @And ("^User first enters the\"(.*)\"and add to meeting$")
	    public void AddFirstinvitee (String FirstName) throws Throwable {
	    	
	    	WebElement FirstInvitee = driver1.findElement(By.id("search_first_name"));
	    	
	    	FirstInvitee.sendKeys(FirstName);
	    	
	    	Thread.sleep(3000);
	    	
	    	driver1.findElement(By.id("invitees_search")).click();
	    	
	    	Thread.sleep(3000);
	    	
	    	driver1.findElement(By.id("invitees_add_1")).click();
	    	
	    }
	    
	    @And ("^User second enters the\"(.*)\"and add to meeting$")
	    public void AddSecondinvitee(String SecondName) throws Throwable {
	    	
	    	WebElement SecondInvitee = driver1.findElement(By.id("search_first_name"));
	    	
	    	SecondInvitee.clear();
	    	
	    	SecondInvitee.sendKeys(SecondName);
	    	
	    	driver1.findElement(By.id("invitees_search")).click();
	    	
	    	Thread.sleep(3000);
	    	
	    	driver1.findElement(By.id("invitees_add_1")).click();
	    	
	    }
	  
	    @And ("^User third enters the\"(.*)\"and add to meeting$")
	    public void AddThirdinvitee(String ThirdName) throws Throwable {
	    	
	    	WebElement ThirdInvitee = driver1.findElement(By.id("search_first_name"));
	    	
	    	ThirdInvitee.clear();
	    	
	    	ThirdInvitee.sendKeys(ThirdName);
	    	driver1.findElement(By.id("invitees_search")).click();
	    	
	    	Thread.sleep(3000);
	    	
	    	driver1.findElement(By.id("invitees_add_1")).click();
	    	
	    }
	    
	    @And ("^Enter other details to Save the Meeting$")
	    public void ScheduleMeeting() throws InterruptedException {
	    	
	    	driver1.findElement(By.id("name")).sendKeys("Meeting to Discuss Business");
	    	driver1.findElement(By.id("date_start_date")).sendKeys("01/22/2021");
	    	driver1.findElement(By.id("date_start_hours")).sendKeys("09");
	    	driver1.findElement(By.id("date_start_minutes")).sendKeys("45");
	    	driver1.findElement(By.id("date_end_date")).sendKeys("01/22/2021");
	    	driver1.findElement(By.id("date_end_hours")).sendKeys("12");
	    	driver1.findElement(By.id("date_end_minutes")).sendKeys("45");
	    	driver1.findElement(By.id("SAVE_HEADER")).click();
	    	
	    	Thread.sleep(5000);
	    }
	    
	    @Then ("^Navigates to the View Meetings Page$")
	    public void ClickViewMeeting() throws InterruptedException {
	    	
	    	driver1.findElement(By.linkText("View Meetings")).click();
	    	
	    	Thread.sleep(3000);
	    }
	    
	    @And ("^confirm the meeting")
	    public void ValidateMeeting()  {
	    	
	    	if(driver1.findElement(By.linkText("Meeting to Discuss Business")).isDisplayed())
	    		
	    	{
	    		System.out.println("The Meeting is scheduled successfully");
	    		
	    	}
	    	
	    	else
	    	{
	    		System.out.println("The meeting could not be scheduled");
	    	}
	    }
	    
	    // Option "ALL" is selected
	    @When ("^User navigates to All option$")
	    public void ClickAll() {
	    	
	    	//All tab

	    			WebElement AllTab = driver1.findElement(By.className("grouptab"));
	    			System.out.println("All tab selected"+ AllTab);

	    			wait.until(ExpectedConditions.elementToBeClickable(AllTab));

	    			//click on All tab

	    			AllTab.click();

	    	
	    }
	    
	   @And ("^Select the Product option$")
	   public void ClickProduct() throws InterruptedException {
		   
			//WebElement Productoption= driver1.findElement(By.linkText("Products"));
		   WebElement Productoption= driver1.findElement(By.id("moduleTab_9_Products"));
		   
			Productoption.click();

			Thread.sleep(1000);
	   }
	    
	   
	   @When ("^Clicks on Create Product option$")
	   public void ClickCreateProduct() throws InterruptedException {
		   
		   driver1.findElement(By.linkText("Create Product")).click();
	   	
	   	   Thread.sleep(5000);
	   }
	   
	   @And ("^User  enters product name as\"(.*)\"$")
	   public void User_enters_product_name_as_(String ProductName) {
		   
		   driver1.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(ProductName);
		   
	   }
	   
	   @And ("^Enter other details as\"(.*)\"to Save the Product$")
	   public void Enter_other_details_as_to_Save_the_Product_(String Price) throws InterruptedException {
		   
		   driver1.findElement(By.xpath("//*[@id=\"price\"]")).sendKeys(Price);
		   driver1.findElement(By.xpath("//*[@id=\"SAVE\"]")).click();
		   
		   Thread.sleep(5000);
		      
	   }
	   
	   @Then ("^Navigates to the View Products Page$")
	   public void validate () {
		   
		   driver1.findElement(By.linkText("View Products")).click();
		   
	   }
	    	
	    @And("^Close the browser for CRM activity$")
	        public void closeBrowserCRM() {
	            //Close browser
	    	     driver1.quit();
	   	        }
}