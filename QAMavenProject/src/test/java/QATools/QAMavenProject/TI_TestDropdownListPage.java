package QATools.QAMavenProject;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TI_TestDropdownListPage extends AbstractLoginTestOnIndexPage{

	
	@BeforeMethod
	public void goToCheckboxesPage() {
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
	}
	
	@Test
	public void testDropdownListOption1() throws IOException {
				
		TI_DropdownListPage dropdownList = new TI_DropdownListPage(driver);
		if ( dropdownList.isDropdownListPageDipsplayed() ) 
			dropdownList.selectOptionForDropdown("Option 2");			
		
		Assert.assertEquals(dropdownList.getSelectedDropdownOption(), "Option 2");
	}
	
}
