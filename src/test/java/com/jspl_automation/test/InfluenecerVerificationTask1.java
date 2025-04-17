package com.jspl_automation.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.jspl_automation.OutboundTask.TaskTypeManager;
import com.jspl_automation.OutboundTask.TestCaseTracker;
import com.jspl_automation.TestComponents.CommanFunctions;
import com.jspl_automation.pageobjects.DialerLoginPage;
import com.jspl_automation.pageobjects.LoginPage;
import com.jspl_automation.utility.BaseClass;


public class InfluenecerVerificationTask1 extends BaseClass {
	
	

	DialerLoginPage dialerPage;
	CommanFunctions functions;
	String backButtonTaskNo;
	String hangUpTaskNo;
	String inflVerificationTaskNo;
	String inflVerifyWrongTaskNo;
	String inflVefNotInterestedTakNo;
	String inflVefRingNotReceivedTaskNo;
	String inflVefCallBackLaterTaskNo;
	TaskTypeManager manager;



LoginPage loginPage;
		
@BeforeSuite
public void Login() throws InterruptedException
{ 
	
	String url="https://jsplrjtest.prowessbeat.net";
	String username = "6001";
	String password = "tELE@6001";
	launchBrowser("chrome");
	loginPage=new LoginPage(driver);
	loginPage.loginTo(url, username, password);
//	dialerPage=new DialerLoginPage(driver);
//	dialerPage.pssplDialerLogin("https://psspldialer.prowessbeat.net/"); //call method
//	dialerPage.phoneLogin("6001", "Axc45fgvb54"); // Called Method
//	dialerPage.campaignLogin("6001", "Axc45fgvb54"); // Called Method
//	dialerPage.agentLoginController(); // Call Method
//	
//	//go back on main window
//	mainWindowHandle();
}



@BeforeClass
public void openOutBoundTask() throws InterruptedException {
	
	functions = new CommanFunctions(driver);
	Thread.sleep(5000);
	functions.CustomerEngagementMenu("Outbound Task"); //click on OutBound Task
	// click on dial next to open first task
	functions.dialNextClick();
				
	functions.verifyCallsAvailability();
				
				
}

/*
@Test(priority = 1)
public void inflVerifCloseTaskbuttonclickable()
{
	SoftAssert softAssert = new SoftAssert();
	functions = new CommanFunctions(driver);
	By popUpCrossLocator=By.xpath("//button[@class=\"btn btn-link p-0  btn btn-btn-link\"]/i");
	WaitVisibliltyOfLocated(popUpCrossLocator);
	click(popUpCrossLocator);
	
	functions.callActionButton("Close Task");
	By closeTaskLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
	WaitVisibliltyOfLocated(closeTaskLableLocator);
	WebElement closeTaskLableElement=driver.findElement(closeTaskLableLocator);
	softAssert.assertTrue(closeTaskLableElement.isDisplayed(),"Close Task Button not clickable");
	softAssert.assertAll();
	
	
	
	
}

@Test(priority = 2)
public void inflVerifCloseTaskSubmitbuttonclickable()
{
	SoftAssert softAssert = new SoftAssert();
	functions = new CommanFunctions(driver);
	By submitButtonLocator=By.xpath("//button[@class=\"btn btn-success\"]");
	click(submitButtonLocator);
	
	By errorLocator=By.xpath("//div[text()=\"Please Enter Remark\"]");
	WaitVisibliltyOfLocated(errorLocator);
	WebElement errorElement=driver.findElement(errorLocator);
	softAssert.assertTrue(errorElement.isDisplayed(),"Close Task Submit button not clickable");
	
    softAssert.assertAll();
	
	
	
}

@Test(priority = 3)
public void inflVerifCloseTaskSubmitBreakbuttonclickable()
{
	SoftAssert softAssert = new SoftAssert();
	functions = new CommanFunctions(driver);
	By submitButtonLocator=By.xpath("//button[@class=\"btn btn-primary me-md-2 btn btn-primary\"]");
	click(submitButtonLocator);
	By errorLocator=By.xpath("//div[text()=\"Please Enter Remark\"]");
	WaitVisibliltyOfLocated(errorLocator);
	WebElement errorElement=driver.findElement(errorLocator);
	softAssert.assertTrue(errorElement.isDisplayed(),"Close Task Submit & Break button not clickable");
	
    softAssert.assertAll();
	
	
	
}

@Test(priority = 4)
public void inflVerifCloseTaskCancelbuttonclickable()
{
	boolean status=true;
	SoftAssert softAssert = new SoftAssert();
	functions = new CommanFunctions(driver);
	By cancelButtonLocator=By.xpath("//button[@class=\"btn btn-danger\"]");
	click(cancelButtonLocator);
	try
	{
	By closeTaskLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
	WebElement closeTaskLableElement=driver.findElement(closeTaskLableLocator);
	if(closeTaskLableElement.isDisplayed())
	{
		status=false;
	}
	}catch(Exception e)
	{
		
	}
	 if(!status)
	 {
		 softAssert.fail("Close Task cancel button not clickable");
	 }
    softAssert.assertAll();
	
	
	
}

@Test(priority = 5)
public void inflVerifCloseTaskCrossIconclickable()
{
	boolean status=true;
	SoftAssert softAssert = new SoftAssert();
	functions = new CommanFunctions(driver);
	functions.callActionButton("Close Task");
	By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
	click(crossIconLocator);
	try
	{
	By closeTaskLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
	WebElement closeTaskLableElementElement=driver.findElement(closeTaskLableLocator);
	if(closeTaskLableElementElement.isDisplayed())
	{
		status=false;
	}
	}catch(Exception e)
	{
		
	}
	 if(!status)
	 {
		 softAssert.fail("Close Task Cross button not clickable");
	 }
    softAssert.assertAll();
	
	
	
}

@Test(priority = 6)
public void inflVerifRescheduledbuttonclickable()
{
	SoftAssert softAssert = new SoftAssert();
	functions = new CommanFunctions(driver);
	functions.callActionButton("Reschedule Call");
	By rescheduleLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
	WaitVisibliltyOfLocated(rescheduleLableLocator);
	WebElement rescheduleLableElement=driver.findElement(rescheduleLableLocator);
	softAssert.assertTrue(rescheduleLableElement.isDisplayed(),"Reschedule Button not clickable");
	softAssert.assertAll();
	
	
	
	
}

@Test(priority = 7)
public void inflVerifRescheduledSubmitbuttonclickable()
{
	SoftAssert softAssert = new SoftAssert();
	functions = new CommanFunctions(driver);
	By submitButtonLocator=By.xpath("//button[@class=\"btn btn-success\"]");
	click(submitButtonLocator);
	
	By errorLocator=By.xpath("//div[text()=\"Please Select Schedule Status\"]");
	WaitVisibliltyOfLocated(errorLocator);
	WebElement errorElement=driver.findElement(errorLocator);
	softAssert.assertTrue(errorElement.isDisplayed(),"Reschedule Submit button not clickable");
	
    softAssert.assertAll();
	
	
}

@Test(priority = 8)
public void inflVerifRescheduledSubmitBreakbuttonclickable()
{
	SoftAssert softAssert = new SoftAssert();
	functions = new CommanFunctions(driver);
	By submitButtonLocator=By.xpath("//button[@class=\"btn btn-primary me-md-2 btn btn-primary\"]");
	click(submitButtonLocator);
	By errorLocator=By.xpath("//div[text()=\"Please Select Schedule Status\"]");
	WaitVisibliltyOfLocated(errorLocator);
	WebElement errorElement=driver.findElement(errorLocator);
	softAssert.assertTrue(errorElement.isDisplayed(),"Reschedule Submit & Break button not clickable");
	
    softAssert.assertAll();
	
	
}

@Test(priority = 9)
public void inflVerifRescheduledCancelbuttonclickable()
{
	boolean status=true;
	SoftAssert softAssert = new SoftAssert();
	functions = new CommanFunctions(driver);
	By cancelButtonLocator=By.xpath("//button[@class=\"btn btn-danger\"]");
	click(cancelButtonLocator);
	try
	{
	By rescheduleLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
	WebElement rescheduleLabelElement=driver.findElement(rescheduleLableLocator);
	if(rescheduleLabelElement.isDisplayed())
	{
		status=false;
	}
	}catch(Exception e)
	{
		
	}
	 if(!status)
	 {
		 softAssert.fail("Reschedule cancel button not clickable");
	 }
    softAssert.assertAll();
	
	
	
}

@Test(priority = 10)
public void inflVerifRescheduledCrossIconclickable()
{
	boolean status=true;
	SoftAssert softAssert = new SoftAssert();
	functions = new CommanFunctions(driver);
	functions.callActionButton("Reschedule Call");
	By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
	click(crossIconLocator);
	try
	{
	By rescheduleLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
	WebElement rescheduleLabelElement=driver.findElement(rescheduleLableLocator);
	if(rescheduleLabelElement.isDisplayed())
	{
		status=false;
	}
	}catch(Exception e)
	{
		
	}
	 if(!status)
	 {
		 softAssert.fail("Reschedule Cross button not clickable");
	 }
    softAssert.assertAll();
	
	
}

	
	
	
	@Test(priority = 11, alwaysRun = true)
	public void inflVerifBack() throws InterruptedException
	{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		backButtonTaskNo =functions.getTaskNo();
		System.out.println("Influncer Verifivation backButtonTaskNo : "+ backButtonTaskNo);
		Thread.sleep(9000);
		functions.callActionButton("Back");
		//verify Dial Next button display or not
		By dialNextElement= (By.xpath("//*[contains(text(),\"Dial Next\")]"));
		WaitVisibliltyOf(dialNextElement);
		 WebElement dialNext=driver.findElement(dialNextElement);
		 softAssert.assertTrue(dialNext.isDisplayed(),"Test Failed :inflVerifBack Back Button Not working proper");
		// Call assertAll to aggregate the results
			softAssert.assertAll();

			
		 
	}
	
	@Test(priority = 12, alwaysRun = true)
	public void inflVerifBackTaskStatus() 
	{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		
		boolean status=false;
		By element=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a");
		WaitVisibliltyOfLocated(element);
		//get task no from dashboard
		List<WebElement> taskNoElements=driver.findElements(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a"));
		for(int i=1; i<=taskNoElements.size();i++)
		 {  
			By taskNoElement=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div/a");
			WaitVisibliltyOf(taskNoElement);
			String taskNo=driver.findElement(taskNoElement).getText();
			 System.out.println("Dashboard Task No :" +taskNo);
			if(taskNo.equals(backButtonTaskNo))
			{
				//get task Status from dashboard
				String taskStatus=driver.findElement(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div[8]/div")).getText();
				System.out.println("Dashboard Task status Influncer Verification-BackButton : "+taskStatus);
				softAssert.assertEquals(taskStatus, "Pending", " Test Failed : inflVerifBackTaskStatus");
				status=true;
				 break;
			}
			
		}
		if (!status) {
			softAssert.fail("Influencer Verification- inflVerifBackTaskStatus Task no : " + backButtonTaskNo + " not found");
		}
		
		softAssert.assertAll();

		 
		
		}
		
		
   
	
	@Test(priority = 13, alwaysRun = true)
	public void inflVerifBackButtonDialNext() throws InterruptedException
	{   dialerPage=new DialerLoginPage(driver);
		//Verify after back task when click on dial next then same task should be open
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.dialNextClick();
		
		functions.checkErrorToastForInflVef();
		Thread.sleep(5000);	 
		String newTaskNo= functions.getTaskNo();
		softAssert.assertEquals(newTaskNo, backButtonTaskNo,"Test Failed : inflVerifBackButtonDialNext -incorrect call connect");
		
		softAssert.assertAll();

	   
		
	}
	
	
	
	@Test(priority = 14, alwaysRun = true)
	public void inflVerifHangUp() throws InterruptedException
	{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		try
		{
		functions.checkErrorToastForInflVef();
		}catch(Exception e)
		{
			
		}
		By popUpCrossLocator=By.xpath("//button[@class=\"btn btn-link p-0  btn btn-btn-link\"]/i");
		WaitVisibliltyOfLocated(popUpCrossLocator);
		click(popUpCrossLocator);
		Thread.sleep(3000);
		hangUpTaskNo=functions.getTaskNo();
		functions.callActionButton("Hangup");
		By loaderElement=By.xpath("// div[@id=\"loader-container\"]/p");
		WaitVisibliltyOfLocated(loaderElement);
		String loaderMsg=driver.findElement(loaderElement).getText();
		System.out.println(loaderMsg);

		softAssert.assertNotEquals(loaderMsg,"New Call Connecting", "Test Faild : inflVerifHangUp");
		softAssert.assertAll();
		 WaitInVisibliltyOfLocated(loaderElement);
		 
				
	}
	
	
	
	
	@Test(priority = 15, alwaysRun = true)
	public void inflVefVerificationButtonClickable()
	{
				
		//click on Verifivation Button
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		By verificationLocator=By.xpath("//button[@class=\"btn btn-primary btn-sm dropdown-toggle\"]");
		WaitVisibliltyOfLocated(verificationLocator);
		click(verificationLocator);
		
		//Influncer Verification Button 
		By inflVefLocator=By.xpath("//button[text()=\"Influencer Verification\"]");
		WaitVisibliltyOfLocated(inflVefLocator);
		WebElement inflVefElement=driver.findElement(inflVefLocator);
		softAssert.assertTrue(inflVefElement.isDisplayed(), "Verification Button is not clickable.");
		
		softAssert.assertAll();
		
		

		
	}
	
	@Test(priority = 16, alwaysRun = true)
	public void inflVefInfluncerVerificationButtonClickable()
	{
		//Click on Influncer Verification Button 
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		By inflVefLocator=By.xpath("//button[text()=\"Influencer Verification\"]");
		WaitVisibliltyOfLocated(inflVefLocator);
		click(inflVefLocator);
		
		By inflVefLabelLocator=By.xpath("//label[text()=\"Influencer Verification\"]");
		WaitVisibliltyOfLocated(inflVefLabelLocator);
		WebElement inflVefLabelElement=driver.findElement(inflVefLabelLocator);
		softAssert.assertTrue(inflVefLabelElement.isDisplayed(), "Influencer Verification Button is not clickable.");
		
		 softAssert.assertAll();
		
		
		
	}
	
	@Test(priority = 17, alwaysRun = true)
	public void inflVefVerificationSubmitBreakButtonClickable()
	{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		By submitBreakButtonLocator=By.xpath("//button[@class=\"btn btn-primary me-md-2 btn btn-primary\"]");
		click(submitBreakButtonLocator);
		By errorLocator=By.xpath("//div[text()=\"Please Enter year in Construction business\"]");
		WaitVisibliltyOfLocated(errorLocator);
		WebElement errorElement=driver.findElement(errorLocator);
		softAssert.assertTrue(errorElement.isDisplayed(),"Influncer Verification Submit & Break button not clickable");
		
        softAssert.assertAll();
		
		
		
		
	}
	
	@Test(priority = 18, alwaysRun = true)
	public void inflVefVerificationCancelButtonClickable()
	{
		boolean status=true;
		SoftAssert softAssert = new SoftAssert();
		By cancelButtonLocator=By.xpath("//button[@class=\"btn btn-danger\"]");
		click(cancelButtonLocator);
		try
		{
		By inflVefLabelLocator=By.xpath("//label[text()=\"Influencer Verification\"]");
		WebElement inflVefLabelElement=driver.findElement(inflVefLabelLocator);
		if(inflVefLabelElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
			
		}
		 if(!status)
		 {
			 softAssert.fail("Influncer Verification Cancel button not clickable");
		 }
        softAssert.assertAll();
		
		
		
		
	}
	
	@Test(priority = 19, alwaysRun = true)
	public void inflVefVerificationSubmitButtonClickable()
	{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		By verificationLocator=By.xpath("//button[@class=\"btn btn-primary btn-sm dropdown-toggle\"]");
		WaitVisibliltyOfLocated(verificationLocator);
		click(verificationLocator);
		
		//Influncer Verification Button 
		By inflVefLocator=By.xpath("//button[text()=\"Influencer Verification\"]");
		WaitVisibliltyOfLocated(inflVefLocator);
		click(inflVefLocator);
		
		By submitButtonLocator=By.xpath("//button[@class=\"btn btn-success\"]");
		WaitVisibliltyOfLocated(submitButtonLocator);
		click(submitButtonLocator);
		
		By errorLocator=By.xpath("//div[text()=\"Please Enter year in Construction business\"]");
		WaitVisibliltyOfLocated(errorLocator);
		WebElement errorElement=driver.findElement(errorLocator);
		softAssert.assertTrue(errorElement.isDisplayed(),"Influncer Verification Submit button not clickable");
		
        softAssert.assertAll();
		
		
		
	}
	
	@Test(priority = 20, alwaysRun = true)
	public void inflVefVerificationCrossIconClickable()
	{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		boolean status=true;
		By crossIconLocator=By.xpath("//button[@class=\"btn btn-link p-0  btn btn-btn-link\"]/i");
		click(crossIconLocator);
		try
		{
			By inflVefLabelLocator=By.xpath("//label[text()=\"Influencer Verification\"]");
			WebElement inflVefLabelElement=driver.findElement(inflVefLabelLocator);
		if(inflVefLabelElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
			
		}
		 if(!status)
		 {
			 softAssert.fail("Influncer Verification Cross button not clickable");
		 }
        softAssert.assertAll();
		
		
		
	}
	
	@Test(priority = 21, alwaysRun = true)
	public void inflVefVerificationMandtoryFields()
	{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		By verificationLocator=By.xpath("//button[@class=\"btn btn-primary btn-sm dropdown-toggle\"]");
		WaitVisibliltyOfLocated(verificationLocator);
		click(verificationLocator);
		
		//Influncer Verification Button 
		By inflVefLocator=By.xpath("//button[text()=\"Influencer Verification\"]");
		WaitVisibliltyOfLocated(inflVefLocator);
		click(inflVefLocator);
		
		//click on Submit button
		By submitButtonLocator=By.xpath("//button[@class=\"btn btn-success\"]");
		WaitVisibliltyOfLocated(submitButtonLocator);
		click(submitButtonLocator);
		
        //Array for Holds the field name
        String[] fieldNames = {"YearsInBussiness", "NoOfMasons", "CurrentSitesNo", "SitesPerYear", "BrandUsed", "MostPreferredBrand", "Status"};
        //Array for Hold the Error field locators
        By[] errorLocators = {
        	By.xpath("//div[text()=\"Please Enter year in Construction business\"]"),
        	By.xpath("//div[text()=\"Please Enter Number of masons working under him\"]"),
        	By.xpath("//div[text()=\"Please Enter Current Number of Sites\"]"),
        	By.xpath("//div[text()=\"Please Enter  Number of Sites per Year\"]"),
        	By.xpath("//div[text()=\"Please select Brand Used\"]"),
        	By.xpath("//div[text()=\"Please select Most Preferred Brand\"]"),
        	By.xpath("//div[text()=\"Please select Status\"]")
        };

        // Loop through each field and check if the error message is displayed
        for (int i = 0; i < errorLocators.length; i++) {
            try {
            	WaitVisibliltyOfLocated(errorLocators[i]);
            	WebElement errorMessage=driver.findElement(errorLocators[i]);
                softAssert.assertTrue(errorMessage.isDisplayed(), "Error message should be displayed for " + fieldNames[i]);
            } catch (Exception e) {
                System.err.println("Error message not displayed for: " + fieldNames[i]);
                softAssert.fail("Error message not displayed for: " + fieldNames[i]);
            }
        }
        
        By crossIconLocator=By.xpath("//button[@class=\"btn btn-link p-0  btn btn-btn-link\"]/i");
		click(crossIconLocator);
        softAssert.assertAll();

		
		
	}
	
	
	@Test(priority = 22, alwaysRun = true)
	public void inflVerifRedial() throws InterruptedException

	{ 
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		Thread.sleep(2000);
		String oldTaskNo = functions.getTaskNo();
		System.out.println("Influncer Verification oldTaskNo : "+ oldTaskNo);
		// click on Redial button
		functions.callActionButton("Redial");
		Thread.sleep(12000);
		By taskPopUpLocator=By.xpath("//*[@id=\"TelecallingInfoDiv\"]/div/div/a/div/div[3]/marquee/span");
		WaitVisibliltyOfLocated(taskPopUpLocator);
		String newTaskNo = functions.getTaskNo();
		System.out.println("Influncer Verification newTaskNo : "+ newTaskNo);
		softAssert.assertEquals(newTaskNo, oldTaskNo, "Test Failed : Redial button not working properly");
		
	    softAssert.assertAll();

		
		

	}
	
	
	

	
	@Test(priority = 23, dataProvider= "inflVerificationData", alwaysRun = true)
	public void inflVefEnterVerificationData(HashMap<String, String> verificationData) throws InterruptedException
	
	{
	
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		

		String yearsInBuss = verificationData.get("yearsInBuss"); 
		String noOfMasons = verificationData.get("noOfMasons");
		String currentSitesNo = verificationData.get("currentSitesNo");
		String sitesPerYear = verificationData.get("sitesPerYear");
		String brandUsed = verificationData.get("brandUsed");
		String mostPreferredBrand = verificationData.get("mostPreferredBrand");
		String status = verificationData.get("status");
		
		
		Thread.sleep(2000);
		inflVerificationTaskNo =functions.getTaskNo();
		System.out.println("Influncer Verification Task No : "+ inflVerificationTaskNo);
		functions.enterInfluncerVerificationData(yearsInBuss, noOfMasons, currentSitesNo, sitesPerYear, brandUsed, mostPreferredBrand, status);
        softAssert.assertAll();

		

	}
	
	
	@Test(priority = 24, alwaysRun = true)
	public void inflVefBySubmitBreakButton()
	{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		By submitBreakButtonLocator=By.xpath("//button[@class=\"btn btn-primary me-md-2 btn btn-primary\"]");
		click(submitBreakButtonLocator);
		By successLableLocator=By.xpath("//h2[text()=\"Verification Saved\"]");
		WaitVisibliltyOfLocated(successLableLocator);
		WebElement successElement =driver.findElement(successLableLocator);
		softAssert.assertTrue(successElement.isDisplayed(),"Influncer Verification  Not Getting Submit.");
		
		//Click on "OK" Button
		By okButtonLocator=By.xpath("//button[text()=\"OK\"]");
		WaitVisibliltyOfLocated(okButtonLocator);
		click(okButtonLocator);
		By loaderElement=By.xpath("// div[@id=\"loader-container\"]/p");
		WaitInVisibliltyOfLocated(loaderElement);
		softAssert.assertAll();

		
	}
	
	@Test(priority = 25, alwaysRun = true)
	public void inflVefBySubmitBreakButtonVerifyNextCall() throws InterruptedException
	{
		//Next Call should not be connect
    	 SoftAssert softAssert = new SoftAssert();
  		functions = new CommanFunctions(driver);
  		Thread.sleep(5000);
    	//verify next call connect or not
  		try
  		{
  		     By taskLocator=By.xpath("//*[@id=\"TelecallingInfoDiv\"]/div/div/a/div/div[3]/marquee/span");
		     Thread.sleep(3000);
			 WebElement taskElement=driver.findElement(taskLocator);
			 softAssert.assertFalse(taskElement.isDisplayed(),"After done Influncer Verification  By Submit & Break Button Then next Call should not be connect");
  		}catch(Exception e)
  		{
  			System.out.println("Next call Not connect due to Verification submit by Submit & Break Button");
  		}
			softAssert.assertAll();

			
    	 
		
	}
	
	@Test(priority = 26, alwaysRun = true)
	public void inflVefCheckTaskStatusOnDashboard()
	{
		SoftAssert softAssert = new SoftAssert();
 		 functions = new CommanFunctions(driver);
 		
 		boolean status=false;
 		By element=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a");
 		WaitVisibliltyOfLocated(element);
 		//get task no from dashboard
 		List<WebElement> taskNoElements=driver.findElements(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a"));
 		for(int i=1; i<=taskNoElements.size();i++)
 		 {  
 			By taskNoElement=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div/a");
 			WaitVisibliltyOf(taskNoElement);
 			String taskNo=driver.findElement(taskNoElement).getText();
 			 System.out.println("InflVerification Dashboard Task No :" +taskNo);
 			if(taskNo.equals(inflVerificationTaskNo))
 			{
 				//get task Status from dashboard
 				String taskStatus=driver.findElement(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div[8]/div")).getText();
 				System.out.println("Dashboard Task status For Influncer Verification : "+taskStatus);
 				softAssert.assertEquals(taskStatus, "Closed", "After  Influncer Verifiaction task Status should be closed");
 				status=true;
 				 break;
 			}
 			
 		}
 		if (!status) {
 			softAssert.fail("Influncer Verification Task no : " + inflVerificationTaskNo + " not found");
 		}
 		 
 		  softAssert.assertAll();
    	 
 		
	}
	
	@Test(priority = 27, dataProvider="inflVerificationData", alwaysRun = true)
	public void inflVefBySubmitButton(HashMap<String, String> verificationData) throws InterruptedException, IOException
	{
		//If Next call is Available then call should be connect directly
		SoftAssert softAssert = new SoftAssert();
 		functions = new CommanFunctions(driver);
 		functions.dialNextClick();
 		functions.verifyCallsAvailability();
 		String yearsInBuss = verificationData.get("yearsInBuss"); 
		String noOfMasons = verificationData.get("noOfMasons");
		String currentSitesNo = verificationData.get("currentSitesNo");
		String sitesPerYear = verificationData.get("sitesPerYear");
		String brandUsed = verificationData.get("brandUsed");
		String mostPreferredBrand = verificationData.get("mostPreferredBrand");
		String status = verificationData.get("status");
 
    		Thread.sleep(2000);
    		inflVerificationTaskNo =functions.getTaskNo();
    		System.out.println("Influncer Verification Task no : "+ inflVerificationTaskNo);
    		functions.enterInfluncerVerificationData(yearsInBuss, noOfMasons, currentSitesNo, sitesPerYear, brandUsed, mostPreferredBrand, status);
    		
    		
   			//Click on Submit Button
    		By submitButtonLocator=By.xpath("//button[@class=\"btn btn-success\"]");
			WaitVisibliltyOfLocated(submitButtonLocator);
			click(submitButtonLocator);
   			
   			
   		   ///Click on "OK" Button
			By okButtonLocator=By.xpath("//button[text()=\"OK\"]");
			WaitVisibliltyOfLocated(okButtonLocator);
			click(okButtonLocator);
			By loaderElement=By.xpath("// div[@id=\"loader-container\"]/p");
			WaitInVisibliltyOfLocated(loaderElement);
			softAssert.assertAll();
   			
			 try
			 { 
				 
				By nextDialTextElement=By.xpath("//h4[@class=\"text-info fw-bold\"]");
				 WaitVisibliltyOfLocated(nextDialTextElement);
				 WebElement nextDialText = driver.findElement(nextDialTextElement);
				 System.out.println(nextDialText.getText());
				 if(nextDialText.isDisplayed())
				 {
					 System.out.println("No calls are scheduled");
				 }
				 
			 }catch(Exception r)
			 {
				 
				 By taskPopUpLocator=By.xpath("//*[@id=\"TelecallingInfoDiv\"]/div/div/a/div/div[3]/marquee/span");
					WaitVisibliltyOfLocated(taskPopUpLocator);
				   WebElement taskPopUp=driver.findElement(taskPopUpLocator);
				   String taskName=taskPopUp.getText();
				   System.out.println(taskName);
				   softAssert.assertTrue(taskPopUp.isDisplayed(), "If we Submit Influencer Verification By submit Button then next call shoukd be connect.");
			 }	
			 softAssert.assertAll();

	        
		
	}
	
	
	 @Test(priority = 28, alwaysRun = true)
	public void inflVefCloseTaskSubmitBreak() throws InterruptedException, IOException
	{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		
 			By popUpCrossLocator=By.xpath("//button[@class=\"btn btn-link p-0  btn btn-btn-link\"]/i");
			WaitVisibliltyOfLocated(popUpCrossLocator);
			click(popUpCrossLocator);
		String inflVerifyTaskNo =functions.getTaskNo();
		System.out.println("Influncer Verification Task No For Close Task By Submit Break button  : " +inflVerifyTaskNo);
		functions.callActionButton("Close Task");
	
		
		//Enter close task remark
		By remarkLocator=By.id("REMARK");
		sendkeys(By.id("REMARK"),"Close Influncer Verification Task");
	   
		//click on submit & break button
		By submitBreakButtonLocator=By.xpath("//button[@class=\"btn btn-primary me-md-2 btn btn-primary\"]");
		WaitVisibliltyOfLocated(submitBreakButtonLocator);
		click(submitBreakButtonLocator);
		
		//click on "Ok" button
		By okButtonLocator=By.xpath("//button[text()=\"OK\"]");
		WaitVisibliltyOfLocated(okButtonLocator);
		click(okButtonLocator);
		By loaderElement=By.xpath("// div[@id=\"loader-container\"]/p");
		WaitInVisibliltyOfLocated(loaderElement);
		boolean status=false;
		 
		//get task no from dashboard
		List<WebElement> taskNoElements=driver.findElements(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a"));
		for(int i=1; i<=taskNoElements.size();i++)
		 {  
			By taskNoElement=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div/a");
			WaitVisibliltyOf(taskNoElement);
			String taskNo=driver.findElement(taskNoElement).getText();
			 System.out.println("Dashboard Task No :" +taskNo);
			if(taskNo.equals(inflVerifyTaskNo))
			{
				//get task Status from dashboard
				String taskStatus=driver.findElement(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div[8]/div")).getText();
				System.out.println("Dashboard Task Status Influencer Verification-Close Task :"+taskStatus);
				softAssert.assertEquals(taskStatus, "Closed", " Test Failed : inflVefCloseTaskSubmitBreak");
				status=true;
				 break;
			} 
			
		}
		if (!status) {
			softAssert.fail("Influncer Verification- closed Task No : " + inflVerifyTaskNo + " not found");
		}

		// Call assertAll to aggregate the results
		softAssert.assertAll();

		
 		
	}
	
	@Test(priority = 29, alwaysRun = true)
	public void inflVefCloseTaskSubmit() throws InterruptedException, IOException
	{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		
		functions.dialNextClick();
 		functions.verifyCallsAvailability();
    		Thread.sleep(2000);
 			By popUpCrossLocator=By.xpath("//button[@class=\"btn btn-link p-0  btn btn-btn-link\"]/i");
			WaitVisibliltyOfLocated(popUpCrossLocator);
			click(popUpCrossLocator);
		String oldTaskNo =functions.getTaskNo();
		System.out.println("Influncer Verification closed Task No By submit button  : " +oldTaskNo);
		functions.callActionButton("Close Task");
         
		//Enter close task remark
		By remarkLocator=By.id("REMARK");
		sendkeys(By.id("REMARK"),"Close Influncer Verification Task");
	   
		//click on submit & break button
		By submitButtonLocator=By.xpath("//button[@class=\"btn btn-success\"]");
		WaitVisibliltyOfLocated(submitButtonLocator);
		click(submitButtonLocator);
		
		//click on "Ok" button
		By okButtonLocator=By.xpath("//button[text()=\"OK\"]");
		WaitVisibliltyOfLocated(okButtonLocator);
		click(okButtonLocator);
		
		By loaderElement=By.xpath("// div[@id=\"loader-container\"]/p");
		WaitInVisibliltyOfLocated(loaderElement);
		 try
		 { 
			 
			By nextDialTextElement=By.xpath("//h4[@class=\"text-info fw-bold\"]");
			 WaitVisibliltyOfLocated(nextDialTextElement);
			 WebElement nextDialText = driver.findElement(nextDialTextElement);
			 System.out.println(nextDialText.getText());
			 if(nextDialText.isDisplayed())
			 {
				 System.out.println("No calls are scheduled");
			 }
			 
		 }catch(Exception e)
		 {
			 
			 String newTaskNo=functions.getTaskNo();
			 System.out.println(newTaskNo);
			   softAssert.assertNotEquals(newTaskNo, oldTaskNo,"Test Failed : inflVefCloseTaskSubmit ");
		 }
			softAssert.assertAll();

			
	}			
	
	
	
	
	@Test(priority = 30, alwaysRun = true)
	public void inflVefRescheduleNotInterestedSubmitBreak() throws InterruptedException, IOException
	{ 
		functions = new CommanFunctions(driver);
		SoftAssert softAssert = new SoftAssert();
		
		By popUpCrossLocator=By.xpath("//button[@class=\"btn btn-link p-0  btn btn-btn-link\"]/i");
		WaitVisibliltyOfLocated(popUpCrossLocator);
		click(popUpCrossLocator);
		
		inflVefNotInterestedTakNo=functions.getTaskNo();
		System.out.println("Task No-Influncer Verification- Reschedule-Not Interested -Submit & break button : "+ inflVefNotInterestedTakNo);
		Thread.sleep(2000);
		functions.callActionButton("Reschedule Call");
		functions.selectRescheduleStatus("Not interested");
		functions.enterRescheduleRemark("Remark : Not interested");
		functions.clickRescheduleSubmitBreak();
		By loaderElement=By.xpath("// div[@id=\"loader-container\"]/p");
			WaitInVisibliltyOfLocated(loaderElement);
			
		       //verify Dial Next button display or not
				By dialNextElement= (By.xpath("//*[contains(text(),\"Dial Next\")]"));
				WaitVisibliltyOfLocated(dialNextElement);
				 WebElement dialNext=driver.findElement(dialNextElement);
				 softAssert.assertTrue(dialNext.isDisplayed(),"If We Reschedule call by submit & break button then call should be paused.");
				// Call assertAll to aggregate the results
				softAssert.assertAll();

					
		}
	

	@Test(priority = 31, alwaysRun = true)
	public void inflVerfRescheduleNotInterestedTaskStatus() throws InterruptedException
	{	
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);

		boolean status=false;
		By element=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a");
		WaitVisibliltyOfLocated(element);
		Thread.sleep(2000);
		//get task no from dashboard
		List<WebElement> taskNoElements=driver.findElements(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a"));
		for(int i=1; i<=taskNoElements.size();i++)
		 {  
			By taskNoElement=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div/a");
			WaitVisibliltyOf(taskNoElement);
			String taskNo=driver.findElement(taskNoElement).getText();
			
			if(taskNo.equals(inflVefNotInterestedTakNo))
			{
				 System.out.println("Dashboard Task No :" +taskNo);
				//get task Status from dashboard
				String taskStatus=driver.findElement(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div[8]/div")).getText();
				System.out.println("Dashboard Task status Influncer Verification-Rechedule- Not Interested : "+taskNo + " - "+taskStatus);
				softAssert.assertEquals(taskStatus, "Closed", " If Select Reschedule status Not Interested then task should be closed.");
				status=true;
				 break;
			}
			
		}
		if (!status) {
			softAssert.fail("Influencer Verification- inflVerfRescheduleNotInterestedTaskStatus Task no : " + inflVefNotInterestedTakNo + " not found");
		}
		
		softAssert.assertAll();

		
		
		}
	
	
	@Test(priority = 32, alwaysRun = true)
	public void inflVefRescheduleNotInterestedSubmit() throws InterruptedException, IOException
	{
		SoftAssert softAssert = new SoftAssert();
        functions = new CommanFunctions(driver);
        functions.dialNextClick();
 		functions.verifyCallsAvailability();
    		//Thread.sleep(2000);
 			By popUpCrossLocator=By.xpath("//button[@class=\"btn btn-link p-0  btn btn-btn-link\"]/i");
			WaitVisibliltyOfLocated(popUpCrossLocator);
			click(popUpCrossLocator);
		        String taskNoNotInterestedSubmit=functions.getTaskNo();
		        System.out.println("Task no. of Influencer Verification-Reschedule-Not Interested-Submit button : "+taskNoNotInterestedSubmit);
		        Thread.sleep(2000);
		        functions.callActionButton("Reschedule Call");
		        functions.selectRescheduleStatus("Not interested");
				functions.enterRescheduleRemark("Remark : Not interested");
				functions.clickrescheduleSubmit();
				By loaderElement=By.xpath("// div[@id=\"loader-container\"]/p");
				WaitInVisibliltyOfLocated(loaderElement); 
				 try
				 { 
					 
					By nextDialTextElement=By.xpath("//h4[@class=\"text-info fw-bold\"]");
					 WaitVisibliltyOfLocated(nextDialTextElement);
					 WebElement nextDialText = driver.findElement(nextDialTextElement);
					 System.out.println(nextDialText.getText());
					 if(nextDialText.isDisplayed())
					 {
						 System.out.println("No calls are scheduled");
					 }
					 
				 }catch(Exception e)
				 {
					 
					 By taskPopUpLocator=By.xpath("//*[@id=\"TelecallingInfoDiv\"]/div/div/a/div/div[3]/marquee/span");
					 WaitVisibliltyOfLocated(taskPopUpLocator);
					   WebElement taskPopUp=driver.findElement(taskPopUpLocator);
					   String taskName=taskPopUp.getText();
					   System.out.println(taskName);
					   softAssert.assertTrue(taskPopUp.isDisplayed(), "If Reschedule task by Submit button then next call should be connet. ");
				 }
							
		softAssert.assertAll();

		
 	
	}
 		
	
	
	
	
	@Test(priority = 33, alwaysRun = true)
	public void inflVefRescheduleRingNotReceivedSubmitBreak() throws InterruptedException, IOException
	{ 
		functions = new CommanFunctions(driver);
		SoftAssert softAssert = new SoftAssert();
		
			  By popUpCrossLocator=By.xpath("//button[@class=\"btn btn-link p-0  btn btn-btn-link\"]/i");
		  WaitVisibliltyOfLocated(popUpCrossLocator);
		  click(popUpCrossLocator);
		
		inflVefRingNotReceivedTaskNo=functions.getTaskNo();
		System.out.println("Task No- Influencer Verification- Reschedule-Ringing Not Received -Submit & break button : "+ inflVefRingNotReceivedTaskNo);
		Thread.sleep(2000);
		functions.callActionButton("Reschedule Call");
		functions.selectRescheduleStatus("Ringing not received");
		functions.enterRescheduleRemark("Remark : Ringing not received");
		functions.clickRescheduleSubmitBreak();
		By loaderElement=By.xpath("// div[@id=\"loader-container\"]/p");
			WaitInVisibliltyOfLocated(loaderElement);
			
		       //verify Dial Next button display or not
				By dialNextElement= (By.xpath("//*[contains(text(),\"Dial Next\")]"));
				WaitVisibliltyOfLocated(dialNextElement);
				 WebElement dialNext=driver.findElement(dialNextElement);
				 softAssert.assertTrue(dialNext.isDisplayed(),"If We Reschedule call by submit & break button then call should be paused.");
				// Call assertAll to aggregate the results
				softAssert.assertAll();

					
 		
		}
	
	
	
	@Test(priority = 34, alwaysRun = true)
	public void inflVerfRescheduleRingNotReceivedTaskStatus() throws InterruptedException
	{	
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);

		boolean status=false;
		By element=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a");
		WaitVisibliltyOfLocated(element);
		Thread.sleep(2000);
		//get task no from dashboard
		List<WebElement> taskNoElements=driver.findElements(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a"));
		for(int i=1; i<=taskNoElements.size();i++)
		 {  
			By taskNoElement=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div/a");
			WaitVisibliltyOf(taskNoElement);
			String taskNo=driver.findElement(taskNoElement).getText();
			 
			if(taskNo.equals(inflVefRingNotReceivedTaskNo))
			{
				System.out.println("Dashboard Task No :" +taskNo);
				//get task Status from dashboard
				String taskStatus=driver.findElement(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div[8]/div")).getText();
				System.out.println("Dashboard Task status Influencer Verification-Rechedule- Ringing Not Received : "+taskNo + " - "+taskStatus);
				softAssert.assertEquals(taskStatus, "Pending", " If Select Reschedule status Ringing Not Received then task should be Pending.");
				status=true;
				 break;
			}
			
		}
		if (!status) {
			softAssert.fail("Claim Verification- inflVerfRescheduleRingNotReceivedTaskStatus Task no : " + inflVefRingNotReceivedTaskNo + " not found");
		}
		
		softAssert.assertAll();

		
		
		}
	
	
	@Test(priority = 35, alwaysRun = true)
	public void inflVerfRescheduleRingNotReceivedSubmit() throws InterruptedException, IOException
	{
		SoftAssert softAssert = new SoftAssert();
        functions = new CommanFunctions(driver);
        functions.dialNextClick();
 		functions.verifyCallsAvailability();
    		//Thread.sleep(2000);
 			  By popUpCrossLocator=By.xpath("//button[@class=\"btn btn-link p-0  btn btn-btn-link\"]/i");
			  WaitVisibliltyOfLocated(popUpCrossLocator);
			  click(popUpCrossLocator);
		        String taskNoRigNotReceivedSubmit=functions.getTaskNo();
		        System.out.println("Task no. of Influencer Verification-Reschedule-Ring Not Received -Submit button : "+taskNoRigNotReceivedSubmit);
		        Thread.sleep(2000);
		        functions.callActionButton("Reschedule Call");
		        functions.selectRescheduleStatus("Ringing not received");
				functions.enterRescheduleRemark("Remark : Ringing not received");
				functions.clickrescheduleSubmit();
				By loaderElement=By.xpath("// div[@id=\"loader-container\"]/p");
				WaitInVisibliltyOfLocated(loaderElement); 
				 try
				 { 
					 
					By nextDialTextElement=By.xpath("//h4[@class=\"text-info fw-bold\"]");
					 WaitVisibliltyOfLocated(nextDialTextElement);
					 WebElement nextDialText = driver.findElement(nextDialTextElement);
					 System.out.println(nextDialText.getText());
					 if(nextDialText.isDisplayed())
					 {
						 System.out.println("No calls are scheduled");
					 }
					 
				 }catch(Exception e)
				 {
					 
					 By taskPopUpLocator=By.xpath("//*[@id=\"TelecallingInfoDiv\"]/div/div/a/div/div[3]/marquee/span");
					 WaitVisibliltyOfLocated(taskPopUpLocator);
					   WebElement taskPopUp=driver.findElement(taskPopUpLocator);
					   String taskName=taskPopUp.getText();
					   System.out.println(taskName);
					   softAssert.assertTrue(taskPopUp.isDisplayed(), "If Reshedule task by Submit button then next call should be connet. ");
				 }
							
		softAssert.assertAll();

		
 	
	}
 		
	
	@Test(priority = 36, alwaysRun = true)
	public void inflVerfRescheduleCallBackLaterSubmitBreak() throws InterruptedException, IOException
	{ 
		functions = new CommanFunctions(driver);
		SoftAssert softAssert = new SoftAssert();
		
			  By popUpCrossLocator=By.xpath("//button[@class=\"btn btn-link p-0  btn btn-btn-link\"]/i");
		  WaitVisibliltyOfLocated(popUpCrossLocator);
		  click(popUpCrossLocator);
			   
		inflVefCallBackLaterTaskNo=functions.getTaskNo();
		System.out.println("Task No- Influencer Verification- Reschedule-Call Back Later -Submit & break button : "+ inflVefCallBackLaterTaskNo);
		Thread.sleep(2000);
		functions.callActionButton("Reschedule Call");
		functions.selectRescheduleStatus("Call Back Later");
		
		//Click on Schedule time (+15 min)--Based On button index we can change time
		By timeLocator=By.xpath("//div[@class=\"d-grid gap-2 d-md-flex justify-content col\"]/button[1]");
		WaitVisibliltyOfLocated(timeLocator);
		click(timeLocator);
		
		functions.enterRescheduleRemark("Remark : Call Back Later");
		functions.clickRescheduleSubmitBreak();
		By loaderElement=By.xpath("// div[@id=\"loader-container\"]/p");
			WaitInVisibliltyOfLocated(loaderElement);
			
		       //verify Dial Next button display or not
				By dialNextElement= (By.xpath("//*[contains(text(),\"Dial Next\")]"));
				WaitVisibliltyOfLocated(dialNextElement);
				 WebElement dialNext=driver.findElement(dialNextElement);
				 softAssert.assertTrue(dialNext.isDisplayed(),"If We Reschedule call by submit & break button then call should be paused.");
				// Call assertAll to aggregate the results
				softAssert.assertAll();

					
 		
		}
	
	
	@Test(priority = 37, alwaysRun = true)
	public void inflVerfRescheduleCallBackLaterTaskStatus() throws InterruptedException
	{	
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);

		boolean status=false;
		By element=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a");
		WaitVisibliltyOfLocated(element);
		Thread.sleep(2000);
		//get task no from dashboard
		List<WebElement> taskNoElements=driver.findElements(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a"));
		for(int i=1; i<=taskNoElements.size();i++)
		 {  
			By taskNoElement=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div/a");
			WaitVisibliltyOf(taskNoElement);
			String taskNo=driver.findElement(taskNoElement).getText();
			 System.out.println("Dashboard Task No :" +taskNo);
			if(taskNo.equals(inflVefCallBackLaterTaskNo))
			{
				//get task Status from dashboard
				String taskStatus=driver.findElement(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div[8]/div")).getText();
				System.out.println("Dashboard Task status Influencer Verification-Rechedule- Call Back Later : "+taskNo + " - "+taskStatus);
				softAssert.assertEquals(taskStatus, "Pending", " If Select Reschedule status Call Back Later then task should be Pending.");
				status=true;
				 break;
			}
			
		}
		if (!status) {
			softAssert.fail("Influencer Verification- inflVerfRescheduleCallBackLaterTaskStatus Task no : " + inflVefCallBackLaterTaskNo + " not found");
		}
		
		softAssert.assertAll();

		 
		
		}
	
	
	@Test(priority = 38, alwaysRun = true)
	public void inflVerfRescheduleCallBackLaterSubmit() throws InterruptedException, IOException
	{
		SoftAssert softAssert = new SoftAssert();
        functions = new CommanFunctions(driver);
        functions.dialNextClick();
 		functions.verifyCallsAvailability();
    		//Thread.sleep(2000);
 			  By popUpCrossLocator=By.xpath("//button[@class=\"btn btn-link p-0  btn btn-btn-link\"]/i");
			  WaitVisibliltyOfLocated(popUpCrossLocator);
			  click(popUpCrossLocator);
		        String taskNoCallBackLaterSubmit=functions.getTaskNo();
		        System.out.println("Task no. of Influencer Verification-Reschedule  -Call Back Later -Submit button : "+taskNoCallBackLaterSubmit);
		        Thread.sleep(2000);
		        functions.callActionButton("Reschedule Call");
		        functions.selectRescheduleStatus("Call Back Later");
		        
		      //Click on Schedule time (+15 min)--Based On button index we can change time
				By timeLocator=By.xpath("//div[@class=\"d-grid gap-2 d-md-flex justify-content col\"]/button[1]");
				WaitVisibliltyOfLocated(timeLocator);
				click(timeLocator);
		        
				functions.enterRescheduleRemark("Remark : Call Back Later");
				functions.clickrescheduleSubmit();
				By loaderElement=By.xpath("// div[@id=\"loader-container\"]/p");
				WaitInVisibliltyOfLocated(loaderElement); 
				 try
				 { 
					 
					By nextDialTextElement=By.xpath("//h4[@class=\"text-info fw-bold\"]");
					 WaitVisibliltyOfLocated(nextDialTextElement);
					 WebElement nextDialText = driver.findElement(nextDialTextElement);
					 System.out.println(nextDialText.getText());
					 if(nextDialText.isDisplayed())
					 {
						 System.out.println("No calls are scheduled");
					 }
					 
				 }catch(Exception e)
				 {
					 
					 By taskPopUpLocator=By.xpath("//*[@id=\"TelecallingInfoDiv\"]/div/div/a/div/div[3]/marquee/span");
					 WaitVisibliltyOfLocated(taskPopUpLocator);
					   WebElement taskPopUp=driver.findElement(taskPopUpLocator);
					   String taskName=taskPopUp.getText();
					   System.out.println(taskName);
					   softAssert.assertTrue(taskPopUp.isDisplayed(), "If Reschedule task by Submit button then next call should be connet.");
				 }
							
		softAssert.assertAll();

		
 	
	}
	
	
	
	@Test(priority = 39, alwaysRun = true)
	public void inflVerfRescheduleWrongNoSubmitBreak() throws InterruptedException, IOException
	{	SoftAssert softAssert = new SoftAssert();
	     functions = new CommanFunctions(driver);
	     			 By popUpCrossLocator=By.xpath("//button[@class=\"btn btn-link p-0  btn btn-btn-link\"]/i");
			 WaitVisibliltyOfLocated(popUpCrossLocator);
			 click(popUpCrossLocator);
		inflVerifyWrongTaskNo=functions.getTaskNo();
		System.out.println("Task No-Influncer Verification- Reschedule- Wrong no-Submit & break button : "+ inflVerifyWrongTaskNo);
		Thread.sleep(2000);
		functions.callActionButton("Reschedule Call");
		functions.selectRescheduleStatus("Wrong Number");
		functions.enterRescheduleRemark("Remark : Wrong Number");
		functions.clickRescheduleSubmitBreak();
		By loaderElement=By.xpath("// div[@id=\"loader-container\"]/p");
			WaitInVisibliltyOfLocated(loaderElement);
			
		       //verify Dial Next button display or not
				By dialNextElement= (By.xpath("//*[contains(text(),\"Dial Next\")]"));
				WaitVisibliltyOfLocated(dialNextElement);
				 WebElement dialNext=driver.findElement(dialNextElement);
				 softAssert.assertTrue(dialNext.isDisplayed(),"If We Reshedule call by submit & break button then call should be paused.");
				// Call assertAll to aggregate the results
				softAssert.assertAll();
	}
	
	
	
	
	@Test(priority = 40, alwaysRun = true)
	public void inflVerfRescheduleWrongNoTaskStatus() throws InterruptedException
	{	
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);

		boolean status=false;
		By element=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a");
		WaitVisibliltyOfLocated(element);
		Thread.sleep(2000);
		//get task no from dashboard
		List<WebElement> taskNoElements=driver.findElements(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a"));
		for(int i=1; i<=taskNoElements.size();i++)
		 {  
			By taskNoElement=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div/a");
			WaitVisibliltyOf(taskNoElement);
			String taskNo=driver.findElement(taskNoElement).getText();
			
			if(taskNo.equals(inflVerifyWrongTaskNo))
			{
				 System.out.println("Dashboard Task No :" +taskNo);
				//get task Status from dashboard
				String taskStatus=driver.findElement(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div[8]/div")).getText();
				System.out.println("Dashboard Task status Influencer Verification-Rechedule-Wrong No : "+taskNo+"- "+taskStatus);
				softAssert.assertEquals(taskStatus, "Closed", " If Select Reschedule status Wrong then task should be closed.");
				status=true;
				 break;
			}
			
		}
		if (!status) {
			softAssert.fail("Influencer Verification- inflVerfRescheduleWrongNoTaskStatus Task no : " + inflVerifyWrongTaskNo + " not found");
		}
		
		softAssert.assertAll();

		
		
		}
	
	
	
	@Test(priority = 41, alwaysRun = true)
	public void inflVerfRescheduleWrongNoSubmit() throws InterruptedException, IOException
	{
		SoftAssert softAssert = new SoftAssert();
	       functions = new CommanFunctions(driver);
	       functions.dialNextClick();
	 		functions.verifyCallsAvailability();
 			 By popUpCrossLocator=By.xpath("//button[@class=\"btn btn-link p-0  btn btn-btn-link\"]/i");
			 WaitVisibliltyOfLocated(popUpCrossLocator);
			 click(popUpCrossLocator);
		        String taskNoWrongNoSubmit=functions.getTaskNo();
		        System.out.println("Task no. of Influencer Verification-Reschedule-Wrong no-Submit button : "+taskNoWrongNoSubmit);
		        Thread.sleep(2000);
		        functions.callActionButton("Reschedule Call");
				functions.selectRescheduleStatus("Wrong Number");
				functions.enterRescheduleRemark("Remark : Wrong Number");
				functions.clickrescheduleSubmit();
				By loaderElement=By.xpath("// div[@id=\"loader-container\"]/p");
				WaitInVisibliltyOfLocated(loaderElement); 
				 try
				 { 
					 
					By nextDialTextElement=By.xpath("//h4[@class=\"text-info fw-bold\"]");
					 WaitVisibliltyOfLocated(nextDialTextElement);
					 WebElement nextDialText = driver.findElement(nextDialTextElement);
					 System.out.println(nextDialText.getText());
					 if(nextDialText.isDisplayed())
					 {
						 System.out.println("No calls are scheduled");
					 }
					 
				 }catch(Exception e)
				 {
					 
					 By taskPopUpLocator=By.xpath("//*[@id=\"TelecallingInfoDiv\"]/div/div/a/div/div[3]/marquee/span");
					 WaitVisibliltyOfLocated(taskPopUpLocator);
					   WebElement taskPopUp=driver.findElement(taskPopUpLocator);
					   String taskName=taskPopUp.getText();
					   System.out.println(taskName);
					   softAssert.assertTrue(taskPopUp.isDisplayed(), "If Recshedule task by Submit button then next call should be connet.");
				 }
							
		softAssert.assertAll();

 	
	}
	*/
	

