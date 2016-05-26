package QATools.QAMavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TI_DragAndDropPage {
	
	private WebDriver driver;
	
	@FindBy(how = How.XPATH, using = ".//div[@id='column-a']")
	private WebElement column1;	

	@FindBy(how = How.XPATH, using = ".//div[@id='column-b']")
	private WebElement column2;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='column-a']/header")
	private WebElement column1Header;	

	@FindBy(how = How.XPATH, using = ".//*[@id='column-b']/header")
	private WebElement column2Header;
	
	private String location="//div[@class='large-4 large-centered columns']";
	
	public TI_DragAndDropPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	// Method that needs correction ---------- !!!!!!
	public void moveColumnAOverColumnB() {
		WebElement elem=driver.findElement(By.xpath(location));
		Actions builder = new Actions(driver);
		builder.moveToElement(elem).build().perform();
//				.clickAndHold(column1)				 
//				.moveToElement(elem).build().perform();
				
				
				
			
//		Action dragAndDrop = builder.moveToElement(column1)
//				.clickAndHold(column1)				 
//				.moveToElement(column2).click()				 
//				.release(column1)				 
//				.build();				 
//				dragAndDrop.perform();
		
		
	}
	
	public String getColumnAHeader() {
		
		return column1Header.getText();
	}
	
	public String getColumnBHeader() {
		
		return column2Header.getText();
	}
	
	public Boolean isDragAndDropPageDipsplayed() {
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		try {
			driver.findElement(By.xpath(".//*[@id='content']"));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
