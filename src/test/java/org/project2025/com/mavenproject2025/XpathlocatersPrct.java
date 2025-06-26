package org.project2025.com.mavenproject2025;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class XpathlocatersPrct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.get("https://login.salesforce.com/");
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("123");
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys("22131");
		
		WebElement login= driver.findElement(By.id("Login"));
		login.click();
		//div[@id='error']
		WebElement errrotext=driver.findElement(By.xpath("//div[@id='error']"));
		String ActualErrText=errrotext.getText();
		System.out.println(ActualErrText);
		String Expectederrtext= "Error: Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		if(ActualErrText.equals(Expectederrtext)) {
			System.out.println("PASS");
			
		}else {
			System.out.println("FAILED");
		}
		driver.findElement(By.cssSelector("body.hasMotif.userTab.UserProfilePage.ext-webkit.ext-chrome.sfdcBody.brandQuaternaryBgr:nth-child(2) div.bodyDiv.brdPalette.brandPrimaryBrd:nth-child(2) table.outerNoSidebar td.noSidebarCell div.profilePage.userProfilePage:nth-child(3) div.leftContent div.contactInfo.profileSection:nth-child(4) div.vfButtonBar h3:nth-child(1) div.vfButtonBarButton div.editPen a.contactInfoLaunch.editLink > img:nth-child(1)"));
		//WebElement forgotpassword=driver.findElement(By.xpath("//a[@id='forgot_password_link']"));
		//forgotpassword.click();
//		String parentHandle = driver.getWindowHandle(); // optional, for reference
//		System.out.println("This is the parent handle: " + parentHandle);
		
//		for (String handle : driver.getWindowHandles()) {
//		    if (!handle.equals(driver.getWindowHandle())) {
//		        driver.switchTo().window(handle);
//		    }
//		}
//	
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement entertext = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='un']")));
//		entertext.sendKeys("kafka@gmail.com");
//		WebElement continuebutton =driver.findElement(By.xpath("//input[@id='continue']"));
//		continuebutton.click();
		
		
		//driver.quit();
		// Do whatever actions you want on the parent window directly
//		WebElement entertext = driver.findElement(By.id("placeholder"));
//		entertext.sendKeys("kafka@gmail.com");
		
		
//		String parenthandle=driver.getWindowHandle();
//		System.out.println(parenthandle + "This is parent Handle");
//		Set<String> getWindowHandles=driver.getWindowHandles();
//		for(String handle:getWindowHandles) {
//		if(handle.equals(parenthandle)) {
//			driver.switchTo().window(parenthandle);
//			driver.manage().window().maximize();
//			WebElement entertext=driver.findElement(By.id("placeholder"));
//			entertext.sendKeys("kafka@gmail.com");
			
		}
	
		
		
		
		
		//WebElement contact_tab= driver.findElement(By.linkText("Contacts"));
		//contact_tab.click();
		/*
		 * Chatter Tab ...locate next tab (campaigns)
		 * //li[@id='Chatter_Tab']/following-sibling::li[1]
		 * 
		 * x-path for lead Tab ,find preceding tab
		 * 
		 * //li[@id='Chatter_Tab']/following-sibling::li[2]
		 * preceding
		 * 
		 *  Important Notes:
id should be unique in the DOM — otherwise, you might select the wrong element.

If the id is on the <a> tag, but you're trying to find a sibling <li>, you’ll still need to go to its parent first:

Example:

//a[@id='Lead_Tab']/parent::li/preceding-sibling::li[1]
///
///
with preceding-sibling <a> won't work use id and tagname as li

working xpath for preceding 

//li[contains(@id,'Lead_Tab')]//preceding-sibling::li[1]
///
///
///Parent:::
/////li[contains(@id,'Lead_Tab')]//parent::ul
Child:: gives direct children of that parent ,first parent xpath then child::tagname

//ul[contains(@id,'tabBar')]//child::li
///
///
///Ancestor:::  Selects all ancestors (parents, grandparents, etc.)
///
//li[contains(@id,'Lead_Tab')]//ancestor::form
///
/////ul[contains(@id,'tabBar')]//descendant::span
///
///
///ANother example of x-path for ancestors  use form for ancestors
///
/////table[contains(@id,'bodyTable')]//ancestor::form
///
///use span for descendant - 	Selects all children, grandchildren, etc.
///============================================================================
///
///American Airlines 
///URL   https://www.aa.com/homePage.do
///To find the position and using position()
///
/////ul[contains(@role,'tablist')] -------------> parent class of the Tab
/////ul[contains(@role,'tablist')]//li ---------> To know how many children
///
/////ul[contains(@role,'tablist')]//li[position()=1] and 2 and 3 ..so on 
///
///Flight booking TabBar ---->Has two children
/////ul[contains(@role,'radiogroup')]//li[position()=1]
///Ancestor 
///
/////div[contains(@id,'bookingCheckboxContainer')]//ancestor::span  -----------> it has 4
///
///Descendant
/////div[contains(@id,'bookingCheckboxContainer')]//descendant::span --------> it has 7
///Radio button Bar::
///
/////div[contains(@id,'bookingCheckboxContainer')]/div[position()=2]
/////input[starts-with(@id,'flightSearchForm')]
///
///To see what next sibling tabbar 
///
/////div[contains(@id,'bookingCheckboxContainer')]/following-sibling::div[1]
///==============================================================================
///
///SalesForce :::
///
///To check last and Mode methods/functions
///
///  //ul[contains(@id,'tabBar')]//li ------------------> it has 10 children
///
///To check Last one 
/////ul[contains(@id,'tabBar')]//li[last()]
///
///To check one before last and so on
/////ul[contains(@id,'tabBar')]//li[last()-1]
///
///Finding odd positioned children Tabs
/////ul[contains(@id,'tabBar')]//li[position()mod 2=1]
///
///Finding Even Number children Tabs
///
/////ul[contains(@id,'tabBar')]//li[position()mod 2=0]
///
///Logic Behind This 
///
///position() gives the 1-based index of the node in its sibling list (1, 2, 3, ...).

mod is the modulo operator (i.e., remainder after division).

So:

1 mod 2 = 1 ✅ (odd)

2 mod 2 = 0 ❌ (even)

3 mod 2 = 1 ✅ (odd)

4 mod 2 = 0 ❌ (even)

if we do  position() mod 3 = 1  ,I will give 
///
///
///
		 */
		
		
		
		
		
	}


