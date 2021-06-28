package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import model.SignUpModel;

public class SignUpPage extends SignUpModel{
	public SignUpPage(WebDriver d){
		super(d);
	}
	
	  WebElement p;
	  
	  public void typeFirstName(String firstname)  throws InterruptedException{
		  
		  p = getFirstnameText();
		  p.sendKeys(firstname);
	  }
	  public void typeLaseNameText(String lastname) throws InterruptedException{
		  
		  p = getLastnameText();
		  p.sendKeys(lastname);
	  }

	  public void typePhoneNumber(String phone) throws InterruptedException{
		  p = getEmailText();
		  p.sendKeys(phone);
	  }
	  public void typePassword(String pass) throws InterruptedException{
		   p = getPasswordText();
		   p.sendKeys(pass);
	  }   
	  public void selectBirthdayMonth(String mon) throws InterruptedException{
		   p = selectMonth();
		   Select month = new Select(p);
           month.selectByVisibleText(mon);

       }
	  public void selectBirthdayDay(String dy) throws InterruptedException{
		   p = selectDate();
		   Select day = new Select(p);
           day.selectByVisibleText(dy);

       }
	  public void selectBirthdayYear(String yr) throws InterruptedException{
		   p = selectYear();
		   Select year = new Select(p);
          year.selectByVisibleText(yr);
          
	  
    }
	
	public void clickOnFemale()throws InterruptedException{
		  p = selectGender();
		  p.click();
	  }
	  
	
	}
