package com.jspl_automation.OutboundTask;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.jspl_automation.TestComponents.CommanFunctions;
import com.jspl_automation.pageobjects.DialerLoginPage;
import com.jspl_automation.pageobjects.LoginPage;
import com.jspl_automation.utility.BaseClass;

public class InfluencerVerificationTask extends BaseClass{
	
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

	// ANSI escape code for red color
	String redColor = "\u001B[31m";
	// ANSI escape code to reset color
	String resetColor = "\u001B[0m";

	String greenColor = "\033[0;32;1m";
	String resetGreenColor = "\033[0m";

	InfluencerVerificationTask(WebDriver driver) {
		this.driver = driver;
	}

	public void runTests() throws InterruptedException, IOException {

		if (!TestCaseTracker.isExecuted("inflVerifCloseTaskbuttonclickable")) {
			inflVerifCloseTaskbuttonclickable();
		}

		if (!TestCaseTracker.isExecuted("inflVerifCloseTaskSubmitbuttonclickable")) {
			inflVerifCloseTaskSubmitbuttonclickable();
		}

		if (!TestCaseTracker.isExecuted("inflVerifCloseTaskSubmitBreakbuttonclickable")) {
			inflVerifCloseTaskSubmitBreakbuttonclickable();
		}

		if (!TestCaseTracker.isExecuted("inflVerifCloseTaskCancelbuttonclickable")) {
			inflVerifCloseTaskCancelbuttonclickable();
		}

		if (!TestCaseTracker.isExecuted("inflVerifCloseTaskCrossIconclickable")) {
			inflVerifCloseTaskCrossIconclickable();
		}

		if (!TestCaseTracker.isExecuted("inflVerifRescheduledbuttonclickable")) {
			inflVerifRescheduledbuttonclickable();
		}

		if (!TestCaseTracker.isExecuted("inflVerifRescheduledSubmitbuttonclickable")) {
			inflVerifRescheduledSubmitbuttonclickable();
		}

		if (!TestCaseTracker.isExecuted("inflVerifRescheduledSubmitBreakbuttonclickable")) {
			inflVerifRescheduledSubmitBreakbuttonclickable();
		}

		if (!TestCaseTracker.isExecuted("inflVerifRescheduledCancelbuttonclickable")) {
			inflVerifRescheduledCancelbuttonclickable();
		}

		if (!TestCaseTracker.isExecuted("inflVerifRescheduledCrossIconclickable")) {
			inflVerifRescheduledCrossIconclickable();
		}

		if (!TestCaseTracker.isExecuted("inflVerifBack")) {
			inflVerifBack();
		}

		if (!TestCaseTracker.isExecuted("inflVerifBackTaskStatus")) {
			inflVerifBackTaskStatus();
		}

		if (!TestCaseTracker.isExecuted("inflVerifBackButtonDialNext")) {
			inflVerifBackButtonDialNext();
		}

		if (!TestCaseTracker.isExecuted("inflVerifHangUp")) {
			inflVerifHangUp();
		}

		if (!TestCaseTracker.isExecuted("inflVefVerificationButtonClickable")) {
			inflVefVerificationButtonClickable();
		}

		if (!TestCaseTracker.isExecuted("inflVefInfluncerVerificationButtonClickable")) {
			inflVefInfluncerVerificationButtonClickable();
		}

		if (!TestCaseTracker.isExecuted("inflVefVerificationSubmitBreakButtonClickable")) {
			inflVefVerificationSubmitBreakButtonClickable();
		}

		if (!TestCaseTracker.isExecuted("inflVefVerificationCancelButtonClickable")) {
			inflVefVerificationCancelButtonClickable();
		}

		if (!TestCaseTracker.isExecuted("inflVefVerificationSubmitButtonClickable")) {
			inflVefVerificationSubmitButtonClickable();
		}

		if (!TestCaseTracker.isExecuted("inflVefVerificationCrossIconClickable")) {
			inflVefVerificationCrossIconClickable();
		}

		if (!TestCaseTracker.isExecuted("inflVefVerificationMandtoryFields")) {
			inflVefVerificationMandtoryFields();
		}

		if (!TestCaseTracker.isExecuted("inflVerifRedial")) {
			inflVerifRedial();
		}

		if (!TestCaseTracker.isExecuted("inflVefEnterVerificationData")) {
			// Fetch data from DataProvider
			Object[][] data = inflVerificationDetails();

			for (Object[] dataSet : data) {

				HashMap<String, String> verificationData = (HashMap<String, String>) dataSet[0];

				String yearsInBuss = verificationData.get("yearsInBuss");
				String noOfMasons = verificationData.get("noOfMasons");
				String currentSitesNo = verificationData.get("currentSitesNo");
				String sitesPerYear = verificationData.get("sitesPerYear");
				String brandUsed = verificationData.get("brandUsed");
				String mostPreferredBrand = verificationData.get("mostPreferredBrand");
				String status = verificationData.get("status");

				inflVefEnterVerificationData(yearsInBuss, noOfMasons, currentSitesNo, sitesPerYear, brandUsed,
						mostPreferredBrand, status);
			}
		}

		if (!TestCaseTracker.isExecuted("inflVefBySubmitBreakButton")) {
			inflVefBySubmitBreakButton();
		}

		if (!TestCaseTracker.isExecuted("inflVefBySubmitBreakButtonVerifyNextCall")) {
			inflVefBySubmitBreakButtonVerifyNextCall();
		}

		if (!TestCaseTracker.isExecuted("inflVefCheckTaskStatusOnDashboard")) {
			inflVefCheckTaskStatusOnDashboard();
		}

		if (!TestCaseTracker.isExecuted("inflVefBySubmitButton")) {
			Object[][] data = inflVerificationDetails();

			for (Object[] dataSet : data) {

				HashMap<String, String> verificationData = (HashMap<String, String>) dataSet[0];

				String yearsInBuss = verificationData.get("yearsInBuss");
				String noOfMasons = verificationData.get("noOfMasons");
				String currentSitesNo = verificationData.get("currentSitesNo");
				String sitesPerYear = verificationData.get("sitesPerYear");
				String brandUsed = verificationData.get("brandUsed");
				String mostPreferredBrand = verificationData.get("mostPreferredBrand");
				String status = verificationData.get("status");

				inflVefBySubmitButton(yearsInBuss, noOfMasons, currentSitesNo, sitesPerYear, brandUsed,
						mostPreferredBrand, status);

			}

		}

		if (!TestCaseTracker.isExecuted("inflVefCloseTaskSubmitBreak")) {

			inflVefCloseTaskSubmitBreak();
		}

		if (!TestCaseTracker.isExecuted("inflVefCloseTaskSubmit")) {

			inflVefCloseTaskSubmit();

		}

		if (!TestCaseTracker.isExecuted("inflVefRescheduleNotInterestedSubmitBreak")) {
			inflVefRescheduleNotInterestedSubmitBreak();
		}

		if (!TestCaseTracker.isExecuted("inflVerfRescheduleNotInterestedTaskStatus")) {
			inflVerfRescheduleNotInterestedTaskStatus();
		}

		if (!TestCaseTracker.isExecuted("inflVefRescheduleNotInterestedSubmit")) {
			inflVefRescheduleNotInterestedSubmit();
		}

		if (!TestCaseTracker.isExecuted("inflVefRescheduleRingNotReceivedSubmitBreak")) {
			inflVefRescheduleRingNotReceivedSubmitBreak();
		}

		if (!TestCaseTracker.isExecuted("inflVerfRescheduleRingNotReceivedTaskStatus")) {
			inflVerfRescheduleRingNotReceivedTaskStatus();
		}

		if (!TestCaseTracker.isExecuted("inflVerfRescheduleRingNotReceivedSubmit")) {
			inflVerfRescheduleRingNotReceivedSubmit();
		}

		if (!TestCaseTracker.isExecuted("inflVerfRescheduleCallBackLaterSubmitBreak")) {
			inflVerfRescheduleCallBackLaterSubmitBreak();
		}

		if (!TestCaseTracker.isExecuted("inflVerfRescheduleCallBackLaterTaskStatus")) {

			inflVerfRescheduleCallBackLaterTaskStatus();
		}

		if (!TestCaseTracker.isExecuted("inflVerfRescheduleCallBackLaterSubmit")) {

			inflVerfRescheduleCallBackLaterSubmit();
		}

		if (!TestCaseTracker.isExecuted("inflVerfRescheduleWrongNoSubmitBreak")) {
			inflVerfRescheduleWrongNoSubmitBreak();
		}

		if (!TestCaseTracker.isExecuted("inflVerfRescheduleWrongNoTaskStatus")) {
			inflVerfRescheduleWrongNoTaskStatus();
		}

		if (!TestCaseTracker.isExecuted("inflVerfRescheduleWrongNoSubmit")) {
			inflVerfRescheduleWrongNoSubmit();
		}

	}
	
	
		@Test(priority = 1)
		public void inflVerifCloseTaskbuttonclickable()
		{
			try
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
			
			System.out.println(greenColor + "Influencer Verification Test Case : 1 Passed " + resetGreenColor);
			
			}catch (AssertionError ae) {
			      
			     System.out.println(redColor + "Influencer Verification Test Case : 1 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
		     }catch(Exception e)
		 		{
		 			System.out.println(redColor+"Influencer Verification Test Case : 1 Failed.\n Exception : " + e.getMessage()+ resetColor);
		 		}
			TestCaseTracker.markAsExecuted("inflVerifCloseTaskbuttonclickable");
			
			
		}
		
