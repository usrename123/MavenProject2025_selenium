package org.project2025.com.mavenproject2025;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Practiceselenium2025 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\DRIVERS\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver","C:\\DRIVERS\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://selenium-prd.firebaseapp.com");
		WebElement usernameField= driver.findElement(By.id("email_field"));
		usernameField.sendKeys("admin123@gmail.com");
		WebElement passwordField= driver.findElement(By.id("password_field"));
		passwordField.sendKeys("admin123");
		Thread.sleep(3000);
		WebElement LoginButton= driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]"));
	
		LoginButton.click();
		Thread.sleep(5000);
		//Alert alert= driver.switchTo().alert();
		//String text=alert.getText();
		//Thread.sleep(2000);
		
		//alert.accept();
		
		WebElement home=driver.findElement(By.linkText("Home"));
		home.click();
		Thread.sleep(5000);
		WebElement yourname=driver.findElement(By.id("name"));
		yourname.sendKeys("Aruna Bindra");
		Thread.sleep(2000);
		WebElement fathername=driver.findElement(By.id("lname"));
		fathername.sendKeys("V.Bindra");
		Thread.sleep(2000);
		WebElement postaladdress=driver.findElement(By.id("postaladdress"));
		postaladdress.sendKeys("abcd,ca,95337,Lion st");
		Thread.sleep(2000);
		WebElement personaladdress=driver.findElement(By.xpath("//input[@id='personaladdress']"));
		personaladdress.sendKeys("xyz,ca,95337,Lion st");
		Thread.sleep(2000);
		WebElement genderfemale= driver.findElement(By.xpath("//input[@value='female']"));
		genderfemale.click();
		WebElement gendermale= driver.findElement(By.xpath("//input[@value='male']"));
		if(!gendermale.isSelected()) {
			gendermale.click();
		}
		else {
			System.out.println("female is  selected");
		};
		if(!genderfemale.isSelected()) {
			genderfemale.click();
		}
			else {System.out.println("gender selected as required");
				
			};
			System.out.println("test successful");
			driver.quit();
		}
		
		
		
		
		
		

}





