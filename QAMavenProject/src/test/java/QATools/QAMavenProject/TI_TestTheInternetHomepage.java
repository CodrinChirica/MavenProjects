package QATools.QAMavenProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TI_TestTheInternetHomepage extends AbstractLoginTestOnIndexPage {

	
	@Test
	public void checkLinkGoToCheckboxesPage () {
		
		TI_TheInternetHomepage theInternetHomepage = new TI_TheInternetHomepage(driver);
		theInternetHomepage.goToCheckboxesPage();
		
		TI_CheckboxesPage checkboxesPage = new TI_CheckboxesPage(driver);
		Boolean checkboxesPageDisplayed = checkboxesPage.isCheckboxesPageDipsplayed(); 
		
		Assert.assertEquals( checkboxesPageDisplayed.booleanValue(), true);
	}
	
	@Test
	public void checkLinkGoToDragAndDropPage () {
		
		TI_TheInternetHomepage theInternetHomepage = new TI_TheInternetHomepage(driver);
		theInternetHomepage.goToDragAndDropPage();
		
		TI_DragAndDropPage dragAndDropPage = new TI_DragAndDropPage(driver);
		Boolean checkboxesPageDisplayed = dragAndDropPage.isDragAndDropPageDipsplayed(); 
		
		Assert.assertEquals( checkboxesPageDisplayed.booleanValue(), true);
	}
}
