package CRMProjActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

	public static void main(String[] args) {
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
		
		//Verify that homepage is open by checking whether the toolbar is displayed
		WebElement toolbar = driver.findElement(By.id("toolbar"));
		
		if (toolbar.isDisplayed())
			System.out.println("Homepage is opened");
		else
			System.out.println("Homepage is not opened");
		
		//close the browser
        driver.close();
	}

}
