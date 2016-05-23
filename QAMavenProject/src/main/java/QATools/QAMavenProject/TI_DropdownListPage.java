package QATools.QAMavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TI_DropdownListPage {

	private WebDriver driver;
	
	private Select optionForDropdown ;
	
	public TI_DropdownListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectOptionForDropdown (String option) {
		
		optionForDropdown =  new Select(driver.findElement(By.xpath(".//*[@id='dropdown']")));
		optionForDropdown.selectByVisibleText(option);
		System.out.println(optionForDropdown.getFirstSelectedOption().getText());
	}
	
	public String getSelectedDropdownOption () {
		optionForDropdown = new Select(driver.findElement(By.xpath(".//*[@id='dropdown']")));
		return optionForDropdown.getFirstSelectedOption().getText();
	}
	
	public Boolean isDropdownListPageDipsplayed() {
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		try {
			driver.findElement(By.xpath(".//*[@id='dropdown']"));
			return true;
		} catch (Exception e) {
			System.out.println("wrong xpath");
			return false;
		}
	}
}
