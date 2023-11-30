package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;
import pages.WelcomePage;

public class LoginTC_001 extends ProjectSpecificMethod{
	
	@Test
	public void runLogin() {
		
		//System.out.println("TC001 : "+ driver);
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName();
		lp.enterPassword();
		lp.clickLoginButton();		
		
	}

}
