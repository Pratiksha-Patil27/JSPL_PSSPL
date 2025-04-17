package com.jspl_automation.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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

public class ClaimVerificationTask1 extends BaseClass {

	
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
	int r=1;
	int n=1;
	
	
	LoginPage loginPage;

	@BeforeSuite
	public void Login() throws InterruptedException {

		String url = "https://jsplrjtest.prowessbeat.net";
		String username = "6001";
		String password = "tELE@6001";
		launchBrowser("chrome");
		loginPage = new LoginPage(driver);
		loginPage.loginTo(url, username, password);
	    dialerPage=new DialerLoginPage(driver);
	    dialerPage.pssplDialerLogin("https://psspldialer.prowessbeat.net/"); //call method
	    dialerPage.phoneLogin("6001", "Axc45fgvb54"); // Called Method
	    dialerPage.campaignLogin("6001", "Axc45fgvb54"); // Called Method
	    dialerPage.agentLoginController(); // Call Method
	   
	     //go back on main window
	   mainWindowHandle();
	}

	@BeforeClass
	public void openOutBoundTask() throws InterruptedException {

		functions = new CommanFunctions(driver);
		Thread.sleep(5000);
		functions.CustomerEngagementMenu("Outbound Task"); // click on OutBound Task
	  
	  // click on dial next to open first task
		functions.dialNextClick();

		functions.verifyCallsAvailability();

	}
	
	
	
	@Test(priority = 1)
	public void claimVerifCloseTaskbuttonclickable()
	{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		functions.callActionButton("Close Task");
		By closeTaskLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
		WaitVisibliltyOfLocated(closeTaskLableLocator);
		WebElement closeTaskLableElement=driver.findElement(closeTaskLableLocator);
		softAssert.assertTrue(closeTaskLableElement.isDisplayed(),"Close Task Button not clickable");
		softAssert.assertAll();
		
		
		
		
	}
	
	@Test(priority = 2)
	public void claimVerifCloseTaskSubmitbuttonclickable()
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
	public void claimVerifCloseTaskSubmitBreakbuttonclickable()
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
	public void claimVerifCloseTaskCancelbuttonclickable()
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
	public void claimVerifCloseTaskCrossIconclickable()
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
	public void claimVerifRescheduledbuttonclickable()
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
	public void claimVerifRescheduledSubmitbuttonclickable()
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
	public void claimVerifRescheduledSubmitBreakbuttonclickable()
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
	public void claimVerifRescheduledCancelbuttonclickable()
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
	public void claimVerifRescheduledCrossIconclickable()
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
	

	@Test(priority = 11)
	public void claimVerifClaimVerifyButtonClickable()
	{
		SoftAssert softAssert = new SoftAssert();
		functions = new CommanFunctions(driver);
		By verifyButtonLocator=By.xpath("//button[@class=\"btn btn-sm btn-primary\"]");
		click(verifyButtonLocator);
		By claimVerificationLable=By.xpath("//h6[@class=\"my-0\"]/label");
		WaitVisibliltyOfLocated(claimVerificationLable);
		WebElement claimVerificationLableElement=driver.findElement(claimVerificationLable);
		softAssert.assertTrue(claimVerificationLableElement.isDisplayed(),"Claim Verify button not clickable");
		
        softAssert.assertAll();
		
		
		
	}
	
	@Test(priority = 12)
	public void claimVerifClaimSubmitBreakClickable()
	{
		
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
        By crossIconLocator=By.xpath("//button[@class=\"waves-effect btn btn-link p-0\"]/i");
		click(crossIconLocator);
		
	}
	
	
	
	@Test(priority = 13)
	public void claimVerifClaimSubmitClickable()
	{
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
      
		
	}
	
	
	
	@Test(priority = 14)
	public void claimVerifClaimCancelClickable()
	{
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
		
		
		
	}
	
	@Test(priority = 15)
	public void claimVerifClaimCrossIconClickable()
	{
		
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
		
		
	}
	
	
	
	
	
	   @Test(priority = 16, alwaysRun = true)
		public void claimVerifRedial() throws InterruptedException

