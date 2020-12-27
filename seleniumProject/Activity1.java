package CRMProjActivities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm/");
		
		//Check the title of the page
        String title = driver.getTitle();
        //Print the title of the page
        System.out.println("Page title is: " + title);
        
		if(title.equals("SuiteCRM"))
		{
			System.out.println("The titele matches ");
			driver.close();
		}else
			System.out.println("The titele does not match!! ");

	}

}
