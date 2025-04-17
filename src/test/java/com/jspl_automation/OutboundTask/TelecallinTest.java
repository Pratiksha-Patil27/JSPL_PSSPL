package com.jspl_automation.OutboundTask;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;


import com.jspl_automation.TestComponents.CommanFunctions;
import com.jspl_automation.pageobjects.DialerLoginPage;
import com.jspl_automation.pageobjects.LoginPage;

import com.jspl_automation.utility.BaseClass;

public class TelecallinTest extends BaseClass {

	DialerLoginPage dialerPage;
	LoginPage loginPage;
	CommanFunctions function;
	
	
	@BeforeSuite
	@Parameters({"reactUrl", "reactUsername","reactPassword","dialerUrl","dialerUsername","dialerPassword"})
	public void Login(String reactUrl, String reactUsername, String reactPassword , String dialerUrl,String dialerUsername , String dialerPassword ) throws InterruptedException {

		String url = reactUrl;
		String username =reactUsername ;
		String password = reactPassword;
		String dialUrl = dialerUrl;
		String dialUsername =dialerUsername ;
		String dialPassword = dialerPassword;
         		
		launchBrowser("chrome");
		loginPage = new LoginPage(driver);
		loginPage.loginTo(url, username, password);
		dialerPage = new DialerLoginPage(driver);		
		
		dialerPage.pssplDialerLogin(dialUrl); // call method
		dialerPage.phoneLogin(dialUsername,dialPassword); // Called Method
		dialerPage.campaignLogin(dialUsername,dialPassword); // Called Method
		dialerPage.agentLoginController(); // Call Method

		// go back on main window
		mainWindowHandle();
	}

	@BeforeClass
	public void openOutBoundTask() throws InterruptedException, IOException {

		function = new CommanFunctions(driver);
		Thread.sleep(15000);
		function.CustomerEngagementMenu("Outbound Task"); // click on OutBound Task

//			String expectedResult = "Dial Next"; // give expected result name
//			
//			By dialNextLocator=By.xpath("//*[contains(text(),\"Dial Next\")]");
//			WaitVisibliltyOfLocated(dialNextLocator);
//			//getText welcome text for verification 
//			String actualResult = driver.findElement(dialNextLocator).getText(); 
//			System.out.println(actualResult);
//
//			Assert.assertEquals(actualResult, expectedResult, "The opened menu is not correct");
//			System.out.println("Successfully Navigate to OutBound Task Menu...! ");

	}

	@Test(alwaysRun = true)
	public void teleCalling() throws InterruptedException, IOException {
		function = new CommanFunctions(driver);

		// click on dial next to open first task
		function.dialNextClick();

		function.verifyCallsAvailability();

		new TaskTypeManager(driver).executeTask();
		 
		

	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
