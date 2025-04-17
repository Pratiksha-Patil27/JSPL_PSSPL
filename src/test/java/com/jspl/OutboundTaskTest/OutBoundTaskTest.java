package com.jspl.OutboundTaskTest;


import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.jspl.pageobjects.DashboardPage;
import com.jspl.pageobjects.DialerLoginPage;
import com.jspl.pageobjects.OutBoundTaskPage;
import com.jspl.pageobjects.ReactLoginPage;
import com.jspl.base.OutboundTaskBaseClass;

public class OutBoundTaskTest extends OutboundTaskBaseClass {

	private DialerLoginPage dialerPage;
	private ReactLoginPage loginPage;
	private DashboardPage dashboardPage;
	private OutBoundTaskPage outboundTaskPage;

	
	
	
	@BeforeSuite
	public void Login() throws InterruptedException {	
		launchBrowser(getProperty("browserName"));
		driver.navigate().to(getProperty("reactSite"));
		loginPage = new ReactLoginPage(driver);
		dashboardPage=loginPage.loginToReact(getProperty("reactUsername"), getProperty("reactPassword"));
		dashboardPage.verifySuccessfullyLandingOnDashboard();
		
		dialerPage = new DialerLoginPage(driver);		
		dialerPage.phoneLogin(getProperty("dialerUrl"),getProperty("dialerUsername"),getProperty("dialerPassword")); 
		dialerPage.campaignLogin(getProperty("dialerUsername"),getProperty("dialerPassword")); 
		dialerPage.agentLoginController();
	   // go back on main window
		mainWindowHandle();
		
	}

	@BeforeClass
	public void openOutBoundTaskMenu() throws InterruptedException, IOException {

		Thread.sleep(15000);
		dashboardPage.clickOnCustomerEngagementIcon();
		outboundTaskPage=dashboardPage.selectCustomerEngagementOption("Outbound Task"); 
		outboundTaskPage.verifyOutboundTaskPageDisplay();

	}

	@Test(alwaysRun = true)
	public void executeTelecallingTestCases() throws InterruptedException, IOException {
		
		outboundTaskPage.clickOnDialNextButton();

		outboundTaskPage.verifyCallsAvailabilityDisplay();
		
		new TaskTypeManager(driver,test).executeTask();
		 
		

	}
	
	 @BeforeMethod
	public void startTestMethod(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
	}

	@AfterMethod
	public void endTestMethod(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, "Test method " + result.getMethod().getMethodName() + " failed");
			test.fail(result.getThrowable());
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "Test method " + result.getMethod().getMethodName() + " skipped");
			test.skip(result.getThrowable());
		} else {
			test.log(Status.PASS, "Test method " + result.getMethod().getMethodName() + " passed");
		}
	}

	

}
