package QATools.QAMavenProject;

import java.io.IOException;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TI_TestFileDownloadPage extends AbstractLoginTestOnIndexPage {

	@BeforeMethod
	public void goToDownloadPage() {
		driver.get("https://the-internet.herokuapp.com/download");		
	}
	
	@Test
	public void testFileDownload() throws IOException {
		
		
		
	}
	
}
