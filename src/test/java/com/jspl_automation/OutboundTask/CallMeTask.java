package com.jspl_automation.OutboundTask;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.jspl_automation.TestComponents.CommanFunctions;
import com.jspl_automation.pageobjects.DialerLoginPage;
import com.jspl_automation.pageobjects.LoginPage;
import com.jspl_automation.utility.BaseClass;

public class CallMeTask extends BaseClass {
	
	
	DialerLoginPage dialerPage;
	CommanFunctions functions;
	TaskTypeManager manager;
	int i = 1;
	String generatedClaimID;
	String backButtonTaskNo;
	String hangUpTaskNo;
	String callMeWrongTaskNo;
	String callMeNotInterestedTakNo;
	String callMeRingNotReceivedTaskNo;
	String callMeCallBackLaterTaskNo;
	int expectedRedemptionPoints;
	int oldLockedPoints;
	int oldReedemablePoints;
	int oldTotalPoints;
	int newLockedPoints;
	int newReedemablePoints;

	// ANSI escape code for red color
	String redColor = "\u001B[31m";
	// ANSI escape code to reset color
	String resetColor = "\u001B[0m";

	String greenColor = "\033[0;32;1m";
	String resetGreenColor = "\033[0m";

	
	
	public CallMeTask(WebDriver driver) {
		this.driver = driver;

	}
 
	    
	
	@Test
	public void runTests() throws InterruptedException, IOException {

		
		if (!TestCaseTracker.isExecuted("callCloseTaskbuttonclickable")) {

			callCloseTaskbuttonclickable();
		}

		if (!TestCaseTracker.isExecuted("callCloseTaskSubmitbuttonclickable")) {
			callCloseTaskSubmitbuttonclickable();
		}

		if (!TestCaseTracker.isExecuted("callCloseTaskSubmitBreakbuttonclickable")) {
			callCloseTaskSubmitBreakbuttonclickable();
		}

		if (!TestCaseTracker.isExecuted("callCloseTaskCancelbuttonclickable")) {
			callCloseTaskCancelbuttonclickable();
		}

		if (!TestCaseTracker.isExecuted("callCloseTaskCrossIconclickable")) {
			callCloseTaskCrossIconclickable();
		}

		if (!TestCaseTracker.isExecuted("callRescheduledbuttonclickable")) {
			callRescheduledbuttonclickable();
		}

		if (!TestCaseTracker.isExecuted("callRescheduledSubmitbuttonclickable")) {
			callRescheduledSubmitbuttonclickable();
		}

		if (!TestCaseTracker.isExecuted("callRescheduledSubmitBreakbuttonclickable")) {
			callRescheduledSubmitBreakbuttonclickable();
		}

		if (!TestCaseTracker.isExecuted("callRescheduledCancelbuttonclickable")) {
			callRescheduledCancelbuttonclickable();
		}

		if (!TestCaseTracker.isExecuted("callRescheduledCrossIconclickable")) {
			callRescheduledCrossIconclickable();
		}

		if (!TestCaseTracker.isExecuted("callCatalogClickable")) {
			callCatalogClickable();
		}

		if (!TestCaseTracker.isExecuted("callCatalogProductClickable")) {
			callCatalogProductClickable();
		}

		if (!TestCaseTracker.isExecuted("callCatalogProductCrossIconClickable")) {
			callCatalogProductCrossIconClickable();
		}

		if (!TestCaseTracker.isExecuted("callPointsClickable")) {
			callPointsClickable();
		}

		if (!TestCaseTracker.isExecuted("callPointsOptionClickable")) {
			callPointsOptionClickable();
		}

		if (!TestCaseTracker.isExecuted("callPointsOptionCrossIconClickable")) {
			callPointsOptionCrossIconClickable();
		}

		if (!TestCaseTracker.isExecuted("callEscalationClickable")) {
			callEscalationClickable();
		}

		if (!TestCaseTracker.isExecuted("callEscalationListClickable")) {
			callEscalationListClickable();
		}
		if (!TestCaseTracker.isExecuted("callEscalationListCrossIconClickable")) {
			callEscalationListCrossIconClickable();
		}

		if (!TestCaseTracker.isExecuted("callAddEscalationClickable")) {
			callAddEscalationClickable();
		}

		if (!TestCaseTracker.isExecuted("callAddEscalationSubmitClickable")) {
			callAddEscalationSubmitClickable();
		}

		if (!TestCaseTracker.isExecuted("callAddEscalationCancelClickable")) {
			callAddEscalationCancelClickable();
		}

		if (!TestCaseTracker.isExecuted("callAddEscalationCrossIconClickable")) {
			callAddEscalationCrossIconClickable();
		}

		if (!TestCaseTracker.isExecuted("callRedemptionClickable")) {
			callRedemptionClickable();
		}
		if (!TestCaseTracker.isExecuted("callRedemptionHistoryClickable")) {
			callRedemptionHistoryClickable();
		}

		if (!TestCaseTracker.isExecuted("callRedemptionHistoryCrossIconClickable")) {
			callRedemptionHistoryCrossIconClickable();
		}

		if (!TestCaseTracker.isExecuted("callAddRedemptionClickable")) {
			callAddRedemptionClickable();
		}

		if (!TestCaseTracker.isExecuted("callAddRedemptionSubmitClickable")) {
			callAddRedemptionSubmitClickable();
		}

		if (!TestCaseTracker.isExecuted("callAddRedemptionCancelClickable")) {
			callAddRedemptionCancelClickable();
		}

		if (!TestCaseTracker.isExecuted("callAddRedemptionCrossIconClickable")) {
			callAddRedemptionCrossIconClickable();
		}

		if (!TestCaseTracker.isExecuted("CallClaimAddButtonClickable")) {
			CallClaimAddButtonClickable();
		}

		if (!TestCaseTracker.isExecuted("CallAddClaimButtonClickable")) {
			CallAddClaimButtonClickable();
		}

		if (!TestCaseTracker.isExecuted("callAddClaimSubmitButtonClickable")) {
			callAddClaimSubmitButtonClickable();
		}

		if (!TestCaseTracker.isExecuted("callAddClaimCancelButtonClickable")) {
			callAddClaimCancelButtonClickable();
		}

		if (!TestCaseTracker.isExecuted("callAddClaimCrossButtonClickable")) {
			callAddClaimCrossButtonClickable();
		}

		if (!TestCaseTracker.isExecuted("callClaimStatusClickable")) {
			callClaimStatusClickable();
		}

		if (!TestCaseTracker.isExecuted("callClaimStatusCrossClickable")) {
			callClaimStatusCrossClickable();
		}

		if (!TestCaseTracker.isExecuted("callVerifyClaimClickable")) {
			callVerifyClaimClickable();
		}

		if (!TestCaseTracker.isExecuted("callAddEscalation")) {
			callAddEscalation();
		}

		if (!TestCaseTracker.isExecuted("callSubmitEscalationVerifyNavigation")) {
			callSubmitEscalationVerifyNavigation();
		}

		if (!TestCaseTracker.isExecuted("VerifyCallEscaListNameFilter")) {
			VerifyCallEscaListNameFilter();
		}

		if (!TestCaseTracker.isExecuted("callAddClaimDealFieldMandotory")) {
			callAddClaimDealFieldMandotory();
		}

		if (!TestCaseTracker.isExecuted("callAddClaimCustNameFieldMandotory")) {
			callAddClaimCustNameFieldMandotory();
		}

		if (!TestCaseTracker.isExecuted("callAddClaimCustContactFieldMandotory")) {
			callAddClaimCustContactFieldMandotory();
		}

		if (!TestCaseTracker.isExecuted("callAddClaimAddressFieldMandotory")) {
			callAddClaimAddressFieldMandotory();
		}

		if (!TestCaseTracker.isExecuted("callAddClaimProductFieldMandotory")) {
			callAddClaimProductFieldMandotory();
		}

		if (!TestCaseTracker.isExecuted("callAddClaimPointsFieldMandotory")) {
			callAddClaimPointsFieldMandotory();
		}

		if (!TestCaseTracker.isExecuted("callAddClaimQtyFieldMandotory")) {
			callAddClaimQtyFieldMandotory();
		}

		if (!TestCaseTracker.isExecuted("callAddClaimNotSelectProductClickAddButton")) {
			callAddClaimNotSelectProductClickAddButton();
		}

		if (!TestCaseTracker.isExecuted("callAddClaimNotSelectProductClickDeleteButton")) {
			callAddClaimNotSelectProductClickDeleteButton();
		}

		if (!TestCaseTracker.isExecuted("callEnterClaimData")) {
			// Fetch data from DataProvider
			Object[][] data = customerDetails();

			for (Object[] dataSet : data) {
				// Assuming the first HashMap has the keys "productCode" and "productQty"
				HashMap<String, String> customerData = (HashMap<String, String>) dataSet[0];

				String dealerCode = customerData.get("dealerCode"); // Use the key to access the value
				String invNo = customerData.get("invNo"); // Use the key to access the value
				String invoiceDate = customerData.get("invoiceDate");
				String customerName = customerData.get("customerName");
				String customerContact = customerData.get("customerContact");
				String customerAddress = customerData.get("customerAddress");
				String filePath = customerData.get("filePath");

				callEnterClaimData(dealerCode, invNo, invoiceDate, customerName, customerContact, customerAddress,
						filePath);
			}

		}

		if (!TestCaseTracker.isExecuted("callAddClaimProducts")) {
			// Fetch data from DataProvider
			Object[][] data = productData();

			for (Object[] dataSet : data) {
				// Assuming the first HashMap has the keys "productCode" and "productQty"
				HashMap<String, String> productData = (HashMap<String, String>) dataSet[0];

				String productCodeValue = productData.get("productCode"); // Use the key to access the value
				String productQty = productData.get("productQty"); // Use the key to access the value
				callAddClaimProducts(productCodeValue, productQty);
			}
		}

		if (!TestCaseTracker.isExecuted("verifyCallClaimTotalPoints")) {
			verifyCallClaimTotalPoints();
		}

		if (!TestCaseTracker.isExecuted("callSubmitClaim")) {
			callSubmitClaim();
		}

		if (!TestCaseTracker.isExecuted("verifyCallClaimSubmitNavigateToClaimStatus")) {
			verifyCallClaimSubmitNavigateToClaimStatus();
		}

		if (!TestCaseTracker.isExecuted("verifyCallAddedClaim")) {
			verifyCallAddedClaim();
		}

		if (!TestCaseTracker.isExecuted("openCallClaimStatusPDF")) {
			openCallClaimStatusPDF();
		}

		if (!TestCaseTracker.isExecuted("callClaimStatusPDFCrossClick")) {
			callClaimStatusPDFCrossClick();
		}

		if (!TestCaseTracker.isExecuted("callClaimStatusNameFilter")) {
			callClaimStatusNameFilter();
		}

		if (!TestCaseTracker.isExecuted("callClaimStatusFilterIconClick")) {
			callClaimStatusFilterIconClick();
		}

		if (!TestCaseTracker.isExecuted("callClaimStatusFilterCrossClick")) {
			callClaimStatusFilterCrossClick();
		}

		if (!TestCaseTracker.isExecuted("callRedemptionGiftMandatoryField")) {
			callRedemptionGiftMandatoryField();
		}

		if (!TestCaseTracker.isExecuted("callRedemptionQtyMandatoryField")) {
			callRedemptionQtyMandatoryField();
		}

		if (!TestCaseTracker.isExecuted("callRedemptionPoints")) {
			// Fetch data from DataProvider
			Object[][] data = redemptionDetails();

			for (Object[] dataSet : data) {

				HashMap<String, String> redemptionData = (HashMap<String, String>) dataSet[0];

				String rewardCode = redemptionData.get("GiftName"); // Use the key to access the value
				String rewardQty = redemptionData.get("RewardQty"); // Use the key to access the value

				callRedemptionPoints(rewardCode, rewardQty);
			}
		}

		if (!TestCaseTracker.isExecuted("callSubmitRedemption")) {
			callSubmitRedemption();
		}

		if (!TestCaseTracker.isExecuted("callRedemptionSubmitNavigation")) {
			callRedemptionSubmitNavigation();
		}

		if (!TestCaseTracker.isExecuted("callRedemptionLockedPoints")) {
			callRedemptionLockedPoints();
		}

		if (!TestCaseTracker.isExecuted("callRedemptionRedeemablePoints")) {
			callRedemptionRedeemablePoints();
		}

		if (!TestCaseTracker.isExecuted("callRedemptionTotalPoints")) {
			callRedemptionTotalPoints();
		}

		if (!TestCaseTracker.isExecuted("callMeRedial")) {
			callMeRedial();
		}

		if (!TestCaseTracker.isExecuted("callMeBack")) {
			callMeBack();
		}

		if (!TestCaseTracker.isExecuted("callMeBackTaskStatus")) {
			callMeBackTaskStatus();
		}

		if (!TestCaseTracker.isExecuted("verifyCallBackButtonDialNext")) {
			verifyCallBackButtonDialNext();
		}

		if (!TestCaseTracker.isExecuted("callMeHangUp")) {
			callMeHangUp();
		}

		if (!TestCaseTracker.isExecuted("callMecloseTaskSubmitBreak")) {
			callMecloseTaskSubmitBreak();

		}

		if (!TestCaseTracker.isExecuted("callMecloseTaskSubmit")) {
			callMecloseTaskSubmit();

		}
		
		
		if (!TestCaseTracker.isExecuted("callMeRescheduleNotInterestedSubmitBreak")) {
			callMeRescheduleNotInterestedSubmitBreak();
		}
		
		if (!TestCaseTracker.isExecuted("callMeRescheduleNotInterestedTaskStatus")) {
			callMeRescheduleNotInterestedTaskStatus();
		}
		
		
		if (!TestCaseTracker.isExecuted("callMeRescheduleNotInterestedSubmit")) {
			callMeRescheduleNotInterestedSubmit();
		}
		
	
		if (!TestCaseTracker.isExecuted("callMeRescheduleRingNotReceivedSubmitBreak")) {
			callMeRescheduleRingNotReceivedSubmitBreak();
		}
		
		if (!TestCaseTracker.isExecuted("callMeRescheduleRingNotReceivedTaskStatus")) {
			callMeRescheduleRingNotReceivedTaskStatus();
		}
		
		if (!TestCaseTracker.isExecuted("callMeRescheduleRingNotReceivedSubmit")) {
			callMeRescheduleRingNotReceivedSubmit();
		}
	
	
		
		if (!TestCaseTracker.isExecuted("callMeRescheduleCallBackLaterSubmitBreak")) {
			callMeRescheduleCallBackLaterSubmitBreak();
		}
		
		if (!TestCaseTracker.isExecuted("callMeRescheduleCallBackLaterTaskStatus")) {
			callMeRescheduleCallBackLaterTaskStatus();
		}
		
		
		if (!TestCaseTracker.isExecuted("callMeRescheduleCallBackLaterSubmit")) {
			callMeRescheduleCallBackLaterSubmit();
		}
		
		
		if (!TestCaseTracker.isExecuted("callMeRescheduleWrongNoSubmitBreak")) {
			callMeRescheduleWrongNoSubmitBreak();
		}
		
		if (!TestCaseTracker.isExecuted("callMeRescheduleWrongNoTaskStatus")) {
			callMeRescheduleWrongNoTaskStatus();
		}
		
		
		if (!TestCaseTracker.isExecuted("callMeRescheduleWrongNoSubmit")) {
			callMeRescheduleWrongNoSubmit();
		}
		
		
		
		
		
	}
	         
	
	
	
	
