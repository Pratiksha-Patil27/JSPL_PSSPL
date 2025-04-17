package com.jspl.OutboundTaskTest;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.jspl.base.OutboundTaskBaseClass;
import com.jspl.pageobjects.DialerLoginPage;
import com.jspl.pageobjects.OutBoundTaskPage;
import com.jspl.pageobjects.OutboundTelecallingPage;
import com.jspl.retryanalyzer.Retry;




public class ClaimVerificationTask extends OutboundTaskBaseClass{
	 
	
	private DialerLoginPage dialerPage;
	private OutboundTelecallingPage telePage;
	private OutBoundTaskPage outboundPage;
	private int i = 1;
	private String generatedClaimID;
	private String backButtonTaskNo;
	private String hangUpTaskNo;
	private String wrongTaskNo;
	private String notInterestedTakNo;
	private String ringNotReceivedTaskNo;
	private String callBackLaterTaskNo;
	private int expectedRedemptionPoints;
	private int oldLockedPoints;
	private int oldReedemablePoints;
	private int oldTotalPoints;
	private int newTotalPoints ;
	private int newLockedPoints;
	private int newReedemablePoints;
	private String addedRedemptionNumber;
	private String claimVerificationTaskNo;
	
	
	ExtentTest test;
	
	 public ClaimVerificationTask(WebDriver driver, ExtentTest test) {
	        this.driver = driver;
	        this.test = test;
	    }
 
		public int claimVerificationTaskMethodsCount()

		{
			Class<?> clazz = ClaimVerificationTask.class;

			// Get all the methods of the class
			Method[] methods = clazz.getDeclaredMethods();

			int testCaseCount = 0;
			for (Method method : methods) {
				if (method.isAnnotationPresent(Test.class)) {
					testCaseCount++;
				}
			}

			System.out.println("Number of test cases in class : " + clazz.getSimpleName() + ": " + testCaseCount);
			return testCaseCount;
		}

