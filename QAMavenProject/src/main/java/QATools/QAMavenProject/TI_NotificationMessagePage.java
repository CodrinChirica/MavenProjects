package QATools.QAMavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TI_NotificationMessagePage {
	
	private WebDriver driver;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='flash']")
	private WebElement notificationMessage;
	
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Click here")
	private WebElement clickHereToLoadMessageLink;
	
	public TI_NotificationMessagePage ( WebDriver driver ){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getNotificationMessageString() {
		
		clickHereToLoadMessage();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		String[] tokens = notificationMessage.getText().split("[\n]");
		return tokens[0];
	}

	public void clickHereToLoadMessage (){
		clickHereToLoadMessageLink.click();
	}
	
}