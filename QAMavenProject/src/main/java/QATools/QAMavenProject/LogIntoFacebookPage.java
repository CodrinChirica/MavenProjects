package QATools.QAMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class LogIntoFacebookPage {
	// this is the page were Facebook redirects you after you introduced wrong credentials

	private WebDriver driver;
	
	public LogIntoFacebookPage(WebDriver driver) {
		// TODO Auto-generated constructor stub		
		this.setDriver(driver);
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(how = How.XPATH, using = ".//*[@id='loginform']")
	private WebElement logIntoFacebookForm;
	
	// getter 
	public WebDriver getDriver() {
		return driver;
	}
	
	// setter
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getLogIntoFacebookForm (WebDriver driver){
		return logIntoFacebookForm;
	}

}
