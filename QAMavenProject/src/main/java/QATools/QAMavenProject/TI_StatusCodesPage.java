package QATools.QAMavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TI_StatusCodesPage {

	private WebDriver driver;
	
	public TI_StatusCodesPage ( WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public Boolean isStausCodesPageHeaderDisplayed() {
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		try {
			driver.findElement(By.xpath(".//div[@id='content']/*/h3"));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
}
