package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class LoginTC_003 extends ProjectSpecificMethod{

	@Test
	public void LeadPages() {
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.clickCrmsfaLink()
		.clickLeadsTab();
		
	}
	
}