		@Test(priority = 2)
		public void inflVerifCloseTaskSubmitbuttonclickable()
		{
			try
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
	        
	        System.out.println(greenColor + "Influencer Verification Test Case : 2 Passed " + resetGreenColor);
	        
			}catch (AssertionError ae) {
			      
			     System.out.println(redColor + "Influencer Verification Test Case : 2 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
		     }catch(Exception e)
		 		{
		 			System.out.println(redColor+"Influencer Verification Test Case : 2 Failed.\n Exception : " + e.getMessage()+ resetColor);
		 		}
			TestCaseTracker.markAsExecuted("inflVerifCloseTaskSubmitbuttonclickable");
			
		}
		
		@Test(priority = 3)
		public void inflVerifCloseTaskSubmitBreakbuttonclickable()
		{
			try
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
	        System.out.println(greenColor + "Influencer Verification Test Case : 3 Passed " + resetGreenColor);
	        
			}catch (AssertionError ae) {
			      
			     System.out.println(redColor + "Influencer Verification Test Case : 3 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
		     }catch(Exception e)
		 		{
		 			System.out.println(redColor+"Influencer Verification Test Case : 3 Failed.\n Exception : " + e.getMessage()+ resetColor);
		 		}
			TestCaseTracker.markAsExecuted("inflVerifCloseTaskSubmitBreakbuttonclickable");
			
		}
		
		@Test(priority = 4)
		public void inflVerifCloseTaskCancelbuttonclickable()
		{
			try
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
	        System.out.println(greenColor + "Influencer Verification Test Case : 4 Passed " + resetGreenColor);
	        
			}catch (AssertionError ae) {
			      
			     System.out.println(redColor + "Influencer Verification Test Case : 4 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
		     }catch(Exception e)
		 		{
		 			System.out.println(redColor+"Influencer Verification Test Case : 4 Failed.\n Exception : " + e.getMessage()+ resetColor);
		 		}
			TestCaseTracker.markAsExecuted("inflVerifCloseTaskCancelbuttonclickable");
			
		}
		
