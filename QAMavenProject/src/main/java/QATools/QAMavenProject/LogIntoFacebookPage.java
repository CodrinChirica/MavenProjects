package QATools.QAMavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class LogIntoFacebookPage {
	// this is the page were Facebook redirects you after you introduced wrong credentials

	private WebDriver driver;
	
	public LogIntoFacebookPage(WebDriver driver) {
		// TODO Auto-generated constructor stub		
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	public Boolean isLogIntoFacebookFormDisplayed(){
		
		// wait for the page to load ( waits until element is found or time passed )
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		try {
			driver.findElement(By.xpath(".//*[@id='loginform']"));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void waitForPageToLoad () {
		
	}
}
