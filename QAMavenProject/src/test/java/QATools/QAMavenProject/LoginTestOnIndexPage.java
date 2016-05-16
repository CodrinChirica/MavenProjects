package QATools.QAMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
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
		loginpage.logIn("cody_cody2007@yahoo.com", "pass");
		
		LogIntoFacebookPage logIntoFacebook = new LogIntoFacebookPage(driver);
//		LoginAndSignUpPage loginAndSignUpPage = new LoginAndSignUpPage(driver);
		
		Assert.assertNotEquals(driver.findElement(By.xpath(".//*[@id='loginform']")), logIntoFacebook.getLogIntoFacebookForm(driver));;
	}
	
	
	
	@BeforeSuite
	  public void beforeMethod() {		
		  
		// Create a new instance of the Firefox driver
		FirefoxProfile profile = new FirefoxProfile();
	    profile.setPreference("intl.accept_languages", "en-au");
	    driver =  new FirefoxDriver(profile);
		
	  }
	  
	  @BeforeMethod
	  public void navigateToLogin()
	  {
		//Launch the  Website
		driver.get("https://www.facebook.com");
	  }	  
	  
	  @AfterMethod
	  public void afterMethod() {
		  
		// Close the driver	  
		driver.quit();
	  }	
	
}
