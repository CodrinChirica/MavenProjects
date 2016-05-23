package QATools.QAMavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TI_CheckboxesPage {

	private WebDriver driver;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='checkboxes']/input[1]")
	private WebElement checkBox1;	

	@FindBy(how = How.XPATH, using = ".//*[@id='checkboxes']/input[2]")
	private WebElement checkBox2;
	
	
	public TI_CheckboxesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void checkTheFirstCheckbox() {
	
		checkBox1.click();		
	}

	public void checkTheSecondCheckbox() {
	
		checkBox2.click();		
	}
	
	public void checkAllCheckboxes() {
		
		if (! checkBox1.isSelected() )
			checkTheFirstCheckbox();
		if (! checkBox2.isSelected() )
			checkTheSecondCheckbox();
	}
	
	public void unCheckAllCheckboxes () {
		
		if ( checkBox1.isSelected() )
			checkTheFirstCheckbox();
		if ( checkBox2.isSelected() )
			checkTheSecondCheckbox();
	}
	
	public Boolean isCheckbox1Checked () {
		return checkBox1.isSelected();
	}
	
	public Boolean isCheckbox2Checked () {
		return checkBox2.isSelected();
	}
	
	public Boolean isCheckboxesPageDipsplayed() {
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		try {
			driver.findElement(By.xpath(".//*[@id='checkboxes']"));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
