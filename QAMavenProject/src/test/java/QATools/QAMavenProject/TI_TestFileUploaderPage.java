package QATools.QAMavenProject;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TI_TestFileUploaderPage extends AbstractLoginTestOnIndexPage{

	
	@BeforeMethod
	public void goToFileUploaderPage() {
		driver.get("https://the-internet.herokuapp.com/upload");
	}
		
	@Test
	public void testFileUploaderPage () {
		TI_FileUploaderPage testUploadFile = new TI_FileUploaderPage(driver);
		testUploadFile.uploadFile("C:\\temp\\img.jpg");
		
		String resultFileName = testUploadFile.getUploadedFileName();
		
		Assert.assertEquals(resultFileName, "img.jpg");
	}
}
