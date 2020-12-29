package CRMProjActivities;

import java.util.List;

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

public class Activity8 {
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
		WebElement accountsInfo = driver.findElement(By.id("moduleTab_9_Accounts"));
		System.out.println("Accounts Page Title is " + accountsInfo.getText());
		accountsInfo.click();
		
		Thread.sleep(5000);
		
		//Find rowCount
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'list view table-responsive')]/tbody/tr"));
		int rowCount = rows.size();
		System.out.println("Row count = " + rowCount);
		
		//Find column count
		List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class,'list view table-responsive')]/tbody/tr[1]/td"));
		int colCount = cols.size();
		System.out.println("Column count = " + colCount);
		
		//Find and print the names of the first 5 odd-numbered rows
		List<WebElement> name = driver.findElements(By.xpath("//table[contains(@class,'list view table-responsive')]/tbody/tr/td[3]"));
		
		System.out.println("Name of first 5 odd-numbered rows are: ");
		
		for(int i=0; i<10; i=i+2) {
			String nameText = name.get(i).getText();
			System.out.println("Name: " + nameText);
		}
		
  }
  
  
  @AfterTest
	public void aftertest()
	{
		//Close the browser
      driver.close();
	}
}