		public void runTests(TaskTypeManager manager) throws IOException, InterruptedException {

			try
			{
		
			if (!TestCaseTracker.isExecuted("claimTaskVerifyCloseTaskBtnClickable")) {

				claimTaskVerifyCloseTaskBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyCloseTaskSubmitBtnClickable")) {
				claimTaskVerifyCloseTaskSubmitBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyCloseTaskCancelBtnClickable")) {
				claimTaskVerifyCloseTaskCancelBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyCloseTaskSubmitBreakBtnClickable")) {
				claimTaskVerifyCloseTaskSubmitBreakBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyCloseTaskCrossIconClickable")) {
				claimTaskVerifyCloseTaskCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduledBtnClickable")) {
				claimTaskVerifyRescheduledBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduledSubmitBtnClickable")) {
				claimTaskVerifyRescheduledSubmitBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduledSubmitBreakBtnClickable")) {
				claimTaskVerifyRescheduledSubmitBreakBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduledCancelBtnClickable")) {
				claimTaskVerifyRescheduledCancelBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduledCrossIconClickable")) {
				claimTaskVerifyRescheduledCrossIconClickable(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyRedial")) {
				claimTaskVerifyRedial(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyBackBtn")) {
				claimTaskVerifyBackBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyBackTaskStatus")) {
				claimTaskVerifyBackTaskStatus(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyBackButtonDialNext")) {
				claimTaskVerifyBackButtonDialNext(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyHangUp")) {
				claimTaskVerifyHangUp(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyCloseTaskBySubmitBtnWhenClaimStatusPending")) {
				claimTaskVerifyCloseTaskBySubmitBtnWhenClaimStatusPending(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyCloseTaskBySubmitBreakBtnWhenClaimStatusPending")) {
				claimTaskVerifyCloseTaskBySubmitBreakBtnWhenClaimStatusPending(manager);
			}
					
			if (!TestCaseTracker.isExecuted("claimTaskVerifyClaimVerifyBtnClickable")) {
				claimTaskVerifyClaimVerifyBtnClickable(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyClaimVerificationSubmitBtnClickable")) {
				claimTaskVerifyClaimVerificationSubmitBtnClickable(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyClaimCancelBtnClickable")) {
				claimTaskVerifyClaimCancelBtnClickable(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyClaimCrossIconClickable")) {
				claimTaskVerifyClaimCrossIconClickable(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyClaimedPointsOfClaimVerification")) {
				claimTaskVerifyClaimedPointsOfClaimVerification(manager);
			}
				
			if (!TestCaseTracker.isExecuted("claimTaskVerifyQtyFieldOfClaimVerificationByEnterMaxQty")) {
				claimTaskVerifyQtyFieldOfClaimVerificationByEnterMaxQty(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyReasonFieldNotDisplayForApproveStatusForClaimVef")) {
				claimTaskVerifyReasonFieldNotDisplayForApproveStatusForClaimVef(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyReasonFieldShouldDisplayForRejectStatusForClaimVerf")) {
				claimTaskVerifyReasonFieldShouldDisplayForRejectStatusForClaimVerf(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyQtyAndPointsForClaimVerificationRejectStatus")) {
				claimTaskVerifyQtyAndPointsForClaimVerificationRejectStatus(manager);
			}
				
			if (!TestCaseTracker.isExecuted("claimTaskVerifyClaimWithoutSelectClaimVefRejectReason")) {
				claimTaskVerifyClaimWithoutSelectClaimVefRejectReason(manager);
			}
				
			if (!TestCaseTracker.isExecuted("claimTaskVerifyClaimIdOfClaimVerification")) {
				claimTaskVerifyClaimIdOfClaimVerification(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyClaimDateOfClaimVerification")) {
				claimTaskVerifyClaimDateOfClaimVerification(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyCustomerNameOfClaimVerification")) {
				claimTaskVerifyCustomerNameOfClaimVerification(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyStatusOfClaimVerification")) {
				claimTaskVerifyStatusOfClaimVerification(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyInfluencerNameOfClaimVerification")) {
				claimTaskVerifyInfluencerNameOfClaimVerification(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyInfluencerMobileNoOfClaimVerification")) {
				claimTaskVerifyInfluencerMobileNoOfClaimVerification(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyTotalRecordsOfClaimVerification")) {
				claimTaskVerifyTotalRecordsOfClaimVerification(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifySingleClaimInMultipleWaysBySubmitBreakBtn")) {
				claimTaskVerifySingleClaimInMultipleWaysBySubmitBreakBtn(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyStatusOnDashboardForClaimVef")) {
				claimTaskVerifyStatusOnDashboardForClaimVef(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifySingleClaimInMultipleWaysBySubmitBtn")) {
				claimTaskVerifySingleClaimInMultipleWaysBySubmitBtn(manager);
			}
		
			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduleNotInterestedBySubmitBreakBtn")) {
				claimTaskVerifyRescheduleNotInterestedBySubmitBreakBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduleNotInterestedTaskStatus")) {
				claimTaskVerifyRescheduleNotInterestedTaskStatus(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduleNotInterestedBySubmitBtn")) {
				claimTaskVerifyRescheduleNotInterestedBySubmitBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduleRingNotReceivedBySubmitBreakBtn")) {
				claimTaskVerifyRescheduleRingNotReceivedBySubmitBreakBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduleRingNotReceivedTaskStatus")) {
				claimTaskVerifyRescheduleRingNotReceivedTaskStatus(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduleRingNotReceivedBySubmitBtn")) {
				claimTaskVerifyRescheduleRingNotReceivedBySubmitBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduleCallBackLaterBySubmitBreakBtn")) {
				claimTaskVerifyRescheduleCallBackLaterBySubmitBreakBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduleCallBackLaterTaskStatus")) {
				claimTaskVerifyRescheduleCallBackLaterTaskStatus(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduleCallBackLaterBySubmitBtn")) {
				claimTaskVerifyRescheduleCallBackLaterBySubmitBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduleWrongNoBySubmitBreakBtn")) {
				claimTaskVerifyRescheduleWrongNoBySubmitBreakBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduleWrongNoTaskStatus")) {
				claimTaskVerifyRescheduleWrongNoTaskStatus(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduleWrongNoBySubmitBtn")) {
				claimTaskVerifyRescheduleWrongNoBySubmitBtn(manager);
			}else {
				claimTaskVerifyRescheduleWrongNoBySubmitBtn(manager);
			}
		
			}catch (Exception e) {
		        System.err.println("Exception during test execution: " + e.getMessage());
			}
		}
		
		
		
	
	@Test(priority = 1, retryAnalyzer = Retry.class)
	public void claimTaskVerifyCloseTaskBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("claimTaskVerifyCloseTaskBtnClickable");
		logTestMethod(driver, methodTest, manager,"claimTaskVerifyCloseTaskBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnCallActionButton("Close Task");
			softAssert.assertTrue(telePage.verifyCloseTaskLableDisplay(), "Close Task Button not clickable");
			softAssert.assertAll();
		});
		TestCaseTracker.markAsExecuted("claimTaskVerifyCloseTaskBtnClickable");
	}
	
	@Test(priority = 2)
	public void claimTaskVerifyCloseTaskSubmitBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("claimTaskVerifyCloseTaskSubmitBtnClickable");
		logTestMethod(driver, methodTest,manager, "claimTaskVerifyCloseTaskSubmitBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnCloseTasksubmitButton();
			softAssert.assertTrue(telePage.verifyCloseTaskRemarkWarningMsgDisplay(),
					"Close Task Submit button not clickable");
			softAssert.assertAll();
		});
		TestCaseTracker.markAsExecuted("claimTaskVerifyCloseTaskSubmitBtnClickable");

	}

	@Test(priority = 3)
	public void claimTaskVerifyCloseTaskCancelBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("claimTaskVerifyCloseTaskCancelBtnClickable");
		logTestMethod(driver, methodTest,manager, "claimTaskVerifyCloseTaskCancelBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			boolean status = true;
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnCloseTaskCancelButton();
			try {
				By closeTaskLableLocator = By.xpath("//h6[@class=\"my-0\"]/label");
				WebElement closeTaskLableElement = driver.findElement(closeTaskLableLocator);
				if (closeTaskLableElement.isDisplayed()) {
					status = false;
				}
			} catch (Exception e) {

			}
			if (!status) {
				softAssert.fail("Close Task cancel button not clickable");
			}
			softAssert.assertAll();
		});
		TestCaseTracker.markAsExecuted("claimTaskVerifyCloseTaskCancelBtnClickable");
	}

	@Test(priority = 4)
	public void claimTaskVerifyCloseTaskSubmitBreakBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("claimTaskVerifyCloseTaskSubmitBreakBtnClickable");
		logTestMethod(driver, methodTest,manager, "claimTaskVerifyCloseTaskSubmitBreakBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnCallActionButton("Close Task");
			telePage.clickOnCloseTasksubmitBreakButton();
			softAssert.assertTrue(telePage.verifyCloseTaskRemarkWarningMsgDisplay(),
					"Close Task Submit Break button not clickable");
			softAssert.assertAll();
		});
		TestCaseTracker.markAsExecuted("claimTaskVerifyCloseTaskSubmitBreakBtnClickable");

	}

	@Test(priority = 5)
	public void claimTaskVerifyCloseTaskCrossIconClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("claimTaskVerifyCloseTaskCrossIconClickable");
		logTestMethod(driver, methodTest,manager, "claimTaskVerifyCloseTaskCrossIconClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			boolean status = true;
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnCloseTaskCrossIcon();
			try {
				By closeTaskLableLocator = By.xpath("//h6[@class=\"my-0\"]/label");
				WebElement closeTaskLableElementElement = driver.findElement(closeTaskLableLocator);
				if (closeTaskLableElementElement.isDisplayed()) {
					status = false;
				}
			} catch (Exception e) {

			}
			if (!status) {
				softAssert.fail("Close Task Cross button not clickable");
			}
			softAssert.assertAll();

		});
		TestCaseTracker.markAsExecuted("claimTaskVerifyCloseTaskCrossIconClickable");
	}

	@Test(priority = 6)
	public void claimTaskVerifyRescheduledBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduledBtnClickable");
		logTestMethod(driver, methodTest,manager, "claimTaskVerifyRescheduledBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnCallActionButton("Reschedule Call");
			softAssert.assertTrue(telePage.verifyRescheduleLableDisplay(), "Reschedule Button not clickable");
			softAssert.assertAll();
		});
		TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduledBtnClickable");

	}

	@Test(priority = 7)
	public void claimTaskVerifyRescheduledSubmitBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduledSubmitBtnClickable");
		logTestMethod(driver, methodTest,manager, "claimTaskVerifyRescheduledSubmitBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnRescheduleCallSubmitButton();

			softAssert.assertTrue(telePage.verifyRescheduleCallStatusWarningMsgDisplay(),
					"Reschedule Submit button not clickable");

			softAssert.assertAll();

		});
		TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduledSubmitBtnClickable");
	}

	@Test(priority = 8)
	public void claimTaskVerifyRescheduledSubmitBreakBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduledSubmitBreakBtnClickable");
		logTestMethod(driver, methodTest,manager, "claimTaskVerifyRescheduledSubmitBreakBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnRescheduleCallSubmitBreakButton();
			softAssert.assertTrue(telePage.verifyRescheduleCallStatusWarningMsgDisplay(),
					"Reschedule Submit & Break button not clickable");

			softAssert.assertAll();

		});
		TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduledSubmitBreakBtnClickable");
	}

	@Test(priority = 9)
	public void claimTaskVerifyRescheduledCancelBtnClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduledCancelBtnClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyRescheduledCancelBtnClickable", () -> {
		boolean status=true;
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnRescheduleCallCancelButton();
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
        TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduledCancelBtnClickable");
		
	}
	
	@Test(priority = 10)
	public void claimTaskVerifyRescheduledCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduledCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyRescheduledCrossIconClickable", () -> {
		boolean status=true;
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnCallActionButton("Reschedule Call");
		telePage.clickOnRescheduleCallCrossIcon();
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
        TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduledCrossIconClickable");
	}
	
	
	
		
	
	@Test(priority = 11, alwaysRun = true)
	public void claimTaskVerifyRedial(TaskTypeManager manager) throws InterruptedException, IOException
	{ 
		ExtentTest methodTest = test.createNode("claimTaskVerifyRedial");
        logTestMethod(driver,methodTest, manager,"claimTaskVerifyRedial", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		String oldTaskNo = telePage.getTelePageTaskNo();
		// click on Redial button
		telePage.clickOnCallActionButton("Redial");
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		String newTaskNo =telePage.getTelePageTaskNo();
		
		try
		{
		telePage.waitInVisibilityOfLoader();
		}catch(Exception e)
		{
			softAssert.fail("Redial Button not working proper.");
		driver.navigate().refresh();
		}
		softAssert.assertEquals(newTaskNo, oldTaskNo, "Test Failed : Redial button not working properly");
	    softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("claimTaskVerifyRedial");
	}
	
	
	
	@Test(priority = 12, alwaysRun = true)
	public void claimTaskVerifyBackBtn(TaskTypeManager manager) throws IOException  
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyBackBtn");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyBackBtn", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		outboundPage=new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		backButtonTaskNo= telePage.getTelePageTaskNo();
		System.out.println("backButtonTaskNo :"+ backButtonTaskNo);
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		telePage.clickOnCallActionButton("Back");
		//verify Dial Next button display or not
		softAssert.assertTrue(outboundPage.verifyOutboundTaskPageDisplay()," Back Button Not working proper");
		softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("claimTaskVerifyBackBtn");
		 
	}
	
	@Test(priority = 13, alwaysRun = true)
	public void claimTaskVerifyBackTaskStatus(TaskTypeManager manager) throws IOException 
	{
		
		ExtentTest methodTest = test.createNode("claimTaskVerifyBackTaskStatus");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyBackTaskStatus", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		outboundPage=new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		String taskStatus=outboundPage.getOutboundPageTaskStatus(backButtonTaskNo);
		System.out.println("Back Button taskStatus "+ taskStatus);
		System.out.println("Dashboard Task status for Back Button : "+taskStatus);
		softAssert.assertEquals(taskStatus, "Pending", "Back Button status Should be show as pending.");
		softAssert.assertAll();
        });
		 TestCaseTracker.markAsExecuted("claimTaskVerifyBackTaskStatus");
		
		}
	
	@Test(priority = 14, alwaysRun = true)
	public void claimTaskVerifyBackButtonDialNext(TaskTypeManager manager) throws InterruptedException, IOException
	{  
		ExtentTest methodTest = test.createNode("claimTaskVerifyBackButtonDialNext");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyBackButtonDialNext", () ->{ 
		dialerPage=new DialerLoginPage(driver);
		//Verify after back task when click on dial next then same task should be open
		SoftAssert softAssert = new SoftAssert();
		outboundPage=new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		outboundPage.clickOnDialNextButton();
		try {
			dialerPage.checkErrorToast();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}	 
		String newTaskNo=telePage.getTelePageTaskNo();
		softAssert.assertEquals(newTaskNo, backButtonTaskNo,"incorrect call connect");
		
		softAssert.assertAll();
        });
	   TestCaseTracker.markAsExecuted("claimTaskVerifyBackButtonDialNext");
		
	}
	
	@Test(priority = 15, alwaysRun = true)
	public void claimTaskVerifyHangUp(TaskTypeManager manager) throws InterruptedException, IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyHangUp");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyHangUp", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		outboundPage=new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		 hangUpTaskNo=telePage.getTelePageTaskNo();
		 telePage.clickOnCallActionButton("Hangup");
		 String loaderMsg= telePage.getLoaderMsg();
		 System.out.println("Loader Msg : "+loaderMsg);
		softAssert.assertNotEquals(loaderMsg,"New Call Connecting", "Hang Up Button not working proper");
		try
		{
		telePage.waitInVisibilityOfLoader();
		}catch(Exception e)
		{
			softAssert.fail("HangUp Button not working proper.");
		driver.navigate().refresh();
		}
		softAssert.assertAll();
        });
        
		 TestCaseTracker.markAsExecuted("claimTaskVerifyHangUp");
				
	}
	
