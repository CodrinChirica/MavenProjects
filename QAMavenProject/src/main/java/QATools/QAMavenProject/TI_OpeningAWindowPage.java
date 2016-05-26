package QATools.QAMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TI_OpeningAWindowPage {

	
	@SuppressWarnings("unused")
	private WebDriver driver;
	
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Click Here")
	private WebElement openAWindowLink;

	public TI_OpeningAWindowPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickLinkToOpenWindow () {
		
		openAWindowLink.click();
	}
	
	public WebElement getOpenAWindowLink (){
		System.out.println(openAWindowLink);
		return openAWindowLink;
	}
}
