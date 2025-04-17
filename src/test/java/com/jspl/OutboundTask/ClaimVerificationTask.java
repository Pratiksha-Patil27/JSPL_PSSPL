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



public class ClaimVerificationTask extends BaseClass {

	DialerLoginPage dialerPage;
	CommanFunctions functions;
	TaskTypeManager manager;
	String claimVerifyBackButtonTaskNo;
	String claimVerifyHangUpTaskNo;
	String claimVerifyWrongTaskNo;
	String claimVerificationTaskNo;
	String claimVefNotInterestedTakNo;
	String claimVefRingNotReceivedTaskNo;
	String claimVefCallBackLaterTaskNo;

	
	ExtentTest test;
	public ClaimVerificationTask(WebDriver driver, ExtentTest test) {
		this.driver = driver;
        this.test = test;
	}

	
	
	public void runTests() throws InterruptedException, IOException {

		if (!TestCaseTracker.isExecuted("claimVerifCloseTaskbuttonclickable")) {
			claimVerifCloseTaskbuttonclickable();
		}

		if (!TestCaseTracker.isExecuted("claimVerifCloseTaskSubmitbuttonclickable")) {
			claimVerifCloseTaskSubmitbuttonclickable();
		}

		if (!TestCaseTracker.isExecuted("claimVerifCloseTaskSubmitBreakbuttonclickable")) {
			claimVerifCloseTaskSubmitBreakbuttonclickable();
		}

		if (!TestCaseTracker.isExecuted("claimVerifCloseTaskCancelbuttonclickable")) {
			claimVerifCloseTaskCancelbuttonclickable();
		}

		if (!TestCaseTracker.isExecuted("claimVerifCloseTaskCrossIconclickable")) {
			claimVerifCloseTaskCrossIconclickable();
		}

		if (!TestCaseTracker.isExecuted("claimVerifRescheduledbuttonclickable")) {
			claimVerifRescheduledbuttonclickable();
		}

		if (!TestCaseTracker.isExecuted("claimVerifRescheduledSubmitbuttonclickable")) {
			claimVerifRescheduledSubmitbuttonclickable();
		}

		if (!TestCaseTracker.isExecuted("claimVerifRescheduledSubmitBreakbuttonclickable")) {
			claimVerifRescheduledSubmitBreakbuttonclickable();
		}

		if (!TestCaseTracker.isExecuted("claimVerifRescheduledCancelbuttonclickable")) {
			claimVerifRescheduledCancelbuttonclickable();
		}

		if (!TestCaseTracker.isExecuted("claimVerifRescheduledCrossIconclickable")) {
			claimVerifRescheduledCrossIconclickable();
		}

		if (!TestCaseTracker.isExecuted("claimVerifClaimVerifyButtonClickable")) {
			claimVerifClaimVerifyButtonClickable();
		}

		if (!TestCaseTracker.isExecuted("claimVerifClaimSubmitBreakClickable")) {
			claimVerifClaimSubmitBreakClickable();
		}

		if (!TestCaseTracker.isExecuted("claimVerifClaimSubmitClickable")) {
			claimVerifClaimSubmitClickable();
		}

		if (!TestCaseTracker.isExecuted("claimVerifClaimCancelClickable")) {
			claimVerifClaimCancelClickable();
		}

		if (!TestCaseTracker.isExecuted("claimVerifClaimCrossIconClickable")) {
			claimVerifClaimCrossIconClickable();
		}

		if (!TestCaseTracker.isExecuted("claimVerifRedial")) {
			claimVerifRedial();
		}

		if (!TestCaseTracker.isExecuted("claimVerifBack")) {
			claimVerifBack();
		}

		if (!TestCaseTracker.isExecuted("claimVerifBackTaskStatus")) {
			claimVerifBackTaskStatus();
		}

		if (!TestCaseTracker.isExecuted("claimVerifBackButtonDialNext")) {
			claimVerifBackButtonDialNext();
		}

		if (!TestCaseTracker.isExecuted("claimVerifHangUp")) {
			claimVerifHangUp();
		}

		if (!TestCaseTracker.isExecuted("claimVerifStatusPendingCloseTaskBySubmit")) {
			claimVerifStatusPendingCloseTaskBySubmit();
		}

		if (!TestCaseTracker.isExecuted("claimVerifStatusPendingCloseTaskBySubmitBreak")) {
			claimVerifStatusPendingCloseTaskBySubmitBreak();
		}

		if (!TestCaseTracker.isExecuted("verifyClaimedPointsOfClaimVerification")) {
			verifyClaimedPointsOfClaimVerification();
		}

		if (!TestCaseTracker.isExecuted("claimVerificationEnterMaxQty")) {
			claimVerificationEnterMaxQty();
		}

		if (!TestCaseTracker.isExecuted("claimVerifselectStatusApproveVerifyReasonField")) {
			claimVerifselectStatusApproveVerifyReasonField();
		}

		if (!TestCaseTracker.isExecuted("claimVerifselectStatusRejectVerifyReasonField")) {
			claimVerifselectStatusRejectVerifyReasonField();
		}

		if (!TestCaseTracker.isExecuted("claimVefclaimStatusRejectVerifyQtyPoints")) {
			claimVefclaimStatusRejectVerifyQtyPoints();
		}

		if (!TestCaseTracker.isExecuted("claimVerifStatusRejectSubmitClaim")) {
			claimVerifStatusRejectSubmitClaim();
		}

		if (!TestCaseTracker.isExecuted("openClaimVerification")) {
			openClaimVerification();
		}

		if (!TestCaseTracker.isExecuted("enterclaimDataForClaimVerification")) {
			// Fetch data from DataProvider
			Object[][] data = claimVerificationDetails();

			for (int i = 1; i <= data.length; i++) {

				HashMap<String, String> claimData = (HashMap<String, String>) data[i - 1][0];

				String claimQty = claimData.get("qty");
				String claimStatus = claimData.get("status");
				String rejectReason = claimData.get("reason");
				String claimRemark = claimData.get("remark");
				enterclaimDataForClaimVerification(i, claimQty, claimStatus, rejectReason, claimRemark);
			}
		}

		if (!TestCaseTracker.isExecuted("verifyTotalClaimPointsOfClaimVerification")) {
			verifyTotalClaimPointsOfClaimVerification();
		}

		if (!TestCaseTracker.isExecuted("verifyClaimBySubmitBreakButtonClaimVef")) {
			verifyClaimBySubmitBreakButtonClaimVef();
		}

		if (!TestCaseTracker.isExecuted("claimVefBySubmitBreakButtonVerifyNextCall")) {
			claimVefBySubmitBreakButtonVerifyNextCall();
		}

		if (!TestCaseTracker.isExecuted("verifyTaskStatusOnDashboardForClaimVef")) {
			verifyTaskStatusOnDashboardForClaimVef();
		}

		if (!TestCaseTracker.isExecuted("openClaimVerificationForSubmitButton")) {
			openClaimVerificationForSubmitButton();
		}

		if (!TestCaseTracker.isExecuted("enterClaimDataSubmitButtonClaimVef")) {
			// Fetch data from DataProvider
			Object[][] data = claimVerificationDetails();

			for (int i = 1; i <= data.length; i++) {

				HashMap<String, String> claimData = (HashMap<String, String>) data[i - 1][0];

				String claimQty = claimData.get("qty");
				String claimStatus = claimData.get("status");
				String rejectReason = claimData.get("reason");
				String claimRemark = claimData.get("remark");
				enterClaimDataSubmitButtonClaimVef(i, claimQty, claimStatus, rejectReason, claimRemark);
			}

		}

		if (!TestCaseTracker.isExecuted("verifyClaimBySubmitButtonClaimVef")) {
			verifyClaimBySubmitButtonClaimVef();
		}

		if (!TestCaseTracker.isExecuted("claimVerifRescheduleNotInterestedSubmitBreak")) {
			claimVerifRescheduleNotInterestedSubmitBreak();
		}

		if (!TestCaseTracker.isExecuted("claimVerifRescheduleNotInterestedTaskStatus")) {
			claimVerifRescheduleNotInterestedTaskStatus();
		}

		if (!TestCaseTracker.isExecuted("claimVerifRescheduleNotInterestedSubmit")) {
			claimVerifRescheduleNotInterestedSubmit();
		}

		if (!TestCaseTracker.isExecuted("claimVerifRescheduleRingNotReceivedSubmitBreak")) {
			claimVerifRescheduleRingNotReceivedSubmitBreak();
		}

		if (!TestCaseTracker.isExecuted("claimVerifRescheduleRingNotReceivedTaskStatus")) {
			claimVerifRescheduleRingNotReceivedTaskStatus();
		}

		if (!TestCaseTracker.isExecuted("claimVerifRescheduleRingNotReceivedSubmit")) {
			claimVerifRescheduleRingNotReceivedSubmit();
		}

		if (!TestCaseTracker.isExecuted("claimVerifRescheduleCallBackLaterSubmitBreak")) {
			claimVerifRescheduleCallBackLaterSubmitBreak();
		}

		if (!TestCaseTracker.isExecuted("claimVerifRescheduleCallBackLaterTaskStatus")) {
			claimVerifRescheduleCallBackLaterTaskStatus();
		}

		if (!TestCaseTracker.isExecuted("claimVerifRescheduleCallBackLaterSubmit")) {

			claimVerifRescheduleCallBackLaterSubmit();

		}

		if (!TestCaseTracker.isExecuted("claimVerifRescheduleWrongNoSubmitBreak")) {

			claimVerifRescheduleWrongNoSubmitBreak();

		}

		if (!TestCaseTracker.isExecuted("claimVerifRescheduleWrongNoTaskStatus")) {
			claimVerifRescheduleWrongNoTaskStatus();
		}

		if (!TestCaseTracker.isExecuted("claimVerifRescheduleWrongNoSubmit")) {
			claimVerifRescheduleWrongNoSubmit();
		}

	}
	
	
	
	@Test(priority = 1)
	public void claimVerifCloseTaskbuttonclickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("claimVerifCloseTaskbuttonclickable");
        logTestMethod(driver,methodTest, "claimVerifCloseTaskbuttonclickable", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.callActionButton("Close Task");
		By closeTaskLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
		WaitVisibliltyOfLocated(closeTaskLableLocator);
		WebElement closeTaskLableElement=driver.findElement(closeTaskLableLocator);
		softAssert.assertTrue(closeTaskLableElement.isDisplayed(),"Close Task Button not clickable");
		softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("claimVerifCloseTaskbuttonclickable");
		
		
	}
	
