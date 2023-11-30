package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class ViewLeadPage extends ProjectSpecificMethod{
	
    public ViewLeadPage(RemoteWebDriver driver) {
    	this.driver=driver;
	}
	public ViewLeadPage retriveLeadId() {
		String Id = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("LeadID: "+Id);
		return this;
	}
    public ViewLeadPage verifyCreateLead() {
		String ViewLeadtitle = driver.getTitle();
		System.out.println("ViewLead Page title: "+ ViewLeadtitle);
		return this;
	}

}
