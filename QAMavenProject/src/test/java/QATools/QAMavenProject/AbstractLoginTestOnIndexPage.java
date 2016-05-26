package QATools.QAMavenProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class AbstractLoginTestOnIndexPage {

	public WebDriver driver;
	String browser = null;
	String url = null;
	
	
	@BeforeSuite
	  public void beforeSuite() {		
		  
		// Create a new instance of the Firefox driver
//		FirefoxProfile profile = new FirefoxProfile();
//	    profile.setPreference("intl.accept_languages", "en-au");
//	    driver =  new FirefoxDriver(profile);
		parseConfigFile();
		
	  }
	  
	 
	@BeforeMethod
	  public void navigateToLogin()
	  {
		
		switch (browser) {
		case "Firefox":
			FirefoxProfile profile = new FirefoxProfile();
		    profile.setPreference("intl.accept_languages", "en-au");
		    driver =  new FirefoxDriver(profile);
			break;
			
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "C:/Users/p3700650/Downloads/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
			break;

		default: throw new IllegalArgumentException("Invalid browser (Firefox, Chrome): " + browser);
		}
		
		
		if ( url.equals("https://the-internet.herokuapp.com/") || url.equals("https://www.facebook.com/") )
			driver.get(url);
		else 
			throw new IllegalArgumentException("Invalid URL (Facebook): " + url);
				
	  	}	
	
	
	private void parseConfigFile (){
		
		Properties prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream("src\\main\\resources\\config.properties");

			// load a properties file
			prop.load(input);

			// get the property value 
			browser = prop.getProperty("browser").toString();			
			url = prop.getProperty("url").toString();

		} 
		catch (IOException ex) {
			ex.printStackTrace();
		} 
		finally {
			if (input != null) {
				try {
					input.close();
				} 
				catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
	
	@AfterMethod
	public void afterEachTest() {
		driver.close();
	}

	  @AfterSuite
	  public void afterTestSuite() {
		  
		// Close the driver	  
		driver.quit();
	  }	
	
}
