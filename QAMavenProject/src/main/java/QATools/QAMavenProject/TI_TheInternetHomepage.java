package QATools.QAMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TI_TheInternetHomepage {

	@SuppressWarnings("unused")
	private WebDriver driver;
	
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Checkboxes")
	private WebElement checkboxesPage;
	
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Drag and Drop")
	private WebElement dragAndDropPage;
	
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Dropdown")
	private WebElement dropdownListPage;
	
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "File Download")
	private WebElement fileDownloadPage;
	
	public TI_TheInternetHomepage(WebDriver driver) {
		// TODO Auto-generated constructor stub		
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	public void goToCheckboxesPage() {
		checkboxesPage.click();
	}
	

	public void goToDragAndDropPage() {
		dragAndDropPage.click();
	}
	
	public void goToDropdownListPage() {
		dropdownListPage.click();
	}
	
	public void goToFileDownloadPage() {
		fileDownloadPage.click();
	}
}
