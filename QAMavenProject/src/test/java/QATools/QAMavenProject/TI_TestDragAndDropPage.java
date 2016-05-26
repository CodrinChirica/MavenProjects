package QATools.QAMavenProject;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TI_TestDragAndDropPage extends AbstractLoginTestOnIndexPage{
	

	@BeforeMethod
	public void goToDragAndDropPage() {
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
		
		Assert.assertEquals(resultHeader,testColumnAOverB.getColumnAHeader());
	}
	
	
}
