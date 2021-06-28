package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InstallModel extends AccessModel{
	public InstallModel(WebDriver d) {
		super(d);
	}
	public WebElement getEmailText() {
		//Thread.sleep(2000);
		WebElement eml = driver.findElement(By.xpath("//input[@name='identifier']"));
		return eml;
     }
	 public  WebElement  getCreateAccountFormyself() {
			WebElement p = driver.findElement(By.xpath("//a[text( )='Create New Account']"));
			return p;
    } 
	 
  }