package com.jspl_automation.OutboundTask;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



import com.jspl_automation.TestComponents.CommanFunctions;
import com.jspl_automation.utility.BaseClass;


public class TaskTypeManager extends BaseClass {

	 CommanFunctions function;

	public TaskTypeManager(WebDriver driver) {
		this.driver = driver;
	}

	public void executeTask() throws InterruptedException, IOException {
		function = new CommanFunctions(driver);
		String taskType;
		System.out.println("Manager Class");

		while (!(taskType = getTaskTypeFromApplication()).isEmpty()) {

			System.out.println("Task Type : " + taskType);
			switch (taskType) {
			case "Influencer Claim Verification":
				executeClaimVerificationTask();

				break;

			case "Influencer Primary Verification":
				executeInfluencerVerificationTask();
				break;

			case "Call Me - Customer Request for TC to Call.":
				executeCallMeTask();
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
							By.xpath("//div[@class=\"main-content\"]/div/div/header/div/div[1]/div[2]/button")).click();

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

	private void executeInfluencerVerificationTask() throws InterruptedException, IOException {

		InfluencerVerificationTask influencerTask = new InfluencerVerificationTask(driver);

		influencerTask.runTests();

	}

	private void executeClaimVerificationTask() throws InterruptedException, IOException {
		ClaimVerificationTask claimTask = new ClaimVerificationTask(driver);
		claimTask.runTests();
	}

	private void executeCallMeTask() throws InterruptedException, IOException {
		CallMeTask callMeTask = new CallMeTask(driver);
		callMeTask.runTests();
	}

}
