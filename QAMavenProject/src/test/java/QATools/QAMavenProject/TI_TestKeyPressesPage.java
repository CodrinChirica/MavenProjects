package QATools.QAMavenProject;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TI_TestKeyPressesPage extends AbstractLoginTestOnIndexPage{

	@BeforeMethod
	public void goToKeyPressesPage() {
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
	}
	
	
	@Test
	public void testKeyPresses () {
		
		TI_KeyPressesPage keyPressesPage = new TI_KeyPressesPage(driver);
		String keyToPress = Keys.chord(Keys.CONTROL);
		keyPressesPage.pressKey(keyToPress);
		
		String resultKeyPressed = keyPressesPage.getKeyPressed();
		
		Assert.assertEquals(resultKeyPressed,"CONTROL");
	}
	
}