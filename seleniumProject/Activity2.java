package CRMProjActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
		
		//Open the browser
		driver.get("https://alchemy.hguy.co/crm/");
		
		//Check the title of the page
        String title = driver.getTitle();
        //Print the title of the page
        System.out.println("Page title is: " + title);
        
        WebElement headerImage =driver.findElement(By.linkText("SuiteCRM"));
        System.out.println("The URL of the header image is: "+headerImage.getAttribute("href"));
        //System.out.println("The URL of the header image is: http://www.suitecrm.com");
        
        //close the browser
        driver.close();
	}

}
