package com.jspl.OutboundTaskTest;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;

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




public class InfluencerVerificationTask extends OutboundTaskBaseClass{
	 
	
	private DialerLoginPage dialerPage;
	private OutboundTelecallingPage telePage;
	private OutBoundTaskPage outboundPage;
	private String backButtonTaskNo;
	private String hangUpTaskNo;
	private String wrongTaskNo;
	private String notInterestedTakNo;
	private String ringNotReceivedTaskNo;
	private String callBackLaterTaskNo;
	private String inflVerificationTaskNo;
	
	
	ExtentTest test;
	
	 public InfluencerVerificationTask(WebDriver driver, ExtentTest test) {
	        this.driver = driver;
	        this.test = test;
	    }
 
		public int inflVerificationMethodsCount() 
		{
			Class<?> clazz = InfluencerVerificationTask.class;
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

		public void runTests(TaskTypeManager manager)throws IOException, InterruptedException {
            try
            {	
            	
			if (!TestCaseTracker.isExecuted("inflVerificationVerifyCloseTaskBtnClickable")) {

				inflVerificationVerifyCloseTaskBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("inflVerificationVerifyCloseTaskSubmitBtnClickable")) {
				inflVerificationVerifyCloseTaskSubmitBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("inflVerificationVerifyCloseTaskCancelBtnClickable")) {
				inflVerificationVerifyCloseTaskCancelBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("inflVerificationVerifyCloseTaskSubmitBreakBtnClickable")) {
				inflVerificationVerifyCloseTaskSubmitBreakBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("inflVerificationVerifyCloseTaskCrossIconClickable")) {
				inflVerificationVerifyCloseTaskCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("inflVerificationVerifyRescheduledBtnClickable")) {
				inflVerificationVerifyRescheduledBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("inflVerificationVerifyRescheduledSubmitBtnClickable")) {
				inflVerificationVerifyRescheduledSubmitBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("inflVerificationVerifyRescheduledSubmitBreakBtnClickable")) {
				inflVerificationVerifyRescheduledSubmitBreakBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("inflVerificationVerifyRescheduledCancelBtnClickable")) {
				inflVerificationVerifyRescheduledCancelBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("inflVerificationVerifyRescheduledCrossIconClickable")) {
				inflVerificationVerifyRescheduledCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("inflVerificationVerifyBackBtn")) {
				inflVerificationVerifyBackBtn(manager);
			}
			
			if (!TestCaseTracker.isExecuted("inflVerificationVerifyBackTaskStatus")) {
				inflVerificationVerifyBackTaskStatus(manager);
			}
			
			if (!TestCaseTracker.isExecuted("inflVerificationVerifyBackButtonDialNext")) {
				inflVerificationVerifyBackButtonDialNext(manager);
			}
			
			if (!TestCaseTracker.isExecuted("inflVerificationVerifyHangUp")) {
				inflVerificationVerifyHangUp(manager);
			}
			
			if (!TestCaseTracker.isExecuted("inflVerificationVerificationButtonClickable")) {
				inflVerificationVerificationButtonClickable(manager);
			}
			
			if (!TestCaseTracker.isExecuted("inflVerificationVerifyInfluncerVerificationMenuButtonClickable")) {
				inflVerificationVerifyInfluncerVerificationMenuButtonClickable(manager);
			}
			
			if (!TestCaseTracker.isExecuted("inflVerificationVerifyVerificationSubmitBreakButtonClickable")) {
				inflVerificationVerifyVerificationSubmitBreakButtonClickable(manager);
			}
			
			if (!TestCaseTracker.isExecuted("inflVerificationVerifyVerificationCancelButtonClickable")) {
				inflVerificationVerifyVerificationCancelButtonClickable(manager);
			}
			
			if (!TestCaseTracker.isExecuted("inflVerificationVerifyVerificationSubmitButtonClickable")) {
				inflVerificationVerifyVerificationSubmitButtonClickable(manager);
			}
			
			if (!TestCaseTracker.isExecuted("inflVerificationVerifyVerificationCrossIconClickable")) {
				inflVerificationVerifyVerificationCrossIconClickable(manager);
			}
			
			if (!TestCaseTracker.isExecuted("inflVerificationVerifyVerificationMandtoryFields")) {
				inflVerificationVerifyVerificationMandtoryFields(manager);
			}
			
			if (!TestCaseTracker.isExecuted("inflVerificationVerifyRedial")) {
				inflVerificationVerifyRedial(manager);
			}
			
			if (!TestCaseTracker.isExecuted("inflVerificationEnterVerificationData")) {
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

					inflVerificationEnterVerificationData(manager,yearsInBuss, noOfMasons, currentSitesNo, sitesPerYear, brandUsed,
							mostPreferredBrand, status);
				}
			}
			
			if (!TestCaseTracker.isExecuted("inflVerificationVerifyTaskBySubmitBreakButton")) {
				inflVerificationVerifyTaskBySubmitBreakButton(manager);
			}
			
			if (!TestCaseTracker.isExecuted("inflVerificationVerifyNextCallBySubmitBreakButton")) {
				inflVerificationVerifyNextCallBySubmitBreakButton(manager);
			}
			
			if (!TestCaseTracker.isExecuted("inflVerificationCheckTaskStatusOnDashboard")) {
				inflVerificationCheckTaskStatusOnDashboard(manager);
			}
			
			if (!TestCaseTracker.isExecuted("inflVerificationVerifTaskBySubmitButton")) {
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

					inflVerificationVerifTaskBySubmitButton(manager,yearsInBuss, noOfMasons, currentSitesNo, sitesPerYear, brandUsed,
							mostPreferredBrand, status);

				}

			}
				
			if (!TestCaseTracker.isExecuted("inflVerificationCloseTaskSubmitBreak")) {

				inflVerificationCloseTaskSubmitBreak(manager);
			}

			if (!TestCaseTracker.isExecuted("inflVerificationCloseTaskSubmit")) {
				inflVerificationCloseTaskSubmit(manager);
			}
			
			if (!TestCaseTracker.isExecuted("inflVerificationVerifyRescheduleNotInterestedBySubmitBreakBtn")) {
				inflVerificationVerifyRescheduleNotInterestedBySubmitBreakBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("inflVerificationVerifyRescheduleNotInterestedTaskStatus")) {
				inflVerificationVerifyRescheduleNotInterestedTaskStatus(manager);
			}

			if (!TestCaseTracker.isExecuted("inflVerificationVerifyRescheduleNotInterestedBySubmitBtn")) {
				inflVerificationVerifyRescheduleNotInterestedBySubmitBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("inflVerificationVerifyRescheduleRingNotReceivedBySubmitBreakBtn")) {
				inflVerificationVerifyRescheduleRingNotReceivedBySubmitBreakBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("inflVerificationVerifyRescheduleRingNotReceivedTaskStatus")) {
				inflVerificationVerifyRescheduleRingNotReceivedTaskStatus(manager);
			}

			if (!TestCaseTracker.isExecuted("inflVerificationVerifyRescheduleRingNotReceivedBySubmitBtn")) {
				inflVerificationVerifyRescheduleRingNotReceivedBySubmitBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("inflVerificationVerifyRescheduleCallBackLaterBySubmitBreakBtn")) {
				inflVerificationVerifyRescheduleCallBackLaterBySubmitBreakBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("inflVerificationVerifyRescheduleCallBackLaterTaskStatus")) {
				inflVerificationVerifyRescheduleCallBackLaterTaskStatus(manager);
			}

			if (!TestCaseTracker.isExecuted("inflVerificationVerifyRescheduleCallBackLaterBySubmitBtn")) {
				inflVerificationVerifyRescheduleCallBackLaterBySubmitBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("inflVerificationVerifyRescheduleWrongNoBySubmitBreakBtn")) {
				inflVerificationVerifyRescheduleWrongNoBySubmitBreakBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("inflVerificationVerifyRescheduleWrongNoTaskStatus")) {
				inflVerificationVerifyRescheduleWrongNoTaskStatus(manager);
			}

			if (!TestCaseTracker.isExecuted("outboundTaskPageVerifyNameFilter")) {
				outboundTaskPageVerifyNameFilter(manager);
			}
			
			if (!TestCaseTracker.isExecuted("outboundTaskPageOpenTaskActivity")) {
				outboundTaskPageOpenTaskActivity(manager);
			}
			
			if (!TestCaseTracker.isExecuted("outboundTaskPageVerifyFilterIconClickable")) {
				outboundTaskPageVerifyFilterIconClickable(manager);
			}
			
			if (!TestCaseTracker.isExecuted("outboundTaskPageVerifyFilterCrossIconClickable")) {
				outboundTaskPageVerifyFilterCrossIconClickable(manager);
			}
				
			if (!TestCaseTracker.isExecuted("inflVerificationVerifyRescheduleWrongNoBySubmitBtn")) {
				inflVerificationVerifyRescheduleWrongNoBySubmitBtn(manager);
			}else {
				inflVerificationVerifyRescheduleWrongNoBySubmitBtn(manager);
			}

            }catch (Exception e) {
                System.err.println("Exception during test execution: " + e.getMessage());
        	}
		}
	
		
	@Test(priority = 1, retryAnalyzer = Retry.class)
	public void inflVerificationVerifyCloseTaskBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("inflVerificationVerifyCloseTaskBtnClickable");
		logTestMethod(driver, methodTest,manager, "inflVerificationVerifyCloseTaskBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnInfluencerVerificationPopUpCrossIcon();
			telePage.clickOnCallActionButton("Close Task");
			softAssert.assertTrue(telePage.verifyCloseTaskLableDisplay(), "Close Task Button not clickable");
			softAssert.assertAll();
		});
		TestCaseTracker.markAsExecuted("inflVerificationVerifyCloseTaskBtnClickable");
	}
	
	@Test(priority = 2)
	public void inflVerificationVerifyCloseTaskSubmitBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("inflVerificationVerifyCloseTaskSubmitBtnClickable");
		logTestMethod(driver, methodTest, manager,"inflVerificationVerifyCloseTaskSubmitBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnCloseTasksubmitButton();
			softAssert.assertTrue(telePage.verifyCloseTaskRemarkWarningMsgDisplay(),
					"Close Task Submit button not clickable");
			softAssert.assertAll();
		});
		TestCaseTracker.markAsExecuted("inflVerificationVerifyCloseTaskSubmitBtnClickable");

	}

	@Test(priority = 3)
	public void inflVerificationVerifyCloseTaskCancelBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("inflVerificationVerifyCloseTaskCancelBtnClickable");
		logTestMethod(driver, methodTest,manager, "inflVerificationVerifyCloseTaskCancelBtnClickable", () -> {
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
		TestCaseTracker.markAsExecuted("inflVerificationVerifyCloseTaskCancelBtnClickable");
	}

	@Test(priority = 4)
	public void inflVerificationVerifyCloseTaskSubmitBreakBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("inflVerificationVerifyCloseTaskSubmitBreakBtnClickable");
		logTestMethod(driver, methodTest, manager,"inflVerificationVerifyCloseTaskSubmitBreakBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnCallActionButton("Close Task");
			telePage.clickOnCloseTasksubmitBreakButton();
			softAssert.assertTrue(telePage.verifyCloseTaskRemarkWarningMsgDisplay(),
					"Close Task Submit Break button not clickable");
			softAssert.assertAll();
		});
		TestCaseTracker.markAsExecuted("inflVerificationVerifyCloseTaskSubmitBreakBtnClickable");

	}

	@Test(priority = 5)
	public void inflVerificationVerifyCloseTaskCrossIconClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("inflVerificationVerifyCloseTaskCrossIconClickable");
		logTestMethod(driver, methodTest,manager, "inflVerificationVerifyCloseTaskCrossIconClickable", () -> {
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
		TestCaseTracker.markAsExecuted("inflVerificationVerifyCloseTaskCrossIconClickable");
	}

	@Test(priority = 6)
	public void inflVerificationVerifyRescheduledBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("inflVerificationVerifyRescheduledBtnClickable");
		logTestMethod(driver, methodTest,manager, "inflVerificationVerifyRescheduledBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnCallActionButton("Reschedule Call");
			softAssert.assertTrue(telePage.verifyRescheduleLableDisplay(), "Reschedule Button not clickable");
			softAssert.assertAll();
		});
		TestCaseTracker.markAsExecuted("inflVerificationVerifyRescheduledBtnClickable");

	}

	@Test(priority = 7)
	public void inflVerificationVerifyRescheduledSubmitBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("inflVerificationVerifyRescheduledSubmitBtnClickable");
		logTestMethod(driver, methodTest,manager, "inflVerificationVerifyRescheduledSubmitBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnRescheduleCallSubmitButton();

			softAssert.assertTrue(telePage.verifyRescheduleCallStatusWarningMsgDisplay(),
					"Reschedule Submit button not clickable");

			softAssert.assertAll();

		});
		TestCaseTracker.markAsExecuted("inflVerificationVerifyRescheduledSubmitBtnClickable");
	}

	@Test(priority = 8)
	public void inflVerificationVerifyRescheduledSubmitBreakBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("inflVerificationVerifyRescheduledSubmitBreakBtnClickable");
		logTestMethod(driver, methodTest, manager,"inflVerificationVerifyRescheduledSubmitBreakBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnRescheduleCallSubmitBreakButton();
			softAssert.assertTrue(telePage.verifyRescheduleCallStatusWarningMsgDisplay(),
					"Reschedule Submit & Break button not clickable");

			softAssert.assertAll();

		});
		TestCaseTracker.markAsExecuted("inflVerificationVerifyRescheduledSubmitBreakBtnClickable");
	}

	@Test(priority = 9)
	public void inflVerificationVerifyRescheduledCancelBtnClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("inflVerificationVerifyRescheduledCancelBtnClickable");
        logTestMethod(driver,methodTest,manager, "inflVerificationVerifyRescheduledCancelBtnClickable", () -> {
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
        TestCaseTracker.markAsExecuted("inflVerificationVerifyRescheduledCancelBtnClickable");
		
	}
	
	@Test(priority = 10)
	public void inflVerificationVerifyRescheduledCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("inflVerificationVerifyRescheduledCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "inflVerificationVerifyRescheduledCrossIconClickable", () -> {
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
        TestCaseTracker.markAsExecuted("inflVerificationVerifyRescheduledCrossIconClickable");
	}
	
	
	@Test(priority = 11, alwaysRun = true)
	public void inflVerificationVerifyBackBtn(TaskTypeManager manager) throws IOException  
	{
		ExtentTest methodTest = test.createNode("inflVerificationVerifyBackBtn");
        logTestMethod(driver,methodTest, manager,"inflVerificationVerifyBackBtn", () ->{ 
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
		TestCaseTracker.markAsExecuted("inflVerificationVerifyBackBtn");
		 
	}
	
	@Test(priority = 12, alwaysRun = true)
	public void inflVerificationVerifyBackTaskStatus(TaskTypeManager manager) throws IOException 
	{
		
		ExtentTest methodTest = test.createNode("inflVerificationVerifyBackTaskStatus");
        logTestMethod(driver,methodTest, manager,"inflVerificationVerifyBackTaskStatus", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		outboundPage=new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		String taskStatus=outboundPage.getOutboundPageTaskStatus(backButtonTaskNo);
		System.out.println("Back Button taskStatus "+ taskStatus);
		System.out.println("Dashboard Task status for Back Button : "+taskStatus);
		softAssert.assertEquals(taskStatus, "Pending", "Back Button status Should be show as pending.");
		softAssert.assertAll();
        });
		 TestCaseTracker.markAsExecuted("inflVerificationVerifyBackTaskStatus");
		
		}
		
	
	@Test(priority = 13, alwaysRun = true)
	public void inflVerificationVerifyBackButtonDialNext(TaskTypeManager manager) throws InterruptedException, IOException
	{  
		ExtentTest methodTest = test.createNode("inflVerificationVerifyBackButtonDialNext");
        logTestMethod(driver,methodTest,  manager,"inflVerificationVerifyBackButtonDialNext", () ->{ 
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
	   TestCaseTracker.markAsExecuted("inflVerificationVerifyBackButtonDialNext");
		
	}
	
	@Test(priority = 14, alwaysRun = true)
	public void inflVerificationVerifyHangUp(TaskTypeManager manager) throws InterruptedException, IOException
	{
		ExtentTest methodTest = test.createNode("inflVerificationVerifyHangUp");
        logTestMethod(driver,methodTest, manager, "inflVerificationVerifyHangUp", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		outboundPage=new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		telePage.clickOnInfluencerVerificationPopUpCrossIcon();
		 hangUpTaskNo=telePage.getTelePageTaskNo();
		 telePage.clickOnCallActionButton("Hangup");
		 String loaderMsg= telePage.getLoaderMsg();
		 System.out.println("Loader Msg : "+loaderMsg);
		softAssert.assertNotEquals(loaderMsg,"New Call Connecting", "Hang Up Button not working proper");
		telePage.waitInVisibilityOfLoader();
		softAssert.assertAll();
        });
		 TestCaseTracker.markAsExecuted("inflVerificationVerifyHangUp");
				
	}
	
	
	@Test(priority = 15, alwaysRun = true)
	public void inflVerificationVerificationButtonClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("inflVerificationVerificationButtonClickable");
        logTestMethod(driver,methodTest, manager, "inflVerificationVerificationButtonClickable", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		outboundPage=new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnInflVerificationVerificationBtn();
		softAssert.assertTrue(telePage.verifyInfluencerVerificationMenuDisplay(), "Verification Button is not clickable.");	
		softAssert.assertAll();
        });
		 TestCaseTracker.markAsExecuted("inflVerificationVerificationButtonClickable");
			
	}
	
	@Test(priority = 16, alwaysRun = true)
	public void inflVerificationVerifyInfluncerVerificationMenuButtonClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("inflVerificationVerifyInfluncerVerificationMenuButtonClickable");
        logTestMethod(driver,methodTest, manager, "inflVerificationVerifyInfluncerVerificationMenuButtonClickable", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		outboundPage=new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnInfluencerVerificationMenu();
		softAssert.assertTrue(telePage.verifyInfluencerVerificationMenuLabelDisplay(), "Influencer Verification Button is not clickable.");
		
		 softAssert.assertAll();
        });
		 TestCaseTracker.markAsExecuted("inflVerificationVerifyInfluncerVerificationMenuButtonClickable");
		
		
	}
	
	@Test(priority = 17, alwaysRun = true)
	public void inflVerificationVerifyVerificationSubmitBreakButtonClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("inflVerificationVerifyVerificationSubmitBreakButtonClickable");
		logTestMethod(driver, methodTest, manager, "inflVerificationVerifyVerificationSubmitBreakButtonClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnInfluencerVerificationMenuSubmitBreakBtn();

			softAssert.assertTrue(telePage.verifyIinfluencerVerificationMenuConstructionBussFieldWarningMsgDisplay(),
					"Influncer Verification Submit & Break button not clickable");
			softAssert.assertAll();
		});
		TestCaseTracker.markAsExecuted("inflVerificationVerifyVerificationSubmitBreakButtonClickable");

	}
	
	@Test(priority = 18, alwaysRun = true)
	public void inflVerificationVerifyVerificationCancelButtonClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("inflVerificationVerifyVerificationCancelButtonClickable");
		logTestMethod(driver, methodTest, manager, "inflVerificationVerifyVerificationCancelButtonClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			boolean status = true;
			telePage.clickOnInfluencerVerificationMenuCancelBtn();
			try {
				By inflVefLabelLocator = By.xpath("//label[text()=\"Influencer Verification\"]");
				WebElement inflVefLabelElement = driver.findElement(inflVefLabelLocator);
				if (inflVefLabelElement.isDisplayed()) {
					status = false;
				}
			} catch (Exception e) {

			}
			if (!status) {
				softAssert.fail("Influncer Verification Cancel button not clickable");
			}
			softAssert.assertAll();
		});
		TestCaseTracker.markAsExecuted("inflVerificationVerifyVerificationCancelButtonClickable");

	}
	
	@Test(priority = 19, alwaysRun = true)
	public void inflVerificationVerifyVerificationSubmitButtonClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("inflVerificationVerifyVerificationSubmitButtonClickable");
		logTestMethod(driver, methodTest, manager, "inflVerificationVerifyVerificationSubmitButtonClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnInflVerificationVerificationBtn();
			telePage.clickOnInfluencerVerificationMenu();
			telePage.clickOnInfluencerVerificationMenuSubmitBtn();
			softAssert.assertTrue(telePage.verifyIinfluencerVerificationMenuConstructionBussFieldWarningMsgDisplay(),
					"Influncer Verification Submit button not clickable");

			softAssert.assertAll();
		});

		TestCaseTracker.markAsExecuted("inflVerificationVerifyVerificationSubmitButtonClickable");

	}
	
	@Test(priority = 20, alwaysRun = true)
	public void inflVerificationVerifyVerificationCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("inflVerificationVerifyVerificationCrossIconClickable");
		logTestMethod(driver, methodTest, manager, "inflVerificationVerifyVerificationCrossIconClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
		boolean status=true;
		telePage.clickOnInfluencerVerificationMenuCrossIcon();
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
		TestCaseTracker.markAsExecuted("inflVerificationVerifyVerificationCrossIconClickable");
		
	}
	
	@Test(priority = 21, alwaysRun = true)
	public void inflVerificationVerifyVerificationMandtoryFields(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("inflVerificationVerifyVerificationMandtoryFields");
		logTestMethod(driver, methodTest, manager, "inflVerificationVerifyVerificationMandtoryFields", () -> {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
		
			telePage.clickOnInflVerificationVerificationBtn();
			telePage.clickOnInfluencerVerificationMenu();
			telePage.clickOnInfluencerVerificationMenuSubmitBtn();
		
        //Array for Holds the field name
        String[] fieldNames = {"YearsInBussiness", "NoOfMasons", "CurrentSitesNo", "SitesPerYear", "BrandUsed", "MostPreferredBrand", "Status"};
        //Array for Hold the Error field locators
        WebElement[] errorLocators = {
        		telePage.influencerVerificationMenuYearsInBussinessFieldWarningMsg(),
        		telePage.influencerVerificationMenuNoOfMasonsFieldWarningMsg(),
        		telePage.influencerVerificationMenuCurrentSitesNoFieldWarningMsg(),
        		telePage.influencerVerificationMenuSitesPerYearFieldWarningMsg(),
        		telePage.influencerVerificationMenuBrandUsedFieldWarningMsg(),
        		telePage.influencerVerificationMenuMostPreferredBrandFieldWarningMsg(),
        		telePage.influencerVerificationMenuStatusFieldWarningMsg(),
        };

        // Loop through each field and check if the error message is displayed
        for (int i = 0; i < errorLocators.length; i++) {
            try {
            	WebElement errorMessage=errorLocators[i];
                softAssert.assertTrue(errorMessage.isDisplayed(), "Error message should be displayed for " + fieldNames[i]);
            } catch (Exception e) {
                System.err.println("Error message not displayed for: " + fieldNames[i]);
                softAssert.fail("Error message not displayed for: " + fieldNames[i]);
            }
        } 
        softAssert.assertAll();
       
        });
		telePage.clickOnInfluencerVerificationMenuCrossIcon();
		TestCaseTracker.markAsExecuted("inflVerificationVerifyVerificationMandtoryFields");
		
	}
	
	
	
	@Test(priority = 22, alwaysRun = true)
	public void inflVerificationVerifyRedial(TaskTypeManager manager) throws InterruptedException, IOException
	{ 
		ExtentTest methodTest = test.createNode("inflVerificationVerifyRedial");
        logTestMethod(driver,methodTest,manager, "inflVerificationVerifyRedial", () ->{ 
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
		softAssert.assertEquals(newTaskNo, oldTaskNo, "Test Failed : Redial button not working properly");
	    softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("inflVerificationVerifyRedial");
	}
	
	
	@Test(priority = 23, dataProvider= "inflVerificationData", alwaysRun = true)
	public void inflVerificationEnterVerificationData(TaskTypeManager manager,String yearsInBuss, String noOfMasons, String currentSitesNo,
            String sitesPerYear, String brandUsed, String mostPreferredBrand, String status) throws InterruptedException, IOException
	
	{
		ExtentTest methodTest = test.createNode("inflVerificationEnterVerificationData");
		logTestMethod(driver, methodTest, manager, "inflVerificationEnterVerificationData", () -> {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
		//Thread.sleep(2000);
		inflVerificationTaskNo =telePage.getTelePageTaskNo();
		System.out.println("Influncer Verification Task No : "+ inflVerificationTaskNo);
		try {
			telePage.enterTextInInfluencerVerificationYearsInBussField(yearsInBuss);
			telePage.enterTextInInfluencerVerificationNoOfMasonsField(noOfMasons);
			telePage.enterTextInInfluencerVerificationCurrentSitesNoField(currentSitesNo);
			telePage.enterTextInInfluencerVerificationSitesPerYearField(sitesPerYear);
			telePage.selectInfluencerVerificationBrandUsedDropdownValue(brandUsed);
			telePage.selectInfluencerVerificationMostPreBrandDropdownValue(mostPreferredBrand);
			telePage.selectInfluencerVerificationStatusDropdownValue(status);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
        softAssert.assertAll();

        });
		TestCaseTracker.markAsExecuted("inflVerificationEnterVerificationData");

	}
	
	
	@Test(priority = 24, alwaysRun = true)
	public void inflVerificationVerifyTaskBySubmitBreakButton(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("inflVerificationVerifyTaskBySubmitBreakButton");
		logTestMethod(driver, methodTest, manager, "inflVerificationVerifyTaskBySubmitBreakButton", () -> {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnInfluencerVerificationMenuSubmitBreakBtn();

			softAssert.assertTrue(telePage.verifyInfluencerVerificationSuccessPopUpDisplay(),
					"Influncer Verification  Not Getting Submit.");

		telePage.clickOnInfluencerVerificationSuccessPopUpOkBtn();
		telePage.waitInVisibilityOfLoader();
		softAssert.assertAll();
        });
		telePage.clickOnInfluencerVerificationPopUpCrossIcon();
		TestCaseTracker.markAsExecuted("inflVerificationVerifyTaskBySubmitBreakButton");
	}
	
	@Test(priority = 25, alwaysRun = true)
	public void inflVerificationVerifyNextCallBySubmitBreakButton(TaskTypeManager manager) throws InterruptedException, IOException
	{
		ExtentTest methodTest = test.createNode("inflVerificationVerifyNextCallBySubmitBreakButton");
		logTestMethod(driver, methodTest, manager, "inflVerificationVerifyNextCallBySubmitBreakButton", () -> {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
  		//Thread.sleep(5000);
    	//verify next call connect or not
  		try
  		{
  		   
			 softAssert.assertFalse(telePage.verifyInfluencerVerificationTaskNoPopUpDisplay(),"After done Influncer Verification  By Submit & Break Button Then next Call should not be connect");
  		}catch(Exception e)
  		{
  			System.out.println("Next call Not connect due to Verification submit by Submit & Break Button");
  		}
			softAssert.assertAll();
			
        });
		telePage.clickOnInfluencerVerificationMenuCrossIcon();
			TestCaseTracker.markAsExecuted("inflVerificationVerifyNextCallBySubmitBreakButton");
    	 
		
	}
	
	@Test(priority = 26, alwaysRun = true)
	public void inflVerificationCheckTaskStatusOnDashboard(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("inflVerificationCheckTaskStatusOnDashboard");
		logTestMethod(driver, methodTest, manager, "inflVerificationCheckTaskStatusOnDashboard", () -> {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
 			String taskStatus=outboundPage.getOutboundPageTaskStatus(inflVerificationTaskNo);
 			System.out.println("Dashboard Task status For Influncer Verification : "+taskStatus);
				softAssert.assertEquals(taskStatus, "Closed", "After  Influncer Verifiaction task Status should be closed");	
				softAssert.assertAll();
        });
		
 		 TestCaseTracker.markAsExecuted("inflVerificationCheckTaskStatusOnDashboard");
	}

	
	@Test(priority = 27, dataProvider="inflVerificationData", alwaysRun = true)
	public void inflVerificationVerifTaskBySubmitButton(TaskTypeManager manager,String yearsInBuss, String noOfMasons, String currentSitesNo,
            String sitesPerYear, String brandUsed, String mostPreferredBrand, String status) throws InterruptedException, IOException
	{
		
		//If Next call is Available then call should be connect directly
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		String taskType = telePage.getTaskTypeFromApplication();
 		if(taskType.equals("Influencer Primary Verification") )
 		{
 			ExtentTest methodTest = test.createNode("inflVerificationVerifTaskBySubmitButton");
			logTestMethod(driver, methodTest, manager, "inflVerificationVerifTaskBySubmitButton", () -> {
 				
    		//Thread.sleep(2000);
    		inflVerificationTaskNo =telePage.getTelePageTaskNo();
    		System.out.println("Influncer Verification Task no : "+ inflVerificationTaskNo);
    		try {
    			telePage.enterTextInInfluencerVerificationYearsInBussField(yearsInBuss);
    			telePage.enterTextInInfluencerVerificationNoOfMasonsField(noOfMasons);
    			telePage.enterTextInInfluencerVerificationCurrentSitesNoField(currentSitesNo);
    			telePage.enterTextInInfluencerVerificationSitesPerYearField(sitesPerYear);
    			telePage.selectInfluencerVerificationBrandUsedDropdownValue(brandUsed);
    			telePage.selectInfluencerVerificationMostPreBrandDropdownValue(mostPreferredBrand);
    			telePage.selectInfluencerVerificationStatusDropdownValue(status);
    			
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
    		
				telePage.clickOnInfluencerVerificationMenuSubmitBtn();

				softAssert.assertTrue(telePage.verifyInfluencerVerificationSuccessPopUpDisplay(),
						"Influncer Verification  Not Getting Submit.");

				telePage.clickOnInfluencerVerificationSuccessPopUpOkBtn();
				telePage.waitInVisibilityOfLoader();

				softAssert.assertAll();
   			
			 try
			 { 
				 if(outboundPage.nextDialText().isDisplayed())
				 {
					 System.out.println("No calls are scheduled");
				 }
				 
			 }catch(Exception r)
			 {
				 
				   softAssert.assertTrue(telePage.verifyInfluencerVerificationTaskNoPopUpDisplay(), "If we Submit Influencer Verification By submit Button then next call should be connect.");
			 }	
			 softAssert.assertAll();
	        });
 			
	         TestCaseTracker.markAsExecuted("inflVerificationVerifTaskBySubmitButton");
	         
    	 }
	       
 		else
 		{
 			System.out.println("Task type is not Influencer Verification");
 			manager.executeTask();
 		}
 		
		
	}
	
	 @Test(priority = 28, alwaysRun = true)
		public void inflVerificationCloseTaskSubmitBreak(TaskTypeManager manager) throws InterruptedException, IOException
		{
		 SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
	 		if(taskType.equals("Influencer Primary Verification") )
	 		{
	 			ExtentTest methodTest = test.createNode("inflVerificationCloseTaskSubmitBreak");
				logTestMethod(driver, methodTest, manager, "inflVerificationCloseTaskSubmitBreak", () -> {
				telePage.clickOnInfluencerVerificationPopUpCrossIcon();
			String inflVerifyTaskNo =telePage.getTelePageTaskNo();
			System.out.println("Influncer Verification Task No For Close Task By Submit Break button  : " +inflVerifyTaskNo);
			telePage.clickOnCallActionButton("Close Task");
			telePage.enterCloseTaskRemark("Close Influncer Verification Task");
			telePage.clickOnCloseTasksubmitBreakButton();
			telePage.clickOnCloseTaskDialogBoxOkBtn();
			telePage.waitInVisibilityOfLoader();
		
			String taskStatus = outboundPage.getOutboundPageTaskStatus(inflVerifyTaskNo);
					System.out.println("Dashboard Task Status Influencer Verification-Close Task :"+taskStatus);
					softAssert.assertEquals(taskStatus, "Closed", "Task Status Should be 'Closed'.");
				
			softAssert.assertAll();
		        });
	 			
			TestCaseTracker.markAsExecuted("inflVerificationCloseTaskSubmitBreak");
	 		}
	 		
			else
	 		{
	 			System.out.println("Task type is not Influencer Verification");
	 			manager.executeTask();
	 		}
	 		
	 		
		}
		
		@Test(priority = 29, alwaysRun = true)
		public void inflVerificationCloseTaskSubmit(TaskTypeManager manager) throws InterruptedException, IOException
		{
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
	 		if(taskType.equals("Influencer Primary Verification") )
	 		{
	 			ExtentTest methodTest = test.createNode("inflVerificationCloseTaskSubmit");
				logTestMethod(driver, methodTest, manager, "inflVerificationCloseTaskSubmit", () -> {
				telePage.clickOnInfluencerVerificationPopUpCrossIcon();
			String oldTaskNo =telePage.getTelePageTaskNo();
			System.out.println("Influncer Verification closed Task No By submit button  : " +oldTaskNo);
			telePage.clickOnCallActionButton("Close Task");
			telePage.enterCloseTaskRemark("Close Influncer Verification Task");
			telePage.clickOnCloseTasksubmitButton();
			telePage.clickOnCloseTaskDialogBoxOkBtn();
			telePage.waitInVisibilityOfLoader();
		
			 try
			 { 
				 if(outboundPage.nextDialText().isDisplayed())
				 {
					 System.out.println("No calls are scheduled");
				 }
				 
			 }catch(Exception e)
			 {
				 
				 String newTaskNo=telePage.getTelePageTaskNo();
				 System.out.println(newTaskNo);
				   softAssert.assertNotEquals(newTaskNo, oldTaskNo,"After Close Task By submit Button then new call should be connect.");
			 }
				softAssert.assertAll();
		        });
	 			
				TestCaseTracker.markAsExecuted("inflVerificationCloseTaskSubmit");
	 		}
				else
		 		{
		 			System.out.println("Task type is not Influencer Verification");
		 			manager.executeTask();
		 		}
		}			
		
		
			
		@Test(priority = 30, alwaysRun = true)
		public void inflVerificationVerifyRescheduleNotInterestedBySubmitBreakBtn(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Influencer Primary Verification")) {
				ExtentTest methodTest = test.createNode("inflVerificationVerifyRescheduleNotInterestedBySubmitBreakBtn");
				logTestMethod(driver, methodTest, manager, "inflVerificationVerifyRescheduleNotInterestedBySubmitBreakBtn", () -> {
					telePage.clickOnInfluencerVerificationPopUpCrossIcon();
					notInterestedTakNo = telePage.getTelePageTaskNo();
					System.out.println("Task No - Reschedule-Not Interested -Submit & break button : "
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
				TestCaseTracker.markAsExecuted("inflVerificationVerifyRescheduleNotInterestedBySubmitBreakBtn");
			}

			else {
				System.out.println("Task type is not Influencer Verification");
				manager.executeTask();
			}

		}

		@Test(priority = 31, alwaysRun = true)
		public void inflVerificationVerifyRescheduleNotInterestedTaskStatus(TaskTypeManager manager) throws InterruptedException, IOException {
			ExtentTest methodTest = test.createNode("inflVerificationVerifyRescheduleNotInterestedTaskStatus");
			logTestMethod(driver, methodTest, manager, "inflVerificationVerifyRescheduleNotInterestedTaskStatus", () -> {
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

			TestCaseTracker.markAsExecuted("inflVerificationVerifyRescheduleNotInterestedTaskStatus");

		}
		
		@Test(priority = 32, alwaysRun = true)
		public void inflVerificationVerifyRescheduleNotInterestedBySubmitBtn(TaskTypeManager manager) throws InterruptedException, IOException {

			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Influencer Primary Verification")) {
				ExtentTest methodTest = test.createNode("inflVerificationVerifyRescheduleNotInterestedBySubmitBtn");
				logTestMethod(driver, methodTest, manager, "inflVerificationVerifyRescheduleNotInterestedBySubmitBtn", () -> {
					telePage.clickOnInfluencerVerificationPopUpCrossIcon();
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

				TestCaseTracker.markAsExecuted("inflVerificationVerifyRescheduleNotInterestedBySubmitBtn");
			} else {
				System.out.println("Task type is not Influencer Verification");
				manager.executeTask();
			}

		}

		@Test(priority = 33, alwaysRun = true)
		public void inflVerificationVerifyRescheduleRingNotReceivedBySubmitBreakBtn(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Influencer Primary Verification")) {
				ExtentTest methodTest = test.createNode("inflVerificationVerifyRescheduleRingNotReceivedBySubmitBreakBtn");
				logTestMethod(driver, methodTest, manager, "inflVerificationVerifyRescheduleRingNotReceivedBySubmitBreakBtn", () -> {
					telePage.clickOnInfluencerVerificationPopUpCrossIcon();
					ringNotReceivedTaskNo = telePage.getTelePageTaskNo();
					System.out.println("Task No- Reschedule-Ringing Not Received -Submit & break button : "
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

				TestCaseTracker.markAsExecuted("inflVerificationVerifyRescheduleRingNotReceivedBySubmitBreakBtn");
			}

			else {
				System.out.println("Task type is not Influencer Verification");
				manager.executeTask();
			}

		}
		
		
		@Test(priority = 34, alwaysRun = true)
		public void inflVerificationVerifyRescheduleRingNotReceivedTaskStatus(TaskTypeManager manager) throws InterruptedException, IOException {
			ExtentTest methodTest = test.createNode("inflVerificationVerifyRescheduleRingNotReceivedTaskStatus");
			logTestMethod(driver, methodTest,  manager,"inflVerificationVerifyRescheduleRingNotReceivedTaskStatus", () -> {
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
			TestCaseTracker.markAsExecuted("inflVerificationVerifyRescheduleRingNotReceivedTaskStatus");

		}
			
		@Test(priority = 35, alwaysRun = true)
		public void inflVerificationVerifyRescheduleRingNotReceivedBySubmitBtn(TaskTypeManager manager) throws InterruptedException, IOException {

			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Influencer Primary Verification")) {
				ExtentTest methodTest = test.createNode("inflVerificationVerifyRescheduleRingNotReceivedBySubmitBtn");
				logTestMethod(driver, methodTest, manager, "inflVerificationVerifyRescheduleRingNotReceivedBySubmitBtn", () -> {
					telePage.clickOnInfluencerVerificationPopUpCrossIcon();
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

				TestCaseTracker.markAsExecuted("inflVerificationVerifyRescheduleRingNotReceivedBySubmitBtn");
			} else {
				System.out.println("Task type is not Influencer Verification");
				manager.executeTask();
			}

		}
	 		
		
		@Test(priority = 36, alwaysRun = true)
		public void inflVerificationVerifyRescheduleCallBackLaterBySubmitBreakBtn(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Influencer Primary Verification")) {
				ExtentTest methodTest = test.createNode("inflVerificationVerifyRescheduleCallBackLaterBySubmitBreakBtn");
				logTestMethod(driver, methodTest,  manager,"inflVerificationVerifyRescheduleCallBackLaterBySubmitBreakBtn", () -> {
					telePage.clickOnInfluencerVerificationPopUpCrossIcon();
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
				TestCaseTracker.markAsExecuted("inflVerificationVerifyRescheduleCallBackLaterBySubmitBreakBtn");
			}

			else {
				System.out.println("Task type is not Influencer Verification");
				manager.executeTask();
			}

		}
		
		@Test(priority = 37, alwaysRun = true)
		public void inflVerificationVerifyRescheduleCallBackLaterTaskStatus(TaskTypeManager manager) throws InterruptedException, IOException {
			ExtentTest methodTest = test.createNode("inflVerificationVerifyRescheduleCallBackLaterTaskStatus");
			logTestMethod(driver, methodTest, manager, "inflVerificationVerifyRescheduleCallBackLaterTaskStatus", () -> {
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
			TestCaseTracker.markAsExecuted("inflVerificationVerifyRescheduleCallBackLaterTaskStatus");

		}
		
		
		@Test(priority = 38, alwaysRun = true)
		public void inflVerificationVerifyRescheduleCallBackLaterBySubmitBtn(TaskTypeManager manager) throws InterruptedException, IOException {

			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Influencer Primary Verification")) {
				ExtentTest methodTest = test.createNode("inflVerificationVerifyRescheduleCallBackLaterBySubmitBtn");
				logTestMethod(driver, methodTest, manager, "inflVerificationVerifyRescheduleCallBackLaterBySubmitBtn", () -> {
					telePage.clickOnInfluencerVerificationPopUpCrossIcon();
					String taskNoCallBackLaterSubmit = telePage.getTelePageTaskNo();
					System.out.println("Task no. of Reschedule  -Call Back Later -Submit button : "
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
				TestCaseTracker.markAsExecuted("inflVerificationVerifyRescheduleCallBackLaterBySubmitBtn");
			}

			else {
				System.out.println("Task type is not Influencer Verification");
				manager.executeTask();
			}

		}
		
		
		
		@Test(priority = 39, alwaysRun = true)
		public void inflVerificationVerifyRescheduleWrongNoBySubmitBreakBtn(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Influencer Primary Verification")) {
				ExtentTest methodTest = test.createNode("inflVerificationVerifyRescheduleWrongNoBySubmitBreakBtn");
				logTestMethod(driver, methodTest, manager, "inflVerificationVerifyRescheduleWrongNoBySubmitBreakBtn", () -> {
					telePage.clickOnInfluencerVerificationPopUpCrossIcon();
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

				TestCaseTracker.markAsExecuted("inflVerificationVerifyRescheduleWrongNoBySubmitBreakBtn");
			}

			else {
				System.out.println("Task type is not Influencer Verification");
				manager.executeTask();
			}

		}
		
		@Test(priority = 40, alwaysRun = true)
		public void inflVerificationVerifyRescheduleWrongNoTaskStatus(TaskTypeManager manager) throws InterruptedException, IOException {

			ExtentTest methodTest = test.createNode("inflVerificationVerifyRescheduleWrongNoTaskStatus");
			logTestMethod(driver, methodTest,  manager,"inflVerificationVerifyRescheduleWrongNoTaskStatus", () -> {
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

			TestCaseTracker.markAsExecuted("inflVerificationVerifyRescheduleWrongNoTaskStatus");

		}
		
		@Test(priority = 41, alwaysRun = true)
		public void outboundTaskPageVerifyNameFilter(TaskTypeManager manager) throws InterruptedException, IOException
		{	
			ExtentTest methodTest = test.createNode("outboundTaskPageVerifyNameFilter");
	        logTestMethod(driver,methodTest,manager, "outboundTaskPageVerifyNameFilter", () ->{ 
			SoftAssert softAssert = new SoftAssert(); 
			outboundPage = new OutBoundTaskPage(driver);
			outboundPage.enterTextInOutboundtaskPageSerachFilter("Outbound Task");
			softAssert.assertTrue(outboundPage.verifyOutboundPageNoRecordsLableDisplay(),"Outbound Task Name filter not working");
			driver.navigate().refresh();
			softAssert.assertAll();
	        });
			TestCaseTracker.markAsExecuted("outboundTaskPageVerifyNameFilter");

		}
		
		@Test(priority = 42, alwaysRun = true)
		public void outboundTaskPageOpenTaskActivity(TaskTypeManager manager) throws InterruptedException, IOException {
			ExtentTest methodTest = test.createNode("outboundTaskPageOpenTaskActivity");
	        logTestMethod(driver,methodTest,manager, "outboundTaskPageOpenTaskActivity", () ->{ 
			SoftAssert softAssert = new SoftAssert(); 
			outboundPage = new OutBoundTaskPage(driver);
			outboundPage.clickOnOutboundTaskPageTaskNo();
			softAssert.assertTrue(outboundPage.verifyOutboundPageTaskAcivityLableDisplay(),"Task Activity Not open.");
			softAssert.assertAll();
	        });
	        outboundPage.clickOnOutboundTaskPageTaskActivityCrossIcon();
			TestCaseTracker.markAsExecuted("outboundTaskPageOpenTaskActivity");
		}
		
		@Test(priority = 43, alwaysRun = true)
		public void outboundTaskPageVerifyFilterIconClickable(TaskTypeManager manager) throws IOException
		{
			ExtentTest methodTest = test.createNode("outboundTaskPageVerifyFilterIconClickable");
	        logTestMethod(driver,methodTest,manager, "outboundTaskPageVerifyFilterIconClickable", () ->{ 
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			outboundPage.clickOnOutboundTaskPageDateFilterIcon();
			softAssert.assertTrue(outboundPage.verifyOutbundTaskPageDateFilterLableDisplay()," Filter Icon not working");
			softAssert.assertAll();
	        });
			TestCaseTracker.markAsExecuted("outboundTaskPageVerifyFilterIconClickable");
		}
		
		@Test(priority = 44, alwaysRun = true)
		public void outboundTaskPageVerifyFilterCrossIconClickable(TaskTypeManager manager) throws IOException
		{
			ExtentTest methodTest = test.createNode("outboundTaskPageVerifyFilterCrossIconClickable");
	        logTestMethod(driver,methodTest,manager, "outboundTaskPageVerifyFilterCrossIconClickable", () ->{ 
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			boolean status=true;
			outboundPage.clickOnOutboundTaskPageDatefilterCrossIcon();
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
	        
	        });
			TestCaseTracker.markAsExecuted("outboundTaskPageVerifyFilterCrossIconClickable");
	
		}
	
		@Test(priority = 45, alwaysRun = true)
		public void inflVerificationVerifyRescheduleWrongNoBySubmitBtn(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Influencer Primary Verification")) {
				ExtentTest methodTest = test.createNode("inflVerificationVerifyRescheduleWrongNoBySubmitBtn");
				logTestMethod(driver, methodTest, manager, "inflVerificationVerifyRescheduleWrongNoBySubmitBtn", () -> {
					telePage.clickOnInfluencerVerificationPopUpCrossIcon();
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

				 TestCaseTracker.markAsExecuted("inflVerificationVerifyRescheduleWrongNoBySubmitBtn");
			} else {
				System.out.println("Task type is not Influencer Verification");
				manager.executeTask();
			}

		}
	 		
		@DataProvider(name = "inflVerificationData")
		public Object[][] inflVerificationDetails() {

			// call method to read & enter json data
			Object[][] dataArray = readJsonData(System.getProperty("user.dir")+"\\src\\test\\resource\\com\\jspl\\jsondata\\InfluncerVerificationDetails.json");
			return dataArray;


		};


}
