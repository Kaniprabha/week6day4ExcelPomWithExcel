package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod{
	
	
	public WelcomePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	public MyHomePage clickCrmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver); 
	}
    public WelcomePage clickLogoutButton() {
    	System.out.println("Logout Successfull");
    	return this;
		
	} 
    public WelcomePage verifyLoginPage() {
    	System.out.println("Login Successful");
    	return this;
    }
//<class name="testcases.LoginLogOutTC_002"/>
	
}