		@Test(priority = 5)
		public void inflVerifCloseTaskCrossIconclickable()
		{
			try
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
	        System.out.println(greenColor + "Influencer Verification Test Case : 5 Passed " + resetGreenColor);
	        
			}catch (AssertionError ae) {
			      
			     System.out.println(redColor + "Influencer Verification Test Case : 5 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
		     }catch(Exception e)
		 		{
		 			System.out.println(redColor+"Influencer Verification Test Case : 5 Failed.\n Exception : " + e.getMessage()+ resetColor);
		 		}
			TestCaseTracker.markAsExecuted("inflVerifCloseTaskCrossIconclickable");
			
		}
		
		@Test(priority = 6)
		public void inflVerifRescheduledbuttonclickable()
		{
			try
			{
			SoftAssert softAssert = new SoftAssert();
			functions = new CommanFunctions(driver);
			functions.callActionButton("Reschedule Call");
			By rescheduleLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
			WaitVisibliltyOfLocated(rescheduleLableLocator);
			WebElement rescheduleLableElement=driver.findElement(rescheduleLableLocator);
			softAssert.assertTrue(rescheduleLableElement.isDisplayed(),"Reschedule Button not clickable");
			softAssert.assertAll();
			System.out.println(greenColor + "Influencer Verification Test Case : 6 Passed " + resetGreenColor);
			
			}catch (AssertionError ae) {
			      
			     System.out.println(redColor + "Influencer Verification Test Case : 6 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
		     }catch(Exception e)
		 		{
		 			System.out.println(redColor+"Influencer Verification Test Case : 6 Failed.\n Exception : " + e.getMessage()+ resetColor);
		 		}
			TestCaseTracker.markAsExecuted("inflVerifRescheduledbuttonclickable");
			
			
		}
		
		@Test(priority = 7)
		public void inflVerifRescheduledSubmitbuttonclickable()
		{
			try
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
	        System.out.println(greenColor + "Influencer Verification Test Case : 7 Passed " + resetGreenColor);
	        
			}catch (AssertionError ae) {
			      
			     System.out.println(redColor + "Influencer Verification Test Case : 7 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
		     }catch(Exception e)
		 		{
		 			System.out.println(redColor+"Influencer Verification Test Case : 7 Failed.\n Exception : " + e.getMessage()+ resetColor);
		 		}
			
			TestCaseTracker.markAsExecuted("inflVerifRescheduledSubmitbuttonclickable");
		}
		
		@Test(priority = 8)
		public void inflVerifRescheduledSubmitBreakbuttonclickable()
		{
			try
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
	        System.out.println(greenColor + "Influencer Verification Test Case : 8 Passed " + resetGreenColor);
	        
			}catch (AssertionError ae) {
			      
			     System.out.println(redColor + "Influencer Verification Test Case : 8 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
		     }catch(Exception e)
		 		{
		 			System.out.println(redColor+"Influencer Verification Test Case : 8 Failed.\n Exception : " + e.getMessage()+ resetColor);
		 		}
			TestCaseTracker.markAsExecuted("inflVerifRescheduledSubmitBreakbuttonclickable");
		}
		
		@Test(priority = 9)
		public void inflVerifRescheduledCancelbuttonclickable()
		{
			try
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
	        System.out.println(greenColor + "Influencer Verification Test Case : 9 Passed " + resetGreenColor);
	        
			}catch (AssertionError ae) {
			      
			     System.out.println(redColor + "Influencer Verification Test Case : 9 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
		     }catch(Exception e)
		 		{
		 			System.out.println(redColor+"Influencer Verification Test Case : 9 Failed.\n Exception : " + e.getMessage()+ resetColor);
		 		}
			TestCaseTracker.markAsExecuted("inflVerifRescheduledCancelbuttonclickable");
			
		}
		
		@Test(priority = 10)
		public void inflVerifRescheduledCrossIconclickable()
		{
			try
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
	        System.out.println(greenColor + "Influencer Verification Test Case : 10 Passed " + resetGreenColor);
	        
			}catch (AssertionError ae) {
			      
			     System.out.println(redColor + "Influencer Verification Test Case : 10 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
		     }catch(Exception e)
		 		{
		 			System.out.println(redColor+"Influencer Verification Test Case : 10 Failed.\n Exception : " + e.getMessage()+ resetColor);
		 		}
			TestCaseTracker.markAsExecuted("inflVerifRescheduledCrossIconclickable");
		}
		
			
			
			
			@Test(priority = 11, alwaysRun = true)
			public void inflVerifBack() throws InterruptedException
			{
				try
				{
				SoftAssert softAssert = new SoftAssert();
				functions = new CommanFunctions(driver);
				backButtonTaskNo =functions.getTaskNo();
				System.out.println("Influncer Verification backButtonTaskNo : "+ backButtonTaskNo);
				Thread.sleep(9000);
				functions.callActionButton("Back");
				//verify Dial Next button display or not
				By dialNextElement= (By.xpath("//*[contains(text(),\"Dial Next\")]"));
				WaitVisibliltyOf(dialNextElement);
				 WebElement dialNext=driver.findElement(dialNextElement);
				 softAssert.assertTrue(dialNext.isDisplayed(),"Test Failed :inflVerifBack Back Button Not working proper");
				// Call assertAll to aggregate the results
					softAssert.assertAll();
					System.out.println(greenColor + "Influencer Verification Test Case : 11 Passed " + resetGreenColor);
					
				}catch (AssertionError ae) {
				      
				     System.out.println(redColor + "Influencer Verification Test Case : 11 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
			     }catch(Exception e)
			 		{
			 			System.out.println(redColor+"Influencer Verification Test Case : 11 Failed.\n Exception : " + e.getMessage()+ resetColor);
			 		}
					TestCaseTracker.markAsExecuted("inflVerifBack");
				 
			}
			
			@Test(priority = 12, alwaysRun = true)
			public void inflVerifBackTaskStatus() 
			{
				try
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
				System.out.println(greenColor + "Influencer Verification Test Case : 12 Passed " + resetGreenColor);
				
				}catch (AssertionError ae) {
				      
				     System.out.println(redColor + "Influencer Verification Test Case : 12 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
			     }catch(Exception e)
			 		{
			 			System.out.println(redColor+"Influencer Verification Test Case : 12 Failed.\n Exception : " + e.getMessage()+ resetColor);
			 		}
				 TestCaseTracker.markAsExecuted("inflVerifBackTaskStatus");
				
				}
				
				
		   
			
			@Test(priority = 13, alwaysRun = true)
			public void inflVerifBackButtonDialNext() throws InterruptedException
			{   
				try
				{
				dialerPage=new DialerLoginPage(driver);
				//Verify after back task when click on dial next then same task should be open
				SoftAssert softAssert = new SoftAssert();
				functions = new CommanFunctions(driver);
				functions.dialNextClick();
				
				functions.checkErrorToastForInflVef();
				Thread.sleep(5000);	 
				String newTaskNo= functions.getTaskNo();
				softAssert.assertEquals(newTaskNo, backButtonTaskNo,"Test Failed : inflVerifBackButtonDialNext -incorrect call connect");
				
				softAssert.assertAll();
				System.out.println(greenColor + "Influencer Verification Test Case : 13 Passed " + resetGreenColor);
				
				}catch (AssertionError ae) {
				      
				     System.out.println(redColor + "Influencer Verification Test Case : 13 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
			     }catch(Exception e)
			 		{
			 			System.out.println(redColor+"Influencer Verification Test Case : 13 Failed.\n Exception : " + e.getMessage()+ resetColor);
			 		}
			   TestCaseTracker.markAsExecuted("inflVerifBackButtonDialNext");
				
			}
			
			
			
			@Test(priority = 14, alwaysRun = true)
			public void inflVerifHangUp() throws InterruptedException
			{
				try
				{
				SoftAssert softAssert = new SoftAssert();
				functions = new CommanFunctions(driver);
				try
				{
				functions.checkErrorToastForInflVef();
				}catch(Exception e)
				{
					
				}
				Thread.sleep(2000);
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
				 System.out.println(greenColor + "Influencer Verification Test Case : 14 Passed " + resetGreenColor);
				 
				}catch (AssertionError ae) {
				      
				     System.out.println(redColor + "Influencer Verification Test Case : 14 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
			     }catch(Exception e)
			 		{
			 			System.out.println(redColor+"Influencer Verification Test Case : 14 Failed.\n Exception : " + e.getMessage()+ resetColor);
			 		}
				 TestCaseTracker.markAsExecuted("inflVerifHangUp");
						
			}
			
			
			
			
			@Test(priority = 15, alwaysRun = true)
			public void inflVefVerificationButtonClickable()
			{
					try
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
				System.out.println(greenColor + "Influencer Verification Test Case : 15 Passed " + resetGreenColor);
				
					}catch (AssertionError ae) {
					      
					     System.out.println(redColor + "Influencer Verification Test Case : 15 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
				     }catch(Exception e)
				 		{
				 			System.out.println(redColor+"Influencer Verification Test Case : 15 Failed.\n Exception : " + e.getMessage()+ resetColor);
				 		}
				 TestCaseTracker.markAsExecuted("inflVefVerificationButtonClickable");
				

				
			}
			
			@Test(priority = 16, alwaysRun = true)
			public void inflVefInfluncerVerificationButtonClickable()
			{
				try
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
				 System.out.println(greenColor + "Influencer Verification Test Case : 16 Passed " + resetGreenColor);
				 
				}catch (AssertionError ae) {
				      
				     System.out.println(redColor + "Influencer Verification Test Case : 16 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
			     }catch(Exception e)
			 		{
			 			System.out.println(redColor+"Influencer Verification Test Case : 16 Failed.\n Exception : " + e.getMessage()+ resetColor);
			 		}
				 TestCaseTracker.markAsExecuted("inflVefInfluncerVerificationButtonClickable");
				
				
			}
			
			@Test(priority = 17, alwaysRun = true)
			public void inflVefVerificationSubmitBreakButtonClickable()
			{
				try
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
		        System.out.println(greenColor + "Influencer Verification Test Case : 17 Passed " + resetGreenColor);
		        
				}catch (AssertionError ae) {
				      
				     System.out.println(redColor + "Influencer Verification Test Case : 17 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
			     }catch(Exception e)
			 		{
			 			System.out.println(redColor+"Influencer Verification Test Case : 17 Failed.\n Exception : " + e.getMessage()+ resetColor);
			 		}
				TestCaseTracker.markAsExecuted("inflVefVerificationSubmitBreakButtonClickable");
				
				
			}
			
			@Test(priority = 18, alwaysRun = true)
			public void inflVefVerificationCancelButtonClickable()
			{
				try
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
		        System.out.println(greenColor + "Influencer Verification Test Case : 18 Passed " + resetGreenColor);
		        
				}catch (AssertionError ae) {
				      
				     System.out.println(redColor + "Influencer Verification Test Case : 18 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
			     }catch(Exception e)
			 		{
			 			System.out.println(redColor+"Influencer Verification Test Case : 18 Failed.\n Exception : " + e.getMessage()+ resetColor);
			 		}
				TestCaseTracker.markAsExecuted("inflVefVerificationCancelButtonClickable");
				
				
			}
			
			@Test(priority = 19, alwaysRun = true)
			public void inflVefVerificationSubmitButtonClickable()
			{
				try
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
		        System.out.println(greenColor + "Influencer Verification Test Case : 19 Passed " + resetGreenColor);
		        
				}catch (AssertionError ae) {
				      
				     System.out.println(redColor + "Influencer Verification Test Case : 19 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
			     }catch(Exception e)
			 		{
			 			System.out.println(redColor+"Influencer Verification Test Case : 19 Failed.\n Exception : " + e.getMessage()+ resetColor);
			 		}
				
				TestCaseTracker.markAsExecuted("inflVefVerificationSubmitButtonClickable");
				
			}
			
			@Test(priority = 20, alwaysRun = true)
			public void inflVefVerificationCrossIconClickable()
			{
				try
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
		        System.out.println(greenColor + "Influencer Verification Test Case : 20 Passed " + resetGreenColor);
		        
				}catch (AssertionError ae) {
				      
				     System.out.println(redColor + "Influencer Verification Test Case : 20 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
			     }catch(Exception e)
			 		{
			 			System.out.println(redColor+"Influencer Verification Test Case : 20 Failed.\n Exception : " + e.getMessage()+ resetColor);
			 		}
				TestCaseTracker.markAsExecuted("inflVefVerificationCrossIconClickable");
				
			}
			
			@Test(priority = 21, alwaysRun = true)
			public void inflVefVerificationMandtoryFields()
			{
				try
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
		        System.out.println(greenColor + "Influencer Verification Test Case : 21 Passed " + resetGreenColor);
		        
				}catch (AssertionError ae) {
				      
				     System.out.println(redColor + "Influencer Verification Test Case : 21 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
			     }catch(Exception e)
			 		{
			 			System.out.println(redColor+"Influencer Verification Test Case : 21 Failed.\n Exception : " + e.getMessage()+ resetColor);
			 		}
				TestCaseTracker.markAsExecuted("inflVefVerificationMandtoryFields");
				
			}
			
			
			@Test(priority = 22, alwaysRun = true)
			public void inflVerifRedial() throws InterruptedException

			{ 
				
				try
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
			    System.out.println(greenColor + "Influencer Verification Test Case : 22 Passed " + resetGreenColor);
			    
				}catch (AssertionError ae) {
				      
				     System.out.println(redColor + "Influencer Verification Test Case : 22 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
			     }catch(Exception e)
			 		{
			 			System.out.println(redColor+"Influencer Verification Test Case : 22 Failed.\n Exception : " + e.getMessage()+ resetColor);
			 		}
				TestCaseTracker.markAsExecuted("inflVerifRedial");
				

			}
			
			
			
	
			
			@Test(priority = 23, dataProvider= "inflVerificationData", alwaysRun = true)
			public void inflVefEnterVerificationData(String yearsInBuss, String noOfMasons, String currentSitesNo,
                    String sitesPerYear, String brandUsed, String mostPreferredBrand, String status) throws InterruptedException
			
			{
			try
			{
				SoftAssert softAssert = new SoftAssert();
				functions = new CommanFunctions(driver);
				Thread.sleep(2000);
				inflVerificationTaskNo =functions.getTaskNo();
				System.out.println("Influncer Verification Task No : "+ inflVerificationTaskNo);
				functions.enterInfluncerVerificationData(yearsInBuss, noOfMasons, currentSitesNo, sitesPerYear, brandUsed, mostPreferredBrand, status);
		        softAssert.assertAll();

		        System.out.println(greenColor + "Influencer Verification Test Case : 23 Passed " + resetGreenColor);
		        
			}catch (AssertionError ae) {
			      
			     System.out.println(redColor + "Influencer Verification Test Case : 23 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
		     }catch(Exception e)
		 		{
		 			System.out.println(redColor+"Influencer Verification Test Case : 23 Failed.\n Exception : " + e.getMessage()+ resetColor);
		 		}
				TestCaseTracker.markAsExecuted("inflVefEnterVerificationData");

			}
			
			
			@Test(priority = 24, alwaysRun = true)
			public void inflVefBySubmitBreakButton()
			{
				try
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
				System.out.println(greenColor + "Influencer Verification Test Case : 24 Passed " + resetGreenColor);
				
				}catch (AssertionError ae) {
				      
				     System.out.println(redColor + "Influencer Verification Test Case : 24 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
			     }catch(Exception e)
			 		{
			 			System.out.println(redColor+"Influencer Verification Test Case : 24 Failed.\n Exception : " + e.getMessage()+ resetColor);
			 		}
				TestCaseTracker.markAsExecuted("inflVefBySubmitBreakButton");
			}
			
			@Test(priority = 25, alwaysRun = true)
			public void inflVefBySubmitBreakButtonVerifyNextCall() throws InterruptedException
			{
				try
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
					
					System.out.println(greenColor + "Influencer Verification Test Case : 25 Passed " + resetGreenColor);
					
				}catch (AssertionError ae) {
				      
				     System.out.println(redColor + "Influencer Verification Test Case : 25 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
			     }catch(Exception e)
			 		{
			 			System.out.println(redColor+"Influencer Verification Test Case : 25 Failed.\n Exception : " + e.getMessage()+ resetColor);
			 		}
				
					TestCaseTracker.markAsExecuted("inflVefBySubmitBreakButtonVerifyNextCall");
		    	 
				
			}
			
			@Test(priority = 26, alwaysRun = true)
			public void inflVefCheckTaskStatusOnDashboard()
			{
				try
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
		 		 System.out.println(greenColor + "Influencer Verification Test Case : 26 Passed " + resetGreenColor);
		 		 
				}catch (AssertionError ae) {
				      
				     System.out.println(redColor + "Influencer Verification Test Case : 26 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
			     }catch(Exception e)
			 		{
			 			System.out.println(redColor+"Influencer Verification Test Case : 26 Failed.\n Exception : " + e.getMessage()+ resetColor);
			 		}
				
		 		 TestCaseTracker.markAsExecuted("inflVefCheckTaskStatusOnDashboard");
			}
			
			
			
			@Test(priority = 27, dataProvider="inflVerificationData", alwaysRun = true)
			public void inflVefBySubmitButton(String yearsInBuss, String noOfMasons, String currentSitesNo,
                    String sitesPerYear, String brandUsed, String mostPreferredBrand, String status) throws InterruptedException, IOException
			{
				
				//If Next call is Available then call should be connect directly
				SoftAssert softAssert = new SoftAssert();
		 		functions = new CommanFunctions(driver);
		 		manager=new TaskTypeManager(driver);
		 		
		 		//verify Task Type
		 		String taskType=functions.getTaskTypeFromApplication();
		 		if(taskType.equals("Influencer Primary Verification") )
		 		{
		           
		 			try
		 			{
		 				
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
					 System.out.println(greenColor + "Influencer Verification Test Case : 27 Passed " + resetGreenColor);
					 
		 			}catch (AssertionError ae) {
					      
					     System.out.println(redColor + "Influencer Verification Test Case : 27 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
				     }catch(Exception e)
				 		{
				 			System.out.println(redColor+"Influencer Verification Test Case : 27 Failed.\n Exception : " + e.getMessage()+ resetColor);
				 		}
		 			
			         TestCaseTracker.markAsExecuted("inflVefBySubmitButton");
			         
		    	 }
			       
		 		else
		 		{
		 			System.out.println("Task type is not Influencer Verification");
		 			manager.executeTask();
		 		}
		 		
				
			}
			
			
			 @Test(priority = 28, alwaysRun = true)
			public void inflVefCloseTaskSubmitBreak() throws InterruptedException, IOException
			{
				SoftAssert softAssert = new SoftAssert();
				functions = new CommanFunctions(driver);
				manager=new TaskTypeManager(driver);
		 		//verify Task Type
				
		 		String taskType=functions.getTaskTypeFromApplication();
		 		
		 		if(taskType.equals("Influencer Primary Verification") )
		 		{
		 			try
		 			{
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
				Thread.sleep(2000);
				List<WebElement> taskNoElements=driver.findElements(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a"));
				for(int i=1; i<=taskNoElements.size();i++)
				 {  
					By taskNoElement=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div/a");
					WaitVisibliltyOf(taskNoElement);
					String taskNo=driver.findElement(taskNoElement).getText();
					 System.out.println("Dashboard Task No :" +taskNo);
					 Thread.sleep(2000);
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
				System.out.println(greenColor + "Influencer Verification Test Case : 28 Passed " + resetGreenColor);
				
		 			}catch (AssertionError ae) {
					      
					     System.out.println(redColor + "Influencer Verification Test Case : 28 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
				     }catch(Exception e)
				 		{
				 			System.out.println(redColor+"Influencer Verification Test Case : 28 Failed.\n Exception : " + e.getMessage()+ resetColor);
				 		}
		 			
				TestCaseTracker.markAsExecuted("inflVefCloseTaskSubmitBreak");
		 		}
		 		
				else
		 		{
		 			System.out.println("Task type is not Influencer Verification");
		 			manager.executeTask();
		 		}
		 		
		 		
			}
			
			@Test(priority = 29, alwaysRun = true)
			public void inflVefCloseTaskSubmit() throws InterruptedException, IOException
			{
				SoftAssert softAssert = new SoftAssert();
				functions = new CommanFunctions(driver);
				manager=new TaskTypeManager(driver);
				//verify Task Type
		 		String taskType=functions.getTaskTypeFromApplication();
		 		
		 		if(taskType.equals("Influencer Primary Verification") )
		 		{
		 			try
		 			{
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
					System.out.println(greenColor + "Influencer Verification Test Case : 29 Passed " + resetGreenColor);
					
		 			}catch (AssertionError ae) {
					      
					     System.out.println(redColor + "Influencer Verification Test Case : 29 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
				     }catch(Exception e)
				 		{
				 			System.out.println(redColor+"Influencer Verification Test Case : 29 Failed.\n Exception : " + e.getMessage()+ resetColor);
				 		}
		 			
					TestCaseTracker.markAsExecuted("inflVefCloseTaskSubmit");
		 		}
					else
			 		{
			 			System.out.println("Task type is not Influencer Verification");
			 			manager.executeTask();
			 		}
			}			
			
			
			
			
			@Test(priority = 30, alwaysRun = true)
			public void inflVefRescheduleNotInterestedSubmitBreak() throws InterruptedException, IOException
			{ 
				functions = new CommanFunctions(driver);
				SoftAssert softAssert = new SoftAssert();
				manager=new TaskTypeManager(driver);
				String taskType=functions.getTaskTypeFromApplication();
	 		   if(taskType.equals("Influencer Primary Verification") )
	 		  {
	 			   try
	 			   {
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
						System.out.println(greenColor + "Influencer Verification Test Case : 30 Passed " + resetGreenColor);
						
	 			  }catch (AssertionError ae) {
				      
	 			     System.out.println(redColor + "Influencer Verification Test Case : 30 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	 		     }catch(Exception e)
	 		 		{
	 		 			System.out.println(redColor+"Influencer Verification Test Case : 30 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		 		}
							TestCaseTracker.markAsExecuted("inflVefRescheduleNotInterestedSubmitBreak");
			      }
		 		
		 		else
		 		{
		 			System.out.println("Task type is not Influencer Verification");
		 			manager.executeTask();
		 		}
		 		
				}
			

			@Test(priority = 31, alwaysRun = true)
			public void inflVerfRescheduleNotInterestedTaskStatus() throws InterruptedException
			{	
				try
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
				System.out.println(greenColor + "Influencer Verification Test Case : 31 Passed " + resetGreenColor);
				
				}catch (AssertionError ae) {
				      
				     System.out.println(redColor + "Influencer Verification Test Case : 31 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
			     }catch(Exception e)
			 		{
			 			System.out.println(redColor+"Influencer Verification Test Case : 31 Failed.\n Exception : " + e.getMessage()+ resetColor);
			 		}
				 TestCaseTracker.markAsExecuted("inflVerfRescheduleNotInterestedTaskStatus");
				
				}
			
			
			@Test(priority = 32, alwaysRun = true)
			public void inflVefRescheduleNotInterestedSubmit() throws InterruptedException, IOException
			{
				SoftAssert softAssert = new SoftAssert();
		        functions = new CommanFunctions(driver);
		        manager=new TaskTypeManager(driver);
				String taskType=functions.getTaskTypeFromApplication();
		 		if(taskType.equals("Influencer Primary Verification") )
		 		{
		 			try
		 			{
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
				System.out.println(greenColor + "Influencer Verification Test Case : 32 Passed " + resetGreenColor);
				
		 			}catch (AssertionError ae) {
					      
					     System.out.println(redColor + "Influencer Verification Test Case : 32 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
				     }catch(Exception e)
				 		{
				 			System.out.println(redColor+"Influencer Verification Test Case : 32 Failed.\n Exception : " + e.getMessage()+ resetColor);
				 		}
				 TestCaseTracker.markAsExecuted("inflVefRescheduleNotInterestedSubmit");
				}
		 		
		 		else
		 		{
		 			System.out.println("Task type is not Influencer Verification");
		 			manager.executeTask();
		 		}
		 	
			}
		 		
			
			
			
			
			@Test(priority = 33, alwaysRun = true)
			public void inflVefRescheduleRingNotReceivedSubmitBreak() throws InterruptedException, IOException
			{ 
				functions = new CommanFunctions(driver);
				SoftAssert softAssert = new SoftAssert();
				 manager=new TaskTypeManager(driver);
				String taskType=functions.getTaskTypeFromApplication();
	 		   if(taskType.equals("Influencer Primary Verification") )
	 		  {
	 			   try
	 			   {
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
						System.out.println(greenColor + "Influencer Verification Test Case : 33 Passed " + resetGreenColor);
						
	 			  }catch (AssertionError ae) {
				      
	 			     System.out.println(redColor + "Influencer Verification Test Case : 33 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	 		     }catch(Exception e)
	 		 		{
	 		 			System.out.println(redColor+"Influencer Verification Test Case : 33 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		 		}
	 			   
							TestCaseTracker.markAsExecuted("inflVefRescheduleRingNotReceivedSubmitBreak");
			      }
		 		
		 		else
		 		{
		 			System.out.println("Task type is not Influencer Verification");
		 			manager.executeTask();
		 	
		 		}
		 		
				}
			
			
			
			@Test(priority = 34, alwaysRun = true)
			public void inflVerfRescheduleRingNotReceivedTaskStatus() throws InterruptedException
			{	
				try
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
				System.out.println(greenColor + "Influencer Verification Test Case : 34 Passed " + resetGreenColor);
				
				}catch (AssertionError ae) {
				      
				     System.out.println(redColor + "Influencer Verification Test Case : 34 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
			     }catch(Exception e)
			 		{
			 			System.out.println(redColor+"Influencer Verification Test Case : 34 Failed.\n Exception : " + e.getMessage()+ resetColor);
			 		}
				
				 TestCaseTracker.markAsExecuted("inflVerfRescheduleRingNotReceivedTaskStatus");
				
				}
			
			
			@Test(priority = 35, alwaysRun = true)
			public void inflVerfRescheduleRingNotReceivedSubmit() throws InterruptedException, IOException
			{
				SoftAssert softAssert = new SoftAssert();
		        functions = new CommanFunctions(driver);
		        manager=new TaskTypeManager(driver);
				String taskType=functions.getTaskTypeFromApplication();
		 		if(taskType.equals("Influencer Primary Verification") )
		 		{
		 			try
		 			{
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
				System.out.println(greenColor + "Influencer Verification Test Case : 35 Passed " + resetGreenColor);
				
		 			}catch (AssertionError ae) {
					      
					     System.out.println(redColor + "Influencer Verification Test Case : 35 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
				     }catch(Exception e)
				 		{
				 			System.out.println(redColor+"Influencer Verification Test Case : 35 Failed.\n Exception : " + e.getMessage()+ resetColor);
				 		}
				 TestCaseTracker.markAsExecuted("inflVerfRescheduleRingNotReceivedSubmit");
				}
		 		else
		 		{
		 			System.out.println("Task type is not Influencer Verification");
		 			manager.executeTask();
		 			
		 		}
		 	
			}
		 		
			
			@Test(priority = 36, alwaysRun = true)
			public void inflVerfRescheduleCallBackLaterSubmitBreak() throws InterruptedException, IOException
			{ 
				functions = new CommanFunctions(driver);
				SoftAssert softAssert = new SoftAssert();
				 manager=new TaskTypeManager(driver);
				String taskType=functions.getTaskTypeFromApplication();
	 		   if(taskType.equals("Influencer Primary Verification") )
	 		  {
	 			   try
	 			   {
	 			  By popUpCrossLocator=By.xpath("//button[@class=\"btn btn-link p-0  btn btn-btn-link\"]/i");
				  WaitVisibliltyOfLocated(popUpCrossLocator);
				  click(popUpCrossLocator);
	 			   
				inflVefCallBackLaterTaskNo=functions.getTaskNo();
				System.out.println("Task No- Influencer Verification- Reschedule-Call Back Later -Submit & break button : "+ inflVefCallBackLaterTaskNo);
				Thread.sleep(2000);
				functions.callActionButton("Reschedule Call");
				functions.selectRescheduleStatus("Call Back Later");
				
				//Click on Schedule time (+15 min)--Based On button index we can change time
				By timeLocator=By.xpath("//div[@class=\"d-grid gap-2 d-md-flex justify-content col\"]/button[3]");
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
						System.out.println(greenColor + "Influencer Verification Test Case : 36 Passed " + resetGreenColor);
						
	 			  }catch (AssertionError ae) {
				      
	 			     System.out.println(redColor + "Influencer Verification Test Case : 36 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	 		     }catch(Exception e)
	 		 		{
	 		 			System.out.println(redColor+"Influencer Verification Test Case : 36 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		 		}
							TestCaseTracker.markAsExecuted("inflVerfRescheduleCallBackLaterSubmitBreak");
			      }
		 		
		 		else
		 		{
		 			System.out.println("Task type is not Influencer Verification");
		 			manager.executeTask();
		 		}
		 		
				}
			
			
			@Test(priority = 37, alwaysRun = true)
			public void inflVerfRescheduleCallBackLaterTaskStatus() throws InterruptedException
			{	
				try
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
				System.out.println(greenColor + "Influencer Verification Test Case : 37 Passed " + resetGreenColor);
				
				}catch (AssertionError ae) {
				      
				     System.out.println(redColor + "Influencer Verification Test Case : 37 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
			     }catch(Exception e)
			 		{
			 			System.out.println(redColor+"Influencer Verification Test Case : 37 Failed.\n Exception : " + e.getMessage()+ resetColor);
			 		}
				
				 TestCaseTracker.markAsExecuted("inflVerfRescheduleCallBackLaterTaskStatus");
				
				}
			
			
			@Test(priority = 38, alwaysRun = true)
			public void inflVerfRescheduleCallBackLaterSubmit() throws InterruptedException, IOException
			{
				SoftAssert softAssert = new SoftAssert();
		        functions = new CommanFunctions(driver);
		        manager=new TaskTypeManager(driver);
				String taskType=functions.getTaskTypeFromApplication();
		 		if(taskType.equals("Influencer Primary Verification") )
		 		{
		 			try
		 			{
		 			  By popUpCrossLocator=By.xpath("//button[@class=\"btn btn-link p-0  btn btn-btn-link\"]/i");
					  WaitVisibliltyOfLocated(popUpCrossLocator);
					  click(popUpCrossLocator);
				        String taskNoCallBackLaterSubmit=functions.getTaskNo();
				        System.out.println("Task no. of Influencer Verification-Reschedule  -Call Back Later -Submit button : "+taskNoCallBackLaterSubmit);
				        Thread.sleep(2000);
				        functions.callActionButton("Reschedule Call");
				        functions.selectRescheduleStatus("Call Back Later");
				        
				      //Click on Schedule time (+15 min)--Based On button index we can change time
						By timeLocator=By.xpath("//div[@class=\"d-grid gap-2 d-md-flex justify-content col\"]/button[3]");
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
				System.out.println(greenColor + "Influencer Verification Test Case : 38 Passed " + resetGreenColor);
				
		 			}catch (AssertionError ae) {
					      
					     System.out.println(redColor + "Influencer Verification Test Case : 38 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
				     }catch(Exception e)
				 		{
				 			System.out.println(redColor+"Influencer Verification Test Case : 38 Failed.\n Exception : " + e.getMessage()+ resetColor);
				 		}
				 TestCaseTracker.markAsExecuted("inflVerfRescheduleCallBackLaterSubmit");
				}
		 		
		 		
		 		else
		 		{
		 			System.out.println("Task type is not Influencer Verification");
		 			manager.executeTask();
		 		}
		 	
			}
			
			
			
			@Test(priority = 39, alwaysRun = true)
			public void inflVerfRescheduleWrongNoSubmitBreak() throws InterruptedException, IOException
			{	SoftAssert softAssert = new SoftAssert();
			     functions = new CommanFunctions(driver);
			     manager=new TaskTypeManager(driver);
				//verify Task Type
		 		String taskType=functions.getTaskTypeFromApplication();
		 		if(taskType.equals("Influencer Primary Verification") )
		 		{
				
		 			try
		 			{
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
						System.out.println(greenColor + "Influencer Verification Test Case : 39 Passed " + resetGreenColor);
						
		 			}catch (AssertionError ae) {
					      
					     System.out.println(redColor + "Influencer Verification Test Case : 39 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
				     }catch(Exception e)
				 		{
				 			System.out.println(redColor+"Influencer Verification Test Case : 39 Failed.\n Exception : " + e.getMessage()+ resetColor);
				 		}
							TestCaseTracker.markAsExecuted("inflVerfRescheduleWrongNoSubmitBreak");
			      }
		 		
		 		else
		 		{
		 			System.out.println("Task type is not Influencer Verification");
		 			manager.executeTask();
		 		}
		 		
			
			
			}
			
			
			
			
			@Test(priority = 40, alwaysRun = true)
			public void inflVerfRescheduleWrongNoTaskStatus() throws InterruptedException
			{	
				try
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
				System.out.println(greenColor + "Influencer Verification Test Case : 40 Passed " + resetGreenColor);
				
				}catch (AssertionError ae) {
				      
				     System.out.println(redColor + "Influencer Verification Test Case : 40 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
			     }catch(Exception e)
			 		{
			 			System.out.println(redColor+"Influencer Verification Test Case : 40 Failed.\n Exception : " + e.getMessage()+ resetColor);
			 		}
				 TestCaseTracker.markAsExecuted("inflVerfRescheduleWrongNoTaskStatus");
				
				}
			
			
			
			@Test(priority = 41, alwaysRun = true)
			public void inflVerfRescheduleWrongNoSubmit() throws InterruptedException, IOException
			{
				SoftAssert softAssert = new SoftAssert();
			       functions = new CommanFunctions(driver);
			       manager=new TaskTypeManager(driver);
				String taskType=functions.getTaskTypeFromApplication();
		 		if(taskType.equals("Influencer Primary Verification") )
		 		{
		 			try
		 			{
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
				System.out.println(greenColor + "Influencer Verification Test Case : 41 Passed - Last Test Case." + resetGreenColor);
				
		 			}catch (AssertionError ae) {
					      
					     System.out.println(redColor + "Influencer Verification Test Case : 41 Failed - Last Test Case.\n Assertion error: " + ae.getMessage() + resetColor);
				     }catch(Exception e)
				 		{
				 			System.out.println(redColor+"Influencer Verification Test Case : 41 Failed - Last Test Case.\n Exception : " + e.getMessage()+ resetColor);
				 		}
				 //TestCaseTracker.markAsExecuted("inflVerfRescheduleWrongNoSubmit");
				}
		 		else
		 		{
		 			System.out.println("Task type is not Influencer Verification");
		 			manager.executeTask();
		 		}
		 	
			}
			
			
			

			
			@DataProvider(name = "inflVerificationData")
			public Object[][] inflVerificationDetails() {

				// call method to read & enter json data
				Object[][] dataArray = readJsonData(System.getProperty("user.dir")+"\\src\\test\\java\\com\\jspl_automation\\data\\InfluncerVerificationDetails.json");
				return dataArray;


			};
			
	}

	



