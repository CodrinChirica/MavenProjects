package QATools.QAMavenProject;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TI_TestNotificationMessagePage extends AbstractLoginTestOnIndexPage {

	@BeforeMethod
	public void goToNotificationMessagePage() {
		driver.get("https://the-internet.herokuapp.com/notification_message_rendered");		
	}	
	
	@Test
	public void testNotificationMessage () {
		
		TI_NotificationMessagePage notificationMessage = new TI_NotificationMessagePage(driver);
		String resultNotification = notificationMessage.getNotificationMessageString();
		Boolean resultTest = false;
		
		if ( resultNotification.equals("Action unsuccesful, please try again") || resultNotification.equals("Action successful"))
			resultTest = true;
		
		System.out.println(resultNotification);
		Assert.assertEquals(resultTest.booleanValue(), true);
	}
	
}