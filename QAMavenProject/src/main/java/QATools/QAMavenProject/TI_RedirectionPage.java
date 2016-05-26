package QATools.QAMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TI_RedirectionPage {

	@SuppressWarnings("unused")
	private WebDriver driver;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='redirect']")
	private WebElement linkToAnotherPage;
	
	public TI_RedirectionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLinkToAnotherPage() {
		
		linkToAnotherPage.click();
	}
}
