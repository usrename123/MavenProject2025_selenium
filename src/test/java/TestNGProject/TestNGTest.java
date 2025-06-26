package TestNGProject;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTest {
	
	@BeforeSuite
	
	public void init() {
		System.out.println("Initilizes driver");
		
	}
	
	@BeforeMethod
	public void setup() {
		System.out.println("set up Project");
	}
	
	@BeforeTest
	
	public void beforeConfigCheck() {
		System.out.println("Before Test for config checks....");
	}
    
  @Test
    public void test() {
        System.out.println("This Method ..1");
    }
  
  
  @AfterMethod
	public void tearDown() {
		System.out.println("Tear Down...");
	}
  
  @AfterTest
  
  public void afterconfigcheck() {
		System.out.println("Test name is 'test'...");
	}
  
  
  
  

}
