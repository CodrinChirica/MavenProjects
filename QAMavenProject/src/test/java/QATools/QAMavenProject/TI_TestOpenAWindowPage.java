package QATools.QAMavenProject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TI_TestOpenAWindowPage extends AbstractLoginTestOnIndexPage{

	
	@BeforeMethod
	public void goToOpenWindowPage() {
		driver.get("https://the-internet.herokuapp.com/windows");		
	}
	
	@Test
	public void testLinkOpenAWindow() throws IOException {
		
		TI_OpeningAWindowPage openAWindow = new TI_OpeningAWindowPage(driver);
		
		String response = "";
		URL url = new URL(openAWindow.getOpenAWindowLink().getAttribute("href"));
		System.out.println(url);
		HttpURLConnection connection = (HttpURLConnection)url.openConnection(); 
		try 
		{ 
		    connection.connect(); 
		    response = connection.getResponseMessage();	         
		    connection.disconnect(); 
   
		}
 
		catch(Exception exp) 
		{ 
			response = exp.getMessage(); 
		}  				
		System.out.print(response);
		Assert.assertEquals(response, "OK");
		
	}
}