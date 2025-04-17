package com.jspl.OutboundTask;

import java.io.IOException;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.jspl.TestComponents.CommanFunctions;
import com.jspl_automation.pageobjects.DialerLoginPage;

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

	

	
	ExtentTest test;
	InfluencerVerificationTask(WebDriver driver, ExtentTest test) {
		this.driver = driver;
        this.test = test;
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
		public void inflVerifCloseTaskbuttonclickable() throws IOException
		{
			ExtentTest methodTest = test.createNode("inflVerifCloseTaskbuttonclickable");
	        logTestMethod(driver,methodTest, "inflVerifCloseTaskbuttonclickable", () ->{ 
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
			
	        });
			TestCaseTracker.markAsExecuted("inflVerifCloseTaskbuttonclickable");
			
			
		}
		
		@Test(priority = 2)
		public void inflVerifCloseTaskSubmitbuttonclickable() throws IOException
		{
			ExtentTest methodTest = test.createNode("inflVerifCloseTaskSubmitbuttonclickable");
	        logTestMethod(driver,methodTest, "inflVerifCloseTaskSubmitbuttonclickable", () ->{ 
			SoftAssert softAssert = new SoftAssert();
			functions = new CommanFunctions(driver);
			By submitButtonLocator=By.xpath("//button[@class=\"btn btn-success\"]");
			click(submitButtonLocator);
			
			By errorLocator=By.xpath("//div[text()=\"Please Enter Remark\"]");
			WaitVisibliltyOfLocated(errorLocator);
			WebElement errorElement=driver.findElement(errorLocator);
			softAssert.assertTrue(errorElement.isDisplayed(),"Close Task Submit button not clickable");
			
	        softAssert.assertAll();
	        
	        });
			TestCaseTracker.markAsExecuted("inflVerifCloseTaskSubmitbuttonclickable");
			
		}
		
		@Test(priority = 3)
		public void inflVerifCloseTaskSubmitBreakbuttonclickable() throws IOException
		{
			ExtentTest methodTest = test.createNode("inflVerifCloseTaskSubmitBreakbuttonclickable");
	        logTestMethod(driver,methodTest, "inflVerifCloseTaskSubmitBreakbuttonclickable", () ->{ 
			SoftAssert softAssert = new SoftAssert();
			functions = new CommanFunctions(driver);
			By submitButtonLocator=By.xpath("//button[@class=\"btn btn-primary me-md-2 btn btn-primary\"]");
			click(submitButtonLocator);
			By errorLocator=By.xpath("//div[text()=\"Please Enter Remark\"]");
			WaitVisibliltyOfLocated(errorLocator);
			WebElement errorElement=driver.findElement(errorLocator);
			softAssert.assertTrue(errorElement.isDisplayed(),"Close Task Submit & Break button not clickable");
			
	        softAssert.assertAll();
	        });
			TestCaseTracker.markAsExecuted("inflVerifCloseTaskSubmitBreakbuttonclickable");
			
		}
		
		@Test(priority = 4)
		public void inflVerifCloseTaskCancelbuttonclickable() throws IOException
		{
			ExtentTest methodTest = test.createNode("inflVerifCloseTaskCancelbuttonclickable");
	        logTestMethod(driver,methodTest, "inflVerifCloseTaskCancelbuttonclickable", () ->{ 
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
	        });
			TestCaseTracker.markAsExecuted("inflVerifCloseTaskCancelbuttonclickable");
			
		}
		
		@Test(priority = 5)
		public void inflVerifCloseTaskCrossIconclickable() throws IOException
		{
			ExtentTest methodTest = test.createNode("inflVerifCloseTaskCrossIconclickable");
	        logTestMethod(driver,methodTest, "inflVerifCloseTaskCrossIconclickable", () ->{ 
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
	        });
			TestCaseTracker.markAsExecuted("inflVerifCloseTaskCrossIconclickable");
			
		}
		
		@Test(priority = 6)
		public void inflVerifRescheduledbuttonclickable() throws IOException
		{
			ExtentTest methodTest = test.createNode("inflVerifRescheduledbuttonclickable");
	        logTestMethod(driver,methodTest, "inflVerifRescheduledbuttonclickable", () ->{ 
			SoftAssert softAssert = new SoftAssert();
			functions = new CommanFunctions(driver);
			functions.callActionButton("Reschedule Call");
			By rescheduleLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
			WaitVisibliltyOfLocated(rescheduleLableLocator);
			WebElement rescheduleLableElement=driver.findElement(rescheduleLableLocator);
			softAssert.assertTrue(rescheduleLableElement.isDisplayed(),"Reschedule Button not clickable");
			softAssert.assertAll();
	        });
			TestCaseTracker.markAsExecuted("inflVerifRescheduledbuttonclickable");
			
			
		}
		
		@Test(priority = 7)
		public void inflVerifRescheduledSubmitbuttonclickable() throws IOException
		{
			ExtentTest methodTest = test.createNode("inflVerifRescheduledSubmitbuttonclickable");
	        logTestMethod(driver,methodTest, "inflVerifRescheduledSubmitbuttonclickable", () ->{ 
			SoftAssert softAssert = new SoftAssert();
			functions = new CommanFunctions(driver);
			By submitButtonLocator=By.xpath("//button[@class=\"btn btn-success\"]");
			click(submitButtonLocator);
			
			By errorLocator=By.xpath("//div[text()=\"Please Select Schedule Status\"]");
			WaitVisibliltyOfLocated(errorLocator);
			WebElement errorElement=driver.findElement(errorLocator);
			softAssert.assertTrue(errorElement.isDisplayed(),"Reschedule Submit button not clickable");
			
	        softAssert.assertAll();
	        });
			TestCaseTracker.markAsExecuted("inflVerifRescheduledSubmitbuttonclickable");
		}
		
		@Test(priority = 8)
		public void inflVerifRescheduledSubmitBreakbuttonclickable() throws IOException
		{
			ExtentTest methodTest = test.createNode("inflVerifRescheduledSubmitBreakbuttonclickable");
	        logTestMethod(driver,methodTest, "inflVerifRescheduledSubmitBreakbuttonclickable", () ->{ 
			SoftAssert softAssert = new SoftAssert();
			functions = new CommanFunctions(driver);
			By submitButtonLocator=By.xpath("//button[@class=\"btn btn-primary me-md-2 btn btn-primary\"]");
			click(submitButtonLocator);
			By errorLocator=By.xpath("//div[text()=\"Please Select Schedule Status\"]");
			WaitVisibliltyOfLocated(errorLocator);
			WebElement errorElement=driver.findElement(errorLocator);
			softAssert.assertTrue(errorElement.isDisplayed(),"Reschedule Submit & Break button not clickable");
			
	        softAssert.assertAll();
	        });
			TestCaseTracker.markAsExecuted("inflVerifRescheduledSubmitBreakbuttonclickable");
		}
		
		@Test(priority = 9)
		public void inflVerifRescheduledCancelbuttonclickable() throws IOException
		{
			ExtentTest methodTest = test.createNode("inflVerifRescheduledCancelbuttonclickable");
	        logTestMethod(driver,methodTest, "inflVerifRescheduledCancelbuttonclickable", () ->{ 
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
	        });
			TestCaseTracker.markAsExecuted("inflVerifRescheduledCancelbuttonclickable");
			
		}
		
		@Test(priority = 10)
		public void inflVerifRescheduledCrossIconclickable() throws IOException
		{
			ExtentTest methodTest = test.createNode("inflVerifRescheduledCrossIconclickable");
	        logTestMethod(driver,methodTest, "inflVerifRescheduledCrossIconclickable", () ->{ 
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
	        });
			TestCaseTracker.markAsExecuted("inflVerifRescheduledCrossIconclickable");
		}
		
			
			
			
			@Test(priority = 11, alwaysRun = true)
			public void inflVerifBack() throws InterruptedException, IOException
			{
				ExtentTest methodTest = test.createNode("inflVerifBack");
		        logTestMethod(driver,methodTest, "inflVerifBack", () ->{ 
				SoftAssert softAssert = new SoftAssert();
				functions = new CommanFunctions(driver);
				backButtonTaskNo =functions.getTaskNo();
				System.out.println("Influncer Verification backButtonTaskNo : "+ backButtonTaskNo);
				try {
					Thread.sleep(9000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				functions.callActionButton("Back");
				//verify Dial Next button display or not
				By dialNextElement= (By.xpath("//*[contains(text(),\"Dial Next\")]"));
				WaitVisibliltyOf(dialNextElement);
				 WebElement dialNext=driver.findElement(dialNextElement);
				 softAssert.assertTrue(dialNext.isDisplayed(),"Test Failed :inflVerifBack Back Button Not working proper");
				// Call assertAll to aggregate the results
					softAssert.assertAll();
		        });
					TestCaseTracker.markAsExecuted("inflVerifBack");
				 
			}
			
			@Test(priority = 12, alwaysRun = true)
			public void inflVerifBackTaskStatus() throws IOException 
			{
				ExtentTest methodTest = test.createNode("inflVerifBackTaskStatus");
		        logTestMethod(driver,methodTest, "inflVerifBackTaskStatus", () ->{ 
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
		        });
				 TestCaseTracker.markAsExecuted("inflVerifBackTaskStatus");
				
				}
				
				
		   
			
			@Test(priority = 13, alwaysRun = true)
			public void inflVerifBackButtonDialNext() throws InterruptedException, IOException
			{   
				ExtentTest methodTest = test.createNode("inflVerifBackButtonDialNext");
		        logTestMethod(driver,methodTest, "inflVerifBackButtonDialNext", () ->{ 
				dialerPage=new DialerLoginPage(driver);
				//Verify after back task when click on dial next then same task should be open
				SoftAssert softAssert = new SoftAssert();
				functions = new CommanFunctions(driver);
				functions.dialNextClick();
				
				try {
					functions.checkErrorToastForInflVef();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}	 
				String newTaskNo= functions.getTaskNo();
				softAssert.assertEquals(newTaskNo, backButtonTaskNo,"Test Failed : inflVerifBackButtonDialNext -incorrect call connect");
				
				softAssert.assertAll();
		        });
			   TestCaseTracker.markAsExecuted("inflVerifBackButtonDialNext");
				
			}
			
			
			
			@Test(priority = 14, alwaysRun = true)
			public void inflVerifHangUp() throws InterruptedException, IOException
			{
				ExtentTest methodTest = test.createNode("inflVerifHangUp");
		        logTestMethod(driver,methodTest, "inflVerifHangUp", () ->{ 
				SoftAssert softAssert = new SoftAssert();
				functions = new CommanFunctions(driver);
				try
				{
				functions.checkErrorToastForInflVef();
				}catch(Exception e)
				{
					
				}
				//Thread.sleep(2000);
				By popUpCrossLocator=By.xpath("//button[@class=\"btn btn-link p-0  btn btn-btn-link\"]/i");
				WaitVisibliltyOfLocated(popUpCrossLocator);
				click(popUpCrossLocator);
				//Thread.sleep(3000);
				hangUpTaskNo=functions.getTaskNo();
				functions.callActionButton("Hangup");
				By loaderElement=By.xpath("// div[@id=\"loader-container\"]/p");
				WaitVisibliltyOfLocated(loaderElement);
				String loaderMsg=driver.findElement(loaderElement).getText();
				System.out.println(loaderMsg);

				softAssert.assertNotEquals(loaderMsg,"New Call Connecting", "Test Faild : inflVerifHangUp");
				softAssert.assertAll();
				 WaitInVisibliltyOfLocated(loaderElement);
		        });
				 TestCaseTracker.markAsExecuted("inflVerifHangUp");
						
			}
			
			
			
			
			@Test(priority = 15, alwaysRun = true)
			public void inflVefVerificationButtonClickable() throws IOException
			{
				ExtentTest methodTest = test.createNode("inflVefVerificationButtonClickable");
		        logTestMethod(driver,methodTest, "inflVefVerificationButtonClickable", () ->{ 
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
		        });
				 TestCaseTracker.markAsExecuted("inflVefVerificationButtonClickable");
				

				
			}
			
			@Test(priority = 16, alwaysRun = true)
			public void inflVefInfluncerVerificationButtonClickable() throws IOException
			{
				ExtentTest methodTest = test.createNode("inflVefInfluncerVerificationButtonClickable");
		        logTestMethod(driver,methodTest, "inflVefInfluncerVerificationButtonClickable", () ->{ 
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
		        });
				 TestCaseTracker.markAsExecuted("inflVefInfluncerVerificationButtonClickable");
				
				
			}
			
			@Test(priority = 17, alwaysRun = true)
			public void inflVefVerificationSubmitBreakButtonClickable() throws IOException
			{
				ExtentTest methodTest = test.createNode("inflVefVerificationSubmitBreakButtonClickable");
		        logTestMethod(driver,methodTest, "inflVefVerificationSubmitBreakButtonClickable", () ->{ 
				SoftAssert softAssert = new SoftAssert();
				functions = new CommanFunctions(driver);
				By submitBreakButtonLocator=By.xpath("//button[@class=\"btn btn-primary me-md-2 btn btn-primary\"]");
				click(submitBreakButtonLocator);
				By errorLocator=By.xpath("//div[text()=\"Please Enter year in Construction business\"]");
				WaitVisibliltyOfLocated(errorLocator);
				WebElement errorElement=driver.findElement(errorLocator);
				softAssert.assertTrue(errorElement.isDisplayed(),"Influncer Verification Submit & Break button not clickable");
				
		        softAssert.assertAll();
		        });
				TestCaseTracker.markAsExecuted("inflVefVerificationSubmitBreakButtonClickable");
				
				
			}
			
			@Test(priority = 18, alwaysRun = true)
			public void inflVefVerificationCancelButtonClickable() throws IOException
			{
				ExtentTest methodTest = test.createNode("inflVefVerificationCancelButtonClickable");
		        logTestMethod(driver,methodTest, "inflVefVerificationCancelButtonClickable", () ->{ 
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
		        });
				TestCaseTracker.markAsExecuted("inflVefVerificationCancelButtonClickable");
				
				
			}
			
			@Test(priority = 19, alwaysRun = true)
			public void inflVefVerificationSubmitButtonClickable() throws IOException
			{
				ExtentTest methodTest = test.createNode("inflVefVerificationSubmitButtonClickable");
		        logTestMethod(driver,methodTest, "inflVefVerificationSubmitButtonClickable", () ->{ 
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
		        });
				
				TestCaseTracker.markAsExecuted("inflVefVerificationSubmitButtonClickable");
				
			}
			
			@Test(priority = 20, alwaysRun = true)
			public void inflVefVerificationCrossIconClickable() throws IOException
			{
				ExtentTest methodTest = test.createNode("inflVefVerificationCrossIconClickable");
		        logTestMethod(driver,methodTest, "inflVefVerificationCrossIconClickable", () ->{ 
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
		        });
				TestCaseTracker.markAsExecuted("inflVefVerificationCrossIconClickable");
				
			}
			
			@Test(priority = 21, alwaysRun = true)
			public void inflVefVerificationMandtoryFields() throws IOException
			{
				ExtentTest methodTest = test.createNode("inflVefVerificationMandtoryFields");
		        logTestMethod(driver,methodTest, "inflVefVerificationMandtoryFields", () ->{ 
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
		        
		        
		        softAssert.assertAll();
		       
		        });
		        By crossIconLocator=By.xpath("//button[@class=\"btn btn-link p-0  btn btn-btn-link\"]/i");
				click(crossIconLocator);
				TestCaseTracker.markAsExecuted("inflVefVerificationMandtoryFields");
				
			}
			
			
			@Test(priority = 22, alwaysRun = true)
			public void inflVerifRedial() throws InterruptedException, IOException

			{ 
				
				ExtentTest methodTest = test.createNode("inflVerifRedial");
		        logTestMethod(driver,methodTest, "inflVerifRedial", () ->{ 
				SoftAssert softAssert = new SoftAssert();
				functions = new CommanFunctions(driver);
				//Thread.sleep(2000);
				String oldTaskNo = functions.getTaskNo();
				System.out.println("Influncer Verification oldTaskNo : "+ oldTaskNo);
				// click on Redial button
				functions.callActionButton("Redial");
				try {
					Thread.sleep(12000);
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}
				By taskPopUpLocator=By.xpath("//*[@id=\"TelecallingInfoDiv\"]/div/div/a/div/div[3]/marquee/span");
				WaitVisibliltyOfLocated(taskPopUpLocator);
				String newTaskNo = functions.getTaskNo();
				System.out.println("Influncer Verification newTaskNo : "+ newTaskNo);
				softAssert.assertEquals(newTaskNo, oldTaskNo, "Test Failed : Redial button not working properly");
				
			    softAssert.assertAll();
		        });
				TestCaseTracker.markAsExecuted("inflVerifRedial");
				

			}
			
			
			
	
			
			@Test(priority = 23, dataProvider= "inflVerificationData", alwaysRun = true)
			public void inflVefEnterVerificationData(String yearsInBuss, String noOfMasons, String currentSitesNo,
                    String sitesPerYear, String brandUsed, String mostPreferredBrand, String status) throws InterruptedException, IOException
			
			{
				ExtentTest methodTest = test.createNode("inflVefEnterVerificationData");
		        logTestMethod(driver,methodTest, "inflVefEnterVerificationData", () ->{ 
				SoftAssert softAssert = new SoftAssert();
				functions = new CommanFunctions(driver);
				//Thread.sleep(2000);
				inflVerificationTaskNo =functions.getTaskNo();
				System.out.println("Influncer Verification Task No : "+ inflVerificationTaskNo);
				try {
					functions.enterInfluncerVerificationData(yearsInBuss, noOfMasons, currentSitesNo, sitesPerYear, brandUsed, mostPreferredBrand, status);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
		        softAssert.assertAll();

		        });
				TestCaseTracker.markAsExecuted("inflVefEnterVerificationData");

			}
			
			
			@Test(priority = 24, alwaysRun = true)
			public void inflVefBySubmitBreakButton() throws IOException
			{
				ExtentTest methodTest = test.createNode("inflVefBySubmitBreakButton");
		        logTestMethod(driver,methodTest, "inflVefBySubmitBreakButton", () ->{ 
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
		        });
				TestCaseTracker.markAsExecuted("inflVefBySubmitBreakButton");
			}
			
			@Test(priority = 25, alwaysRun = true)
			public void inflVefBySubmitBreakButtonVerifyNextCall() throws InterruptedException, IOException
			{
				ExtentTest methodTest = test.createNode("inflVefBySubmitBreakButtonVerifyNextCall");
		        logTestMethod(driver,methodTest, "inflVefBySubmitBreakButtonVerifyNextCall", () ->{ 
				//Next Call should not be connect
		    	 SoftAssert softAssert = new SoftAssert();
		  		functions = new CommanFunctions(driver);
		  		//Thread.sleep(5000);
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
					
		        });
				
					TestCaseTracker.markAsExecuted("inflVefBySubmitBreakButtonVerifyNextCall");
		    	 
				
			}
			
			@Test(priority = 26, alwaysRun = true)
			public void inflVefCheckTaskStatusOnDashboard() throws IOException
			{
				ExtentTest methodTest = test.createNode("inflVefCheckTaskStatusOnDashboard");
		        logTestMethod(driver,methodTest, "inflVefCheckTaskStatusOnDashboard", () ->{ 
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
		        });
				
		 		 TestCaseTracker.markAsExecuted("inflVefCheckTaskStatusOnDashboard");
			}
			
			
			
			@Test(priority = 27, dataProvider="inflVerificationData", alwaysRun = true)
			public void inflVefBySubmitButton(String yearsInBuss, String noOfMasons, String currentSitesNo,
                    String sitesPerYear, String brandUsed, String mostPreferredBrand, String status) throws InterruptedException, IOException
			{
				
				//If Next call is Available then call should be connect directly
				SoftAssert softAssert = new SoftAssert();
		 		functions = new CommanFunctions(driver);
		 		manager=new TaskTypeManager(driver, test);
		 		
		 		//verify Task Type
		 		String taskType=functions.getTaskTypeFromApplication();
		 		if(taskType.equals("Influencer Primary Verification") )
		 		{
		           
		 			ExtentTest methodTest = test.createNode("inflVefBySubmitButton");
			        logTestMethod(driver,methodTest, "inflVefBySubmitButton", () ->{ 
		 				
		    		//Thread.sleep(2000);
		    		inflVerificationTaskNo =functions.getTaskNo();
		    		System.out.println("Influncer Verification Task no : "+ inflVerificationTaskNo);
		    		try {
						functions.enterInfluncerVerificationData(yearsInBuss, noOfMasons, currentSitesNo, sitesPerYear, brandUsed, mostPreferredBrand, status);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
		    		
		    		
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
			        });
		 			
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
				manager=new TaskTypeManager(driver, test);
		 		//verify Task Type
				
		 		String taskType=functions.getTaskTypeFromApplication();
		 		
		 		if(taskType.equals("Influencer Primary Verification") )
		 		{
		 			ExtentTest methodTest = test.createNode("inflVefCloseTaskSubmitBreak");
			        logTestMethod(driver,methodTest, "inflVefCloseTaskSubmitBreak", () ->{ 
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
				//Thread.sleep(2000);
				By taskNoLocators=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a");
				WaitInVisibliltyOfLocated(taskNoLocators);
				List<WebElement> taskNoElements=driver.findElements(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a"));
				for(int i=1; i<=taskNoElements.size();i++)
				 {  
					By taskNoElement=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div/a");
					WaitVisibliltyOf(taskNoElement);
					String taskNo=driver.findElement(taskNoElement).getText();
					 System.out.println("Dashboard Task No :" +taskNo);
					 //Thread.sleep(2000);
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
			        });
		 			
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
				manager=new TaskTypeManager(driver, test);
				//verify Task Type
		 		String taskType=functions.getTaskTypeFromApplication();
		 		
		 		if(taskType.equals("Influencer Primary Verification") )
		 		{
		 			ExtentTest methodTest = test.createNode("inflVefCloseTaskSubmit");
			        logTestMethod(driver,methodTest, "inflVefCloseTaskSubmit", () ->{ 
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
			        });
		 			
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
				manager=new TaskTypeManager(driver, test);
				String taskType=functions.getTaskTypeFromApplication();
	 		   if(taskType.equals("Influencer Primary Verification") )
	 		  {
	 			  ExtentTest methodTest = test.createNode("inflVefRescheduleNotInterestedSubmitBreak");
			        logTestMethod(driver,methodTest, "inflVefRescheduleNotInterestedSubmitBreak", () ->{ 
	 			By popUpCrossLocator=By.xpath("//button[@class=\"btn btn-link p-0  btn btn-btn-link\"]/i");
				WaitVisibliltyOfLocated(popUpCrossLocator);
				click(popUpCrossLocator);
				
				inflVefNotInterestedTakNo=functions.getTaskNo();
				System.out.println("Task No-Influncer Verification- Reschedule-Not Interested -Submit & break button : "+ inflVefNotInterestedTakNo);
				//Thread.sleep(2000);
				functions.callActionButton("Reschedule Call");
				try {
					functions.selectRescheduleStatus("Not interested");
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
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
			        });
							TestCaseTracker.markAsExecuted("inflVefRescheduleNotInterestedSubmitBreak");
			      }
		 		
		 		else
		 		{
		 			System.out.println("Task type is not Influencer Verification");
		 			manager.executeTask();
		 		}
		 		
				}
			

			@Test(priority = 31, alwaysRun = true)
			public void inflVerfRescheduleNotInterestedTaskStatus() throws InterruptedException, IOException
			{	
				ExtentTest methodTest = test.createNode("inflVerfRescheduleNotInterestedTaskStatus");
		        logTestMethod(driver,methodTest, "inflVerfRescheduleNotInterestedTaskStatus", () ->{ 
				SoftAssert softAssert = new SoftAssert();
				functions = new CommanFunctions(driver);

				boolean status=false;
				By element=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a");
				WaitVisibliltyOfLocated(element);
				//Thread.sleep(2000);
				//get task no from dashboard
				By taskNoLocators= By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a");
				WaitVisibliltyOfLocated(taskNoLocators);
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
		        });
				 TestCaseTracker.markAsExecuted("inflVerfRescheduleNotInterestedTaskStatus");
				
				}
			
			
			@Test(priority = 32, alwaysRun = true)
			public void inflVefRescheduleNotInterestedSubmit() throws InterruptedException, IOException
			{
				SoftAssert softAssert = new SoftAssert();
		        functions = new CommanFunctions(driver);
		        manager=new TaskTypeManager(driver, test);
				String taskType=functions.getTaskTypeFromApplication();
		 		if(taskType.equals("Influencer Primary Verification") )
		 		{
		 			ExtentTest methodTest = test.createNode("inflVefRescheduleNotInterestedSubmit");
			        logTestMethod(driver,methodTest, "inflVefRescheduleNotInterestedSubmit", () ->{ 
		 			By popUpCrossLocator=By.xpath("//button[@class=\"btn btn-link p-0  btn btn-btn-link\"]/i");
					WaitVisibliltyOfLocated(popUpCrossLocator);
					click(popUpCrossLocator);
				        String taskNoNotInterestedSubmit=functions.getTaskNo();
				        System.out.println("Task no. of Influencer Verification-Reschedule-Not Interested-Submit button : "+taskNoNotInterestedSubmit);
				       // Thread.sleep(2000);
				        functions.callActionButton("Reschedule Call");
				        try {
							functions.selectRescheduleStatus("Not interested");
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
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
			        });
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
				 manager=new TaskTypeManager(driver, test);
				String taskType=functions.getTaskTypeFromApplication();
	 		   if(taskType.equals("Influencer Primary Verification") )
	 		  {
	 			  ExtentTest methodTest = test.createNode("inflVefRescheduleRingNotReceivedSubmitBreak");
			        logTestMethod(driver,methodTest, "inflVefRescheduleRingNotReceivedSubmitBreak", () ->{ 
	 			  By popUpCrossLocator=By.xpath("//button[@class=\"btn btn-link p-0  btn btn-btn-link\"]/i");
				  WaitVisibliltyOfLocated(popUpCrossLocator);
				  click(popUpCrossLocator);
				
				inflVefRingNotReceivedTaskNo=functions.getTaskNo();
				System.out.println("Task No- Influencer Verification- Reschedule-Ringing Not Received -Submit & break button : "+ inflVefRingNotReceivedTaskNo);
				//Thread.sleep(2000);
				functions.callActionButton("Reschedule Call");
				try {
					functions.selectRescheduleStatus("Ringing not received");
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
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
			        });
	 			   
							TestCaseTracker.markAsExecuted("inflVefRescheduleRingNotReceivedSubmitBreak");
			      }
		 		
		 		else
		 		{
		 			System.out.println("Task type is not Influencer Verification");
		 			manager.executeTask();
		 	
		 		}
		 		
				}
			
			
			
			@Test(priority = 34, alwaysRun = true)
			public void inflVerfRescheduleRingNotReceivedTaskStatus() throws InterruptedException, IOException
			{	
				ExtentTest methodTest = test.createNode("inflVerfRescheduleRingNotReceivedTaskStatus");
		        logTestMethod(driver,methodTest, "inflVerfRescheduleRingNotReceivedTaskStatus", () ->{ 
				SoftAssert softAssert = new SoftAssert();
				functions = new CommanFunctions(driver);

				boolean status=false;
				By element=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a");
				WaitVisibliltyOfLocated(element);
				//Thread.sleep(2000);
				//get task no from dashboard
				By taskNoLocators= By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a");
				WaitVisibliltyOfLocated(taskNoLocators);
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
		        });
				
				 TestCaseTracker.markAsExecuted("inflVerfRescheduleRingNotReceivedTaskStatus");
				
				}
			
			
			@Test(priority = 35, alwaysRun = true)
			public void inflVerfRescheduleRingNotReceivedSubmit() throws InterruptedException, IOException
			{
				SoftAssert softAssert = new SoftAssert();
		        functions = new CommanFunctions(driver);
		        manager=new TaskTypeManager(driver, test);
				String taskType=functions.getTaskTypeFromApplication();
		 		if(taskType.equals("Influencer Primary Verification") )
		 		{
		 			ExtentTest methodTest = test.createNode("inflVerfRescheduleRingNotReceivedSubmit");
			        logTestMethod(driver,methodTest, "inflVerfRescheduleRingNotReceivedSubmit", () ->{
		 			  By popUpCrossLocator=By.xpath("//button[@class=\"btn btn-link p-0  btn btn-btn-link\"]/i");
					  WaitVisibliltyOfLocated(popUpCrossLocator);
					  click(popUpCrossLocator);
				        String taskNoRigNotReceivedSubmit=functions.getTaskNo();
				        System.out.println("Task no. of Influencer Verification-Reschedule-Ring Not Received -Submit button : "+taskNoRigNotReceivedSubmit);
				       // Thread.sleep(2000);
				        functions.callActionButton("Reschedule Call");
				        try {
							functions.selectRescheduleStatus("Ringing not received");
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
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
			        });
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
				 manager=new TaskTypeManager(driver, test);
				String taskType=functions.getTaskTypeFromApplication();
	 		   if(taskType.equals("Influencer Primary Verification") )
	 		  {
	 			  ExtentTest methodTest = test.createNode("inflVerfRescheduleCallBackLaterSubmitBreak");
			        logTestMethod(driver,methodTest, "inflVerfRescheduleCallBackLaterSubmitBreak", () ->{
	 			  By popUpCrossLocator=By.xpath("//button[@class=\"btn btn-link p-0  btn btn-btn-link\"]/i");
				  WaitVisibliltyOfLocated(popUpCrossLocator);
				  click(popUpCrossLocator);
	 			   
				inflVefCallBackLaterTaskNo=functions.getTaskNo();
				System.out.println("Task No- Influencer Verification- Reschedule-Call Back Later -Submit & break button : "+ inflVefCallBackLaterTaskNo);
				//Thread.sleep(2000);
				functions.callActionButton("Reschedule Call");
				try {
					functions.selectRescheduleStatus("Call Back Later");
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
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
			        });
							TestCaseTracker.markAsExecuted("inflVerfRescheduleCallBackLaterSubmitBreak");
			      }
		 		
		 		else
		 		{
		 			System.out.println("Task type is not Influencer Verification");
		 			manager.executeTask();
		 		}
		 		
				}
			
			
			@Test(priority = 37, alwaysRun = true)
			public void inflVerfRescheduleCallBackLaterTaskStatus() throws InterruptedException, IOException
			{	
				ExtentTest methodTest = test.createNode("inflVerfRescheduleCallBackLaterTaskStatus");
		        logTestMethod(driver,methodTest, "inflVerfRescheduleCallBackLaterTaskStatus", () ->{
				SoftAssert softAssert = new SoftAssert();
				functions = new CommanFunctions(driver);

				boolean status=false;
				By element=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a");
				WaitVisibliltyOfLocated(element);
				//Thread.sleep(2000);
				//get task no from dashboard
				By taskNoLocators= By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a");
				WaitVisibliltyOfLocated(taskNoLocators);
				List<WebElement> taskNoElements=driver.findElements(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a"));
				for(int i=1; i<=taskNoElements.size();i++)
				 {  
					By taskNoElement=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div/a");
					WaitVisibliltyOfLocated(taskNoElement);
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
		        });
				
				 TestCaseTracker.markAsExecuted("inflVerfRescheduleCallBackLaterTaskStatus");
				
				}
			
			
			@Test(priority = 38, alwaysRun = true)
			public void inflVerfRescheduleCallBackLaterSubmit() throws InterruptedException, IOException
			{
				SoftAssert softAssert = new SoftAssert();
		        functions = new CommanFunctions(driver);
		        manager=new TaskTypeManager(driver, test);
				String taskType=functions.getTaskTypeFromApplication();
		 		if(taskType.equals("Influencer Primary Verification") )
		 		{
		 			ExtentTest methodTest = test.createNode("inflVerfRescheduleCallBackLaterSubmit");
			        logTestMethod(driver,methodTest, "inflVerfRescheduleCallBackLaterSubmit", () ->{
		 			  By popUpCrossLocator=By.xpath("//button[@class=\"btn btn-link p-0  btn btn-btn-link\"]/i");
					  WaitVisibliltyOfLocated(popUpCrossLocator);
					  click(popUpCrossLocator);
				        String taskNoCallBackLaterSubmit=functions.getTaskNo();
				        System.out.println("Task no. of Influencer Verification-Reschedule  -Call Back Later -Submit button : "+taskNoCallBackLaterSubmit);
				        //Thread.sleep(2000);
				        functions.callActionButton("Reschedule Call");
				        try {
							functions.selectRescheduleStatus("Call Back Later");
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
				        
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
		 			});
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
			     manager=new TaskTypeManager(driver, test);
				//verify Task Type
		 		String taskType=functions.getTaskTypeFromApplication();
		 		if(taskType.equals("Influencer Primary Verification") )
		 		{
				
		 			ExtentTest methodTest = test.createNode("inflVerfRescheduleWrongNoSubmitBreak");
			        logTestMethod(driver,methodTest, "inflVerfRescheduleWrongNoSubmitBreak", () ->{
		 			 By popUpCrossLocator=By.xpath("//button[@class=\"btn btn-link p-0  btn btn-btn-link\"]/i");
					 WaitVisibliltyOfLocated(popUpCrossLocator);
					 click(popUpCrossLocator);
				inflVerifyWrongTaskNo=functions.getTaskNo();
				System.out.println("Task No-Influncer Verification- Reschedule- Wrong no-Submit & break button : "+ inflVerifyWrongTaskNo);
				//Thread.sleep(2000);
				functions.callActionButton("Reschedule Call");
				try {
					functions.selectRescheduleStatus("Wrong Number");
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
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
			        });
							TestCaseTracker.markAsExecuted("inflVerfRescheduleWrongNoSubmitBreak");
			      }
		 		
		 		else
		 		{
		 			System.out.println("Task type is not Influencer Verification");
		 			manager.executeTask();
		 		}
		 		
			
			
			}
			
			
			
			
			@Test(priority = 40, alwaysRun = true)
			public void inflVerfRescheduleWrongNoTaskStatus() throws InterruptedException, IOException
			{	
				ExtentTest methodTest = test.createNode("inflVerfRescheduleWrongNoTaskStatus");
		        logTestMethod(driver,methodTest, "inflVerfRescheduleWrongNoTaskStatus", () ->{
				SoftAssert softAssert = new SoftAssert();
				functions = new CommanFunctions(driver);

				boolean status=false;
				By element=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a");
				WaitVisibliltyOfLocated(element);
				//Thread.sleep(2000);
				//get task no from dashboard
				By taskNoLocators= By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a");
				WaitVisibliltyOfLocated(taskNoLocators);
				List<WebElement> taskNoElements=driver.findElements(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a"));
				for(int i=1; i<=taskNoElements.size();i++)
				 {  
					By taskNoElement=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div/a");
					WaitVisibliltyOfLocated(taskNoElement);
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
		        });
				 TestCaseTracker.markAsExecuted("inflVerfRescheduleWrongNoTaskStatus");
				
				}
			
			
			
			@Test(priority = 41, alwaysRun = true)
			public void inflVerfRescheduleWrongNoSubmit() throws InterruptedException, IOException
			{
				SoftAssert softAssert = new SoftAssert();
			       functions = new CommanFunctions(driver);
			       manager=new TaskTypeManager(driver, test);
				String taskType=functions.getTaskTypeFromApplication();
		 		if(taskType.equals("Influencer Primary Verification") )
		 		{
		 			ExtentTest methodTest = test.createNode("inflVerfRescheduleWrongNoSubmit");
			        logTestMethod(driver,methodTest, "inflVerfRescheduleWrongNoSubmit", () ->{
		 			 By popUpCrossLocator=By.xpath("//button[@class=\"btn btn-link p-0  btn btn-btn-link\"]/i");
					 WaitVisibliltyOfLocated(popUpCrossLocator);
					 click(popUpCrossLocator);
				        String taskNoWrongNoSubmit=functions.getTaskNo();
				        System.out.println("Task no. of Influencer Verification-Reschedule-Wrong no-Submit button : "+taskNoWrongNoSubmit);
				        //Thread.sleep(2000);
				        functions.callActionButton("Reschedule Call");
						try {
							functions.selectRescheduleStatus("Wrong Number");
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
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
			        });
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

	



