package test;


import org.testng.annotations.Test;

    public class SignUpTestPage extends BaseTest{
    
 
  

 @Test
      public void signUpPagetest(String firstName) throws InterruptedException {
	 getLogInPage();
	 loginpage.clickOnCreateBtn();
	 
	 getSignUpPage();
	 signuppage.typeFirstName(firstName);
	 signuppage.typeLaseNameText("Rohan");
	 signuppage.typePhoneNumber("12345");
	 signuppage.typePassword("****");
	 signuppage.selectBirthdayMonth("Nov");
	 signuppage.selectBirthdayDay("15");
	 signuppage.selectBirthdayYear("1990");
	 signuppage.clickOnFemale();
	
	 
	
	 
			 
	 
	 
 }
}