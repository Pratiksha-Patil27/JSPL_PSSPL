package com.jspl.OutboundTaskTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.jspl.base.OutboundTaskBaseClass;
import com.jspl.pageobjects.OutBoundTaskPage;
import com.jspl.pageobjects.OutboundTelecallingPage;




public class TaskTypeManager extends OutboundTaskBaseClass {

	private OutBoundTaskPage outboundTaskPage;
	private OutboundTelecallingPage telePage;
	private ExtentTest parentTest;
	boolean status=false;
	 boolean taskCompleted = false;
	 int count=1;
	 int callMeTaskTotalTestCases=0;
	 int influencerVerificationTaskTotalTestCases=0;
	 int claimVerficationTaskTotalTestCases=0;
	 
	   
	 int passedTests = 0;
	 int failedTests = 0;
	 int unexecutedTests=0;
	
	
	    public TaskTypeManager(WebDriver driver, ExtentTest parentTest) {
	        this.driver = driver;
	        this.parentTest = parentTest;
	       
	    }

		public void executeTask() throws InterruptedException, IOException {
			ExtentTest childTest;

			outboundTaskPage = new OutBoundTaskPage(driver);
			String taskType;

			System.out.println("Manager Class");

			while (!(taskType = getTaskTypeFromApplication()).isEmpty()) {
				System.out.println("Task Type : " + taskType);
				String reactUsername = getProperty("reactUsername");
				if (taskType.equals(reactUsername)) {
					System.out.println("on dashboard");
					boolean callStatus = outboundTaskPage.verifyCallsAvailabilityDisplay();
					if (!callStatus) {
						System.out.println("Call Status: " + callStatus + " : Calls are not Scheduled");
						status = true;
						driver.close();
						break;
					} else {
						outboundTaskPage.clickOnDialNextButton();
					}
					continue;
				}

				switch (taskType) {

				case "Influencer Claim Verification":
					childTest = parentTest.createNode("Influencer Claim Verification");
					executeClaimVerificationTask(childTest);
					break;

				case "Call Me - Customer Request for TC to Call.":
					childTest = parentTest.createNode("Call Me Task");
					executeCallMeTask(childTest);
					break;

				case "Influencer Primary Verification":
					childTest = parentTest.createNode("Influencer Primary Verification");
					executeInflVerificationTask(childTest);
					break;
				default:

					throw new IllegalArgumentException("Unknown task type: " + taskType);
				}
				try {
					if (outboundTaskPage.verifyOutboundTaskPageDisplay())
						System.out.println("In try block on TaskTypeManager Class");
						telePage = outboundTaskPage.clickOnDialNextButton();
				}catch (Exception e) {
					System.out.println("In Catch block on TaskTypeManager Class");
				}
			}
			if (status) {
				taskCompleted = true;
			}
			if (taskCompleted) {
				System.out.println("OutOf While Loop.");
				logTestCounts();
			}

		}

	private String getTaskTypeFromApplication() throws InterruptedException {

		Thread.sleep(3000);
		telePage=new OutboundTelecallingPage(driver);
		return telePage.getTaskTypeFromApplication();

	}

	

	private void executeClaimVerificationTask(ExtentTest test) throws InterruptedException, IOException {
		ClaimVerificationTask claimTask = new ClaimVerificationTask(driver,test);
		claimVerficationTaskTotalTestCases=claimTask.claimVerificationTaskMethodsCount();
		claimTask.runTests(this);
	}

	private void executeCallMeTask(ExtentTest test) throws InterruptedException, IOException {
	     CallMeTask callMeTask = new CallMeTask(driver, test); 
	     callMeTaskTotalTestCases=callMeTask.callmeMethodsCount();
		 callMeTask.runTests(this); // Pass the manager instance to track counts
	}
	private void executeInflVerificationTask(ExtentTest test) throws InterruptedException, IOException {
		InfluencerVerificationTask inflVerification = new InfluencerVerificationTask(driver, test); 
		influencerVerificationTaskTotalTestCases=inflVerification.inflVerificationMethodsCount();
		inflVerification.runTests(this);
	}
	
	
	
	public void incrementPassedCount() {
		passedTests++;
	}

	public void incrementFailedCount() {
		failedTests++;
	}

	public void logTestCounts() {

		int totalTestCases=callMeTaskTotalTestCases+influencerVerificationTaskTotalTestCases+claimVerficationTaskTotalTestCases;
		parentTest.log(Status.INFO, "Total Test Cases: " +totalTestCases );
		parentTest.log(Status.INFO, "Passed Test Cases: " + passedTests);
		parentTest.log(Status.INFO, "Failed Test Cases: " + failedTests);

		unexecutedTests = totalTestCases - (passedTests + failedTests);
		parentTest.log(Status.INFO, "Unexecuted Test Cases: " + unexecutedTests);
	}
	
}
