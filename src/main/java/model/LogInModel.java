package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInModel extends BaseModel {
	 
	public LogInModel(WebDriver d) {
		super(d);
	}

	
	 public  WebElement  getCreateAccountBtn() {
		WebElement p = driver.findElement(By.xpath("//a[text( )='Create New Account']"));
		return p;
	 }
	
}
