package CRMProjActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7 {

	public static void main(String[] args) throws InterruptedException {
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
								
		//Open the browser
		driver.get("https://alchemy.hguy.co/crm/");
								
		//Check the title of the page
		String title = driver.getTitle();
		//Print the title of the page
		System.out.println("Page title is: " + title);
						
		//Find the input field username and password and enter the login credentials
		WebElement userName = driver.findElement(By.id("user_name"));
		userName.sendKeys("admin");
						
		WebElement password = driver.findElement(By.id("username_password"));
		password.sendKeys("pa$$w0rd");
						
		//Find the login button and click
		driver.findElement(By.id("bigbutton")).click();		
		
		//Click on Sales-> Leads
		WebElement salesTab = driver.findElement(By.id("grouptab_0"));
		//Select select = new Select(driver.findElement(By.id("grouptab_0")));
		Select select =  new Select(salesTab);
		salesTab.click();
		select.selectByVisibleText("Leads");
		Thread.sleep(1000);
		
		/**
		// finding option - leads in drop down
	    WebElement leadinfo = driver.findElement(By.id("moduleTab_9_Leads"));
	    System.out.println(leadinfo.getText());
	    //finding additional information
	    WebElement additionalinfo = driver.findElement(By.xpath("//table[contains(@class,'table-responsive')]/tbody/tr[1]/td[10]/span"));
	    wait1.until(ExpectedConditions.elementToBeClickable(additionalinfo));
	     System.out.println(additionalinfo.getText());
	      //wait1.until(ExpectedConditions.visibilityOf(leadinfo));
	      additionalinfo.click();
	         Thread.sleep(1000);
		*/
	}

}
