package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpModel extends BaseModel {
	public SignUpModel(WebDriver d) {
		super(d);
	}
	
	public WebElement getFirstnameText() throws InterruptedException {
		Thread.sleep(2000);
		WebElement fn = driver.findElement(By.xpath("//input[@name='firstname']"));
		return fn;
	}
	public WebElement getLastnameText() {
		//Thread.sleep(2000);
		WebElement ln = driver.findElement(By.xpath("//input[@name='lastname']"));
		return ln;
	}
	public WebElement selectGender() {
		//Thread.sleep(2000);
		WebElement female = driver.findElement(By.xpath("(//input[@name=\"sex\"])[1]"));
		return female;
	
		 }
	
	public WebElement getEmailText() {
		//Thread.sleep(2000);
		WebElement eml = driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
		return eml;
}
	public WebElement getPasswordText() {
		//Thread.sleep(2000);
		WebElement pw = driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]"));
		return pw;
	}
	public WebElement selectMonth() {
		//Thread.sleep(2000);
		WebElement mn = driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
		return mn;
}
	public WebElement selectDate() {
		//Thread.sleep(2000);
		WebElement dt = driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
		return dt;
	}
	public WebElement selectYear() {
		WebElement yr = driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
		return yr;
		
	}
	
}
