package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FoundationModel extends AccessModel {

	public FoundationModel(WebDriver d) {
		super(d);
	
}
	 public  WebElement  getSigninBtn() {
			WebElement p = driver.findElement(By.xpath("//a[text( )='Sign in']"));
			return p;
		 }
}