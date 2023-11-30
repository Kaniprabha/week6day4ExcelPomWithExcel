package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class LoginTC_004 extends ProjectSpecificMethod{
	
	@Test
	public void createPage(String cName, String fName, String lName, String phno) {
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.clickCrmsfaLink()
		.clickLeadsTab()
		.clickCreateLead()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.enterPhno(phno)
		.clickSubmitButton();
		
	}

	@BeforeTest
	public void setdata() {
		
	}
	

}