	@Test(priority = 16, alwaysRun = true)
	public void claimTaskVerifyCloseTaskBySubmitBtnWhenClaimStatusPending(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyCloseTaskBySubmitBtnWhenClaimStatusPending");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyCloseTaskBySubmitBtnWhenClaimStatusPending", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		outboundPage=new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnCallActionButton("Close Task");
		
		//Check Claim Status
		String claimStatus=telePage.getClaimStatusOnCloseTask();
		System.out.println("Claim Status : "+claimStatus);
		
		//Enter close task remark
		telePage.enterCloseTaskRemark("Close Task");
		
		//click on submit button
		telePage.clickOnCloseTasksubmitButton();
		
		 if(claimStatus.equals("Pending"))
		 {
			 softAssert.assertTrue(telePage.verifyClosetaskWarningDialogBoxDisplay(),"User should not be closed Task if claim status is pending");
		
		 }
		telePage.clickOnCloseTaskDialogBoxOkBtn();
		
		softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("claimTaskVerifyCloseTaskBySubmitBtnWhenClaimStatusPending");
		
		}

	@Test(priority = 17, alwaysRun = true)
	public void claimTaskVerifyCloseTaskBySubmitBreakBtnWhenClaimStatusPending(TaskTypeManager manager) throws IOException
	{
		
		ExtentTest methodTest = test.createNode("claimTaskVerifyCloseTaskBySubmitBreakBtnWhenClaimStatusPending");
        logTestMethod(driver,methodTest, manager,"claimTaskVerifyCloseTaskBySubmitBreakBtnWhenClaimStatusPending", () ->{ 
        	SoftAssert softAssert = new SoftAssert();
    		outboundPage=new OutBoundTaskPage(driver);
    		telePage = new OutboundTelecallingPage(driver);
    		telePage.clickOnCallActionButton("Close Task");
    		
    		//Check Claim Status
    		String claimStatus=telePage.getClaimStatusOnCloseTask();
    		System.out.println("Claim Status : "+claimStatus);
    		
    		//Enter close task remark
    		telePage.enterCloseTaskRemark("Close Task");
    		
    		//click on submit button
    		telePage.clickOnCloseTasksubmitBreakButton();
    		
    		 if(claimStatus.equals("Pending"))
    		 {
    			 softAssert.assertTrue(telePage.verifyClosetaskWarningDialogBoxDisplay(),"User should not be closed Task if claim status is pending");
    		 }
    		telePage.clickOnCloseTaskDialogBoxOkBtn();
    		
    		softAssert.assertAll();
            });
		TestCaseTracker.markAsExecuted("claimTaskVerifyCloseTaskBySubmitBreakBtnWhenClaimStatusPending");
		
		
	}


