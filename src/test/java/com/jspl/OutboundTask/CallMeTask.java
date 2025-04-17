package com.jspl.OutboundTask;

import java.io.IOException;
import java.lang.reflect.Method;
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
import com.jspl.TestComponents.Retry;




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
	
	
	ExtentTest test;
	
	 public CallMeTask(WebDriver driver, ExtentTest test) {
	        this.driver = driver;
	        this.test = test;
	    }
 
	
	
	@Test
	public void runTests() throws IOException, InterruptedException  {

	
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
	         
	
	
	
	
	@Test(priority = 1, retryAnalyzer=Retry.class)
	public void callCloseTaskbuttonclickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callCloseTaskbuttonclickable");
        logTestMethod(driver,methodTest, "callCloseTaskbuttonclickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.callActionButton("Close Task");
		By closeTaskLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
		WaitVisibliltyOfLocated(closeTaskLableLocator);
		WebElement closeTaskLableElement=driver.findElement(closeTaskLableLocator);
		softAssert.assertTrue(closeTaskLableElement.isDisplayed(),"Close Task Button not clickable");
		softAssert.assertAll();
        });
        TestCaseTracker.markAsExecuted("callCloseTaskbuttonclickable");
	}
	
	@Test(priority = 2)
	public void callCloseTaskSubmitbuttonclickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callCloseTaskSubmitbuttonclickable");
        logTestMethod(driver,methodTest, "callCloseTaskSubmitbuttonclickable", () -> {
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
        TestCaseTracker.markAsExecuted("callCloseTaskSubmitbuttonclickable");
		
	}
	
	@Test(priority = 3)
	public void callCloseTaskSubmitBreakbuttonclickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callCloseTaskSubmitBreakbuttonclickable");
        logTestMethod(driver,methodTest, "callCloseTaskSubmitBreakbuttonclickable", () -> {
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
        TestCaseTracker.markAsExecuted("callCloseTaskSubmitBreakbuttonclickable");
		
		
	}
	
	
	@Test(priority = 4)
	public void callCloseTaskCancelbuttonclickable() throws IOException {
		ExtentTest methodTest = test.createNode("callCloseTaskCancelbuttonclickable");
		logTestMethod(driver, methodTest, "callCloseTaskCancelbuttonclickable", () -> {
			boolean status = true;
			SoftAssert softAssert = new SoftAssert();
			functions = new CommanFunctions(driver);
			By cancelButtonLocator = By.xpath("//button[@class=\"btn btn-danger\"]");
			click(cancelButtonLocator);
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
		TestCaseTracker.markAsExecuted("callCloseTaskCancelbuttonclickable");
	}

	@Test(priority = 5)
	public void callCloseTaskCrossIconclickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callCloseTaskCrossIconclickable");
        logTestMethod(driver,methodTest, "callCloseTaskCrossIconclickable", () -> {
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
        TestCaseTracker.markAsExecuted("callCloseTaskCrossIconclickable");
	}
	
	@Test(priority = 6)
	public void callRescheduledbuttonclickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callRescheduledbuttonclickable");
        logTestMethod(driver,methodTest, "callRescheduledbuttonclickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.callActionButton("Reschedule Call");
		By rescheduleLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
		WaitVisibliltyOfLocated(rescheduleLableLocator);
		WebElement rescheduleLableElement=driver.findElement(rescheduleLableLocator);
		softAssert.assertTrue(rescheduleLableElement.isDisplayed(),"Reschedule Button not clickable");
		softAssert.assertAll();
		
		
        });
        TestCaseTracker.markAsExecuted("callRescheduledbuttonclickable");
		
	}
	
	@Test(priority = 7)
	public void callRescheduledSubmitbuttonclickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callRescheduledSubmitbuttonclickable");
        logTestMethod(driver,methodTest, "callRescheduledSubmitbuttonclickable", () -> {
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
        TestCaseTracker.markAsExecuted("callRescheduledSubmitbuttonclickable");
	}
	
	@Test(priority = 8)
	public void callRescheduledSubmitBreakbuttonclickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callRescheduledSubmitBreakbuttonclickable");
        logTestMethod(driver,methodTest, "callRescheduledSubmitBreakbuttonclickable", () -> {
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
        TestCaseTracker.markAsExecuted("callRescheduledSubmitBreakbuttonclickable");
	}
	
	@Test(priority = 9)
	public void callRescheduledCancelbuttonclickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callRescheduledCancelbuttonclickable");
        logTestMethod(driver,methodTest, "callRescheduledCancelbuttonclickable", () -> {
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
        TestCaseTracker.markAsExecuted("callRescheduledCancelbuttonclickable");
		
	}
	
	@Test(priority = 10)
	public void callRescheduledCrossIconclickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callRescheduledCrossIconclickable");
        logTestMethod(driver,methodTest, "callRescheduledCrossIconclickable", () -> {
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
        TestCaseTracker.markAsExecuted("callRescheduledCrossIconclickable");
	}
	
	@Test(priority = 11)
	public void callCatalogClickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callCatalogClickable");
        logTestMethod(driver,methodTest, "callCatalogClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Catalog");
		By catalogueDropDownLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[5]/div/div/button");
		WaitVisibliltyOfLocated(catalogueDropDownLocator);
		WebElement catalogueDropDownElement=driver.findElement(catalogueDropDownLocator);
		softAssert.assertTrue(catalogueDropDownElement.isDisplayed(),"Catalogue button not clickable");
		
        softAssert.assertAll();
        
        
		
		
        });
        TestCaseTracker.markAsExecuted("callCatalogClickable");
		
	}
	
	@Test(priority = 12)
	public void callCatalogProductClickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callCatalogProductClickable");
        logTestMethod(driver,methodTest, "callCatalogProductClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		By catalogueDropDownLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[5]/div/div/button");
		click(catalogueDropDownLocator);
		By productCatalogueLable=By.xpath("//h6[@class=\"my-0\"]/label");
		WaitVisibliltyOfLocated(productCatalogueLable);
		WebElement productCatalogueLableElement=driver.findElement(productCatalogueLable);
		softAssert.assertTrue(productCatalogueLableElement.isDisplayed(),"Catalogue Products button not clickable");
		
        softAssert.assertAll();
        
		
		
        });
        TestCaseTracker.markAsExecuted("callCatalogProductClickable");
		
	}
	
	@Test(priority = 13)
	public void callCatalogProductCrossIconClickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callCatalogProductCrossIconClickable");
        logTestMethod(driver,methodTest, "callCatalogProductCrossIconClickable", () -> {
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
       
		
		
        });
        TestCaseTracker.markAsExecuted("callCatalogProductCrossIconClickable");

	}
	
	@Test(priority = 14)
	public void callPointsClickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callPointsClickable");
        logTestMethod(driver,methodTest, "callPointsClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Points");
		By pointsDropDownLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[4]/div/div/button");
		WaitVisibliltyOfLocated(pointsDropDownLocator);
		WebElement pointsDropDownElement=driver.findElement(pointsDropDownLocator);
		softAssert.assertTrue(pointsDropDownElement.isDisplayed(),"Points button not clickable");
		
        softAssert.assertAll();
        
		
        });
        TestCaseTracker.markAsExecuted("callPointsClickable");
	}
	
	@Test(priority = 15)
	public void callPointsOptionClickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callPointsOptionClickable");
        logTestMethod(driver,methodTest, "callPointsOptionClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		By pointsDropDownLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[4]/div/div/button");
		click(pointsDropDownLocator);
		By pointsLable=By.xpath("//h6[@class=\"my-0\"]/label");
		WaitVisibliltyOfLocated(pointsLable);
		WebElement pointsLableElement=driver.findElement(pointsLable);
		softAssert.assertTrue(pointsLableElement.isDisplayed(),"Points Drodown option button not clickable");
		
        softAssert.assertAll();
        
		
		
        });
        TestCaseTracker.markAsExecuted("callPointsOptionClickable");
	}
	
	@Test(priority = 16)
	public void callPointsOptionCrossIconClickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callPointsOptionCrossIconClickable");
        logTestMethod(driver,methodTest, "callPointsOptionCrossIconClickable", () -> {
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
        });
		TestCaseTracker.markAsExecuted("callPointsOptionCrossIconClickable");
	}
	
	@Test(priority = 17)
	public void callEscalationClickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callEscalationClickable");
        logTestMethod(driver,methodTest, "callEscalationClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Escalation");
		By escalationDropDownLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[3]/div/div/button[2]");
		WaitVisibliltyOfLocated(escalationDropDownLocator);
		WebElement escalationDropDownElement=driver.findElement(escalationDropDownLocator);
		softAssert.assertTrue(escalationDropDownElement.isDisplayed(),"Escalation button not clickable");
		
        softAssert.assertAll();
        });
		
		TestCaseTracker.markAsExecuted("callEscalationClickable");
		
	}
	
	@Test(priority = 18)
	public void callEscalationListClickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callEscalationListClickable");
        logTestMethod(driver,methodTest, "callEscalationListClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		By escalationListLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[3]/div/div/button[2]");
		click(escalationListLocator);
		By escalationListLable=By.xpath("//h6[@class=\"my-0\"]/label");
		WaitVisibliltyOfLocated(escalationListLable);
		WebElement escalationListLableElement=driver.findElement(escalationListLable);
		softAssert.assertTrue(escalationListLableElement.isDisplayed(),"Escalation list button not clickable");
		
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("callEscalationListClickable");
	}
	
	@Test(priority = 19)
	public void callEscalationListCrossIconClickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callEscalationListCrossIconClickable");
        logTestMethod(driver,methodTest, "callEscalationListCrossIconClickable", () -> {
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
        });
		TestCaseTracker.markAsExecuted("callEscalationListCrossIconClickable");
		
	}
	@Test(priority = 20)
	public void callAddEscalationClickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddEscalationClickable");
        logTestMethod(driver,methodTest, "callAddEscalationClickable", () -> {
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
        });
		
		TestCaseTracker.markAsExecuted("callAddEscalationClickable");
		
		
	}
	
	@Test(priority = 21)
	public void callAddEscalationSubmitClickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddEscalationSubmitClickable");
        logTestMethod(driver,methodTest, "callAddEscalationSubmitClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		By submitButtonLocator=By.xpath("//button[@class=\"btn btn-success\"]");
		click(submitButtonLocator);
		
		By errorLocator=By.xpath("//div[text()=\"Please select Escalation Tag.\"]");
		WaitVisibliltyOfLocated(errorLocator);
		WebElement errorElement=driver.findElement(errorLocator);		
		softAssert.assertTrue(errorElement.isDisplayed(),"Add Escalation Submit button not clickable");
		
        softAssert.assertAll();
        });
		
		TestCaseTracker.markAsExecuted("callAddEscalationSubmitClickable");
		

		
	}
	
	@Test(priority = 22)
	public void callAddEscalationCancelClickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddEscalationCancelClickable");
        logTestMethod(driver,methodTest, "callAddEscalationCancelClickable", () -> {
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
        });
		
		TestCaseTracker.markAsExecuted("callAddEscalationCancelClickable");
	}
	
	@Test(priority = 23)
	public void callAddEscalationCrossIconClickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddEscalationCrossIconClickable");
        logTestMethod(driver,methodTest, "callAddEscalationCrossIconClickable", () -> {
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
        });
		TestCaseTracker.markAsExecuted("callAddEscalationCrossIconClickable");
	}
	
	@Test(priority = 24)
	public void callRedemptionClickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callRedemptionClickable");
        logTestMethod(driver,methodTest, "callRedemptionClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Redemption");
		By redemptionDropDownLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[2]/div/div/button[2]");
		WaitVisibliltyOfLocated(redemptionDropDownLocator);
		WebElement redemptionDropDownElement=driver.findElement(redemptionDropDownLocator);
		softAssert.assertTrue(redemptionDropDownElement.isDisplayed(),"Redemption button not clickable");
		
        softAssert.assertAll();
        });
		
		TestCaseTracker.markAsExecuted("callRedemptionClickable");
	}
	
	@Test(priority = 25)
	public void callRedemptionHistoryClickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callRedemptionHistoryClickable");
        logTestMethod(driver,methodTest, "callRedemptionHistoryClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		By redemptionHistoryLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[2]/div/div/button[2]");
		click(redemptionHistoryLocator);
		By redemptionHistoryLable=By.xpath("//h6[@class=\"my-0\"]/label");
		WaitVisibliltyOfLocated(redemptionHistoryLable);
		WebElement redemptionHistoryLableElement=driver.findElement(redemptionHistoryLable);
		softAssert.assertTrue(redemptionHistoryLableElement.isDisplayed(),"Redemption History button not clickable");
		
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("callRedemptionHistoryClickable");
	}
	
	@Test(priority = 26)
	public void callRedemptionHistoryCrossIconClickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callRedemptionHistoryCrossIconClickable");
        logTestMethod(driver,methodTest, "callRedemptionHistoryCrossIconClickable", () -> {
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
       
        });
		TestCaseTracker.markAsExecuted("callRedemptionHistoryCrossIconClickable");
		
	}
	
	@Test(priority = 27)
	public void callAddRedemptionClickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddRedemptionClickable");
        logTestMethod(driver,methodTest, "callAddRedemptionClickable", () -> {
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
        });
		TestCaseTracker.markAsExecuted("callAddRedemptionClickable");
		
	}
	
	@Test(priority = 28)
	public void callAddRedemptionSubmitClickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddRedemptionSubmitClickable");
        logTestMethod(driver,methodTest, "callAddRedemptionSubmitClickable", () -> {		
        	SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		By submitButtonLocator=By.xpath("//button[@class=\"btn btn-success\"]");
		click(submitButtonLocator);
		
		By errorLocator=By.xpath("//div[text()=\"Please select Gift\"]");
		WaitVisibliltyOfLocated(errorLocator);
		WebElement errorElement=driver.findElement(errorLocator);		
		softAssert.assertTrue(errorElement.isDisplayed(),"Add Redemption Submit button not clickable");
		
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("callAddRedemptionSubmitClickable");
		
	}
	
	@Test(priority = 29)
	public void callAddRedemptionCancelClickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddRedemptionCancelClickable");
        logTestMethod(driver,methodTest, "callAddRedemptionCancelClickable", () -> {
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
        });
		
		TestCaseTracker.markAsExecuted("callAddRedemptionCancelClickable");
		
	}
	
	@Test(priority = 30)
	public void callAddRedemptionCrossIconClickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddRedemptionCrossIconClickable");
        logTestMethod(driver,methodTest, "callAddRedemptionCrossIconClickable", () -> {
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
        });
		TestCaseTracker.markAsExecuted("callAddRedemptionCrossIconClickable");
		
	}

	
	
	
	
	

	@Test(priority = 31)
	public void CallClaimAddButtonClickable() throws InterruptedException, IOException {
		
		ExtentTest methodTest = test.createNode("CallClaimAddButtonClickable");
        logTestMethod(driver,methodTest, "CallClaimAddButtonClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Claim/Add");
		By claimAddDropDownLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[1]/div/div/button[1]");
		WaitVisibliltyOfLocated(claimAddDropDownLocator);
		WebElement claimAddDropDownElement=driver.findElement(claimAddDropDownLocator);
		softAssert.assertTrue(claimAddDropDownElement.isDisplayed(),"Claim Add button not clickable");
		
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("CallClaimAddButtonClickable");
	}

	@Test(priority = 32)
	public void CallAddClaimButtonClickable() throws InterruptedException, IOException {
		
		ExtentTest methodTest = test.createNode("CallAddClaimButtonClickable");
        logTestMethod(driver,methodTest, "CallAddClaimButtonClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		By addClaimLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[1]/div/div/button[1]");
		click(addClaimLocator);
		By addClaimLable=By.xpath("//h6[@class=\"my-0\"]/label");
		WaitVisibliltyOfLocated(addClaimLable);
		WebElement addClaimLableElement=driver.findElement(addClaimLable);
		softAssert.assertTrue(addClaimLableElement.isDisplayed(),"Add Claim button not clickable");
		
        softAssert.assertAll();
        });
		
		TestCaseTracker.markAsExecuted("CallAddClaimButtonClickable");

	}
	
	
	@Test(priority = 33)
	public void callAddClaimSubmitButtonClickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddClaimSubmitButtonClickable");
        logTestMethod(driver,methodTest, "callAddClaimSubmitButtonClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		By submitButtonLocator=By.xpath("//button[@class=\"btn btn-success\"]");
		click(submitButtonLocator);
		
		By errorLocator=By.xpath("//div[text()=\"Please select dealer\"]");
		WaitVisibliltyOfLocated(errorLocator);
		WebElement errorElement=driver.findElement(errorLocator);		
		softAssert.assertTrue(errorElement.isDisplayed(),"Add Claim Submit button not clickable");
		
        softAssert.assertAll();
        });
		
		TestCaseTracker.markAsExecuted("callAddClaimSubmitButtonClickable");
		
	}
	
	@Test(priority = 34)
	public void callAddClaimCancelButtonClickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddClaimCancelButtonClickable");
        logTestMethod(driver,methodTest, "callAddClaimCancelButtonClickable", () -> {
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
        });
		
		TestCaseTracker.markAsExecuted("callAddClaimCancelButtonClickable");
	}
	
	@Test(priority = 35)
	public void callAddClaimCrossButtonClickable() throws IOException 
	{
		ExtentTest methodTest = test.createNode("callAddClaimCrossButtonClickable");
        logTestMethod(driver,methodTest, "callAddClaimCrossButtonClickable", () -> {
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
        });
		TestCaseTracker.markAsExecuted("callAddClaimCrossButtonClickable");
	}
	
	@Test(priority = 36)
	public void callClaimStatusClickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callClaimStatusClickable");
        logTestMethod(driver,methodTest, "callClaimStatusClickable", () -> {
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
        });
		TestCaseTracker.markAsExecuted("callClaimStatusClickable");
	}
	
	@Test(priority = 37)
	public void callClaimStatusCrossClickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callClaimStatusCrossClickable");
        logTestMethod(driver,methodTest, "callClaimStatusCrossClickable", () -> {
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
        });
		TestCaseTracker.markAsExecuted("callClaimStatusCrossClickable");
	
	}
	
	@Test(priority = 38)
	public void callVerifyClaimClickable() throws IOException
	{
		ExtentTest methodTest = test.createNode("callVerifyClaimClickable");
        logTestMethod(driver,methodTest, "callVerifyClaimClickable", () -> {
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
        });
		TestCaseTracker.markAsExecuted("callVerifyClaimClickable");
	}
	
  
	@Test(priority = 39)
	public void callAddEscalation() throws IOException   
	{
		ExtentTest methodTest = test.createNode("callAddEscalation");
        logTestMethod(driver,methodTest, "callAddEscalation", () -> {
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		//click on Escalation button
		functions.transactionButtons("Escalation");
		
		//click on Add Escalation
		By addEscalationLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[3]/div/div/button[1]");
		click(addEscalationLocator);
		
		By dropDownArrow=By.xpath("//*[@id=\"ESCID\"]/div/div[2]/div");
		click(dropDownArrow);
		
		//Select Escalation Dropdown value
		By escalationDropDownElements=By.xpath("//div[@class=\" css-qr46ko\"]/div");
		WaitVisibliltyOfLocated(escalationDropDownElements);
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
        });
		
		TestCaseTracker.markAsExecuted("callAddEscalation");
		
	}
	
	@Test(priority = 40)
	public void callSubmitEscalationVerifyNavigation() throws IOException
	{
		ExtentTest methodTest = test.createNode("callSubmitEscalationVerifyNavigation");
        logTestMethod(driver,methodTest, "callSubmitEscalationVerifyNavigation", () -> {
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		// Verify Navigate to escalation List form
		By escalationListLable = By.xpath("//h6[@class=\"my-0\"]/label");
		WaitVisibliltyOfLocated(escalationListLable);
		WebElement escalationListLableElement = driver.findElement(escalationListLable);
		softAssert.assertTrue(escalationListLableElement.isDisplayed(), "Not navigate to Escalation List page");

		softAssert.assertAll();
		
        });
        By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
		TestCaseTracker.markAsExecuted("callSubmitEscalationVerifyNavigation");
		
	} 
	
	
	@Test(priority = 41)
	public void VerifyCallEscaListNameFilter() throws IOException
	{
		ExtentTest methodTest = test.createNode("VerifyCallEscaListNameFilter");
        logTestMethod(driver,methodTest, "VerifyCallEscaListNameFilter", () -> {
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
		
        });
        By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
		TestCaseTracker.markAsExecuted("VerifyCallEscaListNameFilter");
		
	}
	
	
	
	
	@Test(priority = 42)
	public void callAddClaimDealFieldMandotory() throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddClaimDealFieldMandotory");
        logTestMethod(driver,methodTest, "callAddClaimDealFieldMandotory", () -> {
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
        
        });
        By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
		TestCaseTracker.markAsExecuted("callAddClaimDealFieldMandotory");
		
		
	}
	
	@Test(priority = 43)
	public void callAddClaimCustNameFieldMandotory() throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddClaimCustNameFieldMandotory");
        logTestMethod(driver,methodTest, "callAddClaimCustNameFieldMandotory", () -> {
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
        
        });
        By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
		TestCaseTracker.markAsExecuted("callAddClaimCustNameFieldMandotory");
	}
	
	@Test(priority = 44)
	public void callAddClaimCustContactFieldMandotory() throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddClaimCustContactFieldMandotory");
        logTestMethod(driver,methodTest, "callAddClaimCustContactFieldMandotory", () -> {
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
        
        });
        By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
		
		TestCaseTracker.markAsExecuted("callAddClaimCustContactFieldMandotory");
	}
	
	@Test(priority = 45)
	public void callAddClaimAddressFieldMandotory() throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddClaimAddressFieldMandotory");
        logTestMethod(driver,methodTest, "callAddClaimAddressFieldMandotory", () -> {
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
        
        });
        By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
		
		TestCaseTracker.markAsExecuted("callAddClaimAddressFieldMandotory");
		
	}
	
	@Test(priority = 46)
	public void callAddClaimProductFieldMandotory() throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddClaimProductFieldMandotory");
        logTestMethod(driver,methodTest, "callAddClaimProductFieldMandotory", () -> {
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
        
        });
        By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
		TestCaseTracker.markAsExecuted("callAddClaimProductFieldMandotory");
		
	}
	
	@Test(priority = 47)
	public void callAddClaimPointsFieldMandotory() throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddClaimPointsFieldMandotory");
        logTestMethod(driver,methodTest, "callAddClaimPointsFieldMandotory", () -> {
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
    
        });
        By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
    	click(crossIconLocator);
	TestCaseTracker.markAsExecuted("callAddClaimPointsFieldMandotory");
		
	}
	
	@Test(priority = 48)
	public void callAddClaimQtyFieldMandotory() throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddClaimQtyFieldMandotory");
       logTestMethod(driver,methodTest, "callAddClaimQtyFieldMandotory", () -> {
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
    
        });
       By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
   	click(crossIconLocator);
	TestCaseTracker.markAsExecuted("callAddClaimQtyFieldMandotory");
		
	}
	
	
	
	@Test(priority = 49)
	public void callAddClaimNotSelectProductClickAddButton() throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddClaimNotSelectProductClickAddButton");
        logTestMethod(driver,methodTest, "callAddClaimNotSelectProductClickAddButton", () -> {
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Claim/Add");
		By addClaimLocator = By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[1]/div/div/button[1]");
		click(addClaimLocator);
		
		By addProductButtonLocator=By.xpath("//html/body/div[2]/div/div[1]/div/div/form/div[2]/div[3]/div/div/button");
		click(addProductButtonLocator);
		By errorLocator=By.xpath("//div[text()=\"Fill all required fields before adding a new row.\"]");
		WaitVisibliltyOfLocated(errorLocator);
		WebElement errorElement=driver.findElement(errorLocator);		
		softAssert.assertTrue(errorElement.isDisplayed(),"If product field is blank & still added new product Error message should be displayed .");
		
		softAssert.assertAll();
		
		WaitInVisibliltyOfLocated(errorLocator);
	    
        });
        By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
		TestCaseTracker.markAsExecuted("callAddClaimNotSelectProductClickAddButton");
		
	}
	
	@Test(priority = 50)
	public void callAddClaimNotSelectProductClickDeleteButton() throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddClaimNotSelectProductClickDeleteButton");
        logTestMethod(driver,methodTest, "callAddClaimNotSelectProductClickDeleteButton", () -> {
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
	    
        });
        By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
		TestCaseTracker.markAsExecuted("callAddClaimNotSelectProductClickDeleteButton");
		
	}
	
	
	
	
	@Test(priority = 51, dataProvider = "customerData")
	public void callEnterClaimData(String dealerCode, String invNo, String invoiceDate, String customerName,
			String customerContact, String customerAddress, String filePath) throws InterruptedException, IOException 

	{
		ExtentTest methodTest = test.createNode("callEnterClaimData");
        logTestMethod(driver,methodTest, "callEnterClaimData", () -> {
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Claim/Add");
		By addClaimLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[1]/div/div/button[1]");
		click(addClaimLocator);

		//call method for enter customers details on add claim page
		try {
			functions.claimCustomerDetails(dealerCode, invNo, invoiceDate, customerName, customerContact, customerAddress,
					filePath);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	
        });
		TestCaseTracker.markAsExecuted("callEnterClaimData");

	}
	
	

	
	

	@Test(priority = 52, dataProvider = "productData")
	public void callAddClaimProducts(String productCodeValue, String productQty) throws InterruptedException, IOException   {

		ExtentTest methodTest = test.createNode("callAddClaimProducts");
        logTestMethod(driver,methodTest, "callAddClaimProducts", () -> {
		//call method to add products
		try {
			functions.claimProducts(productCodeValue, productQty);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
      
		// Click on + button to add another product
		if (i < productData().length) {
			By addProductButtonLocator=By.xpath("//html/body/div[2]/div/div[1]/div/div/form/div[2]/div[3]/div/div/button");
			WaitVisibliltyOfLocated(addProductButtonLocator);
			click(addProductButtonLocator);
			i++;
		}
		
		
        });
		TestCaseTracker.markAsExecuted("callAddClaimProducts");
	}
	
	

	@Test(priority = 53)
	public void verifyCallClaimTotalPoints() throws IOException 
	{ 
		ExtentTest methodTest = test.createNode("verifyCallClaimTotalPoints");
        logTestMethod(driver,methodTest, "verifyCallClaimTotalPoints", () -> {
		SoftAssert softAssert = new SoftAssert();
        //Get Count of rows
		
		List<WebElement> rowsCountLocator=driver.findElements(By.xpath("//table[@class=\"table table-sm table-bordered border-secondary mb-2 table-centered table\"]/tbody/tr"));
		System.out.println("rowsCountLocator : "+ rowsCountLocator.size());
		for(int i=1; i<rowsCountLocator.size(); i++)
		
		{
			
			//Get Points Value
			By pointsLocator=By.xpath("//table[@class=\"table table-sm table-bordered border-secondary mb-2 table-centered table\"]/tbody/tr["+i+"]/td[3]/input");
			WaitVisibliltyOfLocated(pointsLocator);
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
        });
		TestCaseTracker.markAsExecuted("verifyCallClaimTotalPoints");
		
	}
	

	@Test(priority = 54)
	public void callSubmitClaim() throws IOException

	{
		ExtentTest methodTest = test.createNode("callSubmitClaim");
        logTestMethod(driver,methodTest, "callSubmitClaim", () -> {
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
        });
		TestCaseTracker.markAsExecuted("callSubmitClaim");

	}
	
	
	@Test(priority = 55)
	public void verifyCallClaimSubmitNavigateToClaimStatus() throws IOException
	{
		ExtentTest methodTest = test.createNode("verifyCallClaimSubmitNavigateToClaimStatus");
        logTestMethod(driver,methodTest, "verifyCallClaimSubmitNavigateToClaimStatus", () -> {
		SoftAssert softAssert = new SoftAssert();
		By claimStatusLable = By.xpath("//h6[@class=\"my-0\"]/label");
		WaitVisibliltyOfLocated(claimStatusLable);
		WebElement claimStatusLableElement = driver.findElement(claimStatusLable);
		softAssert.assertTrue(claimStatusLableElement.isDisplayed(), "Not Navigate to Claim Status Page");

		softAssert.assertAll();
		
        });
        By crossIconLocator = By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1]/div[5]/button/i");
		click(crossIconLocator);
		TestCaseTracker.markAsExecuted("verifyCallClaimSubmitNavigateToClaimStatus");
		
	}
	

	@Test(priority = 56, alwaysRun = true)
	public void verifyCallAddedClaim() throws InterruptedException, IOException {
		ExtentTest methodTest = test.createNode("verifyCallAddedClaim");
        logTestMethod(driver,methodTest, "verifyCallAddedClaim", () -> {
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
		
        });
     // click on cross button of claim status page
     		By crossIconLocator = By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1]/div[5]/button/i");
     		click(crossIconLocator);
		TestCaseTracker.markAsExecuted("verifyCallAddedClaim");
	}
	
	
	
	
	@Test(priority = 57, alwaysRun = true)
	public void openCallClaimStatusPDF() throws InterruptedException, IOException
	{
		ExtentTest methodTest = test.createNode("openCallClaimStatusPDF");
        logTestMethod(driver,methodTest, "openCallClaimStatusPDF", () -> {
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.transactionButtons("Claim/Add");
		By claimStausLocator=By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[1]/div/div/button[2]");
		click(claimStausLocator);
		
		
		By viewClaimPDFLocator=By.xpath("//div[@id=\"row-0\"]/div[2]/a");
		WaitVisibliltyOfLocated(viewClaimPDFLocator);
		click(viewClaimPDFLocator);
		By claimStatusPDFLable=By.xpath("//label[text()=\"Claim Status PDF\"]");
		WaitVisibliltyOfLocated(claimStatusPDFLable);
		WebElement claimStatusPDFLableElement=driver.findElement(claimStatusPDFLable);
		softAssert.assertTrue(claimStatusPDFLableElement.isDisplayed(),"View Claim Status PDF not Geeting Open");
		
		softAssert.assertAll();
        });
		
		TestCaseTracker.markAsExecuted("openCallClaimStatusPDF");
		
		
	}
	
	@Test(priority = 58, alwaysRun = true)
	public void callClaimStatusPDFCrossClick() throws InterruptedException, IOException
	{
		ExtentTest methodTest = test.createNode("callClaimStatusPDFCrossClick");
        logTestMethod(driver,methodTest, "callClaimStatusPDFCrossClick", () ->{ 
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
        
	});
        By claimStatusCrossLocator = By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1]/div[5]/button/i");
		click(claimStatusCrossLocator);
		TestCaseTracker.markAsExecuted("callClaimStatusPDFCrossClick");
				
	}
	
	
	@Test(priority = 59, alwaysRun = true)
	public void callClaimStatusNameFilter() throws IOException
	{	
		
		ExtentTest methodTest = test.createNode("callClaimStatusNameFilter");
        logTestMethod(driver,methodTest, "callClaimStatusNameFilter", () ->{ 
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
		
        });
        By crossIconLocator=By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1]/div[5]/button/i");
		click(crossIconLocator);
		TestCaseTracker.markAsExecuted("callClaimStatusNameFilter");
		
	}
	
	@Test(priority = 60, alwaysRun = true)
	public void callClaimStatusFilterIconClick() throws IOException
	{
		ExtentTest methodTest = test.createNode("callClaimStatusFilterIconClick");
        logTestMethod(driver,methodTest, "callClaimStatusFilterIconClick", () ->{ 
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
        });
		TestCaseTracker.markAsExecuted("callClaimStatusFilterIconClick");
		
	}
	
	@Test(priority = 61, alwaysRun = true)
	public void callClaimStatusFilterCrossClick() throws IOException
	{
		ExtentTest methodTest = test.createNode("callClaimStatusFilterCrossClick");
        logTestMethod(driver,methodTest, "callClaimStatusFilterCrossClick", () ->{ 
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
        
        });
        By claimStatusCrossLocator = By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1]/div[5]/button/i");
		click(claimStatusCrossLocator);
		TestCaseTracker.markAsExecuted("callClaimStatusFilterCrossClick");
		
	}
	
	
	@Test(priority = 62, alwaysRun = true)
	public void callRedemptionGiftMandatoryField() throws IOException
	{
		ExtentTest methodTest = test.createNode("callRedemptionGiftMandatoryField");
        logTestMethod(driver,methodTest, "callRedemptionGiftMandatoryField", () ->{ 
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
       
        });
        By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
		TestCaseTracker.markAsExecuted("callRedemptionGiftMandatoryField");
		
	}
	
	@Test(priority = 63, alwaysRun = true)
	public void callRedemptionQtyMandatoryField() throws IOException
	{
		ExtentTest methodTest = test.createNode("callRedemptionQtyMandatoryField");
        logTestMethod(driver,methodTest, "callRedemptionQtyMandatoryField", () ->{ 
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
       
        });
        By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
		TestCaseTracker.markAsExecuted("callRedemptionQtyMandatoryField");
	}	
	
	
	
	
	@Test(priority = 64, dataProvider="redemptionData", alwaysRun = true)
	public void callRedemptionPoints(String rewardCode, String rewardQty) throws IOException
	{
		ExtentTest methodTest = test.createNode("callRedemptionPoints");
        logTestMethod(driver,methodTest, "callRedemptionPoints", () ->{ 
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
		
        });
		
        TestCaseTracker.markAsExecuted("callRedemptionPoints");
	
		
	}
	
	
	@Test(priority = 65, alwaysRun = true)
	public void callSubmitRedemption() throws IOException
	{
		ExtentTest methodTest = test.createNode("callSubmitRedemption");
        logTestMethod(driver,methodTest, "callSubmitRedemption", () ->{ 
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
        });		
        TestCaseTracker.markAsExecuted("callSubmitRedemption");
		
		
	}
	
	@Test(priority = 66, alwaysRun = true)
	public void callRedemptionSubmitNavigation() throws IOException
	{
		ExtentTest methodTest = test.createNode("callRedemptionSubmitNavigation");
        logTestMethod(driver,methodTest, "callRedemptionSubmitNavigation", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		By redemptionHistoryLable=By.xpath("//h6[@class=\"my-0\"]/label");
		WaitVisibliltyOfLocated(redemptionHistoryLable);
		WebElement redemptionHistoryLocator=driver.findElement(redemptionHistoryLable);
		 softAssert.assertTrue(redemptionHistoryLocator.isDisplayed(),"After Submit Redemption navigate to history page");
			
	      softAssert.assertAll();
	     
			
        });
        By crossIconLocator=By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1]/div[5]/div/button/i");
		click(crossIconLocator);
	      TestCaseTracker.markAsExecuted("callRedemptionSubmitNavigation");
	}
	
	@Test(priority = 67, alwaysRun = true)
	public void callRedemptionLockedPoints() throws IOException
	{
		ExtentTest methodTest = test.createNode("callRedemptionLockedPoints");
        logTestMethod(driver,methodTest, "callRedemptionLockedPoints", () ->{ 
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
		
		softAssert.assertEquals(newLockedPoints,newExpectedLockedPoints,"Locked Points are incorrect.");
	     softAssert.assertAll();
	    
        });
        By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
	     TestCaseTracker.markAsExecuted("callRedemptionLockedPoints");
		
		
		
		
	}
	
	@Test(priority = 68, alwaysRun = true)
	public void callRedemptionRedeemablePoints() throws IOException
	{
		ExtentTest methodTest = test.createNode("callRedemptionRedeemablePoints");
        logTestMethod(driver,methodTest, "callRedemptionRedeemablePoints", () ->{ 
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
		
		
		softAssert.assertEquals(newReedemablePoints,newExpectedReedemablePoints,"Reedamable Points are incorrect.");
		
	      softAssert.assertAll();
	      
	      
        });
        By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
	      TestCaseTracker.markAsExecuted("callRedemptionRedeemablePoints");
		
	}
	
	@Test(priority = 69, alwaysRun = true)
	public void callRedemptionTotalPoints() throws IOException
	{
		ExtentTest methodTest = test.createNode("callRedemptionTotalPoints");
        logTestMethod(driver,methodTest, "callRedemptionTotalPoints", () ->{ 
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
		
		
		 softAssert.assertEquals(newTotalPoints,newExpectedTotalPoints,"Total Points are incorrect.");
		
	      softAssert.assertAll();
	      
        });
        By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i");
		click(crossIconLocator);
		
	 	   TestCaseTracker.markAsExecuted("callRedemptionTotalPoints");
		
	}	
	
	
	
	
	@Test(priority = 70, alwaysRun = true)
	public void callMeRedial() throws InterruptedException, IOException

	{ 
		ExtentTest methodTest = test.createNode("callMeRedial");
        logTestMethod(driver,methodTest, "callMeRedial", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		String oldTaskNo = functions.getTaskNo();
		// click on Redial button
		functions.callActionButton("Redial");
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String newTaskNo = functions.getTaskNo();
		softAssert.assertEquals(newTaskNo, oldTaskNo, "Test Failed : Redial button not working properly");
		 
		
	    softAssert.assertAll();
        });
		
		TestCaseTracker.markAsExecuted("callMeRedial");
		

	}
	
	
	
	
	@Test(priority = 71, alwaysRun = true)
	public void callMeBack() throws IOException  
	{
		ExtentTest methodTest = test.createNode("callMeBack");
        logTestMethod(driver,methodTest, "callMeBack", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		backButtonTaskNo =functions.getTaskNo();
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
		 softAssert.assertTrue(dialNext.isDisplayed(),"Test Failed :callMeBack- Back Button Not working proper");
		// Call assertAll to aggregate the results
			softAssert.assertAll();
        });
		
			TestCaseTracker.markAsExecuted("callMeBack");
		 
	}
	
	@Test(priority = 72, alwaysRun = true)
	public void callMeBackTaskStatus() throws IOException 
	{
		
		ExtentTest methodTest = test.createNode("callMeBackTaskStatus");
        logTestMethod(driver,methodTest, "callMeBackTaskStatus", () ->{ 
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
        });
		
		 TestCaseTracker.markAsExecuted("callMeBackTaskStatus");
		
		}
		
		
   
	
	@Test(priority = 73, alwaysRun = true)
	public void verifyCallBackButtonDialNext() throws InterruptedException, IOException
	{  
		ExtentTest methodTest = test.createNode("verifyCallBackButtonDialNext");
        logTestMethod(driver,methodTest, "verifyCallBackButtonDialNext", () ->{ 
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
			 
		String newTaskNo= functions.getTaskNo();
		softAssert.assertEquals(newTaskNo, backButtonTaskNo,"Test Failed : verifyCallBackButtonDialNext -incorrect call connect");
		
		softAssert.assertAll();
        });
	   TestCaseTracker.markAsExecuted("verifyCallBackButtonDialNext");
		
	}
	
	
	
	@Test(priority = 74, alwaysRun = true)
	public void callMeHangUp() throws InterruptedException, IOException
	{
		ExtentTest methodTest = test.createNode("callMeHangUp");
        logTestMethod(driver,methodTest, "callMeHangUp", () ->{ 
		SoftAssert softAssert = new SoftAssert();
     
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
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
        });
		 TestCaseTracker.markAsExecuted("callMeHangUp");
				
	}
	
	
	
	
	    @Test(priority = 75, alwaysRun = true)
		public void callMecloseTaskSubmitBreak() throws InterruptedException, IOException
		{      
	    	
	    	  
	    	SoftAssert softAssert = new SoftAssert();
		       functions = new CommanFunctions(driver); 
		       manager=new TaskTypeManager(driver, test);
			String taskType=functions.getTaskTypeFromApplication();
	 		if(taskType.equals("Call Me - Customer Request for TC to Call.") )
	 		{  	
			
	 			ExtentTest methodTest = test.createNode("callMecloseTaskSubmitBreak");
		        logTestMethod(driver,methodTest, "callMecloseTaskSubmitBreak", () ->{ 
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
		   
			
			boolean status=false;
			By taskNoLocator=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a");
			WaitVisibliltyOfLocated(taskNoLocator);
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
		        });
			
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
			 manager=new TaskTypeManager(driver, test);
			String taskType=functions.getTaskTypeFromApplication();
	 		if(taskType.equals("Call Me - Customer Request for TC to Call.") )
	 		{  	
	 			ExtentTest methodTest = test.createNode("callMecloseTaskSubmit");
		        logTestMethod(driver,methodTest, "callMecloseTaskSubmit", () ->{ 
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
		        });			
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
			 manager=new TaskTypeManager(driver, test);
			String taskType=functions.getTaskTypeFromApplication();
 		   if(taskType.equals("Call Me - Customer Request for TC to Call.") )
 		  {
 			  ExtentTest methodTest = test.createNode("callMeRescheduleNotInterestedSubmitBreak");
		        logTestMethod(driver,methodTest, "callMeRescheduleNotInterestedSubmitBreak", () ->{ 
 			  callMeNotInterestedTakNo=functions.getTaskNo();
			System.out.println("Task No-Call Me- Reschedule-Not Interested -Submit & break button : "+ callMeNotInterestedTakNo);
			
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
						TestCaseTracker.markAsExecuted("callMeRescheduleNotInterestedSubmitBreak");
		      }
	 		
	 		else
	 		{
	 			System.out.println("Task type is not  Call Me");
	 			manager.executeTask();
	 		}
	 		
			
			}
		

		@Test(priority = 78, alwaysRun = true)
		public void callMeRescheduleNotInterestedTaskStatus() throws InterruptedException, IOException
		{	
			ExtentTest methodTest = test.createNode("callMeRescheduleNotInterestedTaskStatus");
	        logTestMethod(driver,methodTest, "callMeRescheduleNotInterestedTaskStatus", () ->{ 
			SoftAssert softAssert = new SoftAssert();
			functions = new CommanFunctions(driver);

			boolean status=false;
			By element=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a");
			WaitVisibliltyOfLocated(element);
			
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
	        });
			
			 TestCaseTracker.markAsExecuted("callMeRescheduleNotInterestedTaskStatus");
			
			}
		
		
		@Test(priority = 79, alwaysRun = true)
		public void callMeRescheduleNotInterestedSubmit() throws InterruptedException, IOException
		{
			
			SoftAssert softAssert = new SoftAssert();
	        functions = new CommanFunctions(driver);
	        manager=new TaskTypeManager(driver, test);
			String taskType=functions.getTaskTypeFromApplication();
	 		if(taskType.equals("Call Me - Customer Request for TC to Call.") )
	 		{
	 			ExtentTest methodTest = test.createNode("callMeRescheduleNotInterestedSubmit");
		        logTestMethod(driver,methodTest, "callMeRescheduleNotInterestedSubmit", () ->{ 
			        String taskNoNotInterestedSubmit=functions.getTaskNo();
			        System.out.println("Task no. of Call Me -Reschedule-Not Interested-Submit button : "+taskNoNotInterestedSubmit);
			        
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
			 manager=new TaskTypeManager(driver, test);
			String taskType=functions.getTaskTypeFromApplication();
 		   if(taskType.equals("Call Me - Customer Request for TC to Call.") )
 		  {
 			  ExtentTest methodTest = test.createNode("callMeRescheduleRingNotReceivedSubmitBreak");
 		        logTestMethod(driver,methodTest, "callMeRescheduleRingNotReceivedSubmitBreak", () ->{ 
 			 callMeRingNotReceivedTaskNo=functions.getTaskNo();
			System.out.println("Task No-Call Me - Reschedule-Ringing Not Received -Submit & break button : "+ callMeRingNotReceivedTaskNo);
			
			functions.callActionButton("Reschedule Call");
			try {
				functions.selectRescheduleStatus("Ringing not received");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
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
			
						TestCaseTracker.markAsExecuted("callMeRescheduleRingNotReceivedSubmitBreak");
		      }
	 		
	 		else
	 		{
	 			System.out.println("Task type is not Call Me.");
	 			manager.executeTask();
	 		}
 		   
			
			}
		
		
		
		@Test(priority = 81, alwaysRun = true)
		public void callMeRescheduleRingNotReceivedTaskStatus() throws InterruptedException, IOException
		{	
			ExtentTest methodTest = test.createNode("callMeRescheduleRingNotReceivedTaskStatus");
	        logTestMethod(driver,methodTest, "callMeRescheduleRingNotReceivedTaskStatus", () ->{ 
			SoftAssert softAssert = new SoftAssert();
			functions = new CommanFunctions(driver);

			boolean status=false;
			By element=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a");
			WaitVisibliltyOfLocated(element);
			
			//get task no from dashboard
			By taskNoLocator=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a");
			WaitVisibliltyOfLocated(taskNoLocator);
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
	        });
			 TestCaseTracker.markAsExecuted("callMeRescheduleRingNotReceivedTaskStatus");
			
			}
		
		
		@Test(priority = 82, alwaysRun = true)
		public void callMeRescheduleRingNotReceivedSubmit() throws InterruptedException, IOException
		{
			
			
			SoftAssert softAssert = new SoftAssert();
	        functions = new CommanFunctions(driver);
	        manager=new TaskTypeManager(driver, test);
			String taskType=functions.getTaskTypeFromApplication();
	 		if(taskType.equals("Call Me - Customer Request for TC to Call.") )
	 		{
	 			ExtentTest methodTest = test.createNode("callMeRescheduleRingNotReceivedSubmit");
		        logTestMethod(driver,methodTest, "callMeRescheduleRingNotReceivedSubmit", () ->{ 
			        String taskNoRigNotReceivedSubmit=functions.getTaskNo();
			        System.out.println("Task no. of Call Me -Reschedule-Ring Not Received -Submit button : "+taskNoRigNotReceivedSubmit);
			        
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
						   softAssert.assertTrue(taskPopUp.isDisplayed(), "If Reschedule task by Submit button then next call should be connet. ");
					 }
								
			     softAssert.assertAll();
		        });
			        
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
			 manager=new TaskTypeManager(driver, test);
			String taskType=functions.getTaskTypeFromApplication();
 		   if(taskType.equals("Call Me - Customer Request for TC to Call.") )
 		  {
 			  ExtentTest methodTest = test.createNode("callMeRescheduleCallBackLaterSubmitBreak");
 		        logTestMethod(driver,methodTest, "callMeRescheduleCallBackLaterSubmitBreak", () ->{ 
			callMeCallBackLaterTaskNo=functions.getTaskNo();
			System.out.println("Task No-Call Me- Reschedule-Call Back Later -Submit & break button : "+ callMeCallBackLaterTaskNo);
			
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
						TestCaseTracker.markAsExecuted("callMeRescheduleCallBackLaterSubmitBreak");
		      }
	 		
	 		else
	 		{
	 			System.out.println("Task type is not Call Me");
	 			manager.executeTask();
	 		}
			
			}
		
		
		@Test(priority = 84, alwaysRun = true)
		public void callMeRescheduleCallBackLaterTaskStatus() throws InterruptedException, IOException
		{	
			ExtentTest methodTest = test.createNode("callMeRescheduleCallBackLaterTaskStatus");
	        logTestMethod(driver,methodTest, "callMeRescheduleCallBackLaterTaskStatus", () ->{ 
			SoftAssert softAssert = new SoftAssert();
			functions = new CommanFunctions(driver);

			boolean status=false;
			By element=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a");
			WaitVisibliltyOfLocated(element);
			
		By taskNoLocator=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a");
		WaitVisibliltyOfLocated(taskNoLocator);
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
	        });
			 TestCaseTracker.markAsExecuted("callMeRescheduleCallBackLaterTaskStatus");
			
			}
		
		
		@Test(priority = 85, alwaysRun = true)
		public void callMeRescheduleCallBackLaterSubmit() throws InterruptedException, IOException
		{
			
			SoftAssert softAssert = new SoftAssert();
	        functions = new CommanFunctions(driver);
	        manager=new TaskTypeManager(driver, test);
			String taskType=functions.getTaskTypeFromApplication();
	 		if(taskType.equals("Call Me - Customer Request for TC to Call.") )
	 		{
	 			ExtentTest methodTest = test.createNode("callMeRescheduleCallBackLaterSubmit");
		        logTestMethod(driver,methodTest, "callMeRescheduleCallBackLaterSubmit", () ->{ 
			        String taskNoCallBackLaterSubmit=functions.getTaskNo();
			        System.out.println("Task no. of Call Me -Reschedule  -Call Back Later -Submit button : "+taskNoCallBackLaterSubmit);
			       
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
		     manager=new TaskTypeManager(driver, test);
			//verify Task Type
	 		String taskType=functions.getTaskTypeFromApplication();
	 		if(taskType.equals("Call Me - Customer Request for TC to Call.") )
	 		{
	 			ExtentTest methodTest = test.createNode("callMeRescheduleWrongNoSubmitBreak");
		        logTestMethod(driver,methodTest, "callMeRescheduleWrongNoSubmitBreak", () ->{ 
			callMeWrongTaskNo=functions.getTaskNo();
			System.out.println("Task No-Call Me - Reschedule- Wrong no-Submit & break button : "+ callMeWrongTaskNo);
			
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
	 			
						TestCaseTracker.markAsExecuted("callMeRescheduleWrongNoSubmitBreak");
		      }
	 		
	 		else
	 		{
	 			System.out.println("Task type is not Call Me.");
	 			manager.executeTask();
	 		}
			
		
		}
		
		
		
		
		@Test(priority = 87, alwaysRun = true)
		public void callMeRescheduleWrongNoTaskStatus() throws InterruptedException, IOException
		{	
			
			ExtentTest methodTest = test.createNode("callMeRescheduleWrongNoTaskStatus");
	        logTestMethod(driver,methodTest, "callMeRescheduleWrongNoTaskStatus", () ->{ 
			SoftAssert softAssert = new SoftAssert();
			functions = new CommanFunctions(driver);

			boolean status=false;
			By element=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a");
			WaitVisibliltyOfLocated(element);
			
			//get task no from dashboard
			By taskNoLocator=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a");
			WaitVisibliltyOfLocated(taskNoLocator);
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

	        });
			
			 TestCaseTracker.markAsExecuted("callMeRescheduleWrongNoTaskStatus");
			
			}
		
		
		
		@Test(priority = 88, alwaysRun = true)
		public void callMeRescheduleWrongNoSubmit() throws InterruptedException, IOException
		{
			
			
			SoftAssert softAssert = new SoftAssert();
		       functions = new CommanFunctions(driver);
		       manager=new TaskTypeManager(driver, test);
			String taskType=functions.getTaskTypeFromApplication();
	 		if(taskType.equals("Call Me - Customer Request for TC to Call.") )
	 		{
	 			ExtentTest methodTest = test.createNode("callMeRescheduleWrongNoSubmit");
		        logTestMethod(driver,methodTest, "callMeRescheduleWrongNoSubmit", () ->{ 
			        String taskNoWrongNoSubmit=functions.getTaskNo();
			        System.out.println("Task no. of Call Me -Reschedule-Wrong no-Submit button : "+taskNoWrongNoSubmit);
			       
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