	@Test(priority = 1)
	public void callCloseTaskbuttonclickable()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.callActionButton("Close Task");
		By closeTaskLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
		WaitVisibliltyOfLocated(closeTaskLableLocator);
		WebElement closeTaskLableElement=driver.findElement(closeTaskLableLocator);
		softAssert.assertTrue(closeTaskLableElement.isDisplayed(),"Close Task Button not clickable");
		softAssert.assertAll();
		
		System.out.println(greenColor + "Call Me Test Case : 1 Passed " + resetGreenColor);
		
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 1 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 1 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}

		
		TestCaseTracker.markAsExecuted("callCloseTaskbuttonclickable");
		
		
	}
	
	@Test(priority = 2)
	public void callCloseTaskSubmitbuttonclickable()
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
        
        System.out.println(greenColor + "Call Me Test Case : 2 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 2 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 2 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		TestCaseTracker.markAsExecuted("callCloseTaskSubmitbuttonclickable");
		
		
	}
	
	@Test(priority = 3)
	public void callCloseTaskSubmitBreakbuttonclickable()
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
        
        System.out.println(greenColor + "Call Me Test Case : 3 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 3 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 3 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		TestCaseTracker.markAsExecuted("callCloseTaskSubmitBreakbuttonclickable");
		
		
		
	}
	
	
	@Test(priority = 4)
	public void callCloseTaskCancelbuttonclickable()
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
        System.out.println(greenColor + "Call Me Test Case : 4 Passed " + resetGreenColor);
		
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 4 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 4 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callCloseTaskCancelbuttonclickable");
		
	}
	
	@Test(priority = 5)
	public void callCloseTaskCrossIconclickable()
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
        System.out.println(greenColor + "Call Me Test Case : 5 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 5 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 5 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		TestCaseTracker.markAsExecuted("callCloseTaskCrossIconclickable");
		
	}
	
	@Test(priority = 6)
	public void callRescheduledbuttonclickable()
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
		System.out.println(greenColor + "Call Me Test Case : 6 Passed " + resetGreenColor);
		
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 6 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 6 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		TestCaseTracker.markAsExecuted("callRescheduledbuttonclickable");
		
		
	}
	
	@Test(priority = 7)
	public void callRescheduledSubmitbuttonclickable()
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
        System.out.println(greenColor + "Call Me Test Case : 7 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 7 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 7 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		TestCaseTracker.markAsExecuted("callRescheduledSubmitbuttonclickable");
	}
	
	@Test(priority = 8)
	public void callRescheduledSubmitBreakbuttonclickable()
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
        System.out.println(greenColor + "Call Me Test Case : 8 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 8 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 8 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		TestCaseTracker.markAsExecuted("callRescheduledSubmitBreakbuttonclickable");
	}
	
	@Test(priority = 9)
	public void callRescheduledCancelbuttonclickable()
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
        System.out.println(greenColor + "Call Me Test Case : 9 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 9 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 9 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		TestCaseTracker.markAsExecuted("callRescheduledCancelbuttonclickable");
		
	}
	
	@Test(priority = 10)
	public void callRescheduledCrossIconclickable()
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
        System.out.println(greenColor + "Call Me Test Case : 10 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 10 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 10 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callRescheduledCrossIconclickable");
	}
	
	@Test(priority = 11)
	public void callCatalogClickable()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Catalog");
		By catalogueDropDownLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[5]/div/div/button");
		WaitVisibliltyOfLocated(catalogueDropDownLocator);
		WebElement catalogueDropDownElement=driver.findElement(catalogueDropDownLocator);
		softAssert.assertTrue(catalogueDropDownElement.isDisplayed(),"Catalogue button not clickable");
		
        softAssert.assertAll();
        System.out.println(greenColor + "Call Me Test Case : 11 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 11 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 11 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		TestCaseTracker.markAsExecuted("callCatalogClickable");
		
		
	}
	
	@Test(priority = 12)
	public void callCatalogProductClickable()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		By catalogueDropDownLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[5]/div/div/button");
		click(catalogueDropDownLocator);
		By productCatalogueLable=By.xpath("//h6[@class=\"my-0\"]/label");
		WaitVisibliltyOfLocated(productCatalogueLable);
		WebElement productCatalogueLableElement=driver.findElement(productCatalogueLable);
		softAssert.assertTrue(productCatalogueLableElement.isDisplayed(),"Catalogue Products button not clickable");
		
        softAssert.assertAll();
        System.out.println(greenColor + "Call Me Test Case : 12 Passed " + resetGreenColor);
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 12 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 12 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		TestCaseTracker.markAsExecuted("callCatalogProductClickable");
		
		
	}
	
	@Test(priority = 13)
	public void callCatalogProductCrossIconClickable()
	{
		try
		{
		boolean status=true;
		SoftAssert softAssert = new SoftAssert();
		By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
		try
		{
		By productCatalogueLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
		WebElement productCatalogueLableElement=driver.findElement(productCatalogueLableLocator);
		if(productCatalogueLableElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
			
		}
		 if(!status)
		 {
			 softAssert.fail("Product Catalogue Cross button not clickable");
		 }
        softAssert.assertAll();
        System.out.println(greenColor + "Call Me Test Case : 13 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 13 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 13 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		TestCaseTracker.markAsExecuted("callCatalogProductCrossIconClickable");
	}
	
	@Test(priority = 14)
	public void callPointsClickable()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Points");
		By pointsDropDownLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[4]/div/div/button");
		WaitVisibliltyOfLocated(pointsDropDownLocator);
		WebElement pointsDropDownElement=driver.findElement(pointsDropDownLocator);
		softAssert.assertTrue(pointsDropDownElement.isDisplayed(),"Points button not clickable");
		
        softAssert.assertAll();
        System.out.println(greenColor + "Call Me Test Case : 14 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 14 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 14 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		TestCaseTracker.markAsExecuted("callPointsClickable");
		
	}
	
	@Test(priority = 15)
	public void callPointsOptionClickable()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		By pointsDropDownLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[4]/div/div/button");
		click(pointsDropDownLocator);
		By pointsLable=By.xpath("//h6[@class=\"my-0\"]/label");
		WaitVisibliltyOfLocated(pointsLable);
		WebElement pointsLableElement=driver.findElement(pointsLable);
		softAssert.assertTrue(pointsLableElement.isDisplayed(),"Points Drodown option button not clickable");
		
        softAssert.assertAll();
        System.out.println(greenColor + "Call Me Test Case : 15 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 15 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 15 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callPointsOptionClickable");
		
	}
	
	@Test(priority = 16)
	public void callPointsOptionCrossIconClickable()
	{
		try{
			
		
		boolean status=true;
		SoftAssert softAssert = new SoftAssert();
		By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
		try
		{
		By pointsLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
		WebElement pointsLableElement=driver.findElement(pointsLableLocator);
		if(pointsLableElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
			
		}
		 if(!status)
		 {
			 softAssert.fail("Points page Cross button not clickable");
		 }
        softAssert.assertAll();
        System.out.println(greenColor + "Call Me Test Case : 16 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 16 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 16 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callPointsOptionCrossIconClickable");
	}
	
	@Test(priority = 17)
	public void callEscalationClickable()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Escalation");
		By escalationDropDownLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[3]/div/div/button[2]");
		WaitVisibliltyOfLocated(escalationDropDownLocator);
		WebElement escalationDropDownElement=driver.findElement(escalationDropDownLocator);
		softAssert.assertTrue(escalationDropDownElement.isDisplayed(),"Escalation button not clickable");
		
        softAssert.assertAll();
        System.out.println(greenColor + "Call Me Test Case : 17 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 17 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 17 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callEscalationClickable");
		
	}
	
	@Test(priority = 18)
	public void callEscalationListClickable()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		By escalationListLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[3]/div/div/button[2]");
		click(escalationListLocator);
		By escalationListLable=By.xpath("//h6[@class=\"my-0\"]/label");
		WaitVisibliltyOfLocated(escalationListLable);
		WebElement escalationListLableElement=driver.findElement(escalationListLable);
		softAssert.assertTrue(escalationListLableElement.isDisplayed(),"Escalation list button not clickable");
		
        softAssert.assertAll();
        System.out.println(greenColor + "Call Me Test Case : 18 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 18 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 18 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callEscalationListClickable");
	}
	
	@Test(priority = 19)
	public void callEscalationListCrossIconClickable()
	{
		try
		{
		boolean status=true;
		SoftAssert softAssert = new SoftAssert();
		By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
		try
		{
		By escalationListLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
		WebElement escalationListLableElement=driver.findElement(escalationListLableLocator);
		if(escalationListLableElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
			
		}
		 if(!status)
		 {
			 softAssert.fail("Escalation List Cross button not clickable");
		 }
        softAssert.assertAll();
        System.out.println(greenColor + "Call Me Test Case : 19 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 19 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 19 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callEscalationListCrossIconClickable");
		
	}
	@Test(priority = 20)
	public void callAddEscalationClickable()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Escalation");
		By addEscalationLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[3]/div/div/button[1]");
		click(addEscalationLocator);
		By addEscalationLable=By.xpath("//h6[@class=\"my-0\"]/label");
		WaitVisibliltyOfLocated(addEscalationLable);
		WebElement addEscalationLableElement=driver.findElement(addEscalationLable);
		softAssert.assertTrue(addEscalationLableElement.isDisplayed(),"Add Escalation button not clickable");
		
        softAssert.assertAll();
        System.out.println(greenColor + "Call Me Test Case : 20 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 20 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 20 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callAddEscalationClickable");
		
		
	}
	
	@Test(priority = 21)
	public void callAddEscalationSubmitClickable()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		By submitButtonLocator=By.xpath("//button[@class=\"btn btn-success\"]");
		click(submitButtonLocator);
		
		By errorLocator=By.xpath("//div[text()=\"Please select Escalation Tag.\"]");
		WaitVisibliltyOfLocated(errorLocator);
		WebElement errorElement=driver.findElement(errorLocator);		
		softAssert.assertTrue(errorElement.isDisplayed(),"Add Escalation Submit button not clickable");
		
        softAssert.assertAll();
        System.out.println(greenColor + "Call Me Test Case : 21 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 21 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 21 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callAddEscalationSubmitClickable");
		

		
	}
	
	@Test(priority = 22)
	public void callAddEscalationCancelClickable()
	{
		try
		{
		boolean status=true;
		SoftAssert softAssert = new SoftAssert();
		By cancelButtonLocator=By.xpath("//button[@class=\"btn btn-danger\"]");
		click(cancelButtonLocator);
		try
		{
		By addEscalationLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
		WebElement addEscalationLableElement=driver.findElement(addEscalationLableLocator);
		if(addEscalationLableElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
			
		}
		 if(!status)
		 {
			 softAssert.fail("AddEscalation Cancel button not clickable");
		 }
        softAssert.assertAll();
        System.out.println(greenColor + "Call Me Test Case : 22 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 22 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 22 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callAddEscalationCancelClickable");
	}
	
	@Test(priority = 23)
	public void callAddEscalationCrossIconClickable()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Escalation");
		By addEscalationLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[3]/div/div/button[1]");
		click(addEscalationLocator);
		boolean status=true;
		By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
		try
		{
		By addEscalationLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
		WebElement addEscalationLableElement=driver.findElement(addEscalationLableLocator);
		if(addEscalationLableElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
			
		}
		 if(!status)
		 {
			 softAssert.fail("Add Escalation Cross button not clickable");
		 }
        softAssert.assertAll();
        System.out.println(greenColor + "Call Me Test Case : 23 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 23 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 23 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callAddEscalationCrossIconClickable");
	}
	
	@Test(priority = 24)
	public void callRedemptionClickable()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Redemption");
		By redemptionDropDownLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[2]/div/div/button[2]");
		WaitVisibliltyOfLocated(redemptionDropDownLocator);
		WebElement redemptionDropDownElement=driver.findElement(redemptionDropDownLocator);
		softAssert.assertTrue(redemptionDropDownElement.isDisplayed(),"Redemption button not clickable");
		
        softAssert.assertAll();
        System.out.println(greenColor + "Call Me Test Case : 24 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 24 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 24 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callRedemptionClickable");
	}
	
	@Test(priority = 25)
	public void callRedemptionHistoryClickable()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		By redemptionHistoryLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[2]/div/div/button[2]");
		click(redemptionHistoryLocator);
		By redemptionHistoryLable=By.xpath("//h6[@class=\"my-0\"]/label");
		WaitVisibliltyOfLocated(redemptionHistoryLable);
		WebElement redemptionHistoryLableElement=driver.findElement(redemptionHistoryLable);
		softAssert.assertTrue(redemptionHistoryLableElement.isDisplayed(),"Redemption History button not clickable");
		
        softAssert.assertAll();
        System.out.println(greenColor + "Call Me Test Case : 25 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 25 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 25 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callRedemptionHistoryClickable");
	}
	
	@Test(priority = 26)
	public void callRedemptionHistoryCrossIconClickable()
	{
		try
		{
		boolean status=true;
		SoftAssert softAssert = new SoftAssert();
		By crossIconLocator=By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1]/div[5]/div/button/i");
		click(crossIconLocator);
		try
		{
		By redemptionHistoryLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
		WebElement redemptionHistoryLableElement=driver.findElement(redemptionHistoryLableLocator);
		if(redemptionHistoryLableElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
			
		}
		 if(!status)
		 {
			 softAssert.fail("Redemption History Cross button not clickable");
		 }
        softAssert.assertAll();
        System.out.println(greenColor + "Call Me Test Case : 26 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 26 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 26 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callRedemptionHistoryCrossIconClickable");
		
	}
	
	@Test(priority = 27)
	public void callAddRedemptionClickable()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Redemption");
		By addRedemptionLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[2]/div/div/button[1]");
		click(addRedemptionLocator);
		By addRedemptionLable=By.xpath("//h6[@class=\"my-0\"]/label");
		WaitVisibliltyOfLocated(addRedemptionLable);
		WebElement addRedemptionLableElement=driver.findElement(addRedemptionLable);
		softAssert.assertTrue(addRedemptionLableElement.isDisplayed(),"Add Redemption button not clickable");
		
        softAssert.assertAll();
        System.out.println(greenColor + "Call Me Test Case : 27 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 27 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 27 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callAddRedemptionClickable");
		
	}
	
	@Test(priority = 28)
	public void callAddRedemptionSubmitClickable()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		By submitButtonLocator=By.xpath("//button[@class=\"btn btn-success\"]");
		click(submitButtonLocator);
		
		By errorLocator=By.xpath("//div[text()=\"Please select Gift\"]");
		WaitVisibliltyOfLocated(errorLocator);
		WebElement errorElement=driver.findElement(errorLocator);		
		softAssert.assertTrue(errorElement.isDisplayed(),"Add Redemption Submit button not clickable");
		
        softAssert.assertAll();
        System.out.println(greenColor + "Call Me Test Case : 28 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 28 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 28 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		TestCaseTracker.markAsExecuted("callAddRedemptionSubmitClickable");
		
	}
	
	@Test(priority = 29)
	public void callAddRedemptionCancelClickable()
	{
		try
		{
		boolean status=true;
		SoftAssert softAssert = new SoftAssert();
		By cancelButtonLocator=By.xpath("//button[@class=\"btn btn-danger\"]");
		click(cancelButtonLocator);
		try
		{
		By addRedemptionLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
		WebElement addRedemptionLableElement=driver.findElement(addRedemptionLableLocator);
		if(addRedemptionLableElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
			
		}
		 if(!status)
		 {
			 softAssert.fail("Add Redemption Cancel button not clickable");
		 }
        softAssert.assertAll();
        System.out.println(greenColor + "Call Me Test Case : 29 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 29 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 29 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callAddRedemptionCancelClickable");
		
	}
	
	@Test(priority = 30)
	public void callAddRedemptionCrossIconClickable()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Redemption");
		By addRedemptionLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[2]/div/div/button[1]");
		click(addRedemptionLocator);
		boolean status=true;
		By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
		try
		{
		By addRedemptionLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
		WebElement addRedemptionLableElement=driver.findElement(addRedemptionLableLocator);
		if(addRedemptionLableElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
			
		}
		 if(!status)
		 {
			 softAssert.fail("Add Redemption Cross button not clickable");
		 }
        softAssert.assertAll();
        System.out.println(greenColor + "Call Me Test Case : 30 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 30 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 30 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callAddRedemptionCrossIconClickable");
		
	}

	
	
	
	
	

	@Test(priority = 31)
	public void CallClaimAddButtonClickable() throws InterruptedException {
		
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Claim/Add");
		By claimAddDropDownLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[1]/div/div/button[1]");
		WaitVisibliltyOfLocated(claimAddDropDownLocator);
		WebElement claimAddDropDownElement=driver.findElement(claimAddDropDownLocator);
		softAssert.assertTrue(claimAddDropDownElement.isDisplayed(),"Claim Add button not clickable");
		
        softAssert.assertAll();
        System.out.println(greenColor + "Call Me Test Case : 31 Passed " + resetGreenColor);
        
		}catch(Exception e)
		{
			System.out.println("Call Me Test Case : 31 Failed");
		}
		TestCaseTracker.markAsExecuted("CallClaimAddButtonClickable");
	}

	@Test(priority = 32)
	public void CallAddClaimButtonClickable() throws InterruptedException {
		
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		By addClaimLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[1]/div/div/button[1]");
		click(addClaimLocator);
		By addClaimLable=By.xpath("//h6[@class=\"my-0\"]/label");
		WaitVisibliltyOfLocated(addClaimLable);
		WebElement addClaimLableElement=driver.findElement(addClaimLable);
		softAssert.assertTrue(addClaimLableElement.isDisplayed(),"Add Claim button not clickable");
		
        softAssert.assertAll();
        System.out.println(greenColor + "Call Me Test Case : 32 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 32 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 32 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("CallAddClaimButtonClickable");

	}
	
	
	@Test(priority = 33)
	public void callAddClaimSubmitButtonClickable()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		By submitButtonLocator=By.xpath("//button[@class=\"btn btn-success\"]");
		click(submitButtonLocator);
		
		By errorLocator=By.xpath("//div[text()=\"Please select dealer\"]");
		WaitVisibliltyOfLocated(errorLocator);
		WebElement errorElement=driver.findElement(errorLocator);		
		softAssert.assertTrue(errorElement.isDisplayed(),"Add Claim Submit button not clickable");
		
        softAssert.assertAll();
        System.out.println(greenColor + "Call Me Test Case : 33 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 33 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 33 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callAddClaimSubmitButtonClickable");
		
	}
	
	@Test(priority = 34)
	public void callAddClaimCancelButtonClickable()
	{
		try
		{
		boolean status=true;
		SoftAssert softAssert = new SoftAssert();
		By cancelButtonLocator=By.xpath("//button[@class=\"btn btn-danger\"]");
		click(cancelButtonLocator);
		try
		{
		By addClaimLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
		WebElement addClaimLableElement=driver.findElement(addClaimLableLocator);
		if(addClaimLableElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
		
		}
		 if(!status)
		 {
			 softAssert.fail("Add Claim Cancel button not clickable");
		 }
        softAssert.assertAll();
        System.out.println(greenColor + "Call Me Test Case : 34 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 34 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 34 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callAddClaimCancelButtonClickable");
	}
	
	@Test(priority = 35)
	public void callAddClaimCrossButtonClickable() 
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Claim/Add");
		By addClaimLocator = By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[1]/div/div/button[1]");
		click(addClaimLocator);
		boolean status = true;
		By crossIconLocator = By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
		try
		{
		By addClaimLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
		WebElement addClaimLableElement=driver.findElement(addClaimLableLocator);
		if(addClaimLableElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
			
		}
		 if(!status)
		 {
			 softAssert.fail("Add Claim Cross button not clickable");
		 }
        softAssert.assertAll();
        System.out.println(greenColor + "Call Me Test Case : 35 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 35 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 35 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callAddClaimCrossButtonClickable");
	}
	
	@Test(priority = 36)
	public void callClaimStatusClickable()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Claim/Add");
		By claimStausLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[1]/div/div/button[2]");
		click(claimStausLocator);
		By claimStatusLable=By.xpath("//h6[@class=\"my-0\"]/label");
		WaitVisibliltyOfLocated(claimStatusLable);
		WebElement claimStatusLableElement=driver.findElement(claimStatusLable);
		softAssert.assertTrue(claimStatusLableElement.isDisplayed(),"Claim Status button not clickable");
		
        softAssert.assertAll();
        System.out.println(greenColor + "Call Me Test Case : 36 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 36 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 36 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		TestCaseTracker.markAsExecuted("callClaimStatusClickable");
	}
	
	@Test(priority = 37)
	public void callClaimStatusCrossClickable()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		boolean status = true;
		By crossIconLocator = By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1]/div[5]/button/i");
		click(crossIconLocator);
		try
		{
		By claimStatusLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
		WebElement claimStatusLableElement=driver.findElement(claimStatusLableLocator);
		if(claimStatusLableElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
			
		}
		 if(!status)
		 {
			 softAssert.fail("Claim Status Cross button not clickable");
		 }
        softAssert.assertAll();
        System.out.println(greenColor + "Call Me Test Case : 37 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 37 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 37 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callClaimStatusCrossClickable");
	
	}
	
	@Test(priority = 38)
	public void callVerifyClaimClickable()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Claim/Add");
		By verifyClaimLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[1]/div/div/button[3]");
		click(verifyClaimLocator);
		By verifyClaimLable=By.xpath("//*[@id=\"getClaimVerifyDetails\"]/div/div/div/div[1]/div[2]/h6/label");
		WaitVisibliltyOfLocated(verifyClaimLable);
		WebElement verifyClaimLableElement=driver.findElement(verifyClaimLable);
		softAssert.assertTrue(verifyClaimLableElement.isDisplayed(),"Verify Claim button not clickable");
		
        softAssert.assertAll();
        System.out.println(greenColor + "Call Me Test Case : 38 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 38 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 38 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callVerifyClaimClickable");
	}
	
  
	@Test(priority = 39)
	public void callAddEscalation()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		//click on Escalation button
		functions.transactionButtons("Escalation");
		
		//click on Add Escalation
		By addEscalationLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[3]/div/div/button[1]");
		click(addEscalationLocator);
		
		By dropDownArrow=By.xpath("//*[@id=\"ESCID\"]/div/div[2]/div");
		click(dropDownArrow);
		Thread.sleep(2000);
		//Select Escalation Dropdown value
		By escalationDropDownElements=By.xpath("//div[@class=\" css-qr46ko\"]/div");
		listContains(escalationDropDownElements,"ESC005");
		
		 
		//Enter Remark
		driver.findElement(By.id("ESCALATIONREMARK")).sendKeys("Escalation Remark");
		
		//click on Submit button
		By submitButtonLocator=By.xpath("//button[@class=\"btn btn-success\"]");
		click(submitButtonLocator);
		
		By successLocator=By.id("swal2-title");
		WaitVisibliltyOfLocated(successLocator);
		WebElement successElement=driver.findElement(successLocator);
		
		softAssert.assertTrue(successElement.isDisplayed(),"Escalation Not Getting Submit");
		
		//click on Ok button
		By okButtonLocator=By.xpath("//button[text()=\"OK\"]");
		click(okButtonLocator);
		
		softAssert.assertAll();
		System.out.println(greenColor + "Call Me Test Case : 39 Passed " + resetGreenColor);
		
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 39 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 39 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callAddEscalation");
		
	}
	
	@Test(priority = 40)
	public void callSubmitEscalationVerifyNavigation()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		// Verify Navigate to escalation List form
		By escalationListLable = By.xpath("//h6[@class=\"my-0\"]/label");
		WaitVisibliltyOfLocated(escalationListLable);
		WebElement escalationListLableElement = driver.findElement(escalationListLable);
		softAssert.assertTrue(escalationListLableElement.isDisplayed(), "Not navigate to Escalation List page");

		softAssert.assertAll();
		By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
		System.out.println(greenColor + "Call Me Test Case : 40 Passed " + resetGreenColor);
		
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 40 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 40 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callSubmitEscalationVerifyNavigation");
		
	} 
	
	
	@Test(priority = 41)
	public void VerifyCallEscaListNameFilter()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		//click on Escalation button
		functions.transactionButtons("Escalation");
		By escalationListLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[3]/div/div/button[2]");
		click(escalationListLocator);
		By searchFilterLocator=By.id("search");
		WaitVisibliltyOfLocated(searchFilterLocator);
		driver.findElement(searchFilterLocator).sendKeys("Escalation");
		
		By noRecordsLableLocator = By.xpath("//div[text()=\"There are no records to display\"]");
		WaitVisibliltyOfLocated(noRecordsLableLocator);
		WebElement noRecordsLableElement=driver.findElement(noRecordsLableLocator);
		softAssert.assertTrue(noRecordsLableElement.isDisplayed(),"Escalation Filter Name not working");
		
		softAssert.assertAll();
		By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
		System.out.println(greenColor + "Call Me Test Case : 41 Passed " + resetGreenColor);
		
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 41 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 41 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("VerifyCallEscaListNameFilter");
		
	}
	
	
	
	
	@Test(priority = 42)
	public void callAddClaimDealFieldMandotory()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Claim/Add");
		By addClaimLocator = By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[1]/div/div/button[1]");
		click(addClaimLocator);
		By submitButtonLocator=By.xpath("//button[@class=\"btn btn-success\"]");
		click(submitButtonLocator);
		By errorLocator=By.xpath("//div[text()=\"Please select dealer\"]");
		WaitVisibliltyOfLocated(errorLocator);
		WebElement errorElement=driver.findElement(errorLocator);		
		softAssert.assertTrue(errorElement.isDisplayed(),"Error message should be displayed for mandatory field.");
		
        softAssert.assertAll();
        By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
		System.out.println(greenColor + "Call Me Test Case : 42 Passed " + resetGreenColor);
		
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 42 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 42 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callAddClaimDealFieldMandotory");
		
		
	}
	
	@Test(priority = 43)
	public void callAddClaimCustNameFieldMandotory()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Claim/Add");
		By addClaimLocator = By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[1]/div/div/button[1]");
		click(addClaimLocator);
		By submitButtonLocator=By.xpath("//button[@class=\"btn btn-success\"]");
		click(submitButtonLocator);
		By errorLocator=By.xpath("//div[text()=\"Please enter customer name\"]");
		WaitVisibliltyOfLocated(errorLocator);
		WebElement errorElement=driver.findElement(errorLocator);		
		softAssert.assertTrue(errorElement.isDisplayed(),"Error message should be displayed for mandatory field.");
		
        softAssert.assertAll();
        By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
		System.out.println(greenColor + "Call Me Test Case : 43 Passed " + resetGreenColor);
		
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 43 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 43 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callAddClaimCustNameFieldMandotory");
	}
	
	@Test(priority = 44)
	public void callAddClaimCustContactFieldMandotory()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Claim/Add");
		By addClaimLocator = By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[1]/div/div/button[1]");
		click(addClaimLocator);
		By submitButtonLocator=By.xpath("//button[@class=\"btn btn-success\"]");
		click(submitButtonLocator);
		By errorLocator=By.xpath("//div[text()=\"Please enter customer number\"]");
		WaitVisibliltyOfLocated(errorLocator);
		WebElement errorElement=driver.findElement(errorLocator);		
		softAssert.assertTrue(errorElement.isDisplayed(),"Error message should be displayed for mandatory field.");
		
        softAssert.assertAll();
        By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
		System.out.println(greenColor + "Call Me Test Case : 44 Passed " + resetGreenColor);
		
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 44 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 44 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callAddClaimCustContactFieldMandotory");
	}
	
	@Test(priority = 45)
	public void callAddClaimAddressFieldMandotory()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Claim/Add");
		By addClaimLocator = By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[1]/div/div/button[1]");
		click(addClaimLocator);
		By submitButtonLocator=By.xpath("//button[@class=\"btn btn-success\"]");
		click(submitButtonLocator);
		By errorLocator=By.xpath("//div[text()=\"Please enter site address\"]");
		WaitVisibliltyOfLocated(errorLocator);
		WebElement errorElement=driver.findElement(errorLocator);		
		softAssert.assertTrue(errorElement.isDisplayed(),"Error message should be displayed for mandatory field.");
		
        softAssert.assertAll();
        By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
		System.out.println(greenColor + "Call Me Test Case : 45 Passed " + resetGreenColor);
		
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 45 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 45 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callAddClaimAddressFieldMandotory");
		
	}
	
	@Test(priority = 46)
	public void callAddClaimProductFieldMandotory()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Claim/Add");
		By addClaimLocator = By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[1]/div/div/button[1]");
		click(addClaimLocator);
		By submitButtonLocator=By.xpath("//button[@class=\"btn btn-success\"]");
		click(submitButtonLocator);
		By errorLocator=By.xpath("//div[text()=\"Please select product\"]");
		WaitVisibliltyOfLocated(errorLocator);
		WebElement errorElement=driver.findElement(errorLocator);		
		softAssert.assertTrue(errorElement.isDisplayed(),"Error message should be displayed for mandatory field.");
		
        softAssert.assertAll();
        By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
		System.out.println(greenColor + "Call Me Test Case : 46 Passed " + resetGreenColor);
		
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 46 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 46 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callAddClaimProductFieldMandotory");
		
	}
	
	@Test(priority = 47)
	public void callAddClaimPointsFieldMandotory()
	{
		try
		{
	SoftAssert softAssert = new SoftAssert();
	functions = new CommanFunctions(driver);
	functions.transactionButtons("Claim/Add");
	By addClaimLocator = By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[1]/div/div/button[1]");
	click(addClaimLocator);
	By submitButtonLocator=By.xpath("//button[@class=\"btn btn-success\"]");
	click(submitButtonLocator);
	By errorLocator=By.xpath("//div[text()=\"Please enter points\"]");
	WaitVisibliltyOfLocated(errorLocator);
	WebElement errorElement=driver.findElement(errorLocator);		
	softAssert.assertTrue(errorElement.isDisplayed(),"Error message should be displayed for mandatory field.");
	
    softAssert.assertAll();
    By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
	click(crossIconLocator);
	System.out.println(greenColor + "Call Me Test Case : 47 Passed " + resetGreenColor);
	
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 47 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 47 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
	TestCaseTracker.markAsExecuted("callAddClaimPointsFieldMandotory");
		
	}
	
	@Test(priority = 48)
	public void callAddClaimQtyFieldMandotory()
	{
		try
		{
	SoftAssert softAssert = new SoftAssert();
	functions = new CommanFunctions(driver);
	functions.transactionButtons("Claim/Add");
	By addClaimLocator = By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[1]/div/div/button[1]");
	click(addClaimLocator);
	By submitButtonLocator=By.xpath("//button[@class=\"btn btn-success\"]");
	click(submitButtonLocator);
	By errorLocator=By.xpath("//div[text()=\"Please enter qty\"]");
	WaitVisibliltyOfLocated(errorLocator);
	WebElement errorElement=driver.findElement(errorLocator);		
	softAssert.assertTrue(errorElement.isDisplayed(),"Error message should be displayed for mandatory field.");
	
    softAssert.assertAll();
    By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
	click(crossIconLocator);
	System.out.println(greenColor + "Call Me Test Case : 48 Passed " + resetGreenColor);
	
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 48 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 48 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
	TestCaseTracker.markAsExecuted("callAddClaimQtyFieldMandotory");
		
	}
	
	
	
	@Test(priority = 49)
	public void callAddClaimNotSelectProductClickAddButton()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Claim/Add");
		By addClaimLocator = By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[1]/div/div/button[1]");
		click(addClaimLocator);
		
		By addProductButtonLocator=By.xpath("//html/body/div[2]/div/div[1]/div/div/form/div[2]/div[3]/div/div/button");
		click(addProductButtonLocator);
		By errorLocator=By.xpath("//div[text()=\"The first row is empty. Fill the first row before adding a new row.\"]");
		WaitVisibliltyOfLocated(errorLocator);
		WebElement errorElement=driver.findElement(errorLocator);		
		softAssert.assertTrue(errorElement.isDisplayed(),"If product field is blank & still added new product Error message should be displayed .");
		
		softAssert.assertAll();
		
		WaitInVisibliltyOfLocated(errorLocator);
	    By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
		System.out.println(greenColor + "Call Me Test Case : 49 Passed " + resetGreenColor);
		
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 49 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 49 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callAddClaimNotSelectProductClickAddButton");
		
	}
	
	@Test(priority = 50)
	public void callAddClaimNotSelectProductClickDeleteButton()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Claim/Add");
		By addClaimLocator = By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[1]/div/div/button[1]");
		click(addClaimLocator);
		
		By deleteProductButtonLocator=By.xpath("//button[@title=\"click to delete row\"]");
		click(deleteProductButtonLocator);
		By errorLocator=By.xpath("//div[text()=\"Your are not able to delete all product. At least one product is required\"]");
		WaitVisibliltyOfLocated(errorLocator);
		WebElement errorElement=driver.findElement(errorLocator);		
		softAssert.assertTrue(errorElement.isDisplayed(),"While Delete Product atlist one product should be added..");
		
		softAssert.assertAll();
		WaitInVisibliltyOfLocated(errorLocator);
	    By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
		System.out.println(greenColor + "Call Me Test Case : 50 Passed " + resetGreenColor);
		
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 50 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 50 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callAddClaimNotSelectProductClickDeleteButton");
		
	}
	
	
	
	
	@Test(priority = 51, dataProvider = "customerData")
	public void callEnterClaimData(String dealerCode, String invNo, String invoiceDate, String customerName,
			String customerContact, String customerAddress, String filePath) throws InterruptedException 

	{
		try
		{
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Claim/Add");
		By addClaimLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[1]/div/div/button[1]");
		click(addClaimLocator);

		//call method for enter customers details on add claim page
		functions.claimCustomerDetails(dealerCode, invNo, invoiceDate, customerName, customerContact, customerAddress,
				filePath);
	
		System.out.println(greenColor + "Call Me Test Case : 51 Passed " + resetGreenColor);
		
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 51 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 51 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		TestCaseTracker.markAsExecuted("callEnterClaimData");

	}
	
	

	
	

	@Test(priority = 52, dataProvider = "productData")
	public void callAddClaimProducts(String productCodeValue, String productQty) throws InterruptedException   {

		try
		{
		//call method to add products
		functions.claimProducts(productCodeValue, productQty);
        Thread.sleep(2000);
		// Click on + button to add another product
		if (i < productData().length) {
			By addProductButtonLocator=By.xpath("//html/body/div[2]/div/div[1]/div/div/form/div[2]/div[3]/div/div/button");
			click(addProductButtonLocator);
			i++;
		}
		
		
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 52 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 52 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		System.out.println(greenColor + "Call Me Test Case : 52 Passed " + resetGreenColor);
		TestCaseTracker.markAsExecuted("callAddClaimProducts");
	}
	
	

	@Test(priority = 53)
	public void verifyCallClaimTotalPoints() 
	{ 
		try
		{
		SoftAssert softAssert = new SoftAssert();
        //Get Count of rows
		
		List<WebElement> rowsCountLocator=driver.findElements(By.xpath("//table[@class=\"table table-sm table-bordered border-secondary mb-2 table-centered table\"]/tbody/tr"));
		System.out.println("rowsCountLocator : "+ rowsCountLocator.size());
		for(int i=1; i<rowsCountLocator.size(); i++)
		
		{
			Thread.sleep(3000);
			//Get Points Value
			By pointsLocator=By.xpath("//table[@class=\"table table-sm table-bordered border-secondary mb-2 table-centered table\"]/tbody/tr["+i+"]/td[3]/input");
			String pointsValue=driver.findElement(pointsLocator).getAttribute("value");
			int points = Integer.parseInt(pointsValue);
			System.out.println("Points :" +points);
			
			
			//Get Qty value
			By qtyLocator=By.xpath("//table[@class=\"table table-sm table-bordered border-secondary mb-2 table-centered table\"]/tbody/tr["+i+"]/td[4]/input");
			String qtyValue=driver.findElement(qtyLocator).getAttribute("value");
			int qty = Integer.parseInt(qtyValue);
			System.out.println("Qty :"+qty);
			 
			int totalPoints= points*qty;
			int expectedTotalPoints=totalPoints/1000;
			System.out.println("Expected Total Points : "+expectedTotalPoints);
			
			
			//Get Total Points Value
			By totalPointsLocator=By.xpath("//table[@class=\"table table-sm table-bordered border-secondary mb-2 table-centered table\"]/tbody/tr["+i+"]/td[5]/input");
			String toatlPointsValue=driver.findElement(totalPointsLocator).getAttribute("value");
			int actualTotalPoints = Integer.parseInt(toatlPointsValue);
			System.out.println("Actual Total Points :" +actualTotalPoints);
			softAssert.assertEquals(actualTotalPoints,expectedTotalPoints,"Total Points are incorrect");
			
		
		}
		softAssert.assertAll();
		System.out.println(greenColor + "Call Me Test Case : 53 Passed " + resetGreenColor);
		
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 53 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 53 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("verifyCallClaimTotalPoints");
		
	}
	

	@Test(priority = 54)
	public void callSubmitClaim()

	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		By submitButton = By.xpath("//button[text()=\"Submit\"]");
		click(submitButton);
		By successLocator=By.xpath("//h2[@id=\"swal2-title\"]");
		WaitVisibliltyOfLocated(successLocator);
		
		String successMsg = driver.findElement(successLocator).getText();
		System.out.println(successMsg);
		String[] parts = successMsg.split(" ");
		generatedClaimID = parts[2]; // This will be "C25202.."
		softAssert.assertTrue(successMsg.contains("Submitted Successfully"),"Test Failed : Claim Not getting Submit");

		// click on OK button
		By okButton = By.xpath("//button[text()=\"OK\"]");
		click(okButton);

		// Call assertAll to aggregate the results
		softAssert.assertAll();
		System.out.println(greenColor + "Call Me Test Case : 54 Passed " + resetGreenColor);
		
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 54 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 54 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callSubmitClaim");

	}
	
	
	@Test(priority = 55)
	public void verifyCallClaimSubmitNavigateToClaimStatus()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		By claimStatusLable = By.xpath("//h6[@class=\"my-0\"]/label");
		WaitVisibliltyOfLocated(claimStatusLable);
		WebElement claimStatusLableElement = driver.findElement(claimStatusLable);
		softAssert.assertTrue(claimStatusLableElement.isDisplayed(), "Not Navigate to Claim Status Page");

		softAssert.assertAll();
		By crossIconLocator = By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1]/div[5]/button/i");
		click(crossIconLocator);
		System.out.println(greenColor + "Call Me Test Case : 55 Passed " + resetGreenColor);
		
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 55 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 55 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("verifyCallClaimSubmitNavigateToClaimStatus");
		
	}
	

	@Test(priority = 56, alwaysRun = true)
	public void verifyCallAddedClaim() throws InterruptedException {
		try
		{
		// Verify added claim in claim Status Details
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Claim/Add");
		By claimStausLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[1]/div/div/button[2]");
		click(claimStausLocator);
		String claimId = null;
		boolean getActualId = false;

		By claimIdLocator =By.xpath("//div[@id=\"cell-2-undefined\"]/a");
		WaitVisibliltyOfLocated(claimIdLocator);
		// get claim Code from claim status
		List<WebElement> claimIdElements = driver.findElements(By.xpath("//div[@id=\"cell-2-undefined\"]/a"));

		System.out.println(generatedClaimID);

		for (WebElement claimIdElement : claimIdElements) {
			claimId = claimIdElement.getText();

			if (claimId.contains(generatedClaimID)) {

				getActualId = true;
				break;
			}

		}

		if (!getActualId) {
			softAssert.assertTrue(claimId.contains(generatedClaimID),
					"Test Failed : verifyAddedClaim - Added claim not showing on claim status");
		}

		else {
			System.out.println("Claim Id : " + generatedClaimID + " Verified Successfully.");
		}

		
		softAssert.assertAll();
		// click on cross button of claim status page
		By crossIconLocator = By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1]/div[5]/button/i");
		click(crossIconLocator);
		System.out.println(greenColor + "Call Me Test Case : 56 Passed " + resetGreenColor);
		
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 56 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 56 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}

		TestCaseTracker.markAsExecuted("verifyCallAddedClaim");
	}
	
	
	
	
	@Test(priority = 57, alwaysRun = true)
	public void openCallClaimStatusPDF() throws InterruptedException
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Claim/Add");
		By claimStausLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[1]/div/div/button[2]");
		click(claimStausLocator);
		
		Thread.sleep(2000);
		By viewClaimPDFLocator=By.xpath("//div[@id=\"row-0\"]/div[2]/a");
		click(viewClaimPDFLocator);
		By claimStatusPDFLable=By.xpath("//label[text()=\"Claim Status PDF\"]");
		WaitVisibliltyOfLocated(claimStatusPDFLable);
		WebElement claimStatusPDFLableElement=driver.findElement(claimStatusPDFLable);
		softAssert.assertTrue(claimStatusPDFLableElement.isDisplayed(),"View Claim Status PDF not Geeting Open");
		
		softAssert.assertAll();
		System.out.println(greenColor + "Call Me Test Case : 57 Passed " + resetGreenColor);
		
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 57 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 57 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("openCallClaimStatusPDF");
		
		
	}
	
	@Test(priority = 58, alwaysRun = true)
	public void callClaimStatusPDFCrossClick() throws InterruptedException
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		boolean status=true;
		By crossIconLocator = By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[1]/div[5]/button/i");
		click(crossIconLocator);
		try
		{
			By claimStatusPDFLable=By.xpath("//label[text()=\"Claim Status PDF\"]");
		WebElement claimStatusPDFLableElement=driver.findElement(claimStatusPDFLable);
		if(claimStatusPDFLableElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
			
		}
		 if(!status)
		 {
			 softAssert.fail("Claim Status PDF Cross button not clickable");
		 }
        softAssert.assertAll();
        By claimStatusCrossLocator = By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1]/div[5]/button/i");
		click(claimStatusCrossLocator);
		System.out.println(greenColor + "Call Me Test Case : 58 Passed " + resetGreenColor);
		
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 58 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 58 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callClaimStatusPDFCrossClick");
				
	}
	
	
	@Test(priority = 59, alwaysRun = true)
	public void callClaimStatusNameFilter()
	{	
		
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Claim/Add");
		By claimStausLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[1]/div/div/button[2]");
		click(claimStausLocator);
		By searchFilterLocator=By.id("search");
		WaitVisibliltyOfLocated(searchFilterLocator);
		driver.findElement(searchFilterLocator).sendKeys("Claim Status");
		
		By noRecordsLableLocator = By.xpath("//div[text()=\"There are no records to display\"]");
		WaitVisibliltyOfLocated(noRecordsLableLocator);
		WebElement noRecordsLableElement=driver.findElement(noRecordsLableLocator);
		softAssert.assertTrue(noRecordsLableElement.isDisplayed(),"Claim Status Filter Name not working");
		
		softAssert.assertAll();
		By crossIconLocator=By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1]/div[5]/button/i");
		click(crossIconLocator);
		System.out.println(greenColor + "Call Me Test Case : 59 Passed " + resetGreenColor);
		
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 59 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 59 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callClaimStatusNameFilter");
		
	}
	
	@Test(priority = 60, alwaysRun = true)
	public void callClaimStatusFilterIconClick()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Claim/Add");
		By claimStausLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[1]/div/div/button[2]");
		click(claimStausLocator);
		
		By claimStausFiltericonLocator=By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1]/div[4]/button/i");
		click(claimStausFiltericonLocator);
		By filterLableLocator = By.xpath("//span[text()=\"Filter\"]");
		WaitVisibliltyOfLocated(filterLableLocator);
		WebElement filterLableElement=driver.findElement(filterLableLocator);
		softAssert.assertTrue(filterLableElement.isDisplayed()," Filter Icon not working");
		
		softAssert.assertAll();
		System.out.println(greenColor + "Call Me Test Case : 60 Passed " + resetGreenColor);
		
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 60 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 60 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callClaimStatusFilterIconClick");
		
	}
	
	@Test(priority = 61, alwaysRun = true)
	public void callClaimStatusFilterCrossClick()
	{
		try
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
        By claimStatusCrossLocator = By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1]/div[5]/button/i");
		click(claimStatusCrossLocator);
		System.out.println(greenColor + "Call Me Test Case : 61 Passed " + resetGreenColor);
		
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 61 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 61 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callClaimStatusFilterCrossClick");
		
	}
	
	
	@Test(priority = 62, alwaysRun = true)
	public void callRedemptionGiftMandatoryField()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Redemption");
		By addRedemptionLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[2]/div/div/button[1]");
		click(addRedemptionLocator);
		By submitButtonLocator=By.xpath("//button[@class=\"btn btn-success\"]");
		click(submitButtonLocator);
		
		By errorLocator=By.xpath("//div[text()=\"Please select Gift\"]");
		WaitVisibliltyOfLocated(errorLocator);
		WebElement errorElement=driver.findElement(errorLocator);		
		softAssert.assertTrue(errorElement.isDisplayed(),"Error message should be displayed for mandatory field.");
		
        softAssert.assertAll();
        By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
		System.out.println(greenColor + "Call Me Test Case : 62 Passed " + resetGreenColor);
		
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 62 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 62 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callRedemptionGiftMandatoryField");
		
	}
	
	@Test(priority = 63, alwaysRun = true)
	public void callRedemptionQtyMandatoryField()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Redemption");
		By addRedemptionLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[2]/div/div/button[1]");
		click(addRedemptionLocator);
		By submitButtonLocator=By.xpath("//button[@class=\"btn btn-success\"]");
		click(submitButtonLocator);
		
		By errorLocator=By.xpath("//div[text()=\"Please enter quantity\"]");
		WaitVisibliltyOfLocated(errorLocator);
		WebElement errorElement=driver.findElement(errorLocator);		
		softAssert.assertTrue(errorElement.isDisplayed(),"Error message should be displayed for mandatory field.");
		
        softAssert.assertAll();
        By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
		System.out.println(greenColor + "Call Me Test Case : 63 Passed " + resetGreenColor);
		
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 63 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 63 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callRedemptionQtyMandatoryField");
	}	
	
	
	
	
	@Test(priority = 64, dataProvider="redemptionData", alwaysRun = true)
	public void callRedemptionPoints(String rewardCode, String rewardQty)
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Redemption");
		By addRedemptionLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[2]/div/div/button[1]");
		click(addRedemptionLocator);
		//click on Gift Dropdown
		By giftFieldLocator=By.xpath("//div[@class=\" css-hlgwow\"]");
		click(giftFieldLocator);
		
		//Select Gift
		By giftDropDownLocator=By.xpath("//div[@class=\" css-qr46ko\"]/div");
		listContains(giftDropDownLocator, rewardCode);
		
		//Enter gift Qty
		driver.findElement(By.id("QUANTITY")).sendKeys(rewardQty);
		
		int qty = Integer.parseInt(rewardQty);
		System.out.println("Reward Qty : " + qty);
		
		//Get Reward Points value
		String stringRewardPoints=driver.findElement(By.xpath("//html/body/div[2]/div/div[1]/div/div/form/div[2]/div[1]/div[2]/span")).getText();
		 String[] parts = stringRewardPoints.split(":");
	     String digitPart = parts[1].trim();
		int rewardPoints = Integer.parseInt(digitPart);
		System.out.println("Reward Points : " + rewardPoints);
		
		//Redemption Pints=Qty * rewardPoints
		 expectedRedemptionPoints= qty * rewardPoints;
		System.out.println("Expected Redemption Points : " + expectedRedemptionPoints);
		
		//Get Redemption Points
		By redemptionPointsLocator=By.xpath("//html/body/div[2]/div/div[1]/div/div/form/div[2]/div[1]/div[3]/input");
		String redemptionPointsValue=driver.findElement(redemptionPointsLocator).getAttribute("value");
		int actualRedemptionPoints = Integer.parseInt(redemptionPointsValue);
		System.out.println("Actual Redemption Points : " + actualRedemptionPoints);
		
         softAssert.assertEquals(actualRedemptionPoints,expectedRedemptionPoints,"Redemption Points showing Incorrect.");
        softAssert.assertAll();
        
        //get locked points  
        String stringLockedPoints=driver.findElement(By.xpath("//span[@class=\"rounded-pill bg-warning badge bg-secondary font-size-12\"]")).getText();
		 String[] lockedStringParts = stringLockedPoints.split(":");
	     String lockedDigitPart = lockedStringParts[1].trim();
		 oldLockedPoints = Integer.parseInt(lockedDigitPart);
		System.out.println(" Old Locked Points : " + oldLockedPoints);
		
		//get Reedemable points  
        String stringReedemablePoints=driver.findElement(By.xpath("//span[@class=\"rounded-pill bg-success badge bg-secondary font-size-12\"]")).getText();
		 String[] reedemableStringParts = stringReedemablePoints.split(":");
	     String reedemableDigitPart = reedemableStringParts[1].trim();
		 oldReedemablePoints = Integer.parseInt(reedemableDigitPart);
		System.out.println(" Old Reedemable Points : " + oldReedemablePoints);
		
		//get Total points  
        String stringTotalPoints=driver.findElement(By.xpath("//span[@class=\"rounded-pill bg-info badge bg-secondary font-size-12\"]")).getText();
		 String[] totalStringParts = stringTotalPoints.split(":");
	     String totalDigitPart = totalStringParts[1].trim();
		 oldTotalPoints = Integer.parseInt(totalDigitPart);
		System.out.println(" Old Total Points : " + oldTotalPoints);
		
		System.out.println(greenColor + "Call Me Test Case : 64 Passed " + resetGreenColor);
		
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 64 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 64 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
        TestCaseTracker.markAsExecuted("callRedemptionPoints");
	
		
	}
	
	
	@Test(priority = 65, alwaysRun = true)
	public void callSubmitRedemption()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		By submitButtonLocator=By.xpath("//button[@class=\"btn btn-success\"]");
		click(submitButtonLocator);
		By successLocator=By.xpath("//h2[text()=\"Redemption  Submitted Successfully.\"]");	
		WaitVisibliltyOfLocated(successLocator);
		WebElement successMsg=driver.findElement(successLocator);
       softAssert.assertTrue(successMsg.isDisplayed(),"Redemption Not getting submit.");
		
        softAssert.assertAll();
        By okButtonLocator=By.xpath("//button[text()=\"OK\"]");
        click(okButtonLocator);
        System.out.println(greenColor + "Call Me Test Case : 65 Passed " + resetGreenColor);
        
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 65 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 65 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
        TestCaseTracker.markAsExecuted("callSubmitRedemption");
		
		
	}
	
	@Test(priority = 66, alwaysRun = true)
	public void callRedemptionSubmitNavigation()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		By redemptionHistoryLable=By.xpath("//h6[@class=\"my-0\"]/label");
		WaitVisibliltyOfLocated(redemptionHistoryLable);
		WebElement redemptionHistoryLocator=driver.findElement(redemptionHistoryLable);
		 softAssert.assertTrue(redemptionHistoryLocator.isDisplayed(),"After Submit Redemption navigate to history page");
			
	      softAssert.assertAll();
	      By crossIconLocator=By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1]/div[5]/div/button/i");
			click(crossIconLocator);
			
			System.out.println(greenColor + "Call Me Test Case : 66 Passed " + resetGreenColor);
			
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 66 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 66 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
	      TestCaseTracker.markAsExecuted("callRedemptionSubmitNavigation");
	}
	
	@Test(priority = 67, alwaysRun = true)
	public void callRedemptionLockedPoints()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Redemption");
		By addRedemptionLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[2]/div/div/button[1]");
		click(addRedemptionLocator);
		
		int newExpectedLockedPoints=oldLockedPoints + expectedRedemptionPoints;
		System.out.println("Expected Locked Points : " +newExpectedLockedPoints);
		
		//get  new locked points
		By lockedPointsLocator=By.xpath("//span[@class=\"rounded-pill bg-warning badge bg-secondary font-size-12\"]");
		WaitVisibliltyOfLocated(lockedPointsLocator);
        String stringNewLockedPoints=driver.findElement(lockedPointsLocator).getText();
		 String[] newLockedStringParts = stringNewLockedPoints.split(":");
	     String newLockedDigitPart = newLockedStringParts[1].trim();
		 newLockedPoints = Integer.parseInt(newLockedDigitPart);
		System.out.println(" New Locked Points : " + newLockedPoints);
		By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
		softAssert.assertEquals(newLockedPoints,newExpectedLockedPoints,"Locked Points are incorrect.");
	     softAssert.assertAll();
	     System.out.println(greenColor + "Call Me Test Case : 67 Passed " + resetGreenColor);
	     
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 67 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 67 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
	     TestCaseTracker.markAsExecuted("callRedemptionLockedPoints");
		
		
		
		
	}
	
	@Test(priority = 68, alwaysRun = true)
	public void callRedemptionRedeemablePoints()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Redemption");
		By addRedemptionLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[2]/div/div/button[1]");
		click(addRedemptionLocator);
		
		int newExpectedReedemablePoints=oldReedemablePoints-expectedRedemptionPoints;
		System.out.println("Expected Reedemable Points : " +newExpectedReedemablePoints);
		//get Reedemable points 
		By ReedemablePointsLocator=By.xpath("//span[@class=\"rounded-pill bg-success badge bg-secondary font-size-12\"]");
		WaitVisibliltyOfLocated(ReedemablePointsLocator);
        String stringReedemablePoints=driver.findElement(ReedemablePointsLocator).getText();
		 String[] reedemableStringParts = stringReedemablePoints.split(":");
	     String reedemableDigitPart = reedemableStringParts[1].trim();
		 newReedemablePoints = Integer.parseInt(reedemableDigitPart);
		System.out.println("New Reedemable Points : " + newReedemablePoints);
		
		By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
		softAssert.assertEquals(newReedemablePoints,newExpectedReedemablePoints,"Reedamable Points are incorrect.");
		
	      softAssert.assertAll();
	      
	      System.out.println(greenColor + "Call Me Test Case : 68 Passed " + resetGreenColor);
	      
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 68 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 68 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
	      TestCaseTracker.markAsExecuted("callRedemptionRedeemablePoints");
		
	}
	
	@Test(priority = 69, alwaysRun = true)
	public void callRedemptionTotalPoints()
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Redemption");
		By addRedemptionLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[2]/div/div/button[1]");
		click(addRedemptionLocator);
		
		int newExpectedTotalPoints=newLockedPoints+newReedemablePoints;
		System.out.println("Expected Total Points : " +newExpectedTotalPoints);
		//get Total points  
		By toatalPointsLocator=By.xpath("//span[@class=\"rounded-pill bg-info badge bg-secondary font-size-12\"]");
		WaitVisibliltyOfLocated(toatalPointsLocator);
        String stringNewTotalPoints=driver.findElement(toatalPointsLocator).getText();
		 String[] totalStringParts = stringNewTotalPoints.split(":");
	     String totalDigitPart = totalStringParts[1].trim();
		int newTotalPoints = Integer.parseInt(totalDigitPart);
		System.out.println("New Total Points : " + newTotalPoints);
		
		By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
		 softAssert.assertEquals(newTotalPoints,newExpectedTotalPoints,"Total Points are incorrect.");
	      softAssert.assertAll();
	      System.out.println(greenColor + "Call Me Test Case : 69 Passed " + resetGreenColor);
	      
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 69 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 69 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
	 	   TestCaseTracker.markAsExecuted("callRedemptionTotalPoints");
		
	}	
	
	
	
	
	@Test(priority = 70, alwaysRun = true)
	public void callMeRedial() throws InterruptedException

	{ 
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		String oldTaskNo = functions.getTaskNo();
		// click on Redial button
		functions.callActionButton("Redial");
		Thread.sleep(9000);
		String newTaskNo = functions.getTaskNo();
		softAssert.assertEquals(newTaskNo, oldTaskNo, "Test Failed : Redial button not working properly");
		 
		
	    softAssert.assertAll();
	    System.out.println(greenColor + "Call Me Test Case : 70 Passed " + resetGreenColor);
	    
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 70 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 70 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		TestCaseTracker.markAsExecuted("callMeRedial");
		

	}
	
	
	
	
	@Test(priority = 71, alwaysRun = true)
	public void callMeBack() throws InterruptedException
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		backButtonTaskNo =functions.getTaskNo();
		Thread.sleep(9000);
		functions.callActionButton("Back");
		//verify Dial Next button display or not
		By dialNextElement= (By.xpath("//*[contains(text(),\"Dial Next\")]"));
		WaitVisibliltyOf(dialNextElement);
		 WebElement dialNext=driver.findElement(dialNextElement);
		 softAssert.assertTrue(dialNext.isDisplayed(),"Test Failed :callMeBack- Back Button Not working proper");
		// Call assertAll to aggregate the results
			softAssert.assertAll();
			System.out.println(greenColor + "Call Me Test Case : 71 Passed " + resetGreenColor);
			
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 71 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 71 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
			TestCaseTracker.markAsExecuted("callMeBack");
		 
	}
	
	@Test(priority = 72, alwaysRun = true)
	public void callMeBackTaskStatus() 
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
				System.out.println("Dashboard Task status CallMe-BackButton : "+taskStatus);
				softAssert.assertEquals(taskStatus, "Pending", " Test Failed : callMeBackTaskStatus");
				status=true;
				 break;
			}
			
		}
		if (!status) {
			softAssert.fail("Call Me- callMeBackTaskStatus Task no : " + backButtonTaskNo + " not found");
		}
		
		softAssert.assertAll();
		System.out.println(greenColor + "Call Me Test Case : 72 Passed " + resetGreenColor); 
		
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 72 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 72 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		 TestCaseTracker.markAsExecuted("callMeBackTaskStatus");
		
		}
		
		
   
	
	@Test(priority = 73, alwaysRun = true)
	public void verifyCallBackButtonDialNext() throws InterruptedException
	{  
		try
		{
		dialerPage=new DialerLoginPage(driver);
		//Verify after back task when click on dial next then same task should be open
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.dialNextClick();
		
		functions.checkErrorToast();
			 
		String newTaskNo= functions.getTaskNo();
		softAssert.assertEquals(newTaskNo, backButtonTaskNo,"Test Failed : verifyCallBackButtonDialNext -incorrect call connect");
		
		softAssert.assertAll();
		System.out.println(greenColor + "Call Me Test Case : 73 Passed " + resetGreenColor);
		
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 73 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 73 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
	   TestCaseTracker.markAsExecuted("verifyCallBackButtonDialNext");
		
	}
	
	
	
	@Test(priority = 74, alwaysRun = true)
	public void callMeHangUp() throws InterruptedException
	{
		try
		{
		SoftAssert softAssert = new SoftAssert();
     
		Thread.sleep(3000);
		functions = new CommanFunctions(driver);
		 hangUpTaskNo=functions.getTaskNo();
		functions.callActionButton("Hangup");
		By loaderElement=By.xpath("// div[@id=\"loader-container\"]/p");
		WaitVisibliltyOfLocated(loaderElement);
		String loaderMsg=driver.findElement(loaderElement).getText();
		System.out.println(loaderMsg);

		softAssert.assertNotEquals(loaderMsg,"New Call Connecting", "Test Faild : callMeHangUp");
		WaitInVisibliltyOfLocated(loaderElement);
		softAssert.assertAll();
		System.out.println(greenColor + "Call Me Test Case : 74 Passed " + resetGreenColor);
		
		}catch (AssertionError ae) {
		      
		     System.out.println(redColor + "Call Me Test Case : 74 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	     }catch(Exception e)
	 		{
	 			System.out.println(redColor+" Call Me Test Case : 74 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		}
		
		 TestCaseTracker.markAsExecuted("callMeHangUp");
				
	}
	
	
	
	
	    @Test(priority = 75, alwaysRun = true)
		public void callMecloseTaskSubmitBreak() throws InterruptedException, IOException
		{      
	    	
	    	SoftAssert softAssert = new SoftAssert();
		       functions = new CommanFunctions(driver); 
		       manager=new TaskTypeManager(driver);
			String taskType=functions.getTaskTypeFromApplication();
	 		if(taskType.equals("Call Me - Customer Request for TC to Call.") )
	 		{  	
			
			try
			{
			String callMeTaskNo =functions.getTaskNo();
			System.out.println("CallMe Task No For Close Task By Submit & Break Button  : " +callMeTaskNo);
			functions.callActionButton("Close Task");
		
			
			//Enter close task remark
			By remarkLocator=By.id("REMARK");
			sendkeys(By.id("REMARK"),"Close  Call Me Task");
		   
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
		    Thread.sleep(2000);
			
			boolean status=false;
			 
			//get task no from dashboard
			List<WebElement> taskNoElements=driver.findElements(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a"));
			for(int i=1; i<=taskNoElements.size();i++)
			 {  
				By taskNoElement=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div/a");
				WaitVisibliltyOf(taskNoElement);
				String taskNo=driver.findElement(taskNoElement).getText();
				 
				if(taskNo.equals(callMeTaskNo))
				{
					System.out.println("Dashboard Task No For Close Task By Submit & Break Button :" +taskNo);
					//get task Status from dashboard
					String taskStatus=driver.findElement(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div[8]/div")).getText();
					System.out.println("Dashboard Task Status CallMe-Close Task :"+taskStatus);
					softAssert.assertEquals(taskStatus, "Closed", " Test Failed : callMecloseTaskSubmitBreak");
					status=true;
					 break;
				} 
				
			}
			if (!status) {
				softAssert.fail("Call Me- closed Task No : " + callMeTaskNo + " not found");
			}

			// Call assertAll to aggregate the results
			softAssert.assertAll();
			System.out.println(greenColor + "Call Me Test Case : 75 Passed " + resetGreenColor);
			
			}catch (AssertionError ae) {
			      
			     System.out.println(redColor + "Call Me Test Case : 75 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
		     }catch(Exception e)
		 		{
		 			System.out.println(redColor+" Call Me Test Case : 75 Failed.\n Exception : " + e.getMessage()+ resetColor);
		 		}
			
			TestCaseTracker.markAsExecuted("callMecloseTaskSubmitBreak");
		}
		else
		 {
			System.out.println("Task Type is not Call Me");
			manager.executeTask();
		 }
	 		
	    
		}
		
	    
		@Test(priority = 76, alwaysRun = true)
		public void callMecloseTaskSubmit() throws InterruptedException, IOException
		{
			
			SoftAssert softAssert = new SoftAssert();
			functions = new CommanFunctions(driver);
			 manager=new TaskTypeManager(driver);
			String taskType=functions.getTaskTypeFromApplication();
	 		if(taskType.equals("Call Me - Customer Request for TC to Call.") )
	 		{  	
			try
			{
			String oldTaskNo =functions.getTaskNo();
			System.out.println("CallMe Task No For Close Task By Submit Button  : " +oldTaskNo);
			functions.callActionButton("Close Task");
	         
			//Enter close task remark
			By remarkLocator=By.id("REMARK");
			sendkeys(By.id("REMARK"),"Close  Call Me Task");
		   
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
		    Thread.sleep(2000);
		    
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
				   softAssert.assertNotEquals(newTaskNo, oldTaskNo,"Test Failed : callMecloseTaskSubmit ");
			 }
			
				softAssert.assertAll();
				System.out.println(greenColor + "Call Me Test Case : 76 Passed " + resetGreenColor);
				
			}catch (AssertionError ae) {
			      
			     System.out.println(redColor + "Call Me Test Case : 76 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
		     }catch(Exception e)
		 		{
		 			System.out.println(redColor+" Call Me Test Case : 76 Failed.\n Exception : " + e.getMessage()+ resetColor);
		 		}
			
				TestCaseTracker.markAsExecuted("callMecloseTaskSubmit");
	 		}
	 		else
	 		 {
	 			System.out.println("Task Type is not Call Me");
	 			manager.executeTask();
	 		 }
			

		}
	
	
		
		@Test(priority = 77, alwaysRun = true)
		public void callMeRescheduleNotInterestedSubmitBreak() throws InterruptedException, IOException
		{ 
			
			functions = new CommanFunctions(driver);
			SoftAssert softAssert = new SoftAssert();
			 manager=new TaskTypeManager(driver);
			String taskType=functions.getTaskTypeFromApplication();
 		   if(taskType.equals("Call Me - Customer Request for TC to Call.") )
 		  {
			try
			{
 			  callMeNotInterestedTakNo=functions.getTaskNo();
			System.out.println("Task No-Call Me- Reschedule-Not Interested -Submit & break button : "+ callMeNotInterestedTakNo);
			Thread.sleep(1000);
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
					System.out.println(greenColor + "Call Me Test Case : 77 Passed " + resetGreenColor);
					
			}catch (AssertionError ae) {
			      
			     System.out.println(redColor + "Call Me Test Case : 77 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
		     }catch(Exception e)
		 		{
		 			System.out.println(redColor+" Call Me Test Case : 77 Failed.\n Exception : " + e.getMessage()+ resetColor);
		 		}
						TestCaseTracker.markAsExecuted("callMeRescheduleNotInterestedSubmitBreak");
		      }
	 		
	 		else
	 		{
	 			System.out.println("Task type is not  Call Me");
	 			manager.executeTask();
	 		}
	 		
			
			}
		

		@Test(priority = 78, alwaysRun = true)
		public void callMeRescheduleNotInterestedTaskStatus() throws InterruptedException
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
				if(taskNo.equals(callMeNotInterestedTakNo))
				{
					//get task Status from dashboard
					String taskStatus=driver.findElement(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div[8]/div")).getText();
					System.out.println("Dashboard Task status Call Me -Rechedule- Not Interested : "+taskNo + " - "+taskStatus);
					softAssert.assertEquals(taskStatus, "Closed", " If Select Reschedule status Not Interested then task should be closed.");
					status=true;
					 break;
				}
				
			}
			if (!status) {
				softAssert.fail("Call Me- callMeRescheduleNotInterestedTaskStatus Task no : " + callMeNotInterestedTakNo + " not found");
			}
			
			softAssert.assertAll();
			System.out.println(greenColor + "Call Me Test Case : 78 Passed " + resetGreenColor);
			
			}catch (AssertionError ae) {
			      
			     System.out.println(redColor + "Call Me Test Case : 78 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
		     }catch(Exception e)
		 		{
		 			System.out.println(redColor+" Call Me Test Case : 78 Failed.\n Exception : " + e.getMessage()+ resetColor);
		 		}
			
			 TestCaseTracker.markAsExecuted("callMeRescheduleNotInterestedTaskStatus");
			
			}
		
		
		@Test(priority = 79, alwaysRun = true)
		public void callMeRescheduleNotInterestedSubmit() throws InterruptedException, IOException
		{
			
			SoftAssert softAssert = new SoftAssert();
	        functions = new CommanFunctions(driver);
	        manager=new TaskTypeManager(driver);
			String taskType=functions.getTaskTypeFromApplication();
	 		if(taskType.equals("Call Me - Customer Request for TC to Call.") )
	 		{
			        try
			        {
			        String taskNoNotInterestedSubmit=functions.getTaskNo();
			        System.out.println("Task no. of Call Me -Reschedule-Not Interested-Submit button : "+taskNoNotInterestedSubmit);
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
			System.out.println(greenColor + "Call Me Test Case : 79 Passed " + resetGreenColor);
			
			        }catch (AssertionError ae) {
					      
					     System.out.println(redColor + "Call Me Test Case : 79 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
				     }catch(Exception e)
				 		{
				 			System.out.println(redColor+" Call Me Test Case : 79 Failed.\n Exception : " + e.getMessage()+ resetColor);
				 		}
			        
			 TestCaseTracker.markAsExecuted("callMeRescheduleNotInterestedSubmit");
			}
	 		else
	 		{
	 			System.out.println("Task type is not Call Me");
	 			manager.executeTask();
	 		}
			
		}
	 		
		
		
		
		
		@Test(priority = 80, alwaysRun = true)
		public void callMeRescheduleRingNotReceivedSubmitBreak() throws InterruptedException, IOException
		{ 
			
			functions = new CommanFunctions(driver);
			SoftAssert softAssert = new SoftAssert();
			 manager=new TaskTypeManager(driver);
			String taskType=functions.getTaskTypeFromApplication();
 		   if(taskType.equals("Call Me - Customer Request for TC to Call.") )
 		  {
			try
			{
 			 callMeRingNotReceivedTaskNo=functions.getTaskNo();
			System.out.println("Task No-Call Me - Reschedule-Ringing Not Received -Submit & break button : "+ callMeRingNotReceivedTaskNo);
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
					
					System.out.println(greenColor + "Call Me Test Case : 80 Passed " + resetGreenColor);
					
			}catch (AssertionError ae) {
			      
			     System.out.println(redColor + "Call Me Test Case : 80 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
		     }catch(Exception e)
		 		{
		 			System.out.println(redColor+" Call Me Test Case : 80 Failed.\n Exception : " + e.getMessage()+ resetColor);
		 		}
			
						TestCaseTracker.markAsExecuted("callMeRescheduleRingNotReceivedSubmitBreak");
		      }
	 		
	 		else
	 		{
	 			System.out.println("Task type is not Call Me.");
	 			manager.executeTask();
	 		}
 		   
			
			}
		
		
		
		@Test(priority = 81, alwaysRun = true)
		public void callMeRescheduleRingNotReceivedTaskStatus() throws InterruptedException
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
				
				if(taskNo.equals(callMeRingNotReceivedTaskNo))
				{
					System.out.println("Dashboard Task No :" +taskNo);
					//get task Status from dashboard
					String taskStatus=driver.findElement(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div[8]/div")).getText();
					System.out.println("Dashboard Task status Call Me -Rechedule- Ringing Not Received : "+taskNo + " - "+taskStatus);
					softAssert.assertEquals(taskStatus, "Pending", " If Select Reschedule status Ringing Not Received then task should be Pending.");
					status=true;
					 break;
				}
				
			}
			if (!status) {
				softAssert.fail("Call Me - callMeRescheduleRingNotReceivedTaskStatus Task no : " + callMeRingNotReceivedTaskNo + " not found");
			}
			
			softAssert.assertAll();
			System.out.println(greenColor + "Call Me Test Case : 81 Passed " + resetGreenColor);
			
			}catch (AssertionError ae) {
			      
			     System.out.println(redColor + "Call Me Test Case : 81 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
		     }catch(Exception e)
		 		{
		 			System.out.println(redColor+" Call Me Test Case : 81 Failed.\n Exception : " + e.getMessage()+ resetColor);
		 		}
			
			 TestCaseTracker.markAsExecuted("callMeRescheduleRingNotReceivedTaskStatus");
			
			}
		
		
		@Test(priority = 82, alwaysRun = true)
		public void callMeRescheduleRingNotReceivedSubmit() throws InterruptedException, IOException
		{
			
			
			SoftAssert softAssert = new SoftAssert();
	        functions = new CommanFunctions(driver);
	        manager=new TaskTypeManager(driver);
			String taskType=functions.getTaskTypeFromApplication();
	 		if(taskType.equals("Call Me - Customer Request for TC to Call.") )
	 		{
			        try
			        {
			        String taskNoRigNotReceivedSubmit=functions.getTaskNo();
			        System.out.println("Task no. of Call Me -Reschedule-Ring Not Received -Submit button : "+taskNoRigNotReceivedSubmit);
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
						   softAssert.assertTrue(taskPopUp.isDisplayed(), "If Reschedule task by Submit button then next call should be connet. ");
					 }
								
			     softAssert.assertAll();
			     System.out.println(greenColor + "Call Me Test Case : 82 Passed " + resetGreenColor);
			     
			        }catch (AssertionError ae) {
					      
					     System.out.println(redColor + "Call Me Test Case : 82 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
				     }catch(Exception e)
				 		{
				 			System.out.println(redColor+" Call Me Test Case : 82 Failed.\n Exception : " + e.getMessage()+ resetColor);
				 		}
			        
			    TestCaseTracker.markAsExecuted("callMeRescheduleRingNotReceivedSubmit");
			}
	 		else
	 		{
	 			System.out.println("Task type is not Call Me.");
	 			manager.executeTask();
	 		}
	 		
			
	 	
		}
	 		
		
		@Test(priority = 83, alwaysRun = true)
		public void callMeRescheduleCallBackLaterSubmitBreak() throws InterruptedException, IOException
		{ 
			
			functions = new CommanFunctions(driver);
			SoftAssert softAssert = new SoftAssert();
			 manager=new TaskTypeManager(driver);
			String taskType=functions.getTaskTypeFromApplication();
 		   if(taskType.equals("Call Me - Customer Request for TC to Call.") )
 		  {
			try
			{
			callMeCallBackLaterTaskNo=functions.getTaskNo();
			System.out.println("Task No-Call Me- Reschedule-Call Back Later -Submit & break button : "+ callMeCallBackLaterTaskNo);
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
					System.out.println(greenColor + "Call Me Test Case : 83 Passed " + resetGreenColor);
					
			}catch (AssertionError ae) {
			      
			     System.out.println(redColor + "Call Me Test Case : 83 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
		     }catch(Exception e)
		 		{
		 			System.out.println(redColor+" Call Me Test Case : 83 Failed.\n Exception : " + e.getMessage()+ resetColor);
		 		}
			
						TestCaseTracker.markAsExecuted("callMeRescheduleCallBackLaterSubmitBreak");
		      }
	 		
	 		else
	 		{
	 			System.out.println("Task type is not Call Me");
	 			manager.executeTask();
	 		}
			
			}
		
		
		@Test(priority = 84, alwaysRun = true)
		public void callMeRescheduleCallBackLaterTaskStatus() throws InterruptedException
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
				
				if(taskNo.equals(callMeCallBackLaterTaskNo))
				{
					 System.out.println("Dashboard Task No :" +taskNo);
					//get task Status from dashboard
					String taskStatus=driver.findElement(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div[8]/div")).getText();
					System.out.println("Dashboard Task status Call Me -Rechedule- Call Back Later : "+taskNo + " - "+taskStatus);
					softAssert.assertEquals(taskStatus, "Pending", " If Select Reschedule status Call Back Later then task should be Pending.");
					status=true;
					 break;
				}
				
			}
			if (!status) {
				softAssert.fail("Call Me- callMeRescheduleCallBackLaterTaskStatus Task no : " + callMeCallBackLaterTaskNo + " not found");
			}
			
			softAssert.assertAll();
			System.out.println(greenColor + "Call Me Test Case : 84 Passed " + resetGreenColor);
			
			}catch (AssertionError ae) {
			      
			     System.out.println(redColor + "Call Me Test Case : 84 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
		     }catch(Exception e)
		 		{
		 			System.out.println(redColor+" Call Me Test Case : 84 Failed.\n Exception : " + e.getMessage()+ resetColor);
		 		}
			
			 TestCaseTracker.markAsExecuted("callMeRescheduleCallBackLaterTaskStatus");
			
			}
		
		
		@Test(priority = 85, alwaysRun = true)
		public void callMeRescheduleCallBackLaterSubmit() throws InterruptedException, IOException
		{
			
			SoftAssert softAssert = new SoftAssert();
	        functions = new CommanFunctions(driver);
	        manager=new TaskTypeManager(driver);
			String taskType=functions.getTaskTypeFromApplication();
	 		if(taskType.equals("Call Me - Customer Request for TC to Call.") )
	 		{
			        try
			        {
			        String taskNoCallBackLaterSubmit=functions.getTaskNo();
			        System.out.println("Task no. of Call Me -Reschedule  -Call Back Later -Submit button : "+taskNoCallBackLaterSubmit);
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
			System.out.println(greenColor + "Call Me Test Case : 85 Passed " + resetGreenColor);
			
			        }catch (AssertionError ae) {
					      
					     System.out.println(redColor + "Call Me Test Case : 85 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
				     }catch(Exception e)
				 		{
				 			System.out.println(redColor+" Call Me Test Case : 85 Failed.\n Exception : " + e.getMessage()+ resetColor);
				 		}
			        
			 TestCaseTracker.markAsExecuted("callMeRescheduleCallBackLaterSubmit");
			}
	 		
	 		
	 		else
	 		{
	 			System.out.println("Task type is not Call Me.");
	 			manager.executeTask();
	 		}
	 		
			
	 	
		}
		
		
		
		@Test(priority = 86, alwaysRun = true)
		public void callMeRescheduleWrongNoSubmitBreak() throws InterruptedException, IOException
		{	
			
			SoftAssert softAssert = new SoftAssert();
		     functions = new CommanFunctions(driver);
		     manager=new TaskTypeManager(driver);
			//verify Task Type
	 		String taskType=functions.getTaskTypeFromApplication();
	 		if(taskType.equals("Call Me - Customer Request for TC to Call.") )
	 		{
	 			try
	 			{
			callMeWrongTaskNo=functions.getTaskNo();
			System.out.println("Task No-Call Me - Reschedule- Wrong no-Submit & break button : "+ callMeWrongTaskNo);
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
					System.out.println(greenColor + "Call Me Test Case : 86 Passed " + resetGreenColor);
					
	 			}catch (AssertionError ae) {
	 			      
	 			     System.out.println(redColor + "Call Me Test Case : 86 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
	 		     }catch(Exception e)
	 		 		{
	 		 			System.out.println(redColor+" Call Me Test Case : 86 Failed.\n Exception : " + e.getMessage()+ resetColor);
	 		 		}
	 			
						TestCaseTracker.markAsExecuted("callMeRescheduleWrongNoSubmitBreak");
		      }
	 		
	 		else
	 		{
	 			System.out.println("Task type is not Call Me.");
	 			manager.executeTask();
	 		}
			
		
		}
		
		
		
		
		@Test(priority = 87, alwaysRun = true)
		public void callMeRescheduleWrongNoTaskStatus() throws InterruptedException
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
				
				if(taskNo.equals(callMeWrongTaskNo))
				{
					 System.out.println("Dashboard Task No :" +taskNo);
					//get task Status from dashboard
					String taskStatus=driver.findElement(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div[8]/div")).getText();
					System.out.println("Dashboard Task status Call Me -Rechedule-Wrong No : "+taskNo+"- "+taskStatus);
					softAssert.assertEquals(taskStatus, "Closed", " If Select Reschedule status Wrong then task should be closed.");
					status=true;
					 break;
				}
				
			}
			if (!status) {
				softAssert.fail("Call Me- callMeRescheduleWrongNoTaskStatus Task no : " + callMeWrongTaskNo + " not found");
			}
			
			softAssert.assertAll();

			System.out.println(greenColor + "Call Me Test Case : 87 Passed " + resetGreenColor);
			
			}catch (AssertionError ae) {
			      
			     System.out.println(redColor + "Call Me Test Case : 87 Failed.\n Assertion error: " + ae.getMessage() + resetColor);
		     }catch(Exception e)
		 		{
		 			System.out.println(redColor+" Call Me Test Case : 87 Failed.\n Exception : " + e.getMessage()+ resetColor);
		 		}
			
			 TestCaseTracker.markAsExecuted("callMeRescheduleWrongNoTaskStatus");
			
			}
		
		
		
		@Test(priority = 88, alwaysRun = true)
		public void callMeRescheduleWrongNoSubmit() throws InterruptedException, IOException
		{
			
			
			SoftAssert softAssert = new SoftAssert();
		       functions = new CommanFunctions(driver);
		       manager=new TaskTypeManager(driver);
			String taskType=functions.getTaskTypeFromApplication();
	 		if(taskType.equals("Call Me - Customer Request for TC to Call.") )
	 		{
			     try
			     {
			        String taskNoWrongNoSubmit=functions.getTaskNo();
			        System.out.println("Task no. of Call Me -Reschedule-Wrong no-Submit button : "+taskNoWrongNoSubmit);
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
			System.out.println(greenColor + "Call Me Test Case : 88 Passed - Last Test Case. " + resetGreenColor);
			
			     }catch (AssertionError ae) {
				      
				     System.out.println(redColor + "Call Me Test Case : 88 Failed - Last Test Case.\n Assertion error: " + ae.getMessage() + resetColor);
			     }catch(Exception e)
			 		{
			 			System.out.println(redColor+" Call Me Test Case : 88 Failed - Last Test Case.\n Exception : " + e.getMessage()+ resetColor);
			 		}
			     
			 //TestCaseTracker.markAsExecuted("callMeRescheduleWrongNoSubmit");
			}
	 		else
	 		{
	 			System.out.println("Task type is not Call Me.");
	 			 manager.executeTask();
	 		}
			
	 	
		}
	 		
		
	

	@DataProvider(name = "productData")
	public Object[][] productData() {
		// call method to read & enter json data
		Object[][] dataArray = readJsonData(
				System.getProperty("user.dir") + "\\src\\test\\java\\com\\jspl_automation\\data\\ClaimProducts.json");

		return dataArray;
	};

	@DataProvider(name = "customerData")
	public Object[][] customerDetails() {

		// call method to read & enter json data
		Object[][] dataArray = readJsonData(System.getProperty("user.dir")
				+ "\\src\\test\\java\\com\\jspl_automation\\data\\customerClaimDetails.json");
		return dataArray;


	};
	
	@DataProvider(name = "redemptionData")
	public Object[][] redemptionDetails() {

		// call method to read & enter json data
		Object[][] dataArray = readJsonData(System.getProperty("user.dir")+"\\src\\test\\java\\com\\jspl_automation\\data\\RedemptionData.json");
		return dataArray;


	};


}