	@Test(priority = 18, alwaysRun = true)
	public void claimTaskVerifyClaimVerifyBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("claimTaskVerifyClaimVerifyBtnClickable");
		logTestMethod(driver, methodTest,manager, "claimTaskVerifyClaimVerifyBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnVerifyBtnOfClaimVerification();

			softAssert.assertTrue(telePage.verifyClaimVerificationLabelDisplay(), "Claim Verify button not clickable");

			softAssert.assertAll();
		});
		TestCaseTracker.markAsExecuted("claimTaskVerifyClaimVerifyBtnClickable");

	}
	
	
	@Test(priority = 19, alwaysRun = true)
	public void claimTaskVerifyClaimVerificationSubmitBtnClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyClaimVerificationSubmitBtnClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyClaimVerificationSubmitBtnClickable", () ->{ 
        	SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnClaimVerificationSubmitBtn();
		softAssert.assertTrue(telePage.verifyClaimVerificationErrorToastForClaimStatusFieldDisplay(),"Claim Verification Submit button not clickable");
		
        softAssert.assertAll();
        telePage.waitInvisibilityOfErrorToastMsgForClaimVefClaimStatusField();
        });
		TestCaseTracker.markAsExecuted("claimTaskVerifyClaimVerificationSubmitBtnClickable");
	}
	
	

	@Test(priority = 20, alwaysRun = true)
	public void claimTaskVerifyClaimCancelBtnClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyClaimCancelBtnClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyClaimCancelBtnClickable", () ->{ 
		boolean status=true;
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnClaimVerificationCancelBtn();
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
		TestCaseTracker.markAsExecuted("claimTaskVerifyClaimCancelBtnClickable");
		
	}
	
	@Test(priority = 21, alwaysRun = true)
	public void claimTaskVerifyClaimCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyClaimCrossIconClickable");
        logTestMethod(driver,methodTest, manager,"claimTaskVerifyClaimCrossIconClickable", () ->{ 
		boolean status=true;
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnVerifyBtnOfClaimVerification();
		telePage.clickOnClaimVerificationCrossIcon();
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
		TestCaseTracker.markAsExecuted("claimTaskVerifyClaimCrossIconClickable");
	}
	
	
	
	@Test(priority = 22, alwaysRun = true)
    public void claimTaskVerifyClaimedPointsOfClaimVerification(TaskTypeManager manager) throws IOException
     {
  	 ExtentTest methodTest = test.createNode("claimTaskVerifyClaimedPointsOfClaimVerification");
       logTestMethod(driver,methodTest,manager, "claimTaskVerifyClaimedPointsOfClaimVerification", () ->{ 
    	   SoftAssert softAssert = new SoftAssert();
   		outboundPage = new OutBoundTaskPage(driver);
   		telePage = new OutboundTelecallingPage(driver);
   		telePage.clickOnVerifyBtnOfClaimVerification();
		 for(int i=1; i<=telePage.getRowsCountOfSpecificClaim(); i++)
		 {
			 int points=telePage.getPointsValueOfClaimVerification(i);
			 System.out.println("Claim Verification Points :" +points);
       	 
			 int claimedQty= telePage.getClaimedQtyOfClaimVerification(i);
			 System.out.println("Claim Verification Claimed Qty  :" +claimedQty);
			 
			double pointsAndQty= (points*claimedQty);
			System.out.println("points * Qty :"+pointsAndQty);
			double decimalClaimedPoints= pointsAndQty/1000;
			
			System.out.println("decimalClaimedPoints :"+decimalClaimedPoints);
			int expectedClaimedPoints =(int) Math.round(decimalClaimedPoints);
			System.out.println("Claim Verification Expected Claimed Points  :" +expectedClaimedPoints);
       	     
			int actualClaimedPoints=telePage.getClaimedPointsOfClaimVerification(i);
			System.out.println("Claim Verification Actual Claimed Points  :" +actualClaimedPoints);
			softAssert.assertEquals(actualClaimedPoints, expectedClaimedPoints,"Claimed Points are incorrect");
			
			softAssert.assertAll();
			 
		 }
       });
       telePage.clickOnClaimVerificationCrossIcon();
		TestCaseTracker.markAsExecuted("claimTaskVerifyClaimedPointsOfClaimVerification"); 
     }


   
   @Test(priority = 23, alwaysRun = true)
   public void claimTaskVerifyQtyFieldOfClaimVerificationByEnterMaxQty(TaskTypeManager manager) throws InterruptedException, IOException
 { 
	  ExtentTest methodTest = test.createNode("claimTaskVerifyQtyFieldOfClaimVerificationByEnterMaxQty");
      logTestMethod(driver,methodTest,manager, "claimTaskVerifyQtyFieldOfClaimVerificationByEnterMaxQty", () ->{ 
    	  SoftAssert softAssert = new SoftAssert();
     		outboundPage = new OutBoundTaskPage(driver);
     		telePage = new OutboundTelecallingPage(driver);
     		telePage.clickOnVerifyBtnOfClaimVerification();
   	
		 for(int i=1; i<=telePage.getRowsCountOfSpecificClaim(); i++)
		 {
		     int claimedQty=telePage.getClaimedQtyOfClaimVerification(i);
			 System.out.println("Claim Verification Claimed Qty  :" +claimedQty);
		   
			 int verifyQty=claimedQty+1;
			String strVerifyQty = String.valueOf(verifyQty);
			System.out.println("Enter Max Verify Qty : "+ strVerifyQty);
			
			telePage.enterQtyInVerifyQtyFieldOfClaimVerification(i,strVerifyQty);
	
		 }	
		 telePage.clickOnClaimVerificationSubmitBtn();
		softAssert.assertTrue(telePage.verifyClaimVerificationErrorToastForClaimMaxQtyDisplay(), "If Enter Qty more than Claimed Qty then error msg should be show");
		telePage.waitInvisibilityOfErrorToastMsgForClaimVefClaimMaxQty();
		softAssert.assertAll();
      });
      telePage.clickOnClaimVerificationCancelBtn();
		TestCaseTracker.markAsExecuted("claimTaskVerifyQtyFieldOfClaimVerificationByEnterMaxQty");
        	  
   }


@Test(priority = 24, alwaysRun = true)
public void claimTaskVerifyReasonFieldNotDisplayForApproveStatusForClaimVef(TaskTypeManager manager) throws InterruptedException, IOException {
	// If we select claim status approve then Rejected Reason field should not be show

	ExtentTest methodTest = test.createNode("claimTaskVerifyReasonFieldNotDisplayForApproveStatusForClaimVef");
	logTestMethod(driver, methodTest, manager,"claimTaskVerifyReasonFieldNotDisplayForApproveStatusForClaimVef", () -> {
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnVerifyBtnOfClaimVerification();
		for (int i = 1; i <= telePage.getRowsCountOfSpecificClaim(); i++) {
			// Select Claim Status
			try {
				telePage.selectClaimVerificationStatus(i,"Approve");
			} catch (InterruptedException e) {
		
				e.printStackTrace();
			}
			try {
				softAssert.assertFalse(telePage.verifyClaimVerificationSelectReasonFieldDisplay(i),
						"If claim Status is 'Approve' the Reason Field should be not be show");
			} catch (Exception e) {
				// System.out.println("Rejected Reason Field Not display due to Selected Claim
				// Status is \"Approved\" ");
			}
		}
		softAssert.assertAll();
	});
	telePage.clickOnClaimVerificationCancelBtn();
	TestCaseTracker.markAsExecuted("claimTaskVerifyReasonFieldNotDisplayForApproveStatusForClaimVef");

}


@Test(priority = 25, alwaysRun = true)
public void claimTaskVerifyReasonFieldShouldDisplayForRejectStatusForClaimVerf(TaskTypeManager manager)
		throws InterruptedException, IOException {

	// If we select claim status Reject then Rejected Reason field should be show
	ExtentTest methodTest = test.createNode("claimTaskVerifyReasonFieldShouldDisplayForRejectStatusForClaimVerf");
	logTestMethod(driver, methodTest, manager,"claimTaskVerifyReasonFieldShouldDisplayForRejectStatusForClaimVerf", () -> {
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnVerifyBtnOfClaimVerification();
		for (int i = 1; i <= telePage.getRowsCountOfSpecificClaim(); i++) {
			// Select Claim Status
			try {
				telePage.selectClaimVerificationStatus(i, "Reject");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			softAssert.assertTrue(telePage.verifyClaimVerificationSelectReasonFieldDisplay(i),
					"If claim Status is \"Reject\" the Reason Field should be  be show");

		}
		softAssert.assertAll();
	});
	telePage.clickOnClaimVerificationCancelBtn();
	TestCaseTracker.markAsExecuted("claimTaskVerifyReasonFieldShouldDisplayForRejectStatusForClaimVerf");

}

@Test(priority = 26, alwaysRun = true)
public void claimTaskVerifyQtyAndPointsForClaimVerificationRejectStatus(TaskTypeManager manager) throws InterruptedException, IOException {
	ExtentTest methodTest = test.createNode("claimTaskVerifyQtyAndPointsForClaimVerificationRejectStatus");
	logTestMethod(driver, methodTest,manager, "claimTaskVerifyQtyAndPointsForClaimVerificationRejectStatus", () -> {
		// If we select Claim Status Reject then Verify Qty & Points should be show "0".
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnVerifyBtnOfClaimVerification();
		for (int i = 1; i <= telePage.getRowsCountOfSpecificClaim(); i++) {
			// Select Claim Status
			try {
				telePage.selectClaimVerificationStatus(i, "Reject");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			String expectedQtyValue = "0";

			String actualQtyValue = telePage.getVerifyQtyOfClaimVerification(i);
			System.out.println("verify Qty  : " + actualQtyValue);

			softAssert.assertEquals(actualQtyValue, expectedQtyValue,
					"After Select Claim Status \"Reject\" Qty should be show 0.");

			String expectedPointsValue = "0";

			String actualPointsValue = telePage.getTotalVerifyPointsOfClaimVerification(i);
			System.out.println("verify Points : " + actualPointsValue);

			softAssert.assertEquals(actualPointsValue, expectedPointsValue,
					"After Select Claim Status \"Reject\" Points should be show 0.");

		}

		softAssert.assertAll();
	});
	TestCaseTracker.markAsExecuted("claimTaskVerifyQtyAndPointsForClaimVerificationRejectStatus");

}



@Test(priority = 27, alwaysRun = true)
public void claimTaskVerifyClaimWithoutSelectClaimVefRejectReason(TaskTypeManager manager) throws IOException {
	// If we select Claim Status Reject & if Reason field Blank then Error pop-up should be display
	ExtentTest methodTest = test.createNode("claimTaskVerifyClaimWithoutSelectClaimVefRejectReason");
	logTestMethod(driver, methodTest,manager, "claimTaskVerifyClaimWithoutSelectClaimVefRejectReason", () -> {
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnClaimVerificationSubmitBtn();
		softAssert.assertTrue(telePage.verifyClaimVerificationErrorToastForReasonFieldDisplay(),
				"If select Claim Status Reject & Keep Reject Reason Blank and submit claim then error msg should be show");

		telePage.waitInvisibilityOfErrorToastMsgForClaimVefReasonField();
		softAssert.assertAll();
	});
	telePage.clickOnClaimVerificationCancelBtn();
	TestCaseTracker.markAsExecuted("claimTaskVerifyClaimWithoutSelectClaimVefRejectReason");

}

@Test(priority = 28, alwaysRun = true)
public void claimTaskVerifyClaimIdOfClaimVerification(TaskTypeManager manager) throws IOException
{
	ExtentTest methodTest = test.createNode("claimTaskVerifyClaimIdOfClaimVerification");
	logTestMethod(driver, methodTest,manager, "claimTaskVerifyClaimIdOfClaimVerification", () -> {
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		String expectedClaimId=telePage.getClaimVefDetailsClaimId(1);
		System.out.println("expectedClaimId : "+expectedClaimId);
		telePage.clickOnVerifyBtnOfClaimVerification();
		String actualClaimId=telePage.getClaimVerificationClaimId();
		System.out.println("actualClaimId : "+actualClaimId);
		softAssert.assertEquals(actualClaimId, expectedClaimId,
				"Claim Id  of Claim Verification is incorrect.");
	
		softAssert.assertAll();
	});
	telePage.clickOnClaimVerificationCrossIcon();
	TestCaseTracker.markAsExecuted("claimTaskVerifyClaimIdOfClaimVerification");
}


@Test(priority = 29, alwaysRun = true)
public void claimTaskVerifyClaimDateOfClaimVerification(TaskTypeManager manager) throws IOException
{
	ExtentTest methodTest = test.createNode("claimTaskVerifyClaimDateOfClaimVerification");
	logTestMethod(driver, methodTest,manager, "claimTaskVerifyClaimDateOfClaimVerification", () -> {
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		String expectedClaimDate=telePage.getClaimVefDetailsClaimDate(1);
		System.out.println("expectedClaimDate : "+expectedClaimDate);
		telePage.clickOnVerifyBtnOfClaimVerification();
		String actualClaimDate=telePage.getClaimVerificationClaimDate();
		System.out.println("actualClaimDate : "+actualClaimDate);
		softAssert.assertEquals(actualClaimDate, expectedClaimDate,
				"Claim Date of Claim Verification is incorrect.");
	
		softAssert.assertAll();
	});
	telePage.clickOnClaimVerificationCrossIcon();
	TestCaseTracker.markAsExecuted("claimTaskVerifyClaimDateOfClaimVerification");
}

@Test(priority = 30, alwaysRun = true)
public void claimTaskVerifyCustomerNameOfClaimVerification(TaskTypeManager manager) throws IOException
{
	ExtentTest methodTest = test.createNode("claimTaskVerifyCustomerNameOfClaimVerification");
	logTestMethod(driver, methodTest, manager,"claimTaskVerifyCustomerNameOfClaimVerification", () -> {
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		String expectedCustomerName=telePage.getClaimVefDetailsCustomerName(1);
		System.out.println("expectedCustomerName : "+expectedCustomerName);
		telePage.clickOnVerifyBtnOfClaimVerification();
		String actualCustomerName=telePage.getClaimVerificationCustomerName();
		System.out.println("actualCustomerName : "+actualCustomerName);
		softAssert.assertEquals(actualCustomerName.toLowerCase(), expectedCustomerName.toLowerCase(),
				"Customer Name of Claim Verification is incorrect.");
	
		softAssert.assertAll();
	});
	telePage.clickOnClaimVerificationCrossIcon();
	TestCaseTracker.markAsExecuted("claimTaskVerifyCustomerNameOfClaimVerification");
}

@Test(priority = 31, alwaysRun = true)
public void claimTaskVerifyStatusOfClaimVerification(TaskTypeManager manager) throws IOException
{
	//Claim Status Should be show Pending
	ExtentTest methodTest = test.createNode("claimTaskVerifyStatusOfClaimVerification");
	logTestMethod(driver, methodTest, manager,"claimTaskVerifyStatusOfClaimVerification", () -> {
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		String actualClaimStatus=telePage.getClaimVefDetailsClaimStatus(i);
		System.out.println("actualClaimStatus : "+actualClaimStatus);
		softAssert.assertEquals(actualClaimStatus, "Pending",
				" Claim Verification Status should be Pending.");
		softAssert.assertAll();
	});
	TestCaseTracker.markAsExecuted("claimTaskVerifyStatusOfClaimVerification");
	
	
}

@Test(priority = 32, alwaysRun = true)
public void claimTaskVerifyInfluencerNameOfClaimVerification(TaskTypeManager manager) throws IOException
{
	ExtentTest methodTest = test.createNode("claimTaskVerifyInfluencerNameOfClaimVerification");
	logTestMethod(driver, methodTest,manager, "claimTaskVerifyInfluencerNameOfClaimVerification", () -> {
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		String expectedInfluencerName=telePage.getOpenedTaskInfluencerName();
		System.out.println("expectedInfluencerName : "+expectedInfluencerName);
		telePage.clickOnVerifyBtnOfClaimVerification();
		String actualInfluencerName=telePage.getClaimVerificationInfluencerName();
		System.out.println("actualInfluencerName : "+actualInfluencerName);
		softAssert.assertEquals(actualInfluencerName.toLowerCase(), expectedInfluencerName.toLowerCase(),
				"Influencer Name of Claim Verification is incorrect.");
	
		softAssert.assertAll();
	});
	telePage.clickOnClaimVerificationCrossIcon();
	TestCaseTracker.markAsExecuted("claimTaskVerifyInfluencerNameOfClaimVerification");
}

@Test(priority = 33, alwaysRun = true)
public void claimTaskVerifyInfluencerMobileNoOfClaimVerification(TaskTypeManager manager) throws IOException
{
	ExtentTest methodTest = test.createNode("claimTaskVerifyInfluencerMobileNoOfClaimVerification");
	logTestMethod(driver, methodTest,manager, "claimTaskVerifyInfluencerMobileNoOfClaimVerification", () -> {
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		String expectedInfluencerMobileNo=telePage.getOpenedTaskInfluencerMobileNo();
		System.out.println("expectedInfluencerMobileNo : "+expectedInfluencerMobileNo);
		telePage.clickOnVerifyBtnOfClaimVerification();
		String actualInfluencerMobileNo=telePage.getClaimVerificationInfluencerMobileNo();
		System.out.println("actualInfluencerMobileNo : "+actualInfluencerMobileNo);
		softAssert.assertEquals(actualInfluencerMobileNo, expectedInfluencerMobileNo,
				"Influencer Mobile No. of Claim Verification is incorrect.");
	
		softAssert.assertAll();
	});
	telePage.clickOnClaimVerificationCrossIcon();
	TestCaseTracker.markAsExecuted("claimTaskVerifyInfluencerMobileNoOfClaimVerification");
}

@Test(priority = 34, alwaysRun = true)
public void claimTaskVerifyTotalRecordsOfClaimVerification(TaskTypeManager manager) throws IOException
{
	ExtentTest methodTest = test.createNode("claimTaskVerifyTotalRecordsOfClaimVerification");
	logTestMethod(driver, methodTest, manager,"claimTaskVerifyTotalRecordsOfClaimVerification", () -> {
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnVerifyBtnOfClaimVerification();
		String stringCount=telePage.getClaimVerificationTotalRecordsCount();
		int actualCount = Integer.parseInt(stringCount);
		System.out.println("actualCount : "+actualCount);
		int expectedCount=telePage.getRowsCountOfSpecificClaim();
		System.out.println("expectedCount : "+expectedCount);
		softAssert.assertEquals(actualCount, expectedCount,
				"Total Records of Claim Verification is incorrect.");
	
		softAssert.assertAll();
	});
	telePage.clickOnClaimVerificationCrossIcon();
	TestCaseTracker.markAsExecuted("claimTaskVerifyTotalRecordsOfClaimVerification");
}


@Test(priority = 35, alwaysRun = true)
public void claimTaskVerifySingleClaimInMultipleWaysBySubmitBreakBtn(TaskTypeManager manager) throws IOException {
        ExtentTest methodTest = test.createNode("claimTaskVerifySingleClaimInMultipleWaysBySubmitBreakBtn");
        logTestMethod(driver, methodTest, manager, "claimTaskVerifySingleClaimInMultipleWaysBySubmitBreakBtn", () -> {
            SoftAssert softAssert = new SoftAssert();
            outboundPage = new OutBoundTaskPage(driver);
            telePage = new OutboundTelecallingPage(driver);
            claimVerificationTaskNo =telePage.getTelePageTaskNo();
            // Click to open the single available claim
            telePage.clickOnVerifyBtnOfClaimVerification();
            int itemCount = telePage.getRowsCountOfSpecificClaim();

            // Simulate different verifications across different rows/items of the claim
            for (int i = 1; i <= itemCount; i++) {
                if (i == 1) {
                    // Equal Qty, Reject
                    try {
						telePage.selectClaimVerificationStatus(i, "Reject");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
                    try {
						telePage.selectRejectReasonofClaimVerification(i, "Site/Product Picture not clear");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
                } else if (i == 2) {
                    // Equal Qty, Approve
                    try {
						telePage.selectClaimVerificationStatus(i, "Approve");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
                } else if (i == 3) {
                    // Less Qty, Approve
                    int claimedQty = telePage.getClaimedQtyOfClaimVerification(i);
                    telePage.enterQtyInVerifyQtyFieldOfClaimVerification(i, String.valueOf(claimedQty - 1));
                    try {
						telePage.selectClaimVerificationStatus(i, "Approve");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
                } else {
                    // Alternate Approve/Reject
                    String status = (i % 2 == 0) ? "Approve" : "Reject";
                    try {
						telePage.selectClaimVerificationStatus(i, status);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
                    if ("Reject".equals(status)) {
                        try {
							telePage.selectRejectReasonofClaimVerification(i, "Site/Product Picture not clear");
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
                    }
                }

                telePage.enterClaimVerificationRemark(i, "Testing Scenario on Item " + i);
                telePage.getTotalVerifyPointsOfClaimVerification(i);
                softAssert.assertTrue(telePage.verifyTotalVerifyPointsOfClaimVerification(i), "Verification points incorrect for row: " + i);
            }

            telePage.clickOnClaimVerificationSubmitBreakBtn();
            softAssert.assertTrue(telePage.verifyClaimVerificationSuccessPopupDisplay(), "Claim Verification not getting submitted.");
            telePage.clickOnClaimVerificationSuccessPopupOkBtn();
            try
    		{
    		telePage.waitInVisibilityOfLoader();
    		}catch(Exception e)
    		{
    			softAssert.fail("Claim verification not submitted properly.");
    		driver.navigate().refresh();
    		}
            softAssert.assertAll();
        });

        telePage.clickOnClaimVerificationCancelBtn();
        try
        {
        telePage.clickOnCallActionButton("Back");
        }catch(Exception e)
		{
		
		}
        TestCaseTracker.markAsExecuted("claimTaskVerifySingleClaimInMultipleWaysBySubmitBreakBtn");
    }



@Test(priority = 36, alwaysRun = true)
public void claimTaskVerifyStatusOnDashboardForClaimVef(TaskTypeManager manager) throws IOException
{

	ExtentTest methodTest = test.createNode("claimTaskVerifyStatusOnDashboardForClaimVef");
    logTestMethod(driver, methodTest, manager, "claimTaskVerifyStatusOnDashboardForClaimVef", () -> {
        SoftAssert softAssert = new SoftAssert();
        outboundPage = new OutBoundTaskPage(driver);
        telePage = new OutboundTelecallingPage(driver);
	String taskStatus = outboundPage.getOutboundPageTaskStatus(claimVerificationTaskNo);
	System.out.println("Dashboard Task statusOf submit Claim verification task : "
			+ claimVerificationTaskNo + " - " + taskStatus);
	softAssert.assertEquals(taskStatus, "Closed",
			" If we submit claim verification Task then task should be closed.");
	  softAssert.assertAll();
       });
	 TestCaseTracker.markAsExecuted("claimTaskVerifyStatusOnDashboardForClaimVef");
	
}

@Test(priority = 37, alwaysRun = true)
public void claimTaskVerifySingleClaimInMultipleWaysBySubmitBtn(TaskTypeManager manager) throws IOException, InterruptedException {
	SoftAssert softAssert = new SoftAssert();
	outboundPage = new OutBoundTaskPage(driver);
	telePage = new OutboundTelecallingPage(driver);
	String taskType = telePage.getTaskTypeFromApplication();
	if (taskType.equals("Influencer Claim Verification")) {
		ExtentTest methodTest = test.createNode("claimTaskVerifySingleClaimInMultipleWaysBySubmitBtn");
		logTestMethod(driver, methodTest,manager, "claimTaskVerifySingleClaimInMultipleWaysBySubmitBtn", () -> {
            // Click to open the single available claim
            telePage.clickOnVerifyBtnOfClaimVerification();
            int itemCount = telePage.getRowsCountOfSpecificClaim();

            // Simulate different verifications across different rows/items of the claim
            for (int i = 1; i <= itemCount; i++) {
                if (i == 1) {
                    // Equal Qty, Reject
                    try {
						telePage.selectClaimVerificationStatus(i, "Reject");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
                    try {
						telePage.selectRejectReasonofClaimVerification(i, "Site/Product Picture not clear");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
                } else if (i == 2) {
                    // Equal Qty, Approve
                    try {
						telePage.selectClaimVerificationStatus(i, "Approve");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
                } else if (i == 3) {
                    // Less Qty, Approve
                    int claimedQty = telePage.getClaimedQtyOfClaimVerification(i);
                    telePage.enterQtyInVerifyQtyFieldOfClaimVerification(i, String.valueOf(claimedQty - 1));
                    try {
						telePage.selectClaimVerificationStatus(i, "Approve");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
                } else {
                    // Alternate Approve/Reject
                    String status = (i % 2 == 0) ? "Approve" : "Reject";
                    try {
						telePage.selectClaimVerificationStatus(i, status);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
                    if ("Reject".equals(status)) {
                        try {
							telePage.selectRejectReasonofClaimVerification(i, "Site/Product Picture not clear");
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
                    }
                }

                telePage.enterClaimVerificationRemark(i, "Testing Scenario on Item " + i);
                telePage.getTotalVerifyPointsOfClaimVerification(i);
                softAssert.assertTrue(telePage.verifyTotalVerifyPointsOfClaimVerification(i), "Verification points incorrect for row: " + i);
            }

            telePage.clickOnClaimVerificationSubmitBtn();
            softAssert.assertTrue(telePage.verifyClaimVerificationSuccessPopupDisplay(), "Claim Verification not getting submitted.");
            telePage.clickOnClaimVerificationSuccessPopupOkBtn();
            try
    		{
    		telePage.waitInVisibilityOfLoader();
    		}catch(Exception e)
    		{
    			softAssert.fail("Claim verification not submitted properly.");
    		driver.navigate().refresh();
    		}
            softAssert.assertAll();
        });

        telePage.clickOnClaimVerificationCancelBtn();
        try
        {
        	telePage.clickOnCallActionButton("Back");
        }catch(Exception e)
		{
		
		}
        TestCaseTracker.markAsExecuted("claimTaskVerifySingleClaimInMultipleWaysBySubmitBtn");
	}
        else {
			System.out.println("Task type is not Influencer Claim Verification.");
			manager.executeTask();
		}

    }

        @Test(priority = 38, alwaysRun = true)
		public void claimTaskVerifyRescheduleNotInterestedBySubmitBreakBtn(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Influencer Claim Verification")) {
				ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduleNotInterestedBySubmitBreakBtn");
				logTestMethod(driver, methodTest,manager, "claimTaskVerifyRescheduleNotInterestedBySubmitBreakBtn", () -> {
					notInterestedTakNo = telePage.getTelePageTaskNo();
					System.out.println("Task No. - Reschedule-Not Interested -Submit & break button : "
							+ notInterestedTakNo);
					telePage.clickOnCallActionButton("Reschedule Call");
					try {
						telePage.selectRescheduleStatus("Not interested");
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
					telePage.enterRescheduleRemark("Remark : Not interested");
					telePage.clickOnRescheduleCallSubmitBreakButton();
					telePage.clickOnRescheduleSuccessDialogOkBtn();
					telePage.waitInVisibilityOfLoader();
					softAssert.assertTrue(outboundPage.verifyOutboundTaskPageDisplay(),
							"If We Reschedule call by submit & break button then call should be paused.");
					softAssert.assertAll();
				});
				TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduleNotInterestedBySubmitBreakBtn");
			}

			else {
				System.out.println("Task type is not Influencer Claim Verification.");
				manager.executeTask();
			}

		}

        @Test(priority = 39, alwaysRun = true)
		public void claimTaskVerifyRescheduleNotInterestedTaskStatus(TaskTypeManager manager) throws InterruptedException, IOException {
			ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduleNotInterestedTaskStatus");
			logTestMethod(driver, methodTest, manager,"claimTaskVerifyRescheduleNotInterestedTaskStatus", () -> {
				SoftAssert softAssert = new SoftAssert();
				outboundPage = new OutBoundTaskPage(driver);
				telePage = new OutboundTelecallingPage(driver);
				String taskStatus = outboundPage.getOutboundPageTaskStatus(notInterestedTakNo);
				System.out.println("Dashboard Task status - Rechedule- Not Interested : "
						+ notInterestedTakNo + " - " + taskStatus);
				softAssert.assertEquals(taskStatus, "Closed",
						" If Select Reschedule status Not Interested then task should be closed.");

				softAssert.assertAll();
			});

			TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduleNotInterestedTaskStatus");

		}
		
		
        @Test(priority = 40, alwaysRun = true)
		public void claimTaskVerifyRescheduleNotInterestedBySubmitBtn(TaskTypeManager manager) throws InterruptedException, IOException {

			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Influencer Claim Verification")) {
				ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduleNotInterestedBySubmitBtn");
				logTestMethod(driver, methodTest, manager,"claimTaskVerifyRescheduleNotInterestedBySubmitBtn", () -> {
					String taskNoNotInterestedSubmit = telePage.getTelePageTaskNo();
					System.out.println("Task no. of -Reschedule-Not Interested-Submit button : "
							+ taskNoNotInterestedSubmit);
					telePage.clickOnCallActionButton("Reschedule Call");
					try {
						telePage.selectRescheduleStatus("Not interested");
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
					telePage.enterRescheduleRemark("Remark : Not interested");
					telePage.clickOnRescheduleCallSubmitButton();
					telePage.clickOnRescheduleSuccessDialogOkBtn();
					telePage.waitInVisibilityOfLoader();

					try {
						if (outboundPage.nextDialText().isDisplayed()) {
							System.out.println("No calls are scheduled");
						}

					} catch (Exception e) {

						softAssert.assertTrue(telePage.taskNameAndNoPopUp().isDisplayed(),
								"If Reschedule task by Submit button then next call should be connet. ");
					}

					softAssert.assertAll();
				});

				TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduleNotInterestedBySubmitBtn");
			} else {
				System.out.println("Task type is not Influencer Claim Verification.");
				manager.executeTask();
			}

		}

        @Test(priority = 41, alwaysRun = true)
		public void claimTaskVerifyRescheduleRingNotReceivedBySubmitBreakBtn(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Influencer Claim Verification")) {
				ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduleRingNotReceivedBySubmitBreakBtn");
				logTestMethod(driver, methodTest, manager,"claimTaskVerifyRescheduleRingNotReceivedBySubmitBreakBtn", () -> {
					ringNotReceivedTaskNo = telePage.getTelePageTaskNo();
					System.out.println("Task No.- Reschedule-Ringing Not Received -Submit & break button : "
							+ ringNotReceivedTaskNo);
					telePage.clickOnCallActionButton("Reschedule Call");
					try {
						telePage.selectRescheduleStatus("Ringing not received");
					} catch (InterruptedException e) {
				
						e.printStackTrace();
					}
					telePage.enterRescheduleRemark("Remark : Ring Not Received");
					telePage.clickOnRescheduleCallSubmitBreakButton();
					telePage.clickOnRescheduleSuccessDialogOkBtn();
					telePage.waitInVisibilityOfLoader();

					softAssert.assertTrue(outboundPage.verifyOutboundTaskPageDisplay(),
							"If We Reschedule call by submit & break button then call should be paused.");

					softAssert.assertAll();

				});

				TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduleRingNotReceivedBySubmitBreakBtn");
			}

			else {
				System.out.println("Task type is not Influencer Claim Verification.");
				manager.executeTask();
			}

		}
		
		
        @Test(priority = 42, alwaysRun = true)
		public void claimTaskVerifyRescheduleRingNotReceivedTaskStatus(TaskTypeManager manager) throws InterruptedException, IOException {
			ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduleRingNotReceivedTaskStatus");
			logTestMethod(driver, methodTest,manager, "claimTaskVerifyRescheduleRingNotReceivedTaskStatus", () -> {
				SoftAssert softAssert = new SoftAssert();
				outboundPage = new OutBoundTaskPage(driver);
				telePage = new OutboundTelecallingPage(driver);

				String taskStatus = outboundPage.getOutboundPageTaskStatus(ringNotReceivedTaskNo);
				System.out.println("Dashboard Task status - Rechedule- Ringing Not Received : "
						+ ringNotReceivedTaskNo + " - " + taskStatus);
				softAssert.assertEquals(taskStatus, "Pending",
						" If Select Reschedule status Ringing Not Received then task should be Pending.");

				softAssert.assertAll();
			});
			TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduleRingNotReceivedTaskStatus");

		}
		
		
        @Test(priority = 43, alwaysRun = true)
		public void claimTaskVerifyRescheduleRingNotReceivedBySubmitBtn(TaskTypeManager manager) throws InterruptedException, IOException {

			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Influencer Claim Verification")) {
				ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduleRingNotReceivedBySubmitBtn");
				logTestMethod(driver, methodTest, manager,"claimTaskVerifyRescheduleRingNotReceivedBySubmitBtn", () -> {
					String taskNoRigNotReceivedSubmit = telePage.getTelePageTaskNo();
					System.out.println("Task no. of - Reschedule-Ring Not Received -Submit button : "
							+ taskNoRigNotReceivedSubmit);

					telePage.clickOnCallActionButton("Reschedule Call");
					try {
						telePage.selectRescheduleStatus("Ringing not received");
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
					telePage.enterRescheduleRemark("Remark : Not interested");
					telePage.clickOnRescheduleCallSubmitButton();
					telePage.clickOnRescheduleSuccessDialogOkBtn();
					telePage.waitInVisibilityOfLoader();

					try {
						if (outboundPage.nextDialText().isDisplayed()) {
							System.out.println("No calls are scheduled");
						}

					} catch (Exception e) {

						softAssert.assertTrue(telePage.taskNameAndNoPopUp().isDisplayed(),
								"If Reschedule task by Submit button then next call should be connet. ");
					}

					softAssert.assertAll();
				});

				TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduleRingNotReceivedBySubmitBtn");
			} else {
				System.out.println("Task type is not Influencer Claim Verification.");
				manager.executeTask();
			}

		}
	 		
		
        @Test(priority = 44, alwaysRun = true)
		public void claimTaskVerifyRescheduleCallBackLaterBySubmitBreakBtn(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Influencer Claim Verification")) {
				ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduleCallBackLaterBySubmitBreakBtn");
				logTestMethod(driver, methodTest, manager,"claimTaskVerifyRescheduleCallBackLaterBySubmitBreakBtn", () -> {

					callBackLaterTaskNo = telePage.getTelePageTaskNo();
					System.out.println("Task No Reschedule-Call Back Later -Submit & break button : "
							+ callBackLaterTaskNo);

					telePage.clickOnCallActionButton("Reschedule Call");
					try {
						telePage.selectRescheduleStatus("Call Back Later");
					} catch (InterruptedException e) {

						e.printStackTrace();
					}

					// Click on Schedule time (+15 min)--Based On button index we can change time
					telePage.clickOnCallBackLaterTime(3);

					telePage.enterRescheduleRemark("Remark : Call Back Later");
					telePage.clickOnRescheduleCallSubmitBreakButton();
					telePage.clickOnRescheduleSuccessDialogOkBtn();
					telePage.waitInVisibilityOfLoader();

					softAssert.assertTrue(outboundPage.verifyOutboundTaskPageDisplay(),
							"If We Reschedule call by submit & break button then call should be paused.");

					softAssert.assertAll();
				});
				TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduleCallBackLaterBySubmitBreakBtn");
			}

			else {
				System.out.println("Task type is not Influencer Claim Verification.");
				manager.executeTask();
			}

		}
		
        @Test(priority = 45, alwaysRun = true)
		public void claimTaskVerifyRescheduleCallBackLaterTaskStatus(TaskTypeManager manager) throws InterruptedException, IOException {
			ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduleCallBackLaterTaskStatus");
			logTestMethod(driver, methodTest, manager,"claimTaskVerifyRescheduleCallBackLaterTaskStatus", () -> {
				SoftAssert softAssert = new SoftAssert();
				outboundPage = new OutBoundTaskPage(driver);
				telePage = new OutboundTelecallingPage(driver);
	
				String taskStatus = outboundPage.getOutboundPageTaskStatus(callBackLaterTaskNo);

				System.out.println("Dashboard Task status Rechedule- Call Back Later : "
						+ callBackLaterTaskNo + " - " + taskStatus);
				softAssert.assertEquals(taskStatus, "Pending",
						" If Select Reschedule status Call Back Later then task should be Pending.");

				softAssert.assertAll();
			});
			TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduleCallBackLaterTaskStatus");

		}
		
		
        @Test(priority = 46, alwaysRun = true)
		public void claimTaskVerifyRescheduleCallBackLaterBySubmitBtn(TaskTypeManager manager) throws InterruptedException, IOException {

			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Influencer Claim Verification")) {
				ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduleCallBackLaterBySubmitBtn");
				logTestMethod(driver, methodTest,manager, "claimTaskVerifyRescheduleCallBackLaterBySubmitBtn", () -> {
					
					String taskNoCallBackLaterSubmit = telePage.getTelePageTaskNo();
					System.out.println("Task no. of Reschedule - Call Back Later- Submit button : "
							+ taskNoCallBackLaterSubmit);

					telePage.clickOnCallActionButton("Reschedule Call");
					try {
						telePage.selectRescheduleStatus("Call Back Later");
					} catch (InterruptedException e) {

						e.printStackTrace();
					}

					telePage.clickOnCallBackLaterTime(3);

					telePage.enterRescheduleRemark("Remark : Call Back Later");
					telePage.clickOnRescheduleCallSubmitButton();
					telePage.clickOnRescheduleSuccessDialogOkBtn();
					telePage.waitInVisibilityOfLoader();
					try {
						if (outboundPage.nextDialText().isDisplayed()) {
							System.out.println("No calls are scheduled");
						}

					} catch (Exception e) {

						softAssert.assertTrue(telePage.taskNameAndNoPopUp().isDisplayed(),
								"If Reschedule task by Submit button then next call should be connet.");
					}

					softAssert.assertAll();
				});
				TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduleCallBackLaterBySubmitBtn");
			}

			else {
				System.out.println("Task type is not Influencer Claim Verification.");
				manager.executeTask();
			}

		}
			
        @Test(priority = 47, alwaysRun = true)
		public void claimTaskVerifyRescheduleWrongNoBySubmitBreakBtn(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Influencer Claim Verification")) {
				ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduleWrongNoBySubmitBreakBtn");
				logTestMethod(driver, methodTest,manager, "claimTaskVerifyRescheduleWrongNoBySubmitBreakBtn", () -> {
					wrongTaskNo = telePage.getTelePageTaskNo();
					System.out.println(
							"Task No Reschedule- Wrong no-Submit & break button : " + wrongTaskNo);

					telePage.clickOnCallActionButton("Reschedule Call");
					try {
						telePage.selectRescheduleStatus("Wrong Number");
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
					telePage.enterRescheduleRemark("Remark : Wrong Number");
					telePage.clickOnRescheduleCallSubmitBreakButton();
					telePage.clickOnRescheduleSuccessDialogOkBtn();
					telePage.waitInVisibilityOfLoader();

					softAssert.assertTrue(outboundPage.verifyOutboundTaskPageDisplay(),
							"If We Reshedule call by submit & break button then call should be paused.");

					softAssert.assertAll();
				});

				TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduleWrongNoBySubmitBreakBtn");
			}

			else {
				System.out.println("Task type is not Influencer Claim Verification.");
				manager.executeTask();
			}

		}
		
        @Test(priority = 48, alwaysRun = true)
		public void claimTaskVerifyRescheduleWrongNoTaskStatus(TaskTypeManager manager) throws InterruptedException, IOException {

			ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduleWrongNoTaskStatus");
			logTestMethod(driver, methodTest,manager, "claimTaskVerifyRescheduleWrongNoTaskStatus", () -> {
				SoftAssert softAssert = new SoftAssert();
				outboundPage = new OutBoundTaskPage(driver);
				telePage = new OutboundTelecallingPage(driver);

				String taskStatus = outboundPage.getOutboundPageTaskStatus(wrongTaskNo);

				System.out.println(
						"Dashboard Task status Rechedule-Wrong No : " + wrongTaskNo + "- " + taskStatus);
				softAssert.assertEquals(taskStatus, "Closed",
						" If Select Reschedule status Wrong then task should be closed.");

				softAssert.assertAll();

			});

			TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduleWrongNoTaskStatus");
		}
		
        @Test(priority = 49, alwaysRun = true)
		public void claimTaskVerifyRescheduleWrongNoBySubmitBtn(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Influencer Claim Verification")) {
				ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduleWrongNoBySubmitBtn");
				logTestMethod(driver, methodTest,manager, "claimTaskVerifyRescheduleWrongNoBySubmitBtn", () -> {
					String taskNoWrongNoSubmit = telePage.getTelePageTaskNo();
					System.out
							.println("Task no. of Reschedule-Wrong no-Submit button : " + taskNoWrongNoSubmit);

					telePage.clickOnCallActionButton("Reschedule Call");
					try {
						telePage.selectRescheduleStatus("Wrong Number");
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
					telePage.enterRescheduleRemark("Remark : Wrong Number");
					telePage.clickOnRescheduleCallSubmitButton();
					telePage.clickOnRescheduleSuccessDialogOkBtn();
					telePage.waitInVisibilityOfLoader();
					try {
						if (outboundPage.nextDialText().isDisplayed()) {
							System.out.println("No calls are scheduled");
						}

					} catch (Exception e) {
						softAssert.assertTrue(telePage.taskNameAndNoPopUp().isDisplayed(),
								"If Recshedule task by Submit button then next call should be connet.");
					}

					softAssert.assertAll();
				});

				 TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduleWrongNoBySubmitBtn");
			} else {
				System.out.println("Task type is not Influencer Claim Verification.");
				manager.executeTask();
			}

		}
	 		
		
	

        @DataProvider(name = "productData")
    	public Object[][] productData() {
    		// call method to read & enter json data
    		Object[][] dataArray = readJsonData(
    				System.getProperty("user.dir") + "\\src\\test\\resource\\com\\jspl\\jsondata\\ClaimProducts.json");

    		return dataArray;
    	};

    	@DataProvider(name = "customerData")
    	public Object[][] customerDetails() {

    		// call method to read & enter json data
    		Object[][] dataArray = readJsonData(System.getProperty("user.dir")
    				+ "\\src\\test\\resource\\com\\jspl\\jsondata\\customerClaimDetails.json");
    		
    		return dataArray;


    	};
    	
    	@DataProvider(name = "redemptionData")
    	public Object[][] redemptionDetails() {

    		// call method to read & enter json data
    		Object[][] dataArray = readJsonData(System.getProperty("user.dir")+"\\src\\test\\resource\\com\\jspl\\jsondata\\RedemptionData.json");
    		return dataArray;


    	};

	
	 @DataProvider(name = "claimVerificationData")
     public Object[][] claimVerificationDetails() {

	// call method to read & enter json data
	Object[][] dataArray = readJsonData(System.getProperty("user.dir")
			+ "\\src\\test\\resource\\com\\jspl\\jsondata\\ClaimVerificationDetails.json");
	return dataArray;


};



}
