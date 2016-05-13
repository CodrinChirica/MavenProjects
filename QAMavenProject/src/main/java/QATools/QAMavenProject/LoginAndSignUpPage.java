package QATools.QAMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginAndSignUpPage {

	private WebDriver driver;
	
	public LoginAndSignUpPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.setDriver(driver);
	}
	
	// getter 
	public WebDriver getDriver() {
		return driver;
	}
	
	// setter
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	// submit email to login on the first page 
	public void submitEmailToLogin(String emailAddress) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailAddress);
		
		// Wait for 2 Sec
		Thread.sleep(2000);

	}
	
	//public passwd to login on the first page
	public void submitPasswordToLogin(String password) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);

		// Wait for 2 Sec
		Thread.sleep(2000);		
	}
	
	// click on Log In button 
	public void clickLogInButton () throws InterruptedException {
		
		WebElement Login = driver.findElement(By.xpath(".//*[@id='u_0_y']"));
		Login.click();

		// Wait for 2 Sec
		Thread.sleep(2000);
	}
	
	// check login 
	public void logIn( String emailAddress, String password) throws InterruptedException{
		
		submitEmailToLogin(emailAddress);
		submitPasswordToLogin(password);
		
	}
	
	
}
