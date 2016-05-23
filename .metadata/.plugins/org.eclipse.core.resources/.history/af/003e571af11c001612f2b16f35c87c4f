package QATools.QAMavenProject;

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
		
		
		try {
			driver.findElement(By.xpath(".//*[@id='loginform']"));
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
}