	@Test(priority = 48, alwaysRun = true)
	public void dashboardNameFilter() throws InterruptedException
	{	
		
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		try
		{
		functions.callActionButton("Back");
		}catch(Exception e)
		{
			
		}
		By searchFilterLocator=By.id("search");
		WaitVisibliltyOfLocated(searchFilterLocator);
		driver.findElement(searchFilterLocator).sendKeys("Outbound Task");
		
		By noRecordsLableLocator = By.xpath("//div[text()=\"There are no records to display\"]");
		WaitVisibliltyOfLocated(noRecordsLableLocator);
		WebElement noRecordsLableElement=driver.findElement(noRecordsLableLocator);
		softAssert.assertTrue(noRecordsLableElement.isDisplayed(),"Outbound Task Name filter not working");
		driver.navigate().refresh();
		softAssert.assertAll();
		
		
	}
	
	@Test(priority = 49, alwaysRun = true)
	public void openTaskActivity() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		Thread.sleep(2000);
		By taskNoLocator=By.xpath("//div[@id=\"row-0\"]/div/a");
		WaitVisibliltyOfLocated(taskNoLocator);
		click(taskNoLocator);
		
		//get Label Name
		By taskLabelLocator=By.xpath("//label[text()=\"Task Activity - \"]");
		WaitVisibliltyOfLocated(taskLabelLocator);
		WebElement taskLabelName=driver.findElement(taskLabelLocator);
		softAssert.assertTrue(taskLabelName.isDisplayed(),"Task Activity Not open.");
		
