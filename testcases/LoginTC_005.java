package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class LoginTC_005 extends ProjectSpecificMethod{
	
	@Test(dataProvider="fetchData")
	public void ViewPage(String cName, String fName, String lName, String phno) {
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
		.clickSubmitButton()
		.retriveLeadId()
		.verifyCreateLead();
		
	}

}
