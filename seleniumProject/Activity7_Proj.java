package CRMProjActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Activity7_Proj {
	WebDriver driver;
    
    @BeforeTest
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();		
        
        //Open browser
        driver.get("https://alchemy.hguy.co/crm/");
    }
    
   
	@Test
    public void testmain() throws InterruptedException
    {
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
    			WebElement navigationbar = driver.findElement(By.id("grouptab_0"));
    			String testSales = navigationbar.getText();
    			Assert.assertEquals(testSales, "SALES");
    			
    			System.out.println("New page title is: " +testSales);
    			//Wait
    			WebDriverWait wait1 = new WebDriverWait(driver, 50);
    			wait1.until(ExpectedConditions.visibilityOf(navigationbar));
    			
    			//SALES is selected
    			Actions action = new Actions(driver);
    			action.moveToElement(navigationbar).click().build().perform();
    			
    			//Finding Leads in dropdown
    			WebElement leadInfo = driver.findElement(By.id("moduleTab_9_Leads"));
    			System.out.println(" Leads Page Title is " + leadInfo.getText());
    			leadInfo.click();
    			
    			Thread.sleep(800);
    			
    			//Finding additional Information in the first row
    			WebElement additionalinfo = driver.findElement(By.xpath("//table[contains(@class,'table-responsive')]/tbody/tr[2]/td[10]/span/span[contains(@title,'Additional')]"));
    			Actions action1 = new Actions(driver);
    			action1.moveToElement(additionalinfo).click().build().perform();
    			
    			System.out.println(additionalinfo.getText());
    			Thread.sleep(1000);
    			
    			//Finding Phone number from popup
    			WebElement phone = driver.findElement(By.xpath("//div[2]/span[@class='phone']"));
    			String phoneNumber = phone.getText();
    			System.out.println("Phone Number is " + phoneNumber);
    			
    }
	
	@AfterTest
	public void aftertest()
	{
		//Close the browser
        driver.quit();
	}
  
}
