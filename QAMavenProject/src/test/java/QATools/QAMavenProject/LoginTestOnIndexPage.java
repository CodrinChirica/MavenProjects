package QATools.QAMavenProject;


import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestOnIndexPage extends AbstractLoginTestOnIndexPage {

	

	@Test
	public void testLoginWrongPasswd () throws InterruptedException {
		
		LoginAndSignUpPage loginpage = new LoginAndSignUpPage(driver);
		
		loginpage.logIn("nesstest@ness.com", "asd");
		
		LogIntoFacebookPage logIntoFacebook = new LogIntoFacebookPage(driver);
		Boolean result = logIntoFacebook.isLogIntoFacebookFormDisplayed();
		
		Assert.assertEquals(true, result.booleanValue());
	}
	
	
	@Test 
	public void testLoginGoodPasswd () throws InterruptedException {
		
		LoginAndSignUpPage loginpage = new LoginAndSignUpPage(driver);
			loginpage.logIn("nesstest@ness.com", "nesstest");
		
		LogIntoFacebookPage logIntoFacebook = new LogIntoFacebookPage(driver);
		Boolean result = logIntoFacebook.isLogIntoFacebookFormDisplayed();
		
		Assert.assertEquals(false, result.booleanValue());
	}
	
	
}