		//click on Cross Icon
		By crossIconLocator=By.xpath("//button[@Class=\"waves-effect btn btn-link p-0\"]");
		WaitVisibliltyOfLocated(crossIconLocator);
		click(crossIconLocator);
		softAssert.assertAll();	
		
	}
	
	@Test(priority = 50, alwaysRun = true)
	public void dashboardFilterIconClick()
	{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		
		By dateFiltericonLocator=By.xpath("//*[@id=\"page-topbar\"]/div/div[2]/div[2]/button/div/i");
		click(dateFiltericonLocator);
		By filterLableLocator = By.xpath("//span[text()=\"Filter\"]");
		WaitVisibliltyOfLocated(filterLableLocator);
		WebElement filterLableElement=driver.findElement(filterLableLocator);
		softAssert.assertTrue(filterLableElement.isDisplayed()," Filter Icon not working");
		
		softAssert.assertAll();
		
		
	}
	
	@Test(priority = 51, alwaysRun = true)
	public void dashboardFilterCrossClick()
	{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		boolean status=true;
		By filterCrossLocator=By.xpath("//button[@class=\"btn-close\"]");
		click(filterCrossLocator);
		try
		{
			By filterLableLocator = By.xpath("//span[text()=\"Filter\"]");
		   WebElement filterLableElement=driver.findElement(filterLableLocator);
		if(filterLableElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
			
		}
		 if(!status)
		 {
			 softAssert.fail("Filter  Cross button not clickable");
		 }
        softAssert.assertAll();
      	
	}
	
	
	@Test(priority = 52, alwaysRun = true)
	public void applyDateFiler() throws InterruptedException
	{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		
		int year =2025;
		String month="February";
		String date="28";
		
		By dateFiltericonLocator=By.xpath("//*[@id=\"page-topbar\"]/div/div[2]/div[2]/button/div/i");
		click(dateFiltericonLocator);
		
		//Click on Date Field
		By dateFieldLocator=By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/div/input[2]");
		click(dateFieldLocator);
		
		//Select Year
		By currYearLocator=By.xpath("//input[@class=\"numInput cur-year\"]");
		WaitVisibliltyOfLocated(currYearLocator);
		String currYearValue=driver.findElement(currYearLocator).getAttribute("max");
		int currYear = Integer.parseInt(currYearValue);
		System.out.println("currYear : "+ currYear);
		
		
		int ClickCount=currYear-year;
		System.out.println("ClickCount : "+ ClickCount);
		int i=0;
		if(i<ClickCount)
		{
			By downArrowLocator=By.xpath("//span[@class=\"arrowDown\"]");
			
	        WebElement downArrowElement = driver.findElement(downArrowLocator);
	        
	        // Create Actions object
	        Actions actions = new Actions(driver);
	        actions.moveToElement(downArrowElement).perform();
	        WebElement elementToClick = driver.findElement(downArrowLocator);
	        elementToClick.click();	
		}
		
		//Select Month
		By monthLocator=By.xpath("//select[@class=\"flatpickr-monthDropdown-months\"]");
		WaitVisibliltyOfLocated(monthLocator);
		WebElement monthDropDown=driver.findElement(monthLocator);
		
		Select select =new Select(monthDropDown);
		select.selectByVisibleText(month);
		
		
		//Select Date

		List<WebElement> dateSelectElements=driver.findElements(By.xpath("//div[@class=\"flatpickr-days\"]/div/span"));
		System.out.println(dateSelectElements.size());
		for(WebElement dateSelectElement : dateSelectElements)
		 {  
			String dateSelectValue=dateSelectElement.getText();
			System.out.println(dateSelectValue);
			if(dateSelectValue.equals(date))
			{
				System.out.println("dateSelectValue1 : "+dateSelectValue);
				Thread.sleep(2000);
				dateSelectElement.click();
				break;
			}
		 }
	
		
	  //get applied date
	    By appliedDateLocator =By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/div/input[1]");
	    String appliedDate=driver.findElement(appliedDateLocator).getAttribute("value");
	    System.out.println("appliedDate : "+appliedDate);
	    
		
	    //click on apply filter button
	    By filterButtonLocator=By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/button[2]");
	    WaitVisibliltyOfLocated(filterButtonLocator);
	    click(filterButtonLocator);
	    
	    //Get date from Dashboard
	    By dateColumnLocator=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div[2]/div");
		WaitVisibliltyOfLocated(dateColumnLocator);
		Thread.sleep(2000);
		//get Date  from dashboard
		List<WebElement> dateElements=driver.findElements(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div[2]/div"));
		for(int j=1; j<=dateElements.size();j++)
		 {  
			By dateElement=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+j+"]/div[2]/div");
		    WaitVisibliltyOf(dateElement);
			String dashboardDate=driver.findElement(dateElement).getText();
			System.out.println("dashboardDate : "+dashboardDate);
			softAssert.assertEquals(dashboardDate, appliedDate, "Date Filter not working proper.");
			
		 }
		 softAssert.assertAll();
		
	}
	
	
	
	//@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}

	
	@DataProvider(name = "inflVerificationData")
	public Object[][] inflVerificationDetails() {

		// call method to read & enter json data
		Object[][] dataArray = readJsonData(System.getProperty("user.dir")+"\\src\\test\\java\\com\\jspl_automation\\data\\InfluncerVerificationDetails.json");
		return dataArray;


	};
	






}
