package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod{
	
    public CreateLeadPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	public CreateLeadPage enterCompanyName(String comName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(comName);
    	return this;
	}
    public CreateLeadPage enterFirstName(String firstName) {
    	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
    	return this;
	}
    public CreateLeadPage enterLastName(String lastName) {
    	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
    	return this;
    }
    public CreateLeadPage enterPhno(String mobNum) {
    	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(mobNum);
    	return this;
    }
    public ViewLeadPage clickSubmitButton() {
    	driver.findElement(By.name("submitButton")).click();
    	return new ViewLeadPage(driver); 
    }

}
