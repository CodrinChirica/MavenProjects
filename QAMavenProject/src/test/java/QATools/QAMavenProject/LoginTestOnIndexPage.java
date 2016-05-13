package QATools.QAMavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTestOnIndexPage {

	public WebDriver driver;
	
	
	@Test
	public void testLogin () throws InterruptedException {
		
		LoginAndSignUpPage loginpage = new LoginAndSignUpPage(driver);
		loginpage.logIn("cody_cody2007@yahoo.com", "parola");
		
		Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='content']/div/div/div[1]/span")).getText(), "Conectează-te la Facebook");
		System.out.println(By.xpath(driver.findElement(By.xpath(".//*[@id='content']/div/div/div[1]/span")).getText()));
	}
	
	
	@BeforeSuite
	  public void beforeMethod() {		
		  
		// Create a new instance of the Firefox driver
	    driver = new FirefoxDriver();
		
		//Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception	 
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);				
		
	  }
	  
	  @BeforeMethod
	  public void navigateToLogin()
	  {
		//Launch the  Website
		    driver.get("https://facebook.com");
	  }	  
	  
	  @AfterMethod
	  public void afterMethod() {
		  
		// Close the driver	  
		driver.quit();
	  }	
	
}
