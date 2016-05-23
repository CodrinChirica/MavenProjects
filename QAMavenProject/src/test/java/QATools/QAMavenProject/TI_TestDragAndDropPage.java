package QATools.QAMavenProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TI_TestDragAndDropPage extends AbstractLoginTestOnIndexPage{
	

	@BeforeMethod
	public void goToCheckboxesPage() {
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
	}
	
	@Test
	public void testColumnAOverB() throws IOException {
				
		TI_DragAndDropPage testColumnAOverB = new TI_DragAndDropPage(driver);
		System.out.println(testColumnAOverB.getColumnAHeader() + " / " + testColumnAOverB.getColumnBHeader());
		String resultHeader = testColumnAOverB.getColumnBHeader();

		if ( testColumnAOverB.isDragAndDropPageDipsplayed() ) {
			testColumnAOverB.moveColumnAOverColumnB();
			System.out.println(testColumnAOverB.getColumnAHeader() + " / " + testColumnAOverB.getColumnBHeader());
		}		
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Users\\p3700650\\image.png"));
		Assert.assertEquals(resultHeader,testColumnAOverB.getColumnAHeader());
	}
	
	
}