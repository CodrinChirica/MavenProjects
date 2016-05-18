package QATools.QAMavenProject;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


public class SignUpTestOnIndexPage {

	public WebDriver driver;
	
	
//	@Test
//	public void testSignUp () throws InterruptedException, IOException {
//		
//		LoginAndSignUpPage logInAndSignUp = new LoginAndSignUpPage(driver);
//		logInAndSignUp.signUp("Andrei1234", "Ionel", "andreiionel@yahoo.com", "andreiionel@yahoo.com", "asdasdsa", "May", "9", "1994", "Male");
//		
////		ConfirmYourEmailAddressPage confirmForm = new ConfirmYourEmailAddressPage(driver);
//		
//		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(scrFile, new File("C:\\Users\\p3700650\\image.png"));
//		
//		Assert.assertNotEquals(driver.findElement(By.xpath(".//*[@id='reg_box']")), logInAndSignUp.getRegisterBox(driver));
//		
//	}
	
	@Test
	public void testFirstName () throws InterruptedException, IOException {
		LoginAndSignUpPage logInAndSignUp = new LoginAndSignUpPage(driver);
		logInAndSignUp.inputFirstNameOnSignUp("asdasd");
		logInAndSignUp.clickSignUpButtonForSignUp();
		
		// take screenshot 
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Users\\p3700650\\image.png"));
		
		Assert.assertEquals(logInAndSignUp.returnErrorWarningFirstNameForSignUpField(), null);
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
