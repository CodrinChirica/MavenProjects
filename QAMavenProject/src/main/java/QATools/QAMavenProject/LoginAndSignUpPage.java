package QATools.QAMavenProject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginAndSignUpPage {

	@SuppressWarnings("unused")
	private WebDriver driver;

	
//	 elements for Log In form

	@FindBy(how = How.XPATH, using = ".//*[@id='email']")
	private WebElement emailFieldToLogin;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='pass']")
	private WebElement passwordFieldToLogin;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='loginbutton']")
	private WebElement loginButton;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='reg_box']")
	private WebElement registerBoxOnIndexPage;

//	 ----end elements for Log In form
	
	
	// elements for Sign Up Form 

	@FindBy(how = How.XPATH, using = ".//div[contains(@class, 'placeholder') and text()='First name']")
	private WebElement firstNameForSignUpField;
	
	@FindBy(how = How.XPATH, using = ".//div[contains(@class, 'placeholder') and text()='Last name']")
	private WebElement lastNameForSignUpField;
	
	@FindBy(how = How.XPATH, using = ".//div[contains(@class, 'placeholder') and text()='Mobile number or email']")
	private WebElement emailForSignUpField;
	
	@FindBy(how = How.XPATH, using = ".//div[contains(@class, 'placeholder') and text()='Re-enter mobile number or email']")
	private WebElement re_enterEmailForSignUpField;
	
	@FindBy(how = How.XPATH, using = ".//div[contains(@class, 'placeholder') and text()='New password']")
	private WebElement passwordForSignUpField;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='month']")
	private Select monthBirthdayDropdown;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='day']")
	private Select dayBirthdayDropdown;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='year']")
	private Select yearBirthdayDropdown;
	
	@FindBy(how = How.XPATH, using = ".//input[@type='radio'][following-sibling::*/text()='Male']")
	private WebElement genderMaleRadioButton;
	
	@FindBy(how = How.XPATH, using = ".//input[@type='radio'][following-sibling::*/text()='Female']")
	private WebElement genderFemaleRadioButton;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='reg_form_box']//button[@type='submit']")
	private WebElement signUpButton;
	
	// --- end elements for Sign Up Form
	
	

	// elements that proves tests failed
	@FindBy(how = How.XPATH, using = ".//div[contains(@class, 'uiContextualLayer uiContextualLayerLeft') and text()='What’s your name?']")  
	private WebElement errorWarningFirstNameForSignUpField;
	
	// ---- end elements list
	
	
	public LoginAndSignUpPage(WebDriver driver) {
		// TODO Auto-generated constructor stub		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// --------------------------------------- Begin Sign In Tests --------------------------------------
	
	
	// submit email to login on the first page 
	public void inputEmailToLogin(String emailAddress) throws InterruptedException {
		emailFieldToLogin.sendKeys(emailAddress);
	
	}
	
	//public passwd to login on the first page
	public void inputPasswordToLogin(String password) throws InterruptedException {
		passwordFieldToLogin.sendKeys(password);
	}
	
	// click on Log In button 
	public void clickLogInButton () throws InterruptedException {
		
//		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		loginButton.click();

	}
	
	// check login 
	public void logIn( String emailAddress, String password) throws InterruptedException{
		
		inputEmailToLogin(emailAddress);
		inputPasswordToLogin(password);
		clickLogInButton();
		
	}
	
	// --------------------------------------- Begin Sign Up Tests --------------------------------------
	
	public void inputFirstNameOnSignUp( String firstName){
		
		firstNameForSignUpField.sendKeys(firstName);
	}
	
	public void inputLastNameOnSignUp ( String lastName){
		lastNameForSignUpField.sendKeys(lastName);
	}
	
	public void inputEmailOnSignUp ( String email){
		emailForSignUpField.sendKeys(email);
	}	

	public void re_inputEmailOnSignUp ( String re_email){
		re_enterEmailForSignUpField.sendKeys(re_email);
	}
	

	public void inputPasswordOnSignUp ( String password){
		passwordForSignUpField.sendKeys(password);
	}
	
	public void selectMonthForBirthday (String month) {
		
//		System.out.println("\"" + month + "\"");
//		monthBirthdayDropdown.selectByVisibleText(month );
	}
	
	public void selectDayForBirthday (String day) {
		
//		dayBirthdayDropdown.selectByVisibleText("\"" +day+ "\"");
	}

	public void selectYearForBirthday (String year) {
	
//		System.out.println("\"" +year+ "\"");
//		yearBirthdayDropdown.selectByVisibleText("\"" +year+ "\"");
	}
	
	public void clickGenderMaleButtonForSignUp () {
		genderMaleRadioButton.click();
	}
	
	public void clickGenderFemaleButtonForSignUp () {
		genderFemaleRadioButton.click();
	}

	public void clickSignUpButtonForSignUp () {
		signUpButton.click();
	}
	
	public void signUp ( String firstName, String lastName, String email, String re_email, String password, String month, String day, String year, String gender) {
		
		inputFirstNameOnSignUp(firstName);
		inputLastNameOnSignUp(lastName);
		inputEmailOnSignUp(email);
		re_inputEmailOnSignUp(re_email);
		inputPasswordOnSignUp(password);
		selectMonthForBirthday(month);
		selectDayForBirthday(day);
		selectYearForBirthday(year);
		
		switch (gender) {
        case "Male":
            clickGenderMaleButtonForSignUp();
            break;
        case "Female":
            clickGenderFemaleButtonForSignUp();
            break;
        default:
            throw new IllegalArgumentException("Invalid gender: " + gender + " ! Must be (Male / Female)");            
		}
		
		
		clickSignUpButtonForSignUp();
	}
	
	public WebElement getRegisterBox (WebDriver driver){
		return registerBoxOnIndexPage;
	}
	
	
	public WebElement returnErrorWarningFirstNameForSignUpField(){
		
		try {
			return errorWarningFirstNameForSignUpField;		
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
}


