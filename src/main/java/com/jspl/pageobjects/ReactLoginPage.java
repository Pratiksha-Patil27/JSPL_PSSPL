package com.jspl.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReactLoginPage extends BasePage {
	
	
	@FindBy(name="email")
	private WebElement userNameField;
	
	@FindBy(name="password")
	private WebElement passwordField;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement loginButton;
	
	@FindBy(xpath="//div[contains(text(), 'Username and password are invalid')]")
	private WebElement warningMsgForInvalidUserNamePassword;
	
	@FindBy(xpath="//div[contains(text(), \"Please Enter Your\")]")
	private WebElement warningMsgForBlankUserNamePassword;
	
	
	
	public ReactLoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	public void enterUserName(String userName)
	{
		waitVisibilityOf(userNameField);
		userNameField.sendKeys(userName);
	}
	
	public void enterPassword(String password)
	{
		waitVisibilityOf(passwordField);
		passwordField.sendKeys(password);
		
	}
	
	public DashboardPage clickOnLoginButton()
	{
		click(loginButton);
		return new DashboardPage(driver);
	}
	
	
	public DashboardPage loginToReact(String username, String password) 
	{
		enterUserName(username);
		enterPassword(password);
		clickOnLoginButton();
		return new DashboardPage(driver);
	}
	
	
	public boolean verifyWarningMsgForInvalidUsernamePasswordDisplay()
	{
		boolean displayStatus = false;
		waitVisibilityOf( warningMsgForInvalidUserNamePassword);
		try {
			displayStatus =  warningMsgForInvalidUserNamePassword.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
	public boolean verifyWarningMsgForBlankUsernamePasswordDisplay()
	{
		boolean displayStatus = false;
		waitVisibilityOf( warningMsgForBlankUserNamePassword);
		try {
			displayStatus =  warningMsgForBlankUserNamePassword.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
}