	@Test(priority = 2)
	public void claimVerifCloseTaskSubmitbuttonclickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("claimVerifCloseTaskSubmitbuttonclickable");
        logTestMethod(driver,methodTest,"claimVerifCloseTaskSubmitbuttonclickable", () ->{ 
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
		TestCaseTracker.markAsExecuted("claimVerifCloseTaskSubmitbuttonclickable");
		
	}
	
	@Test(priority = 3)
	public void claimVerifCloseTaskSubmitBreakbuttonclickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("claimVerifCloseTaskSubmitBreakbuttonclickable");
        logTestMethod(driver,methodTest, "claimVerifCloseTaskSubmitBreakbuttonclickable", () ->{ 
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
		TestCaseTracker.markAsExecuted("claimVerifCloseTaskSubmitBreakbuttonclickable");
		
	}
	
	@Test(priority = 4)
	public void claimVerifCloseTaskCancelbuttonclickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("claimVerifCloseTaskCancelbuttonclickable");
        logTestMethod(driver,methodTest, "claimVerifCloseTaskCancelbuttonclickable", () ->{ 
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
		TestCaseTracker.markAsExecuted("claimVerifCloseTaskCancelbuttonclickable");
		
	}
	
	@Test(priority = 5)
	public void claimVerifCloseTaskCrossIconclickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("claimVerifCloseTaskCrossIconclickable");
        logTestMethod(driver,methodTest, "claimVerifCloseTaskCrossIconclickable", () ->{ 
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
		TestCaseTracker.markAsExecuted("claimVerifCloseTaskCrossIconclickable");
		
	}
	
	@Test(priority = 6)
	public void claimVerifRescheduledbuttonclickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("claimVerifRescheduledbuttonclickable");
        logTestMethod(driver,methodTest, "claimVerifRescheduledbuttonclickable", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.callActionButton("Reschedule Call");
		By rescheduleLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
		WaitVisibliltyOfLocated(rescheduleLableLocator);
		WebElement rescheduleLableElement=driver.findElement(rescheduleLableLocator);
		softAssert.assertTrue(rescheduleLableElement.isDisplayed(),"Reschedule Button not clickable");
		softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("claimVerifRescheduledbuttonclickable");
		
		
	}
	
	@Test(priority = 7)
	public void claimVerifRescheduledSubmitbuttonclickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("claimVerifRescheduledSubmitbuttonclickable");
        logTestMethod(driver,methodTest, "claimVerifRescheduledSubmitbuttonclickable", () ->{ 
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
		TestCaseTracker.markAsExecuted("claimVerifRescheduledSubmitbuttonclickable");
	}
	
	@Test(priority = 8)
	public void claimVerifRescheduledSubmitBreakbuttonclickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("claimVerifRescheduledSubmitBreakbuttonclickable");
        logTestMethod(driver,methodTest, "claimVerifRescheduledSubmitBreakbuttonclickable", () ->{ 
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
		TestCaseTracker.markAsExecuted("claimVerifRescheduledSubmitBreakbuttonclickable");
	}
	
	@Test(priority = 9)
	public void claimVerifRescheduledCancelbuttonclickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("claimVerifRescheduledCancelbuttonclickable");
        logTestMethod(driver,methodTest, "claimVerifRescheduledCancelbuttonclickable", () ->{ 
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
		TestCaseTracker.markAsExecuted("claimVerifRescheduledCancelbuttonclickable");
		
	}
	
	@Test(priority = 10)
	public void claimVerifRescheduledCrossIconclickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("claimVerifRescheduledCrossIconclickable");
        logTestMethod(driver,methodTest, "claimVerifRescheduledCrossIconclickable", () ->{ 
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
		TestCaseTracker.markAsExecuted("claimVerifRescheduledCrossIconclickable");
	}
	

	@Test(priority = 11)
	public void claimVerifClaimVerifyButtonClickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("claimVerifClaimVerifyButtonClickable");
        logTestMethod(driver,methodTest, "claimVerifClaimVerifyButtonClickable", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		By verifyButtonLocator=By.xpath("//button[@class=\"btn btn-sm btn-primary\"]");
		click(verifyButtonLocator);
		By claimVerificationLable=By.xpath("//h6[@class=\"my-0\"]/label");
		WaitVisibliltyOfLocated(claimVerificationLable);
		WebElement claimVerificationLableElement=driver.findElement(claimVerificationLable);
		softAssert.assertTrue(claimVerificationLableElement.isDisplayed(),"Claim Verify button not clickable");
		
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("claimVerifClaimVerifyButtonClickable");
		
	}
	
	@Test(priority = 12)
	public void claimVerifClaimSubmitBreakClickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("claimVerifClaimSubmitBreakClickable");
        logTestMethod(driver,methodTest, "claimVerifClaimSubmitBreakClickable", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		By submitBreakButtonLocator=By.xpath("//button[@class=\"btn btn-primary me-md-2 btn btn-primary\"]");
		click(submitBreakButtonLocator);
		By errorToastLocator=By.xpath("//div[text()=\"Please select verify status.\"]");
		WaitVisibliltyOfLocated(errorToastLocator);
		WebElement errorToastElement=driver.findElement(errorToastLocator);
		softAssert.assertTrue(errorToastElement.isDisplayed(),"Claim Verification Submit & Break button not clickable");
        softAssert.assertAll();
        WaitInVisibliltyOfLocated(errorToastLocator);
        
        });
        By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0\"]/i");
		click(crossIconLocator);
		TestCaseTracker.markAsExecuted("claimVerifClaimSubmitBreakClickable");
	}
	
	
	
	@Test(priority = 13)
	public void claimVerifClaimSubmitClickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("claimVerifClaimSubmitClickable");
        logTestMethod(driver,methodTest, "claimVerifClaimSubmitClickable", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		By verifyButtonLocator=By.xpath("//button[@class=\"btn btn-sm btn-primary\"]");
		click(verifyButtonLocator);
		By submitButtonLocator=By.xpath("//button[@class=\"btn btn-success\"]");
		WaitVisibliltyOfLocated(submitButtonLocator);
		click(submitButtonLocator);
		By errorToastLocator=By.xpath("//div[text()=\"Please select verify status.\"]");
		WaitVisibliltyOfLocated(errorToastLocator);
		WebElement errorToastElement=driver.findElement(errorToastLocator);
		softAssert.assertTrue(errorToastElement.isDisplayed(),"Claim Verification Submit button not clickable");
		
        softAssert.assertAll();
        WaitInVisibliltyOfLocated(errorToastLocator);
        });
		TestCaseTracker.markAsExecuted("claimVerifClaimSubmitClickable");
	}
	
	
	
	@Test(priority = 14)
	public void claimVerifClaimCancelClickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("claimVerifClaimCancelClickable");
        logTestMethod(driver,methodTest, "claimVerifClaimCancelClickable", () ->{ 
		boolean status=true;
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		By cancelButtonLocator=By.xpath("//button[@class=\"btn btn-danger\"]");
		WaitVisibliltyOfLocated(cancelButtonLocator);
		click(cancelButtonLocator);
		try
		{
		By claimVerificationLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
		WebElement claimVerifLabelElement=driver.findElement(claimVerificationLableLocator);
		if(claimVerifLabelElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
			
		}
		 if(!status)
		 {
			 softAssert.fail("Claim Verification cancel button not clickable");
		 }
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("claimVerifClaimCancelClickable");
		
	}
	
	@Test(priority = 15)
	public void claimVerifClaimCrossIconClickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("claimVerifClaimCrossIconClickable");
        logTestMethod(driver,methodTest, "claimVerifClaimCrossIconClickable", () ->{ 
		boolean status=true;
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		By verifyButtonLocator=By.xpath("//button[@class=\"btn btn-sm btn-primary\"]");
		click(verifyButtonLocator);
		By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0\"]/i");
		WaitVisibliltyOfLocated(crossIconLocator);
		click(crossIconLocator);
		try
		{
		By claimVerifLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
		WebElement claimVerifLabelElement=driver.findElement(claimVerifLableLocator);
		if(claimVerifLabelElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
			
		}
		 if(!status)
		 {
			 softAssert.fail("Claim Verification Cross button not clickable");
		 }
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("claimVerifClaimCrossIconClickable");
	}
	
	
	
	
	
	   @Test(priority = 16, alwaysRun = true)
		public void claimVerifRedial() throws InterruptedException, IOException

		{ 
		   ExtentTest methodTest = test.createNode("claimVerifRedial");
	        logTestMethod(driver,methodTest, "claimVerifRedial", () ->{ 
			SoftAssert softAssert = new SoftAssert();
			functions = new CommanFunctions(driver);
			String oldTaskNo = functions.getTaskNo();
			System.out.println("Claim Verification oldTaskNo : "+ oldTaskNo);
			// click on Redial button
			functions.callActionButton("Redial");
			try {
				Thread.sleep(9000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			By taskPopUpLocator=By.xpath("//*[@id=\"TelecallingInfoDiv\"]/div/div/a/div/div[3]/marquee/span");
			WaitVisibliltyOfLocated(taskPopUpLocator);
			String newTaskNo = functions.getTaskNo();
			System.out.println("Claim Verification newTaskNo : "+ newTaskNo);
			softAssert.assertEquals(newTaskNo, oldTaskNo, "Test Failed : Redial button not working properly");
			 
		    softAssert.assertAll();
	        });
			TestCaseTracker.markAsExecuted("claimVerifRedial");
			

		}
		
		
		
		
		@Test(priority = 17, alwaysRun = true)
		public void claimVerifBack() throws InterruptedException, IOException
		{
			ExtentTest methodTest = test.createNode("claimVerifBack");
	        logTestMethod(driver,methodTest, "claimVerifBack", () ->{ 
			SoftAssert softAssert = new SoftAssert();
			functions = new CommanFunctions(driver);
			claimVerifyBackButtonTaskNo =functions.getTaskNo();
			System.out.println("Claim Verifivation backButtonTaskNo : "+ claimVerifyBackButtonTaskNo);
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
			 softAssert.assertTrue(dialNext.isDisplayed(),"Test Failed :claimVerifBack Back Button Not working proper");
			// Call assertAll to aggregate the results
				softAssert.assertAll();
	        });
				TestCaseTracker.markAsExecuted("claimVerifBack");
			 
		}
		
		@Test(priority = 18, alwaysRun = true)
		public void claimVerifBackTaskStatus() throws IOException 
		{
			ExtentTest methodTest = test.createNode("claimVerifBackTaskStatus");
	        logTestMethod(driver,methodTest, "claimVerifBackTaskStatus", () ->{ 
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
				if(taskNo.equals(claimVerifyBackButtonTaskNo))
				{
					//get task Status from dashboard
					String taskStatus=driver.findElement(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div[8]/div")).getText();
					System.out.println("Dashboard Task status Claim Verification-BackButton : "+taskStatus);
					softAssert.assertEquals(taskStatus, "Pending", " Test Failed : claimVerifBackTaskStatus");
					status=true;
					 break;
				}
				
			}
			if (!status) {
				softAssert.fail("Claim Verification- claimVerifBackTaskStatus Task no : " + claimVerifyBackButtonTaskNo + " not found");
			}
			
			softAssert.assertAll();
	        });
			 TestCaseTracker.markAsExecuted("claimVerifBackTaskStatus");
			
			}
			
			
	   
		
		@Test(priority = 19, alwaysRun = true)
		public void claimVerifBackButtonDialNext() throws InterruptedException, IOException
		{   
			ExtentTest methodTest = test.createNode("claimVerifBackButtonDialNext");
	        logTestMethod(driver,methodTest, "claimVerifBackButtonDialNext", () ->{ 
			dialerPage=new DialerLoginPage(driver);
			//Verify after back task when click on dial next then same task should be open
			SoftAssert softAssert = new SoftAssert();
			functions = new CommanFunctions(driver);
			functions.dialNextClick();
			
			try {
				functions.checkErrorToast();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			//functions.checkErrorToast();	 
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			String newTaskNo= functions.getTaskNo();
			System.out.println("Claim Verification BackButtonDialNext New task No : "+newTaskNo);
			softAssert.assertEquals(newTaskNo, claimVerifyBackButtonTaskNo,"Test Failed : claimVerifBackButtonDialNext -incorrect call connect");
			
			softAssert.assertAll();
	        });
		   TestCaseTracker.markAsExecuted("claimVerifBackButtonDialNext");
			
		}
		
		
		
		@Test(priority = 20, alwaysRun = true)
		public void claimVerifHangUp() throws InterruptedException, IOException
		{
			ExtentTest methodTest = test.createNode("claimVerifHangUp");
	        logTestMethod(driver,methodTest, "claimVerifHangUp", () ->{ 
			SoftAssert softAssert = new SoftAssert();
			functions = new CommanFunctions(driver);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			claimVerifyHangUpTaskNo=functions.getTaskNo();
			functions.callActionButton("Hangup");
			By loaderElement=By.xpath("// div[@id=\"loader-container\"]/p");
			WaitVisibliltyOfLocated(loaderElement);
			String loaderMsg=driver.findElement(loaderElement).getText();
			System.out.println(loaderMsg);

			softAssert.assertNotEquals(loaderMsg,"New Call Connecting", "Test Faild : claimVerifHangUp");
			softAssert.assertAll();
			WaitInVisibliltyOfLocated(loaderElement);
	        });
			 TestCaseTracker.markAsExecuted("claimVerifHangUp");
					
		}
		
		
		
	
		@Test(priority = 21, alwaysRun = true)
		public void claimVerifStatusPendingCloseTaskBySubmit() throws IOException
		{
			ExtentTest methodTest = test.createNode("claimVerifStatusPendingCloseTaskBySubmit");
	        logTestMethod(driver,methodTest, "claimVerifStatusPendingCloseTaskBySubmit", () ->{ 
			SoftAssert softAssert = new SoftAssert();
			functions = new CommanFunctions(driver);
			functions.callActionButton("Close Task");
			
			//Check Claim Status
			By claimStatusLocator=By.xpath("//td[@class=\"text-warning\"]");
			WaitVisibliltyOfLocated(claimStatusLocator);
			String claimStatus=driver.findElement(claimStatusLocator).getText();
			System.out.println("Claim Status : "+claimStatus);
			
			//Enter close task remark
			driver.findElement(By.id("REMARK")).sendKeys("Close Claim Verification Task");
		   
			//click on submit button
			By submitButtonLocator=By.xpath("//button[@class=\"btn btn-success\"]");
			click(submitButtonLocator);
			
			
			 By errorPopUpLocator=By.xpath("//h2[text()=\"Task status is not closed\"]");
			 WaitVisibliltyOfLocated(errorPopUpLocator);
			 WebElement errorPopUp=driver.findElement(errorPopUpLocator);
			 if(claimStatus.equals("Pending"))
			 {
				 softAssert.assertTrue(errorPopUp.isDisplayed(),"User should not be closed Task if claim status is pending");
			
			 }
			
			//click on "Ok" button
			driver.findElement(By.xpath("//button[text()=\"OK\"]")).click();
			
			softAssert.assertAll();
	        });
			TestCaseTracker.markAsExecuted("claimVerifStatusPendingCloseTaskBySubmit");
			
			}
		
		@Test(priority = 22, alwaysRun = true)
		public void claimVerifStatusPendingCloseTaskBySubmitBreak() throws IOException
		{
			
			ExtentTest methodTest = test.createNode("claimVerifStatusPendingCloseTaskBySubmitBreak");
	        logTestMethod(driver,methodTest, "claimVerifStatusPendingCloseTaskBySubmitBreak", () ->{ 
			SoftAssert softAssert = new SoftAssert();
			functions = new CommanFunctions(driver);
			functions.callActionButton("Close Task");
			
			//Check Claim Status
			By claimStatusLocator=By.xpath("//td[@class=\"text-warning\"]");
			WaitVisibliltyOfLocated(claimStatusLocator);
			String claimStatus=driver.findElement(claimStatusLocator).getText();
			System.out.println("Claim Status : "+claimStatus);
			//Enter close task remark
			driver.findElement(By.id("REMARK")).sendKeys("Close Claim Verification Task");
		   
			//click on submit & break button
			driver.findElement(By.xpath("//button[@class=\"btn btn-primary me-md-2 btn btn-primary\"]")).click();
			
			
			 By errorPopUpLocator=By.xpath("//h2[text()=\"Task status is not closed\"]");
			 WaitVisibliltyOfLocated(errorPopUpLocator);
			 WebElement errorPopUp=driver.findElement(errorPopUpLocator);
			 if(claimStatus.equals("Pending"))
			 {
				 softAssert.assertTrue(errorPopUp.isDisplayed(),"User should not be closed Task if claim status is pending");
			
			 }
			
			//click on "Ok" button
			driver.findElement(By.xpath("//button[text()=\"OK\"]")).click();
			
			softAssert.assertAll();
	        });
			TestCaseTracker.markAsExecuted("claimVerifStatusPendingCloseTaskBySubmitBreak");
			
			
		}
		
		


         @Test(priority = 23, alwaysRun = true)
          public void verifyClaimedPointsOfClaimVerification() throws IOException
           {
        	 ExtentTest methodTest = test.createNode("verifyClaimedPointsOfClaimVerification");
 	        logTestMethod(driver,methodTest, "verifyClaimedPointsOfClaimVerification", () ->{ 
        	 SoftAssert softAssert = new SoftAssert();
     		functions = new CommanFunctions(driver);
     		By verifyButtonLocator=By.xpath("//button[@class=\"btn btn-sm btn-primary\"]");
     		click(verifyButtonLocator);
        	 
     		By claimRowsLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr");
     		 WaitVisibliltyOfLocated(claimRowsLocator);
     		List<WebElement> claimRowsElement=driver.findElements(claimRowsLocator);
     		 for(int i=1; i<=claimRowsElement.size(); i++)
     		 {
     			 //Points Locator
     			 By pointsLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr["+i+"]/td[3]");
                 String pointsValue=driver.findElement(pointsLocator).getText();
                 int points = Integer.parseInt(pointsValue);
     			 System.out.println("Claim Verification Points :" +points);
     			
             	  
             	  //Claimed Qty locator
     			 By claimedQtyLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr["+i+"]/td[4]");
     			String qtyValue=driver.findElement(claimedQtyLocator).getText();
     			 int claimedQty= Integer.parseInt(qtyValue);
     			 System.out.println("Claim Verification Claimed Qty  :" +claimedQty);
     			 
     			double pointsAndQty= (points*claimedQty);
     			System.out.println("points * Qty :"+pointsAndQty);
     			double decimalClaimedPoints= pointsAndQty/1000;
     			
     			System.out.println("decimalClaimedPoints :"+decimalClaimedPoints);
     			int expectedClaimedPoints =(int) Math.round(decimalClaimedPoints);
     			System.out.println("Claim Verification Expected Claimed Points  :" +expectedClaimedPoints);
             	  
     	         //Claimed Points Locator
     			 By claimedPointsLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr["+i+"]/td[5]");
     			String claimedPointsValue=driver.findElement(claimedPointsLocator).getText();
     			int actualClaimedPoints= Integer.parseInt(claimedPointsValue);
    			 System.out.println("Claim Verification Actual Claimed Points  :" +actualClaimedPoints);
    			softAssert.assertEquals(actualClaimedPoints, expectedClaimedPoints,"Claimed Points are incorrect");
    			
    			softAssert.assertAll();
    			 
     		 }
     		 
     		By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0\"]/i");
    		WaitVisibliltyOfLocated(crossIconLocator);
    		click(crossIconLocator);
 	        });
     		TestCaseTracker.markAsExecuted("verifyClaimedPointsOfClaimVerification");
     		
        	 
           }


         
      @Test(priority = 24, alwaysRun = true)
         public void claimVerificationEnterMaxQty() throws InterruptedException, IOException

         {
    	  
    	  ExtentTest methodTest = test.createNode("claimVerificationEnterMaxQty");
	        logTestMethod(driver,methodTest, "claimVerificationEnterMaxQty", () ->{ 
        	 SoftAssert softAssert = new SoftAssert();
      		functions = new CommanFunctions(driver);
      		//Thread.sleep(2000);
      		By verifyButtonLocator=By.xpath("//button[@class=\"btn btn-sm btn-primary\"]");
      		 WaitVisibliltyOfLocated(verifyButtonLocator);
      		click(verifyButtonLocator);
         	 
      		By claimRowsLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr");
      		 WaitVisibliltyOfLocated(claimRowsLocator);
      		List<WebElement> claimRowsElement=driver.findElements(claimRowsLocator);
      		
      		 for(int i=1; i<=claimRowsElement.size(); i++)
      		 {
      			//Claimed Qty locator
     			 By claimedQtyLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr["+i+"]/td[4]");
     			String qtyValue=driver.findElement(claimedQtyLocator).getText();
     			 int claimedQty= Integer.parseInt(qtyValue);
     			 System.out.println("Claim Verification Claimed Qty  :" +claimedQty);
      		   
     			 int verifyQty=claimedQty+1;
     			String strVerifyQty = String.valueOf(verifyQty);
     			System.out.println("Enter Max Verify Qty : "+ strVerifyQty);
      			 //Verify Points Locator
      			 By enterQtyLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr["+i+"]/td[6]/input");
      			
      			 WebElement enterQtyElement=driver.findElement(enterQtyLocator);
      			 
      			enterQtyElement.click();
      			
      			enterQtyElement.clear();
      			
      			enterQtyElement.sendKeys(strVerifyQty);
      
    
      		 }	
      		By submitButtonLocator=By.xpath("//button[@class=\"btn btn-success\"]");
    		WaitVisibliltyOfLocated(submitButtonLocator);
    		click(submitButtonLocator);
    		By errorToastLocator=By.xpath("//div[text()=\"Verify Quantity should not be greater than Claimed Quantity\"]");
    		WaitVisibliltyOfLocated(errorToastLocator);
      		WebElement errorToastMsg=driver.findElement(errorToastLocator);
      		softAssert.assertTrue(errorToastMsg.isDisplayed(), "If Enter Qty more than Claimed Qty then error msg should be show");
    	  
      		WaitInVisibliltyOfLocated(errorToastLocator);
   
      		By cancelButtonLocator=By.xpath("//button[@class=\"btn btn-danger\"]");
    		WaitVisibliltyOfLocated(cancelButtonLocator);
    		click(cancelButtonLocator);
      		softAssert.assertAll();
	        });
			TestCaseTracker.markAsExecuted("claimVerificationEnterMaxQty");
              	  
         }
      
      


      @Test(priority = 25, alwaysRun = true)
      public void claimVerifselectStatusApproveVerifyReasonField() throws InterruptedException, IOException
      { 
    	 //If we select claim status approve then Rejected Reason field should not be show
    	 
    	  ExtentTest methodTest = test.createNode("claimVerifselectStatusApproveVerifyReasonField");
	        logTestMethod(driver,methodTest, "claimVerifselectStatusApproveVerifyReasonField", () ->{ 
    	  SoftAssert softAssert = new SoftAssert();
     		functions = new CommanFunctions(driver);
     		By verifyButtonLocator=By.xpath("//button[@class=\"btn btn-sm btn-primary\"]");
     		click(verifyButtonLocator);
      	    By claimRowsLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr");
     		WaitVisibliltyOfLocated(claimRowsLocator);
     		List<WebElement> claimRowsElement=driver.findElements(claimRowsLocator);
     		for(int i=1; i<=claimRowsElement.size(); i++)
      		 {
     			//Select Claim Status
       		    //click on status dropdown
       			By statusFieldLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr["+i+"]/td[8]/div/div/div[2]");
       			WaitVisibliltyOfLocated(statusFieldLocator);
       			click(statusFieldLocator);
       			
       			//Thread.sleep(3000);
       			//DropDown Locator
       			By claimStatusLocator=By.xpath("//div[@class=\"css-qr46ko\"]/div");
       			WaitVisibliltyOfLocated(claimStatusLocator);
       			
       			List<WebElement> claimStatusElements=driver.findElements(By.xpath("//div[@class=\"css-qr46ko\"]/div"));
       			for(WebElement claimStatusElement :claimStatusElements)
       			{
       				String statusValue=claimStatusElement.getText();
       				
       				if(statusValue.equals("Approve"))
       				{
       					System.out.println("Selected Claim Status Value : "+statusValue);
       					try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
       					claimStatusElement.click();
       					break;
       				}
       				
       			}
       				try
       				{
       				By reasonLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr["+i+"]/td[9]/div/div/div/div[1]");
       	    		Thread.sleep(2000);
       	      		WebElement reasonElement=driver.findElement(reasonLocator);
       	      		softAssert.assertFalse(reasonElement.isDisplayed(), "If claim Status is Approve the Reason Field should be not be show");
       	   
       				}catch(Exception e)
       				{
       					//System.out.println("Rejected Reason Field Not display due to Selected Claim Status is \"Approved\" ");
       				}
       			
      		 }
     		
     		By cancelButtonLocator=By.xpath("//button[@class=\"btn btn-danger\"]");
    		WaitVisibliltyOfLocated(cancelButtonLocator);
    		click(cancelButtonLocator);
     		softAssert.assertAll();
	        });
			TestCaseTracker.markAsExecuted("claimVerifselectStatusApproveVerifyReasonField");
    	  
    	  
      }
      
      
      
     @Test(priority = 26, alwaysRun = true)
		public void claimVerifselectStatusRejectVerifyReasonField() throws InterruptedException, IOException {
    	 
    	 
			// If we select claim status Reject then Rejected Reason field should be show
    	 ExtentTest methodTest = test.createNode("claimVerifselectStatusRejectVerifyReasonField");
	        logTestMethod(driver,methodTest, "claimVerifselectStatusRejectVerifyReasonField", () ->{
			SoftAssert softAssert = new SoftAssert();
			functions = new CommanFunctions(driver);
			By verifyButtonLocator = By.xpath("//button[@class=\"btn btn-sm btn-primary\"]");
			click(verifyButtonLocator);
			By claimRowsLocator = By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr");
			WaitVisibliltyOfLocated(claimRowsLocator);
			List<WebElement> claimRowsElement = driver.findElements(claimRowsLocator);
			for (int i = 1; i <= claimRowsElement.size(); i++) {
				// Select Claim Status
				// click on status dropdown
				By statusFieldLocator = By
						.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr[" + i + "]/td[8]/div/div/div[2]");
				click(statusFieldLocator);

				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				// DropDown Locator
				
				List<WebElement> claimStatusElements = driver
						.findElements(By.xpath("//div[@class=\"css-qr46ko\"]/div"));
				for (WebElement claimStatusElement : claimStatusElements) {
					String statusValue = claimStatusElement.getText();

					if (statusValue.equals("Reject")) {
						System.out.println("Selected Claim Status Value : " + statusValue);
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
						claimStatusElement.click();
						break;
					}

				}

				By reasonLocator = By
						.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr[" + i + "]/td[9]/div/div/div/div[1]");
				WaitVisibliltyOfLocated(reasonLocator);
				WebElement reasonElement = driver.findElement(reasonLocator);
				softAssert.assertTrue(reasonElement.isDisplayed(),
						"If claim Status is Reject the Reason Field should be  be show");

			}
            
			By cancelButtonLocator=By.xpath("//button[@class=\"btn btn-danger\"]");
	 		WaitVisibliltyOfLocated(cancelButtonLocator);
	 		click(cancelButtonLocator);
			softAssert.assertAll();
	        });
			TestCaseTracker.markAsExecuted("claimVerifselectStatusRejectVerifyReasonField");

		}
     
     @Test(priority = 27, alwaysRun = true)
     public void claimVefclaimStatusRejectVerifyQtyPoints() throws InterruptedException, IOException
     {
    	 ExtentTest methodTest = test.createNode("claimVefclaimStatusRejectVerifyQtyPoints");
	        logTestMethod(driver,methodTest, "claimVefclaimStatusRejectVerifyQtyPoints", () ->{
    	 //If we select Claim Status Reject then Verify Qty & Points should be show "0".
    	 SoftAssert softAssert = new SoftAssert();
			functions = new CommanFunctions(driver);
			By verifyButtonLocator = By.xpath("//button[@class=\"btn btn-sm btn-primary\"]");
			click(verifyButtonLocator);
			By claimRowsLocator = By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr");
			WaitVisibliltyOfLocated(claimRowsLocator);
			List<WebElement> claimRowsElement = driver.findElements(claimRowsLocator);
			for (int i = 1; i <= claimRowsElement.size(); i++) 
			{
				// Select Claim Status
				// click on status dropdown
				By statusFieldLocator = By
						.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr[" + i + "]/td[8]/div/div/div[2]");
				click(statusFieldLocator);

				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				// DropDown Locator
				List<WebElement> claimStatusElements = driver
						.findElements(By.xpath("//div[@class=\"css-qr46ko\"]/div"));
				for (WebElement claimStatusElement : claimStatusElements) 
				{
					String statusValue = claimStatusElement.getText();

					if (statusValue.equals("Reject")) {
						System.out.println("Selected Claim Status Value : " + statusValue);
						claimStatusElement.click();
						break;
					}

				}
				
				String expectedQtyValue="0";
				//Verify Qty locator
    			 By verifyQtyLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr["+i+"]/td[6]/input");
    			String actualQtyValue=driver.findElement(verifyQtyLocator).getAttribute("value");
    			//System.out.println("verify Qty  : "+actualQtyValue);
    			softAssert.assertEquals(actualQtyValue, expectedQtyValue,"After Select Claim Status Reject Qty should be show 0.");
    			
    			String expectedPointsValue="0";
				//Verify Points locator
    			 By verifyPointsLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr["+i+"]/td[6]/input");
    			String actualPointsValue=driver.findElement(verifyPointsLocator).getAttribute("value");;
    			//System.out.println("verify Points : "+actualPointsValue);
    			softAssert.assertEquals(actualPointsValue, expectedPointsValue,"After Select Claim Status Reject Points should be show 0.");
    			
				
			}	
			
			softAssert.assertAll();
	        });
			TestCaseTracker.markAsExecuted("claimVefclaimStatusRejectVerifyQtyPoints");
    	 
     }
     
     
      
      @Test(priority = 28, alwaysRun = true)
     public void claimVerifStatusRejectSubmitClaim() throws IOException
     {
    	 //If we select Claim Status Reject & if  Reason field Blank then Error pop-up should be display
    	  ExtentTest methodTest = test.createNode("claimVerifStatusRejectSubmitClaim");
	        logTestMethod(driver,methodTest, "claimVerifStatusRejectSubmitClaim", () ->{
    	 SoftAssert softAssert = new SoftAssert();
     	functions = new CommanFunctions(driver);
    	 By submitButtonLocator=By.xpath("//button[@class=\"btn btn-success\"]");
 		WaitVisibliltyOfLocated(submitButtonLocator);
 		click(submitButtonLocator);
 		By errorToastLocator=By.xpath("//div[text()=\"Please select rejection reason\"]");
 		WaitVisibliltyOfLocated(errorToastLocator);
   		WebElement errorToastMsg=driver.findElement(errorToastLocator);
   		softAssert.assertTrue(errorToastMsg.isDisplayed(), "If select Claim Status Reject & Keep Reject Reason Blank and submit claim then error msg should be show");
 	  
   		WaitInVisibliltyOfLocated(errorToastLocator);

   		By cancelButtonLocator=By.xpath("//button[@class=\"btn btn-danger\"]");
 		WaitVisibliltyOfLocated(cancelButtonLocator);
 		click(cancelButtonLocator);
   		softAssert.assertAll();
	        });
		TestCaseTracker.markAsExecuted("claimVerifStatusRejectSubmitClaim");
           	  
    	 
    	 
     }
     
     
	
	@Test(priority = 29,  alwaysRun = true)
	public void openClaimVerification() throws InterruptedException, IOException
	{
		ExtentTest methodTest = test.createNode("openClaimVerification");
        logTestMethod(driver,methodTest, "openClaimVerification", () ->{
		SoftAssert softAssert = new SoftAssert();
   		functions = new CommanFunctions(driver);
   		//Thread.sleep(3000);
   		claimVerificationTaskNo =functions.getTaskNo();
   		System.out.println("Claim Verification Task no : "+claimVerificationTaskNo);
   		By verifyButtonLocator=By.xpath("//button[@class=\"btn btn-sm btn-primary\"]");
   		click(verifyButtonLocator);
        });
   		TestCaseTracker.markAsExecuted("openClaimVerification");
	}
	
	
    @Test(priority = 30, dataProvider="claimVerificationData", alwaysRun = true)
      public void enterclaimDataForClaimVerification(int rowIndex,String claimQty, String claimStatus ,String rejectReason ,String claimRemark) throws InterruptedException, IOException

      {
    	 ExtentTest methodTest = test.createNode("enterclaimDataForClaimVerification");
	        logTestMethod(driver,methodTest, "enterclaimDataForClaimVerification", () ->{
    	SoftAssert softAssert = new SoftAssert();
   		functions = new CommanFunctions(driver);
    	 
   			 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
   			 // Enter Qty
   			 By enterQtyLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr["+rowIndex+"]/td[6]/input");
   			
   			 WebElement enterQtyElement=driver.findElement(enterQtyLocator);
   			 
   			enterQtyElement.click();
   			
   			enterQtyElement.clear();
   			
   			enterQtyElement.sendKeys(claimQty);
   			
   			//Select Claim Status
   		    //click on status dropdown
   			By statusFieldLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr["+rowIndex+"]/td[8]/div/div/div[2]");
   			click(statusFieldLocator);
   			 
   			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
   			//DropDown Locator
   			List<WebElement> claimStatusElements=driver.findElements(By.xpath("//div[@class=\"css-qr46ko\"]/div"));
   			for(WebElement claimStatusElement :claimStatusElements)
   			{
   				String statusValue=claimStatusElement.getText();
   				
   				if(statusValue.equals(claimStatus))
   				{
   					System.out.println("Selected Status Value : "+statusValue);
   					claimStatusElement.click();
   					break;
   				}
   			}
   			
   			// If user select Status as "Reject" then select reason
   			try
   			{ 
   				
   				By reasonLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr["+rowIndex+"]/td[9]/div/div/div/div[1]");
   				Thread.sleep(3000);
   				WebElement reasonElement=driver.findElement(reasonLocator);
   				if(reasonElement.isDisplayed())
   				{  
   					
   					Thread.sleep(3000);
   					reasonElement.click();
   					Thread.sleep(3000);
   				//Reject Reason Drodown List
   				List<WebElement> rejectReasonElements=driver.findElements(By.xpath("//div[@class=\"css-qr46ko\"]/div"));
   	   			for(WebElement rejectReasonElement :rejectReasonElements)
   	   			{
   	   				String reasonValue=rejectReasonElement.getText();
   	   				
   	   				if(reasonValue.equals(rejectReason))
   	   				{
   	   					System.out.println("Selected Reason Value : "+reasonValue);
   	   				     rejectReasonElement.click();
   	   				     break;
   	   				}
   	   			}
   				}
   			
   			}catch(Exception  e)
   			{
   				System.out.println("Selected Claim Status is Approve.");
   			}
   			
   			//Enter Claim Remark
   			By remarkLocator=By.name("CLAIMS["+(rowIndex-1)+"].REMARK");
   			WaitVisibliltyOfLocated(remarkLocator);
   			driver.findElement(remarkLocator).sendKeys(claimRemark);
   			softAssert.assertAll();
	        });
    	   TestCaseTracker.markAsExecuted("enterclaimDataForClaimVerification");
   		 
      }  
      

        
      
      @Test(priority = 31, alwaysRun = true)
      public void verifyTotalClaimPointsOfClaimVerification() throws IOException
      {
    	  ExtentTest methodTest = test.createNode("verifyTotalClaimPointsOfClaimVerification");
	        logTestMethod(driver,methodTest, "verifyTotalClaimPointsOfClaimVerification", () ->{
    	  SoftAssert softAssert = new SoftAssert();
    		functions = new CommanFunctions(driver);
    	 
    		By claimRowsLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr");
    		 WaitVisibliltyOfLocated(claimRowsLocator);
    		List<WebElement> claimRowsElement=driver.findElements(claimRowsLocator);
    		
    		
    		 for(int i=1; i<=claimRowsElement.size(); i++)
    		 {
    			   
    			//Points Locator
     			 By pointsLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr["+i+"]/td[3]");
                 String pointsValue=driver.findElement(pointsLocator).getText();
                 int points = Integer.parseInt(pointsValue);
     			 System.out.println("Claim Verification Points :" +points);
     			 
    			//Get Entered Qty 
    			 By verifyQtyLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr["+i+"]/td[6]/input");
    			 String enteredQtyValue=driver.findElement(verifyQtyLocator).getAttribute("value");
    			 System.out.println("Entered Claim Qty : "+enteredQtyValue);
    			
    			 int enteredClaimedQty= Integer.parseInt(enteredQtyValue);
     			 System.out.println("Claim Verification Claimed Qty  :" +enteredClaimedQty);
     			 
     			double pointsAndQty= (points*enteredClaimedQty);
     			System.out.println("points * Qty :"+pointsAndQty);
     			double decimalClaimedPoints= pointsAndQty/1000;
     			
     			System.out.println("decimalClaimedPoints :"+decimalClaimedPoints);
     			int expectedClaimedPoints =(int) Math.round(decimalClaimedPoints);
     			System.out.println("Expected Claimed Points : "+expectedClaimedPoints);
    			 
				//Get Claim Points 
    			 By verifyPointsLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr["+i+"]/td[7]");
    			String actualPointsValue=driver.findElement(verifyPointsLocator).getText();
    			int actualClaimPoints= Integer.parseInt(actualPointsValue);
    			System.out.println("Verify actual Claim Points : "+actualClaimPoints);
    			
    			softAssert.assertEquals(actualClaimPoints,expectedClaimedPoints,"Verify Claim Points showing incorrect");
    			
    	 }
    		    softAssert.assertAll();
	        });
				TestCaseTracker.markAsExecuted("verifyTotalClaimPointsOfClaimVerification");
     
      }
      
      
      
     
     @Test(priority = 32, alwaysRun = true)
     public void verifyClaimBySubmitBreakButtonClaimVef() throws IOException
     {
    	 ExtentTest methodTest = test.createNode("verifyClaimBySubmitBreakButtonClaimVef");
	        logTestMethod(driver,methodTest, "verifyClaimBySubmitBreakButtonClaimVef", () ->{
    	 SoftAssert softAssert = new SoftAssert();
 		functions = new CommanFunctions(driver);
 		By submitBreakButtonLocator=By.xpath("//button[@class=\"btn btn-primary me-md-2 btn btn-primary\"]");
		click(submitBreakButtonLocator);
		By successLableLocator=By.xpath("//label[text()=\"Verification Submitted Successfully\"]");
		WaitVisibliltyOfLocated(successLableLocator);
		WebElement successElement =driver.findElement(successLableLocator);
		softAssert.assertTrue(successElement.isDisplayed(),"Claim Not Getting Submit.");
		
		//Click on "OK" Button
		By okButtonLocator=By.xpath("//button[text()=\"Ok\"]");
		WaitVisibliltyOfLocated(okButtonLocator);
		click(okButtonLocator);
		By loaderElement=By.xpath("// div[@id=\"loader-container\"]/p");
		WaitInVisibliltyOfLocated(loaderElement);
		 softAssert.assertAll();
	        });
		TestCaseTracker.markAsExecuted("verifyClaimBySubmitBreakButtonClaimVef");
    	
    	 
     }
     
     @Test(priority = 33, alwaysRun = true)
     public void claimVefBySubmitBreakButtonVerifyNextCall() throws InterruptedException, IOException
     {
    	 ExtentTest methodTest = test.createNode("claimVefBySubmitBreakButtonVerifyNextCall");
	        logTestMethod(driver,methodTest, "claimVefBySubmitBreakButtonVerifyNextCall", () ->{
    		
    	 //If Submit Claim by Submit & Break button then next call should not be connect
    	 SoftAssert softAssert = new SoftAssert();
  		functions = new CommanFunctions(driver);
  		
    	//verify next call connect or not
  		try
  		{   Thread.sleep(5000);
  		     By taskLocator=By.xpath("//*[@id=\"TelecallingInfoDiv\"]/div/div/a/div/div[3]/marquee/span");
		     Thread.sleep(3000);
			 WebElement taskElement=driver.findElement(taskLocator);
			 softAssert.assertFalse(taskElement.isDisplayed(),"After Submit Claim By Submit & Break Button Then next Call should not be connect");
  		}catch(Exception e)
  		{
  			System.out.println("Next call Not connect due to Claim submit by Submit & Break Button");
  		}
			softAssert.assertAll();
	        });
			TestCaseTracker.markAsExecuted("claimVefBySubmitBreakButtonVerifyNextCall");
    	 
     }
     
     
     @Test(priority = 34, alwaysRun = true)
     public void verifyTaskStatusOnDashboardForClaimVef() throws IOException
     {
  
    	 ExtentTest methodTest = test.createNode("verifyTaskStatusOnDashboardForClaimVef");
	        logTestMethod(driver,methodTest, "verifyTaskStatusOnDashboardForClaimVef", () ->{
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
 			WaitVisibliltyOfLocated(taskNoElement);
 			String taskNo=driver.findElement(taskNoElement).getText();
 			 System.out.println("Dashboard Task No :" +taskNo);
 			if(taskNo.equals(claimVerificationTaskNo))
 			{
 				//get task Status from dashboard
 				String taskStatus=driver.findElement(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div[8]/div")).getText();
 				System.out.println("Dashboard Task status For claim Verification : "+taskStatus);
 				softAssert.assertEquals(taskStatus, "Closed", "After Verify claim task Status should be closed");
 				status=true;
 				 break;
 			}
 			
 		}
 		if (!status) {
 			softAssert.fail("Claim Verification Task no : " + claimVerificationTaskNo + " not found");
 		}
 		 
 		  softAssert.assertAll();
	        });
 		 TestCaseTracker.markAsExecuted("verifyTaskStatusOnDashboardForClaimVef");
 		
     }
     
     @Test(priority = 35, alwaysRun = true)
     public void openClaimVerificationForSubmitButton() throws InterruptedException, IOException
  	{
    	 SoftAssert softAssert = new SoftAssert();
  		functions = new CommanFunctions(driver);
  		manager=new TaskTypeManager(driver, test);
  		//verify Task Type
  		String taskType=functions.getTaskTypeFromApplication();
  		
  		if(taskType.equals("Influencer Claim Verification") )
  		{
  			ExtentTest methodTest = test.createNode("openClaimVerificationForSubmitButton");
	        logTestMethod(driver,methodTest, "openClaimVerificationForSubmitButton", () ->{
     		//Thread.sleep(2000);
     		claimVerificationTaskNo =functions.getTaskNo();
     		System.out.println("Claim Verification Task no for Submit button: "+ claimVerificationTaskNo);
     		By verifyButtonLocator=By.xpath("//button[@class=\"btn btn-sm btn-primary\"]");
     		click(verifyButtonLocator);
     		
	        });
           
     		 TestCaseTracker.markAsExecuted("openClaimVerificationForSubmitButton");
            }
            
            else
     		{
     			System.out.println("Task type is not Claim Verification");
     			manager.executeTask();
     		}
     		
         }
  	
     
     @Test(priority = 36,  dataProvider="claimVerificationData", alwaysRun = true)
     public void enterClaimDataSubmitButtonClaimVef(int rowIndex,String claimQty, String claimStatus ,String rejectReason ,String claimRemark) throws InterruptedException, IOException
     
     {      
    	 ExtentTest methodTest = test.createNode("enterClaimDataSubmitButtonClaimVef");
	        logTestMethod(driver,methodTest, "enterClaimDataSubmitButtonClaimVef", () ->{
    	 //If verify claim by submit button then if next call is available then next call should be connect
    	
    	    functions = new CommanFunctions(driver);
			SoftAssert softAssert = new SoftAssert();
			 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
  			 By enterQtyLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr["+rowIndex+"]/td[6]/input");
  			WaitVisibliltyOfLocated(enterQtyLocator);
  			 WebElement enterQtyElement=driver.findElement(enterQtyLocator);
  			 
  			enterQtyElement.click();
  			
  			enterQtyElement.clear();
  			
  			enterQtyElement.sendKeys(claimQty);
  			
  			//Select Claim Status
  		    //click on status dropdown
  			By statusFieldLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr["+rowIndex+"]/td[8]/div/div/div[2]");
  			click(statusFieldLocator);
  			 
  			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
  			//DropDown Locator
  			
  			List<WebElement> claimStatusElements=driver.findElements(By.xpath("//div[@class=\"css-qr46ko\"]/div"));
  			for(WebElement claimStatusElement :claimStatusElements)
  			{
  				String statusValue=claimStatusElement.getText();
  				
  				if(statusValue.equals(claimStatus))
  				{  try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
  					System.out.println("Selected Status Value : "+statusValue);
  					claimStatusElement.click();
  					break;
  				}
  				else
  				{
  					softAssert.assertFalse(false,"Status not getting select");
  				}
  			}
  			
  		  // If user select Status as "Reject" then select reason
   			try
   			{
   				By reasonLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr["+rowIndex+"]/td[9]/div/div/div/div[1]");
   				Thread.sleep(3000);
   				WebElement reasonElement=driver.findElement(reasonLocator);
   				if(reasonElement.isDisplayed())
   				{  
   					Thread.sleep(3000);
   					click(reasonLocator);
   					Thread.sleep(3000);
   				//Reject Reason Drodown List
   				List<WebElement> rejectReasonElements=driver.findElements(By.xpath("//div[@class=\"css-qr46ko\"]/div"));
   	   			for(WebElement rejectReasonElement :rejectReasonElements)
   	   			{
   	   				String reasonValue=rejectReasonElement.getText();
   	   				
   	   				if(reasonValue.equals(rejectReason))
   	   				{
   	   					System.out.println("Selected Reason Value : "+reasonValue);
   	   				     rejectReasonElement.click();
   	   				     break;
   	   				}
   	   			}
   				}
   			
   			}catch(Exception  s)
   			{
   				//System.out.println("Selected Claim Status is Approve.");
   			}
   			
   			//Enter Claim Remark
   			By remarkLocator=By.name("CLAIMS["+(rowIndex-1)+"].REMARK");
   			WaitVisibliltyOfLocated(remarkLocator);
   			driver.findElement(remarkLocator).sendKeys(claimRemark);
  
			 softAssert.assertAll();
	        });
           
	         TestCaseTracker.markAsExecuted("enterClaimDataSubmitButtonClaimVef");
       
    	 
	       
 		
     }

		@Test(priority = 37, alwaysRun = true)
		public void verifyClaimBySubmitButtonClaimVef() throws IOException {

			 ExtentTest methodTest = test.createNode("verifyClaimBySubmitButtonClaimVef");
		        logTestMethod(driver,methodTest, "verifyClaimBySubmitButtonClaimVef", () ->{
				functions = new CommanFunctions(driver);
				SoftAssert softAssert = new SoftAssert();

				// Click on Submit Button
				By submitButtonLocator = By.xpath("//button[@class=\"btn btn-success\"]");
				WaitVisibliltyOfLocated(submitButtonLocator);
				 click(submitButtonLocator);

				// Click on "OK" Button
				By okButtonLocator = By.xpath("//button[text()=\"Ok\"]");
				WaitVisibliltyOfLocated(okButtonLocator);
				click(okButtonLocator);
				By loaderElement = By.xpath("// div[@id=\"loader-container\"]/p");
				WaitInVisibliltyOfLocated(loaderElement);

				try {

					By nextDialTextElement = By.xpath("//h4[@class=\"text-info fw-bold\"]");
					WaitVisibliltyOfLocated(nextDialTextElement);
					WebElement nextDialText = driver.findElement(nextDialTextElement);
					System.out.println(nextDialText.getText());
					if (nextDialText.isDisplayed()) {
						System.out.println("No calls are scheduled");
					}

				} catch (Exception r) {

					By taskPopUpLocator = By.xpath("//*[@id=\"TelecallingInfoDiv\"]/div/div/a/div/div[3]/marquee/span");
					WaitVisibliltyOfLocated(taskPopUpLocator);
					WebElement taskPopUp = driver.findElement(taskPopUpLocator);
					String taskName = taskPopUp.getText();
					System.out.println(taskName);
					softAssert.assertTrue(taskPopUp.isDisplayed(),
							"If we Submit claim Verification By submit Button then next call should be connect.");
				}

				softAssert.assertAll();
		        });

			TestCaseTracker.markAsExecuted("verifyClaimBySubmitButtonClaimVef");

		}
  		
		@Test(priority = 38, alwaysRun = true)
			
		public void claimVerifRescheduleNotInterestedSubmitBreak() throws InterruptedException, IOException
		{ 
			
			functions = new CommanFunctions(driver);
			SoftAssert softAssert = new SoftAssert();
			manager=new TaskTypeManager(driver, test);
			String taskType=functions.getTaskTypeFromApplication();
 		   if(taskType.equals("Influencer Claim Verification") )
 		  {
 			  ExtentTest methodTest = test.createNode("claimVerifRescheduleNotInterestedSubmitBreak");
 		        logTestMethod(driver,methodTest, "claimVerifRescheduleNotInterestedSubmitBreak", () ->{
			
			claimVefNotInterestedTakNo=functions.getTaskNo();
			System.out.println("Task No-Claim Verification- Reschedule-Not Interested -Submit & break button : "+ claimVefNotInterestedTakNo);
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
						TestCaseTracker.markAsExecuted("claimVerifRescheduleNotInterestedSubmitBreak");
		      }
	 		
	 		else
	 		{
	 			System.out.println("Task type is not Claim Verification");
	 			manager.executeTask();
	 		}
	 		
			}
		

		@Test(priority = 39, alwaysRun = true)
		public void claimVerifRescheduleNotInterestedTaskStatus() throws InterruptedException, IOException
		{	ExtentTest methodTest = test.createNode("claimVerifRescheduleNotInterestedTaskStatus");
	        logTestMethod(driver,methodTest, "claimVerifRescheduleNotInterestedTaskStatus", () ->{
			
			SoftAssert softAssert = new SoftAssert();
			functions = new CommanFunctions(driver);

			boolean status=false;
			By element=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a");
			WaitVisibliltyOfLocated(element);
			//Thread.sleep(2000);
			//get task no from dashboard
			By taskNoLocator=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a");
			WaitVisibliltyOfLocated(taskNoLocator);
			List<WebElement> taskNoElements=driver.findElements(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a"));
			for(int i=1; i<=taskNoElements.size();i++)
			 {  
				By taskNoElement=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div/a");
				WaitVisibliltyOf(taskNoElement);
				String taskNo=driver.findElement(taskNoElement).getText();
				 System.out.println("Dashboard Task No :" +taskNo);
				if(taskNo.equals(claimVefNotInterestedTakNo))
				{
					//get task Status from dashboard
					String taskStatus=driver.findElement(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div[8]/div")).getText();
					System.out.println("Dashboard Task status Claim Verification-Rechedule- Not Interested : "+taskNo + " - "+taskStatus);
					softAssert.assertEquals(taskStatus, "Closed", " If Select Reschedule status Not Interested then task should be closed.");
					status=true;
					 break;
				}
				
			}
			if (!status) {
				softAssert.fail("Claim Verification- claimVerifRescheduleNotInterestedTaskStatus Task no : " + claimVefNotInterestedTakNo + " not found");
			}
			
			softAssert.assertAll();
			
	        });
			 TestCaseTracker.markAsExecuted("claimVerifRescheduleNotInterestedTaskStatus");
			
			}
		
		
		@Test(priority = 40, alwaysRun = true)
		public void claimVerifRescheduleNotInterestedSubmit() throws InterruptedException, IOException
		{
			
			SoftAssert softAssert = new SoftAssert();
	        functions = new CommanFunctions(driver);
	        manager=new TaskTypeManager(driver, test);
			String taskType=functions.getTaskTypeFromApplication();
	 		if(taskType.equals("Influencer Claim Verification") )
	 		{
	 			ExtentTest methodTest = test.createNode("claimVerifRescheduleNotInterestedSubmit");
		        logTestMethod(driver,methodTest, "claimVerifRescheduleNotInterestedSubmit", () ->{
			        
			        String taskNoNotInterestedSubmit=functions.getTaskNo();
			        System.out.println("Task no. of Claim Verification-Reschedule-Not Interested-Submit button : "+taskNoNotInterestedSubmit);
			        //Thread.sleep(2000);
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
			 TestCaseTracker.markAsExecuted("claimVerifRescheduleNotInterestedSubmit");
			}
	 		else
	 		{
	 			System.out.println("Task type is not Claim Verification");
	 			manager.executeTask();
	 		}
	 	
		}
	 		
		
		
		
		
		@Test(priority = 41, alwaysRun = true)
		public void claimVerifRescheduleRingNotReceivedSubmitBreak() throws InterruptedException, IOException
		{ 
			functions = new CommanFunctions(driver);
			SoftAssert softAssert = new SoftAssert();
			 manager=new TaskTypeManager(driver, test);
			String taskType=functions.getTaskTypeFromApplication();
 		   if(taskType.equals("Influencer Claim Verification") )
 		  {
 			  ExtentTest methodTest = test.createNode("claimVerifRescheduleRingNotReceivedSubmitBreak");
		        logTestMethod(driver,methodTest, "claimVerifRescheduleRingNotReceivedSubmitBreak", () ->{
			claimVefRingNotReceivedTaskNo=functions.getTaskNo();
			System.out.println("Task No-Claim Verification- Reschedule-Ringing Not Received -Submit & break button : "+ claimVefRingNotReceivedTaskNo);
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
						TestCaseTracker.markAsExecuted("claimVerifRescheduleRingNotReceivedSubmitBreak");
		      }
	 		
	 		else
	 		{
	 			System.out.println("Task type is not Claim Verification");
	 			manager.executeTask();
	 		}
	 		
			}
		
		
		
		@Test(priority = 42, alwaysRun = true)
		public void claimVerifRescheduleRingNotReceivedTaskStatus() throws InterruptedException, IOException
		{	
			ExtentTest methodTest = test.createNode("claimVerifRescheduleRingNotReceivedTaskStatus");
	        logTestMethod(driver,methodTest, "claimVerifRescheduleRingNotReceivedTaskStatus", () ->{
			SoftAssert softAssert = new SoftAssert();
			functions = new CommanFunctions(driver);

			boolean status=false;
			By element=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a");
			WaitVisibliltyOfLocated(element);
			//Thread.sleep(2000);
			//get task no from dashboard
			By taskNoLocator=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a");
			WaitVisibliltyOfLocated(taskNoLocator);
			List<WebElement> taskNoElements=driver.findElements(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a"));
			for(int i=1; i<=taskNoElements.size();i++)
			 {  
				By taskNoElement=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div/a");
				WaitVisibliltyOf(taskNoElement);
				String taskNo=driver.findElement(taskNoElement).getText();
				 System.out.println("Dashboard Task No :" +taskNo);
				if(taskNo.equals(claimVefRingNotReceivedTaskNo))
				{
					//get task Status from dashboard
					String taskStatus=driver.findElement(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div[8]/div")).getText();
					System.out.println("Dashboard Task status Claim Verification-Rechedule- Ringing Not Received : "+taskNo + " - "+taskStatus);
					softAssert.assertEquals(taskStatus, "Pending", " If Select Reschedule status Ringing Not Received then task should be Pending.");
					status=true;
					 break;
				}
				
			}
			if (!status) {
				softAssert.fail("Claim Verification- claimVerifRescheduleRingNotReceivedTaskStatus Task no : " + claimVefRingNotReceivedTaskNo + " not found");
			}
			
			softAssert.assertAll();
	        });
			 TestCaseTracker.markAsExecuted("claimVerifRescheduleRingNotReceivedTaskStatus");
			
			}
		
		
		@Test(priority = 43, alwaysRun = true)
		public void claimVerifRescheduleRingNotReceivedSubmit() throws InterruptedException, IOException
		{
			SoftAssert softAssert = new SoftAssert();
	        functions = new CommanFunctions(driver);
	        manager=new TaskTypeManager(driver, test);
			String taskType=functions.getTaskTypeFromApplication();
	 		if(taskType.equals("Influencer Claim Verification") )
	 		{
	 			ExtentTest methodTest = test.createNode("claimVerifRescheduleRingNotReceivedSubmit");
		        logTestMethod(driver,methodTest, "claimVerifRescheduleRingNotReceivedSubmit", () ->{
			        String taskNoRigNotReceivedSubmit=functions.getTaskNo();
			        System.out.println("Task no. of Claim Verification-Reschedule-Ring Not Received -Submit button : "+taskNoRigNotReceivedSubmit);
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
			 TestCaseTracker.markAsExecuted("claimVerifRescheduleRingNotReceivedSubmit");
			}
	 		else
	 		{
	 			System.out.println("Task type is not Claim Verification");
	 			manager.executeTask();
	 		}
	 	
		}
	 		
		
		@Test(priority = 44, alwaysRun = true)
		public void claimVerifRescheduleCallBackLaterSubmitBreak() throws InterruptedException, IOException
		{ 
			functions = new CommanFunctions(driver);
			SoftAssert softAssert = new SoftAssert();
			manager = new TaskTypeManager(driver, test);
			String taskType = functions.getTaskTypeFromApplication();
			if (taskType.equals("Influencer Claim Verification")) {
				ExtentTest methodTest = test.createNode("claimVerifRescheduleCallBackLaterSubmitBreak");
		        logTestMethod(driver,methodTest, "claimVerifRescheduleCallBackLaterSubmitBreak", () ->{
					claimVefCallBackLaterTaskNo = functions.getTaskNo();
					System.out
							.println("Task No-Claim Verification- Reschedule-Call Back Later -Submit & break button : "
									+ claimVefCallBackLaterTaskNo);
					//Thread.sleep(2000);
					functions.callActionButton("Reschedule Call");
					try {
						functions.selectRescheduleStatus("Call Back Later");
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}

					// Click on Schedule time (+15 min)--Based On button index we can change time
					By timeLocator = By.xpath("//div[@class=\"d-grid gap-2 d-md-flex justify-content col\"]/button[3]");
					WaitVisibliltyOfLocated(timeLocator);
					click(timeLocator);

					functions.enterRescheduleRemark("Remark : Call Back Later");
					functions.clickRescheduleSubmitBreak();
					By loaderElement = By.xpath("// div[@id=\"loader-container\"]/p");
					WaitInVisibliltyOfLocated(loaderElement);

					// verify Dial Next button display or not
					By dialNextElement = (By.xpath("//*[contains(text(),\"Dial Next\")]"));
					WaitVisibliltyOfLocated(dialNextElement);
					WebElement dialNext = driver.findElement(dialNextElement);
					softAssert.assertTrue(dialNext.isDisplayed(),
							"If We Reschedule call by submit & break button then call should be paused.");
					// Call assertAll to aggregate the results
					softAssert.assertAll();
		        });
				TestCaseTracker.markAsExecuted("claimVerifRescheduleCallBackLaterSubmitBreak");
			}

			else {
				System.out.println("Task type is not Claim Verification");
				manager.executeTask();
			}

			}
		
		
		@Test(priority = 45, alwaysRun = true)
		public void claimVerifRescheduleCallBackLaterTaskStatus() throws InterruptedException, IOException
		{	
			ExtentTest methodTest = test.createNode("claimVerifRescheduleCallBackLaterTaskStatus");
	        logTestMethod(driver,methodTest, "claimVerifRescheduleCallBackLaterTaskStatus", () ->{
			SoftAssert softAssert = new SoftAssert();
			functions = new CommanFunctions(driver);

			boolean status=false;
			By element=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a");
			WaitVisibliltyOfLocated(element);
			//Thread.sleep(2000);
			//get task no from dashboard
			By taskNoLocator=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a");
			WaitVisibliltyOfLocated(taskNoLocator);
			List<WebElement> taskNoElements=driver.findElements(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a"));
			for(int i=1; i<=taskNoElements.size();i++)
			 {  
				By taskNoElement=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div/a");
				WaitVisibliltyOf(taskNoElement);
				String taskNo=driver.findElement(taskNoElement).getText();
				 System.out.println("Dashboard Task No :" +taskNo);
				if(taskNo.equals(claimVefCallBackLaterTaskNo))
				{
					//get task Status from dashboard
					String taskStatus=driver.findElement(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div[8]/div")).getText();
					System.out.println("Dashboard Task status Claim Verification-Rechedule- Call Back Later : "+taskNo + " - "+taskStatus);
					softAssert.assertEquals(taskStatus, "Pending", " If Select Reschedule status Call Back Later then task should be Pending.");
					status=true;
					 break;
				}
				
			}
			if (!status) {
				softAssert.fail("Claim Verification- claimVerifRescheduleCallBackLaterTaskStatus Task no : " + claimVefCallBackLaterTaskNo + " not found");
			}
			
			softAssert.assertAll();
	        });
			 TestCaseTracker.markAsExecuted("claimVerifRescheduleCallBackLaterTaskStatus");
			
			}
		
		
		@Test(priority = 46, alwaysRun = true)
		public void claimVerifRescheduleCallBackLaterSubmit() throws InterruptedException, IOException
		{
			SoftAssert softAssert = new SoftAssert();
			functions = new CommanFunctions(driver);
			manager = new TaskTypeManager(driver, test);
			String taskType = functions.getTaskTypeFromApplication();
			if (taskType.equals("Influencer Claim Verification")) {
				ExtentTest methodTest = test.createNode("claimVerifRescheduleCallBackLaterSubmit");
		        logTestMethod(driver,methodTest, "claimVerifRescheduleCallBackLaterSubmit", () ->{
					String taskNoCallBackLaterSubmit = functions.getTaskNo();
					System.out.println("Task no. of Claim Verification-Reschedule  -Call Back Later -Submit button : "
							+ taskNoCallBackLaterSubmit);
					//Thread.sleep(2000);
					functions.callActionButton("Reschedule Call");
					try {
						functions.selectRescheduleStatus("Call Back Later");
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}

					// Click on Schedule time (+15 min)--Based On button index we can change time
					By timeLocator = By.xpath("//div[@class=\"d-grid gap-2 d-md-flex justify-content col\"]/button[3]");
					WaitVisibliltyOfLocated(timeLocator);
					click(timeLocator);

					functions.enterRescheduleRemark("Remark : Call Back Later");
					functions.clickrescheduleSubmit();
					By loaderElement = By.xpath("// div[@id=\"loader-container\"]/p");
					WaitInVisibliltyOfLocated(loaderElement);
					try {

						By nextDialTextElement = By.xpath("//h4[@class=\"text-info fw-bold\"]");
						WaitVisibliltyOfLocated(nextDialTextElement);
						WebElement nextDialText = driver.findElement(nextDialTextElement);
						System.out.println(nextDialText.getText());
						if (nextDialText.isDisplayed()) {
							System.out.println("No calls are scheduled");
						}

					} catch (Exception e) {

						By taskPopUpLocator = By
								.xpath("//*[@id=\"TelecallingInfoDiv\"]/div/div/a/div/div[3]/marquee/span");
						WaitVisibliltyOfLocated(taskPopUpLocator);
						WebElement taskPopUp = driver.findElement(taskPopUpLocator);
						String taskName = taskPopUp.getText();
						System.out.println(taskName);
						softAssert.assertTrue(taskPopUp.isDisplayed(),
								"If Reschedule task by Submit button then next call should be connet.");
					}

					softAssert.assertAll();
		        });
				TestCaseTracker.markAsExecuted("claimVerifRescheduleCallBackLaterSubmit");
			}

			else {
				System.out.println("Task type is not Claim Verification");
				manager.executeTask();
			}

		}
		
		
		
		@Test(priority = 47, alwaysRun = true)
		public void claimVerifRescheduleWrongNoSubmitBreak() throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			functions = new CommanFunctions(driver);
			manager = new TaskTypeManager(driver, test);
			// verify Task Type
			String taskType = functions.getTaskTypeFromApplication();
			if (taskType.equals("Influencer Claim Verification")) {

				ExtentTest methodTest = test.createNode("claimVerifRescheduleWrongNoSubmitBreak");
		        logTestMethod(driver,methodTest, "claimVerifRescheduleWrongNoSubmitBreak", () ->{
					claimVerifyWrongTaskNo = functions.getTaskNo();
					System.out.println("Task No-Claim Verification- Reschedule- Wrong no-Submit & break button : "
							+ claimVerifyWrongTaskNo);
					//Thread.sleep(2000);
					functions.callActionButton("Reschedule Call");
					try {
						functions.selectRescheduleStatus("Wrong Number");
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					functions.enterRescheduleRemark("Remark : Wrong Number");
					functions.clickRescheduleSubmitBreak();
					By loaderElement = By.xpath("// div[@id=\"loader-container\"]/p");
					WaitInVisibliltyOfLocated(loaderElement);

					// verify Dial Next button display or not
					By dialNextElement = (By.xpath("//*[contains(text(),\"Dial Next\")]"));
					WaitVisibliltyOfLocated(dialNextElement);
					WebElement dialNext = driver.findElement(dialNextElement);
					softAssert.assertTrue(dialNext.isDisplayed(),
							"If We Reshedule call by submit & break button then call should be paused.");
					// Call assertAll to aggregate the results
					softAssert.assertAll();
		        });
				TestCaseTracker.markAsExecuted("claimVerifRescheduleWrongNoSubmitBreak");
			}

			else {
				System.out.println("Task type is not Claim Verification");
				manager.executeTask();
			}

		}
		
		
		
		
		@Test(priority = 48, alwaysRun = true)
		public void claimVerifRescheduleWrongNoTaskStatus() throws InterruptedException, IOException
		{	
			ExtentTest methodTest = test.createNode("claimVerifRescheduleWrongNoTaskStatus");
	        logTestMethod(driver,methodTest, "claimVerifRescheduleWrongNoTaskStatus", () ->{
			SoftAssert softAssert = new SoftAssert();
			functions = new CommanFunctions(driver);

			boolean status=false;
			By element=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a");
			WaitVisibliltyOfLocated(element);
			//Thread.sleep(2000);
			//get task no from dashboard
			By taskNoLocator=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a");
			WaitVisibliltyOfLocated(taskNoLocator);
			List<WebElement> taskNoElements=driver.findElements(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a"));
			for(int i=1; i<=taskNoElements.size();i++)
			 {  
				By taskNoElement=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div/a");
				WaitVisibliltyOf(taskNoElement);
				String taskNo=driver.findElement(taskNoElement).getText();
				
				if(taskNo.equals(claimVerifyWrongTaskNo))
				{
					 System.out.println("Dashboard Task No :" +taskNo);
					//get task Status from dashboard
					String taskStatus=driver.findElement(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div[8]/div")).getText();
					System.out.println("Dashboard Task status Claim Verification-Rechedule-Wrong No : "+taskNo+"- "+taskStatus);
					softAssert.assertEquals(taskStatus, "Closed", " If Select Reschedule status Wrong then task should be closed.");
					status=true;
					 break;
				}
				
			}
			if (!status) {
				softAssert.fail("Claim Verification- claimVerifRescheduleWrongNoTaskStatus Task no : " + claimVerifyWrongTaskNo + " not found");
			}
			
			softAssert.assertAll();
	        });
			 TestCaseTracker.markAsExecuted("claimVerifRescheduleWrongNoTaskStatus");
			
			}
		
		
		
		@Test(priority = 49, alwaysRun = true)
		public void claimVerifRescheduleWrongNoSubmit() throws InterruptedException, IOException
		{
			SoftAssert softAssert = new SoftAssert();
			functions = new CommanFunctions(driver);
			manager = new TaskTypeManager(driver, test);
			String taskType = functions.getTaskTypeFromApplication();
			if (taskType.equals("Influencer Claim Verification")) {
				ExtentTest methodTest = test.createNode("claimVerifRescheduleWrongNoSubmit");
		        logTestMethod(driver,methodTest, "claimVerifRescheduleWrongNoSubmit", () ->{
					String taskNoWrongNoSubmit = functions.getTaskNo();
					System.out.println("Task no. of Claim Verification-Reschedule-Wrong no-Submit button : "
							+ taskNoWrongNoSubmit);
					//Thread.sleep(2000);
					functions.callActionButton("Reschedule Call");
					try {
						functions.selectRescheduleStatus("Wrong Number");
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					functions.enterRescheduleRemark("Remark : Wrong Number");
					functions.clickrescheduleSubmit();
					By loaderElement = By.xpath("// div[@id=\"loader-container\"]/p");
					WaitInVisibliltyOfLocated(loaderElement);
					try {

						By nextDialTextElement = By.xpath("//h4[@class=\"text-info fw-bold\"]");
						WaitVisibliltyOfLocated(nextDialTextElement);
						WebElement nextDialText = driver.findElement(nextDialTextElement);
						System.out.println(nextDialText.getText());
						if (nextDialText.isDisplayed()) {
							System.out.println("No calls are scheduled");
						}

					} catch (Exception e) {

						By taskPopUpLocator = By
								.xpath("//*[@id=\"TelecallingInfoDiv\"]/div/div/a/div/div[3]/marquee/span");
						WaitVisibliltyOfLocated(taskPopUpLocator);
						WebElement taskPopUp = driver.findElement(taskPopUpLocator);
						String taskName = taskPopUp.getText();
						System.out.println(taskName);
						softAssert.assertTrue(taskPopUp.isDisplayed(),
								"If Recshedule task by Submit button then next call should be connet.");
					}

					softAssert.assertAll();
		        });
				// TestCaseTracker.markAsExecuted("claimVerifRescheduleWrongNoSubmit");
			} else {
				System.out.println("Task type is not Claim Verification");
				manager.executeTask();
			}

		}
	 		
	
		
		
		
		

		@DataProvider(name = "claimVerificationData")
		public Object[][] claimVerificationDetails() {

			// call method to read & enter json data
			Object[][] dataArray = readJsonData(System.getProperty("user.dir")
					+ "\\src\\test\\java\\com\\jspl_automation\\data\\ClaimVerificationDetails.json");
			return dataArray;


		};

	
}


