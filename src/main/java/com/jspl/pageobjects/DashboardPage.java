package com.jspl.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

	@FindBy(xpath="//ul[@id='side-menu']")
	private WebElement siderMenu;
	
	@FindBy(xpath="//div[@id=\"sidebar-menu\"]/ul/li/a/i")
	private WebElement customerEngagementIcon;
	
	@FindBy(xpath="//*[@id=\"side-menu\"]/li/ul/li")
	private List<WebElement> customerEngagementOptions ;
	
	public DashboardPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	public boolean verifySuccessfullyLandingOnDashboard()
	{
		boolean displayStatus=false;
		waitVisibilityOf(siderMenu);
		try
		{
			displayStatus= siderMenu.isDisplayed();
		}catch(Throwable e)
		{
			displayStatus= false;
		}
		
		return displayStatus;
	}
	
	public void clickOnCustomerEngagementIcon()
	{
		click(customerEngagementIcon);
	}

	public OutBoundTaskPage selectCustomerEngagementOption(String menuName) {
		List<WebElement> sideBarElements = customerEngagementOptions;

		for (WebElement sideBarElement : sideBarElements) {
			String sideBarMenu = sideBarElement.getText();
			String expectedMenu = menuName;

			if (sideBarMenu.equals(expectedMenu)) {
				// System.out.println(sideBarMenu);
				sideBarElement.click();
				break;
			}
		}
		return new OutBoundTaskPage(driver);
	}
}