		{ 
			SoftAssert softAssert = new SoftAssert();
			functions = new CommanFunctions(driver);
			String oldTaskNo = functions.getTaskNo();
			System.out.println("Claim Verification oldTaskNo : "+ oldTaskNo);
			// click on Redial button
			functions.callActionButton("Redial");
			Thread.sleep(9000);
			By taskPopUpLocator=By.xpath("//*[@id=\"TelecallingInfoDiv\"]/div/div/a/div/div[3]/marquee/span");
			WaitVisibliltyOfLocated(taskPopUpLocator);
			String newTaskNo = functions.getTaskNo();
			System.out.println("Claim Verification newTaskNo : "+ newTaskNo);
			softAssert.assertEquals(newTaskNo, oldTaskNo, "Test Failed : Redial button not working properly");
			 
		    softAssert.assertAll();

			

		}
		
		
		
		
		@Test(priority = 17, alwaysRun = true)
		public void claimVerifBack() throws InterruptedException
		{
			SoftAssert softAssert = new SoftAssert();
			functions = new CommanFunctions(driver);
			claimVerifyBackButtonTaskNo =functions.getTaskNo();
			System.out.println("Claim Verifivation backButtonTaskNo : "+ claimVerifyBackButtonTaskNo);
			Thread.sleep(9000);
			functions.callActionButton("Back");
			//verify Dial Next button display or not
			By dialNextElement= (By.xpath("//*[contains(text(),\"Dial Next\")]"));
			WaitVisibliltyOf(dialNextElement);
			 WebElement dialNext=driver.findElement(dialNextElement);
			 softAssert.assertTrue(dialNext.isDisplayed(),"Test Failed :claimVerifBack Back Button Not working proper");
			// Call assertAll to aggregate the results
				softAssert.assertAll();

				
			 
		}
		
