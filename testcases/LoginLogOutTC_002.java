package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class LoginLogOutTC_002 extends ProjectSpecificMethod{
    
	@Test
	public void runLogout() {
		//System.out.println("LogOut: "+driver);
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.clickLogoutButton()
		.clickCrmsfaLink();
	}

	
}
