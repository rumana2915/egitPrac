package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import page.FoundationPage;
import page.InstallPage;

    public class AccessTest {
	static WebDriver driver;
	static FoundationPage foundationpage;
	static InstallPage installpage;
	
    @BeforeTest
	    public void setUp() {
		System.setProperty("webdriver.chrome.driver","/Users/fatemaakter/downloads/chromedriver");
		 driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
	}
    }
