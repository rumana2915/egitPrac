package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.LogInModel;

  public class LogInPage extends LogInModel{
	
	public LogInPage(WebDriver d) {
		super(d);
		
	}
    public  void clickOnCreateBtn() {
	WebElement el = getCreateAccountBtn();
	el.click();
}
	
		
		
	}

	

	


