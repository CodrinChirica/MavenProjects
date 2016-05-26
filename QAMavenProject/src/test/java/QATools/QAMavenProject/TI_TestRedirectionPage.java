package QATools.QAMavenProject;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TI_TestRedirectionPage extends AbstractLoginTestOnIndexPage {

	
	@BeforeMethod
	public void goToRedirectionPage() {
		driver.get("https://the-internet.herokuapp.com/redirector");
		
	}
	
	
	@Test
	public void testRedirection () {
		
		TI_RedirectionPage redirectionPage = new TI_RedirectionPage(driver);
		redirectionPage.clickOnLinkToAnotherPage();
		
		TI_StatusCodesPage statusCodesPage = new TI_StatusCodesPage(driver);
		Boolean resultRedirection ;
		resultRedirection = statusCodesPage.isStausCodesPageHeaderDisplayed();
		
		Assert.assertEquals(resultRedirection.booleanValue(), true);
	}
	
}
