package com.jspl.OutboundTask;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.jspl.TestComponents.CommanFunctions;
import com.jspl_automation.utility.BaseClass;




public class TaskTypeManager extends BaseClass {

	private CommanFunctions function;
	private ExtentTest parentTest;
	
	
	
	    public TaskTypeManager(WebDriver driver, ExtentTest parentTest) {
	        this.driver = driver;
	        this.parentTest = parentTest;
	       
	    }

		public void executeTask() throws InterruptedException, IOException {
			ExtentTest childTest;
			
			function = new CommanFunctions(driver);
			String taskType;
			
			System.out.println("Manager Class");

			while (!(taskType = getTaskTypeFromApplication()).isEmpty()) {
				
				System.out.println("Task Type : " + taskType);
				switch (taskType) {
				case "Influencer Claim Verification":
					childTest = parentTest.createNode("Influencer Claim Verification");
					executeClaimVerificationTask(childTest);
					break;

				case "Influencer Primary Verification":
					childTest = parentTest.createNode("Influencer Primary Verification");
					executeInfluencerVerificationTask(childTest);
					break;

				case "Call Me - Customer Request for TC to Call.":
					childTest = parentTest.createNode("Call Me Task");
					executeCallMeTask(childTest);

					break;

				case "6001":
					System.out.println("on dashbord");
					function.verifyCallsAvailability();

					break;

				default:

					throw new IllegalArgumentException("Unknown task type: " + taskType);
				}

				try {
					WebElement dialNextElement = driver.findElement(By.xpath("//*[contains(text(),\"Dial Next\")]"));
					if (dialNextElement.isDisplayed()) {
						System.out.println("in try block dashboard");
						// Click on "Dial Next" to move to the next task
						Thread.sleep(3000);
						driver.findElement(
								By.xpath("//div[@class=\"main-content\"]/div/div/header/div/div[1]/div[2]/button"))
								.click();

					}

				}

				catch (Exception e) {

				}

			}
			
		}

	private String getTaskTypeFromApplication() throws InterruptedException {

		Thread.sleep(3000);

		return driver.findElement(By.xpath("//div[@class=\"page-content\"]/div/header/div/div[2]/div/button[1]"))
				.getText();

	}

	private void executeInfluencerVerificationTask(ExtentTest test) throws InterruptedException, IOException {

		InfluencerVerificationTask influencerTask = new InfluencerVerificationTask(driver, test);

		influencerTask.runTests();

	}

	private void executeClaimVerificationTask(ExtentTest test) throws InterruptedException, IOException {
		ClaimVerificationTask claimTask = new ClaimVerificationTask(driver,test);
		claimTask.runTests();
	}

	private void executeCallMeTask(ExtentTest test) throws InterruptedException, IOException {
	     CallMeTask callMeTask = new CallMeTask(driver, test);
	    
		callMeTask.runTests();
	}
	
	 
	          
}
