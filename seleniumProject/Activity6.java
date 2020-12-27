package CRMProjActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
						
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
		
		//Locate the navigation menu and find the color of it
		WebElement activityTab = driver.findElement(By.id("grouptab_3"));
		
		
		
		//Assert.assertEquals("ACTIVITIES", activityTab.getText());
		
		
		if (activityTab.isDisplayed())
		{
			System.out.println("Activities Menu Item Exist!! The Tab name is " + activityTab.getText());
			activityTab.click();
			Thread.sleep(1000);
		}
		else
			System.out.println("Activities Menu Item does not Exist!!");
		
		//close the browser
        driver.close();

	}

}
