package org.project2025.com.mavenproject2025;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import mavenproject.util.MavenWaitUtil;

public class SeleniumWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver","C:\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("execution started");

     
     
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		WebElement practicetab = driver.findElement(By.xpath("//li[@class='parent'][3]"));

		Actions action = new Actions(driver);
		action.moveToElement(practicetab).build().perform();

		MavenWaitUtil.WaitTobeVisible(practicetab, driver);
		WebElement windowhandleTab = driver.findElement(By.linkText("Window Handles"));
		windowhandleTab.click();

		String parenthandle = driver.getWindowHandle(); // getting the handle id of the first window
		System.out.println(parenthandle + "This is parent handle ID");
		WebElement opennewwinTab = driver.findElement(By.xpath("//button[contains(@id,'newWindowBtn')]"));
		opennewwinTab.click();

		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			System.out.println(handle);

			if (!handle.equals(parenthandle)) {
				driver.switchTo().window(handle);

				driver.manage().window().maximize();
				WebElement firstname = driver.findElement(By.id("firstName"));
				firstname.sendKeys("Somer Mats");

				driver.switchTo().window(parenthandle);
				WebElement box = driver.findElement(By.id("name"));
				box.sendKeys("switched back to parent window");

				System.out.println("switched back");

				 driver.quit();
			}
			
			//Sample window handle code
			
//			public void crossEditProfilepage(WebDriver driver) {
//		    String parentWindow = driver.getWindowHandle();
//		    Set<String> allWindows = driver.getWindowHandles();
	//
//		    for (String handle : allWindows) {
//		        if (!parentWindow.equals(handle)) {
//		            driver.switchTo().window(handle);
//		            driver.close();  
//		            System.out.println("Closing child window: " + handle);
//		        }
//		    }
	//
//		    // Switch back to parent after closing others
//		    driver.switchTo().window(parentWindow);
//		    System.out.println("Switched back to parent window: " + parentWindow);
//		}
	//	

		}

	}
}
