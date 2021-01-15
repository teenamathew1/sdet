package ProjectActivities;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;


public class GoogleTaskActivity {
	

	AppiumDriver<MobileElement> driver = null;
    WebDriverWait wait;
	
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	// Set the Desired Capabilities
      DesiredCapabilities caps = new DesiredCapabilities();
      caps.setCapability("platformName", "Android");
      caps.setCapability("noReset", true);
      // Use your own device's messaging app
      caps.setCapability("appPackage", "com.google.android.apps.tasks");
      caps.setCapability("appActivity", ".ui.TaskListsActivity");

      // Instantiate Appium Driver
      URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
      driver = new AndroidDriver<MobileElement>(appServer, caps);
      wait = new WebDriverWait(driver, 5);
	  }
  
  @Test
  public void Tasks() {
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  driver.findElementById("tasks_fab").click();
	  driver.findElementById("add_task_title").sendKeys("Complete Activity with Google Tasks");
	  driver.findElementById("add_task_done").click();
	  
	  driver.findElementById("tasks_fab").click();
	  driver.findElementById("add_task_title").sendKeys("Complete Activity with Google Keep");
	  driver.findElementById("add_task_done").click();
	  
	  driver.findElementById("tasks_fab").click();
	  driver.findElementById("add_task_title").sendKeys("Complete the second Activity Google Keep");
	  driver.findElementById("add_task_done").click();
	  
	  String task1 = driver.findElementByXPath("//android.widget.TextView[@text='Complete Activity with Google Tasks']").getText();
      Assert.assertEquals(task1, "Complete Activity with Google Tasks");
      
      String task2 = driver.findElementByXPath("//android.widget.TextView[@text='Complete Activity with Google Keep']").getText();
      Assert.assertEquals(task2, "Complete Activity with Google Keep");
      
      String task3 = driver.findElementByXPath("//android.widget.TextView[@text='Complete the second Activity Google Keep']").getText();
      Assert.assertEquals(task3, "Complete the second Activity Google Keep");
      
	  
	  
  }


  @AfterTest
  public void afterTest() {
	  driver.quit();
  }



  
}