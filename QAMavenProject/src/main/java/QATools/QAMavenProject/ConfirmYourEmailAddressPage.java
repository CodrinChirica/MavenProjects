package QATools.QAMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmYourEmailAddressPage {

	private WebDriver driver;
	
	
	public ConfirmYourEmailAddressPage(WebDriver driver){
		this.driver = driver;
	}
	
	
	public Boolean isConfirmYourEmailAddressFormDisplayed () {
		
		try {
			driver.findElement(By.xpath(".//*[@id='confirm_center']/div"));
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		
	}
}
