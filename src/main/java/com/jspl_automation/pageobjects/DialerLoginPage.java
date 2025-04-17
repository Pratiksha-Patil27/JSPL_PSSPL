package com.jspl_automation.pageobjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.jspl_automation.utility.BaseClass;

public class DialerLoginPage extends BaseClass{
	public DialerLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}	
	public void pssplDialerLogin(String url) throws InterruptedException {

		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to(url);
		driver.manage().window().maximize();
		String expectedWelcomText = "Welcome";
		Thread.sleep(5000);
		String actualwelcomeText = driver.findElement(By.xpath("//font[@class='sh_text_white']")).getText();
		System.out.println(actualwelcomeText);
		Assert.assertEquals(actualwelcomeText, expectedWelcomText, "Not landing on Psspl Dialer...!");
		System.out.println("Successfully Land on PSSPL Dialer...!");
	}

	public void phoneLogin(String phoneLogin, String phonePass) throws InterruptedException {

		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()=\"Agent Login\"]")).click(); // click on Agent Login
		String expectedResult = "phone login";
		String actualResult = driver.findElement(By.className("sh_text_white")).getText();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, expectedResult, "Not Land on Phone Login page...!");
		System.out.println("Successfully Landing on Phone Login Page");
		driver.findElement(By.name("phone_login")).sendKeys(phoneLogin);
		driver.findElement(By.name("phone_pass")).sendKeys(phonePass);
		driver.findElement(By.id("login_sub")).click();
	}

	public void campaignLogin(String userLogin, String userPass) throws InterruptedException {

		try {
			String expectedResult = "Campaign Login";
			String actualresult = driver.findElement(By.className("sh_text_white")).getText();
			System.out.println(actualresult);
			Assert.assertEquals(actualresult, expectedResult, "Not Land on Campaign Login page...!");
			System.out.println("Successfully Landing On Compaign Login Page");
			driver.findElement(By.name("VD_login")).sendKeys(userLogin);
			driver.findElement(By.name("VD_pass")).sendKeys(userPass);
			Thread.sleep(3000);
			driver.findElement(By.id("VD_campaign")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("VD_campaign")).click();

			Thread.sleep(3000);
			WebElement compaignDropDownElement = driver.findElement(By.xpath("//*[@id=\"VD_campaign\"]"));
			Select select = new Select(compaignDropDownElement);
			select.selectByIndex(1);
			Thread.sleep(3000);
			driver.findElement(By.id("login_sub")).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException caught, retrying...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void agentLoginController() {
		WebElement anotherliveAgentLogin = driver
				.findElement(By.xpath("//span[@id=\"DeactivateDOlDSessioNSpan\"]/table/tbody/tr/td/font"));

		WebElement outboundActivationElement = driver
				.findElement(By.xpath("//font[text()=\"CLOSER INBOUND GROUP SELECTION\"]")); // get element to verify
																								// successfuly navigate
																								// to agent screen or
																								// not

		if (anotherliveAgentLogin.isDisplayed()) {
			System.out.println(anotherliveAgentLogin.getText());
			driver.findElement(By.xpath("//a[text()=\"OK\"]")).click(); // click on "ok" button for navigate to dialer
																		// screen
			driver.findElement(By.xpath("//*[@id=\"CloserSelectBox\"]/table/tbody/tr/td/font[2]/a[2]")).click();// click
																												// on
																												// submit
																												// button
			System.out.println("Successfully navogate to VICI Dailer...");

			ifAgentLoggedOut(); // call method if seession logged out
		}

		else if (outboundActivationElement.isDisplayed()) {
			System.out.println(outboundActivationElement.getText());

			driver.findElement(By.xpath("//*[@id=\"CloserSelectBox\"]/table/tbody/tr/td/font[2]/a[2]")).click(); // click
																													// on
																													// submit
																													// button

			System.out.println("Successfully navigate to VICC Dailer...");

			ifAgentLoggedOut(); // call method if seession logged out
		}

	}

	public void ifAgentLoggedOut() {
		WebElement sessionLoggedOutElement = driver
				.findElement(By.xpath("//span[@id=\"NoneInSessionBox\"]/table/tbody/tr/td/font"));
		if (sessionLoggedOutElement.isDisplayed()) {
			driver.findElement(By.id("NoneInSessionLink")).click();
		}

	}


	
	
}