		@Test(priority = 18, alwaysRun = true)
		public void claimVerifBackTaskStatus() 
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

			 
			
			}
			
			
	   
		
		@Test(priority = 19, alwaysRun = true)
		public void claimVerifBackButtonDialNext() throws InterruptedException
		{   dialerPage=new DialerLoginPage(driver);
			//Verify after back task when click on dial next then same task should be open
			SoftAssert softAssert = new SoftAssert();
			functions = new CommanFunctions(driver);
			functions.dialNextClick();
			
			functions.checkErrorToast();
			functions.checkErrorToast();	 
			Thread.sleep(5000);
			String newTaskNo= functions.getTaskNo();
			System.out.println("Claim Verification BackButtonDialNext New task No : "+newTaskNo);
			softAssert.assertEquals(newTaskNo, claimVerifyBackButtonTaskNo,"Test Failed : claimVerifBackButtonDialNext -incorrect call connect");
			
			softAssert.assertAll();

		  
		}
		
		
		
		@Test(priority = 20, alwaysRun = true)
		public void claimVerifHangUp() throws InterruptedException
		{
			SoftAssert softAssert = new SoftAssert();
			functions = new CommanFunctions(driver);
			Thread.sleep(3000);
			claimVerifyHangUpTaskNo=functions.getTaskNo();
			functions.callActionButton("Hangup");
			By loaderElement=By.xpath("// div[@id=\"loader-container\"]/p");
			WaitVisibliltyOfLocated(loaderElement);
			String loaderMsg=driver.findElement(loaderElement).getText();
			System.out.println(loaderMsg);

			softAssert.assertNotEquals(loaderMsg,"New Call Connecting", "Test Faild : claimVerifHangUp");
			softAssert.assertAll();
			WaitInVisibliltyOfLocated(loaderElement);
			
					
		}
		
		
		
	
		@Test(priority = 21, alwaysRun = true)
		public void claimVerifStatusPendingCloseTaskBySubmit()
		{
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

			
			
			}
		
		@Test(priority = 22, alwaysRun = true)
		public void claimVerifStatusPendingCloseTaskBySubmitBreak()
		{
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

			
			
			
		}
		
		


         @Test(priority = 23, alwaysRun = true)
          public void verifyClaimedPointsOfClaimVerification()
           {
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
     		
     		
        	 
           }


         
      @Test(priority = 24, alwaysRun = true)
         public void claimVerificationEnterMaxQty() throws InterruptedException

         {
        	 SoftAssert softAssert = new SoftAssert();
      		functions = new CommanFunctions(driver);
      		Thread.sleep(2000);
      		By verifyButtonLocator=By.xpath("//button[@class=\"btn btn-sm btn-primary\"]");
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
      		
		
              	  
         }
      
      


      @Test(priority = 25, alwaysRun = true)
      public void claimVerifselectStatusApproveVerifyReasonField() throws InterruptedException
      { 
    	 //If we select claim status approve then Rejected Reason field should not be show
    	 
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
       			
       			Thread.sleep(3000);
       			//DropDown Locator
       			List<WebElement> claimStatusElements=driver.findElements(By.xpath("//div[@class=\" css-qr46ko\"]/div"));
       			for(WebElement claimStatusElement :claimStatusElements)
       			{
       				String statusValue=claimStatusElement.getText();
       				
       				if(statusValue.equals("Approve"))
       				{
       					System.out.println("Selected Claim Status Value : "+statusValue);
       					Thread.sleep(3000);
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

			
    	  
    	  
      }
      
      
      
     @Test(priority = 26, alwaysRun = true)
		public void claimVerifselectStatusRejectVerifyReasonField() throws InterruptedException {
			// If we select claim status Reject then Rejected Reason field should be show
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

				Thread.sleep(3000);
				// DropDown Locator
				List<WebElement> claimStatusElements = driver
						.findElements(By.xpath("//div[@class=\" css-qr46ko\"]/div"));
				for (WebElement claimStatusElement : claimStatusElements) {
					String statusValue = claimStatusElement.getText();

					if (statusValue.equals("Reject")) {
						System.out.println("Selected Claim Status Value : " + statusValue);
						Thread.sleep(3000);
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
			

		}
     
     @Test(priority = 27, alwaysRun = true)
     public void claimVefclaimStatusRejectVerifyQtyPoints() throws InterruptedException
     {
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

				Thread.sleep(3000);
				// DropDown Locator
				List<WebElement> claimStatusElements = driver
						.findElements(By.xpath("//div[@class=\" css-qr46ko\"]/div"));
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
	   		
			
    	 
     }
     
     
      
      @Test(priority = 28, alwaysRun = true)
     public void claimVerifStatusRejectSubmitClaim()
     {
    	 //If we select Claim Status Reject & if  Reason field Blank then Error pop-up should be display
    	 
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
   		
		
    	 
    	 
     }
     
     
	
	@Test(priority = 29,  alwaysRun = true)
	public void openClaimVerification() throws InterruptedException
	{
		SoftAssert softAssert = new SoftAssert();
   		functions = new CommanFunctions(driver);
   		Thread.sleep(3000);
   		claimVerificationTaskNo =functions.getTaskNo();
   		System.out.println("Claim Verification Task no : "+claimVerificationTaskNo);
   		By verifyButtonLocator=By.xpath("//button[@class=\"btn btn-sm btn-primary\"]");
   		click(verifyButtonLocator);
   		
	}
	
	
    @Test(priority = 30, dataProvider="claimVerificationData", alwaysRun = true)
      public void enterclaimDataForClaimVerification(HashMap<String, String> claimData) throws InterruptedException

      {
    	SoftAssert softAssert = new SoftAssert();
   		functions = new CommanFunctions(driver);
   	 
         	
			String claimQty = claimData.get("qty"); 
			String claimStatus = claimData.get("status"); 
			String rejectReason = claimData.get("reason"); 
			String claimRemark = claimData.get("remark"); 
				
   			if(r < claimData.size())
   			{
   		   	  
   			   	
   			
   			 // Enter Qty
   			 By enterQtyLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr["+r+"]/td[6]/input");
   			
   			 WebElement enterQtyElement=driver.findElement(enterQtyLocator);
   			 
   			enterQtyElement.click();
   			
   			enterQtyElement.clear();
   			
   			enterQtyElement.sendKeys(claimQty);
   			
   			//Select Claim Status
   		    //click on status dropdown
   			By statusFieldLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr["+r+"]/td[8]/div/div/div[2]");
   			click(statusFieldLocator);
   			 
   			Thread.sleep(3000);
   			//DropDown Locator
   			List<WebElement> claimStatusElements=driver.findElements(By.xpath("//div[@class=\" css-qr46ko\"]/div"));
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
   				By reasonLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr["+r+"]/td[9]/div/div/div/div[1]");
   				Thread.sleep(3000);
   				WebElement reasonElement=driver.findElement(reasonLocator);
   				
   				if(reasonElement.isDisplayed())
   				{  
   					System.out.println("27");
   					Thread.sleep(5000);
   					reasonElement.click();
   				//Reject Reason Drodown List
   					Thread.sleep(5000);
   				List<WebElement> rejectReasonElements=driver.findElements(By.xpath("//div[@class=\" css-qr46ko\"]/div"));
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
   				//System.out.println("Selected Claim Status is Approve.");
   			}
   			
   			//Enter Claim Remark
   			By remarkLocator=By.name("CLAIMS["+(r-1)+"].REMARK");
   			WaitVisibliltyOfLocated(remarkLocator);
   			driver.findElement(remarkLocator).sendKeys(claimRemark);
   			r++;
   			 } 
   			
   			softAssert.assertAll();
   		 
      }  
      

        
      
      @Test(priority = 31, alwaysRun = true)
      public void verifyTotalClaimPointsOfClaimVerification()
      {
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
				
     
      }
      
      
      
     
     @Test(priority = 32, alwaysRun = true)
     public void verifyClaimBySubmitBreakButtonClaimVef()
     {
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
		
    	
    	 
     }
     
     @Test(priority = 33, alwaysRun = true)
     public void claimVefBySubmitBreakButtonVerifyNextCall() throws InterruptedException
     {
    	 //If Submit Claim by Submit & Break button then next call should not be connect
    	 SoftAssert softAssert = new SoftAssert();
  		functions = new CommanFunctions(driver);
  		Thread.sleep(5000);
    	//verify next call connect or not
  		try
  		{
  		     By taskLocator=By.xpath("//*[@id=\"TelecallingInfoDiv\"]/div/div/a/div/div[3]/marquee/span");
		     Thread.sleep(3000);
			 WebElement taskElement=driver.findElement(taskLocator);
			 softAssert.assertFalse(taskElement.isDisplayed(),"After Submit Claim By Submit & Break Button Then next Call should not be connect");
  		}catch(Exception e)
  		{
  			System.out.println("Next call Not connect due to Claim submit by Submit & Break Button");
  		}
			softAssert.assertAll();

		
     }
     
     
     @Test(priority = 34, alwaysRun = true)
     public void verifyTaskStatusOnDashboardForClaimVef()
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
    	 
 		
     }
     
     
     
     @Test(priority = 35,  alwaysRun = true)
 	public void openClaimVerificationForSubmitButton() throws InterruptedException
 	{
 		SoftAssert softAssert = new SoftAssert();
    		functions = new CommanFunctions(driver);
    		Thread.sleep(3000);
	       // functions.dialNextClick();
	 		//functions.verifyCallsAvailability();
    		claimVerificationTaskNo =functions.getTaskNo();
    		System.out.println("Claim Verification Task no : "+claimVerificationTaskNo);
    		By verifyButtonLocator=By.xpath("//button[@class=\"btn btn-sm btn-primary\"]");
    		click(verifyButtonLocator);
    		softAssert.assertAll();
 	}
     
     @Test(priority = 36,  dataProvider="claimVerificationData", alwaysRun = true)
     public void enterClaimDataSubmitButtonClaimVef(HashMap<String, String> claimData) throws InterruptedException, IOException
     
     {      
    	 
    	 //If verify claim by submit button then if next call is available then next call should be connect
    	 SoftAssert softAssert = new SoftAssert();
 		functions = new CommanFunctions(driver);

    		String claimQty = claimData.get("qty"); 
			String claimStatus = claimData.get("status"); 
			String rejectReason = claimData.get("reason"); 
			String claimRemark = claimData.get("remark"); 
				
   			if(n < claimData.size())
   			{
    		Thread.sleep(3000);
  			 // Enter Qty
  			 By enterQtyLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr["+n+"]/td[6]/input");
  			
  			 WebElement enterQtyElement=driver.findElement(enterQtyLocator);
  			 
  			enterQtyElement.click();
  			
  			enterQtyElement.clear();
  			
  			enterQtyElement.sendKeys(claimQty);
  			
  			//Select Claim Status
  		    //click on status dropdown
  			By statusFieldLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr["+n+"]/td[8]/div/div/div[2]");
  			click(statusFieldLocator);
  			 
  			Thread.sleep(3000);
  			//DropDown Locator
  			List<WebElement> claimStatusElements=driver.findElements(By.xpath("//div[@class=\" css-qr46ko\"]/div"));
  			for(WebElement claimStatusElement :claimStatusElements)
  			{
  				String statusValue=claimStatusElement.getText();
  				
  				if(statusValue.equals(claimStatus))
  				{  Thread.sleep(2000);
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
   				By reasonLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr["+n+"]/td[9]/div/div/div/div[1]");
   				Thread.sleep(3000);
   				WebElement reasonElement=driver.findElement(reasonLocator);
   				if(reasonElement.isDisplayed())
   				{  
   					Thread.sleep(3000);
   					reasonElement.click();
   					Thread.sleep(5000);
   				//Reject Reason Drodown List
   				List<WebElement> rejectReasonElements=driver.findElements(By.xpath("//div[@class=\" css-qr46ko\"]/div"));
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
   			By remarkLocator=By.name("CLAIMS["+(n-1)+"].REMARK");
   			WaitVisibliltyOfLocated(remarkLocator);
   			driver.findElement(remarkLocator).sendKeys(claimRemark);
  			
   			n++;
   			}
   			softAssert.assertAll();
   			
     }
     
     @Test(priority = 37, alwaysRun = true)
     public void verifyClaimBySubmitButtonClaimVef()
     {
    	 SoftAssert softAssert = new SoftAssert();
  		functions = new CommanFunctions(driver);
   			//Click on Submit Button
   			By submitButtonLocator=By.xpath("//button[@class=\"btn btn-success\"]");
   			WaitVisibliltyOfLocated(submitButtonLocator);
   			click(submitButtonLocator);
   			
   			
   		   //Click on "OK" Button
   			By okButtonLocator=By.xpath("//button[text()=\"Ok\"]");
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
				 
			 }catch(Exception r)
			 {
				 
				 By taskPopUpLocator=By.xpath("//*[@id=\"TelecallingInfoDiv\"]/div/div/a/div/div[3]/marquee/span");
					WaitVisibliltyOfLocated(taskPopUpLocator);
				   WebElement taskPopUp=driver.findElement(taskPopUpLocator);
				   String taskName=taskPopUp.getText();
				   System.out.println(taskName);
				   softAssert.assertTrue(taskPopUp.isDisplayed(), "If we Submit claim Verification By submit Button then next call should be connect.");
			 }	
			 softAssert.assertAll();

       			}     
 		
    
     
  		
		@Test(priority = 38, alwaysRun = true)
			
		public void claimVerifRescheduleNotInterestedSubmitBreak() throws InterruptedException, IOException
		{ 
			functions = new CommanFunctions(driver);
			SoftAssert softAssert = new SoftAssert();
			
			
			claimVefNotInterestedTakNo=functions.getTaskNo();
			System.out.println("Task No-Claim Verification- Reschedule-Not Interested -Submit & break button : "+ claimVefNotInterestedTakNo);
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
		

		@Test(priority = 39, alwaysRun = true)
		public void claimVerifRescheduleNotInterestedTaskStatus() throws InterruptedException
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

			
			
			}
		
		
		@Test(priority = 40, alwaysRun = true)
		public void claimVerifRescheduleNotInterestedSubmit() throws InterruptedException, IOException
		{
			SoftAssert softAssert = new SoftAssert();
	        functions = new CommanFunctions(driver);
	        Thread.sleep(2000);
	        functions.dialNextClick();
	 		functions.verifyCallsAvailability();
			        
			        String taskNoNotInterestedSubmit=functions.getTaskNo();
			        System.out.println("Task no. of Claim Verification-Reschedule-Not Interested-Submit button : "+taskNoNotInterestedSubmit);
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
	 		
		
		
		
		
		@Test(priority = 41, alwaysRun = true)
		public void claimVerifRescheduleRingNotReceivedSubmitBreak() throws InterruptedException, IOException
		{ 
			functions = new CommanFunctions(driver);
			SoftAssert softAssert = new SoftAssert();
			
			
			claimVefRingNotReceivedTaskNo=functions.getTaskNo();
			System.out.println("Task No-Claim Verification- Reschedule-Ringing Not Received -Submit & break button : "+ claimVefRingNotReceivedTaskNo);
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
		
		
		
		@Test(priority = 42, alwaysRun = true)
		public void claimVerifRescheduleRingNotReceivedTaskStatus() throws InterruptedException
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

			
			
			}
		
		
		@Test(priority = 43, alwaysRun = true)
		public void claimVerifRescheduleRingNotReceivedSubmit() throws InterruptedException, IOException
		{
			SoftAssert softAssert = new SoftAssert();
	        functions = new CommanFunctions(driver);
	        Thread.sleep(2000);
	        functions.dialNextClick();
	 		functions.verifyCallsAvailability();
			        
			        String taskNoRigNotReceivedSubmit=functions.getTaskNo();
			        System.out.println("Task no. of Claim Verification-Reschedule-Ring Not Received -Submit button : "+taskNoRigNotReceivedSubmit);
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
	 		
		
		@Test(priority = 44, alwaysRun = true)
		public void claimVerifRescheduleCallBackLaterSubmitBreak() throws InterruptedException, IOException
		{ 
			functions = new CommanFunctions(driver);
		   SoftAssert softAssert = new SoftAssert();
        	claimVefCallBackLaterTaskNo=functions.getTaskNo();
			System.out.println("Task No-Claim Verification- Reschedule-Call Back Later -Submit & break button : "+ claimVefCallBackLaterTaskNo);
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
		
		
		@Test(priority = 45, alwaysRun = true)
		public void claimVerifRescheduleCallBackLaterTaskStatus() throws InterruptedException
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

			
			
			}
		
		
		@Test(priority = 46, alwaysRun = true)
		public void claimVerifRescheduleCallBackLaterSubmit() throws InterruptedException, IOException
		{
			SoftAssert softAssert = new SoftAssert();
	        functions = new CommanFunctions(driver);
	        Thread.sleep(2000);
	        functions.dialNextClick();
	 		functions.verifyCallsAvailability();
			        String taskNoCallBackLaterSubmit=functions.getTaskNo();
			        System.out.println("Task no. of Claim Verification-Reschedule  -Call Back Later -Submit button : "+taskNoCallBackLaterSubmit);
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
		
		
		
		@Test(priority = 47, alwaysRun = true)
		public void claimVerifRescheduleWrongNoSubmitBreak() throws InterruptedException, IOException
		{	SoftAssert softAssert = new SoftAssert();
		     functions = new CommanFunctions(driver);
		    
             
			claimVerifyWrongTaskNo=functions.getTaskNo();
			System.out.println("Task No-Claim Verification- Reschedule- Wrong no-Submit & break button : "+ claimVerifyWrongTaskNo);
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
		
		
		
		
		@Test(priority = 48, alwaysRun = true)
		public void claimVerifRescheduleWrongNoTaskStatus() throws InterruptedException
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

			 TestCaseTracker.markAsExecuted("claimVerifRescheduleWrongNoTaskStatus");
			
			}
		
		
		
		@Test(priority = 49, alwaysRun = true)
		public void claimVerifRescheduleWrongNoSubmit() throws InterruptedException, IOException
		{
			SoftAssert softAssert = new SoftAssert();
		       functions = new CommanFunctions(driver);
		       Thread.sleep(2000);
		       functions.dialNextClick();
		 		functions.verifyCallsAvailability();
			        String taskNoWrongNoSubmit=functions.getTaskNo();
			        System.out.println("Task no. of Claim Verification-Reschedule-Wrong no-Submit button : "+taskNoWrongNoSubmit);
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
	 		
	

		@DataProvider(name = "claimVerificationData")
		public Object[][] claimVerificationDetails() {

			// call method to read & enter json data
			Object[][] dataArray = readJsonData(System.getProperty("user.dir")
					+ "\\src\\test\\java\\com\\jspl_automation\\data\\ClaimVerificationDetails.json");
			return dataArray;


		};

		
}




