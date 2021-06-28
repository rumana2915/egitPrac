package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import page.LogInPage;
import page.SignUpPage;

public class BaseTest {
	static WebDriver driver;
	static LogInPage loginpage;
	static SignUpPage signuppage;
	
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","/Users/fatemaakter/downloads/chromedriver");
		 driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
	}
	public LogInPage getLogInPage() {
		loginpage = new LogInPage(driver);
		return loginpage;
		
	}
	public SignUpPage getSignUpPage() {
		signuppage = new SignUpPage(driver);
		return signuppage;
}
}